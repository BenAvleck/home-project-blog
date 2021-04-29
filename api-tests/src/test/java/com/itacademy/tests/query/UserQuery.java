package com.itacademy.tests.query;/*
package com.softserveinc.ita.homeproject.blog.api.tests.query;


import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;
import com.softserveinc.ita.homeproject.blog.client.model.User;

import java.util.List;

public class UserQuery extends BaseQuery {
    private String email;

    private String firstName;

    private String lastName;

    private String contactEmail;

    private String contactPhone;

    private UsersApi userApi;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setUserApi(UsersApi userApi) {
        this.userApi = userApi;
    }

    public List<User> perform() throws ApiException {
        return userApi
            .getUsers(this.getPageNumber(),
                this.getPageSize(),
                this.getSort(),
                this.getFilter(),
                this.getId(),
                email,
                firstName,
                lastName,
                contactPhone,
                contactEmail);
    }

    public static class Builder extends BaseBuilder<UserQuery, Builder> {

        public Builder(UserApi userApi) {
            queryClass.setUserApi(userApi);
        }

        public Builder email(String email) {
            queryClass.setEmail(email);
            return this;
        }

        public Builder firstName(String firstName) {
            queryClass.setFirstName(firstName);
            return this;
        }

        public Builder lastName(String lastName) {
            queryClass.setLastName(lastName);
            return this;
        }

        public Builder contactEmail(String contactEmail) {
            queryClass.setContactEmail(contactEmail);
            return this;
        }

        public Builder contactPhone(String contactPhone) {
            queryClass.setContactPhone(contactPhone);
            return this;
        }

        @Override
        protected UserQuery getActual() {
            return new UserQuery();
        }

        @Override
        protected Builder getActualBuilder() {
            return this;
        }
    }
}
*/
