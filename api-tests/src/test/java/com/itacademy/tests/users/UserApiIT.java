package com.itacademy.tests.users;

import com.itacademy.tests.utils.ApiClientUtil;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;
import com.softserveinc.ita.homeproject.blog.client.model.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;


class UserApiIT {

    private final UsersApi userApi = new UsersApi(ApiClientUtil.getClient());

    @Test
    void createUserTest() throws ApiException {
        User expectedUser = createTestUser();

        User user = userApi.createUser(expectedUser);

        assertUser(expectedUser, user);
    }

    @Test
    void getUserTest() throws ApiException {
        User expectedUser = createTestUser();
        User user = userApi.getUser(userApi.createUser(expectedUser).getId());
        assertUser(expectedUser, user);
    }

    @Test
    void updateUserTest() throws ApiException {
        User savedUser = userApi
                .createUser(createTestUser());
        User updateUser = new User()
                .firstName("updatedFirstName")
                .lastName("updatedLastName");

        User updated = userApi.updateUser(savedUser.getId(), updateUser);
        assertUser(savedUser, updateUser, updated);
    }

    @Test
    void deleteUserTest() throws ApiException {
        User expectedUser = userApi.createUser(createTestUser());
        userApi.createUser(createTestUser());
        userApi.createUser(createTestUser());
        userApi.removeUser(expectedUser.getId());

        List<User> actualUsersList = userApi.getUsers(
                expectedUser.getId()
                , expectedUser.getName()
                , "-id"
                , 1
                , 10);

        assertFalse(actualUsersList.contains(expectedUser));
        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> userApi.getUser(expectedUser.getId()));
    }


    private User createTestUser() {
        return new User()
                .name("name")
                .firstName("firstName")
                .lastName("lastName")
                .password("passworD321")
                .email(RandomStringUtils.randomAlphabetic(5).concat("@example.com"));
    }

    @Test
    void createUserInvalidEmailTest() {
        User createUserInvalidEmail = new User()
                .firstName("firstName")
                .lastName("lastName")
                .password("passworD321")
                .email("email.com");

        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> userApi.createUser(createUserInvalidEmail))
                .matches(exception -> exception.getCode() == 400)
                .withMessageContaining("Parameter `email` is invalid - must meet the rule.");
    }

    @Test
    void createUserInvalidPasswordTest() {
        User createUserInvalidPassword = new User()
                .firstName("firstName")
                .lastName("lastName")
                .password("some password")
                .email("email@example.com");

        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(() -> userApi.createUser(createUserInvalidPassword))
                .matches(exception -> exception.getCode() == 400)
                .withMessageContaining("Parameter `password` is invalid - must meet the rule.");
    }


    private void assertUser(User expected, User actual) {
        assertNotNull(expected);
        assertEquals(expected.getFirstName(), actual.getFirstName());
        assertEquals(expected.getLastName(), actual.getLastName());
        assertEquals(expected.getEmail(), actual.getEmail());
    }

    private void assertUser(User saved, User update, User updated) {
        assertNotNull(updated);
        assertNotEquals(saved, updated);
        assertEquals(update.getFirstName(), updated.getFirstName());
        assertEquals(update.getLastName(), updated.getLastName());
    }
}
