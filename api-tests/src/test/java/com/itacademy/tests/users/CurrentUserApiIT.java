package com.itacademy.tests.users;

import com.itacademy.tests.utils.ApiClientUtil;
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.client.api.CommentsApi;
import com.softserveinc.ita.homeproject.blog.client.api.CurrentUserApi;
import com.softserveinc.ita.homeproject.blog.client.api.PostsApi;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;
import com.softserveinc.ita.homeproject.blog.client.model.Comment;
import com.softserveinc.ita.homeproject.blog.client.model.Post;
import com.softserveinc.ita.homeproject.blog.client.model.Tag;
import com.softserveinc.ita.homeproject.blog.client.model.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;
import javax.xml.bind.attachment.AttachmentMarshaller;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.*;


class CurrentUserApiIT {

    private final CurrentUserApi currentUserApi = new CurrentUserApi(ApiClientUtil.getClient());
    private final CurrentUserApi unauthorizedCurrentUserApi = new CurrentUserApi(ApiClientUtil.getUnauthorizedClient());
    private final PostsApi postsApi = new PostsApi(ApiClientUtil.getClient());
    private final CommentsApi commentsApi = new CommentsApi(ApiClientUtil.getClient());
    private final UsersApi usersApi = new UsersApi(ApiClientUtil.getClient());

    @Test
    void getCurrentUser() {
        User user = currentUserApi.getCurrentUser();
        assertNotNull(user);
    }

    @Test
    void getCommentByCurrentUser() {
        new ArrayList<Tag>().
                addAll(Arrays.asList(new Tag().name("Tag1"), new Tag().name("Tag2")));
        Post post = postsApi.createPost(createTestPost());
        Comment comment = commentsApi.createComment(post.getId(), new Comment().text(RandomStringUtils.randomAlphabetic(5)));
    }

    @org.junit.jupiter.api.Test
    void getCommentsByCurrentUser() {
    }


    @org.junit.jupiter.api.Test
    void getPostByCurrentUser() {
    }

    @org.junit.jupiter.api.Test
    void getPostsByCurrentUser() {
    }

    @org.junit.jupiter.api.Test
    void removeCommentByCurrentUser() {
    }

    @org.junit.jupiter.api.Test
    void removePostByCurrentUser() {
    }

    @org.junit.jupiter.api.Test
    void updateCommentByCurrentUser() {
    }

    @org.junit.jupiter.api.Test
    void updateCurrentUser() {
    }

    @org.junit.jupiter.api.Test
    void updatePostByCurrentUser() {
    }


    private User createTestUser() {
        return new User()
                .name(RandomStringUtils.randomAlphabetic(5).concat("_test"))
                .firstName("firstName")
                .lastName("lastName")
                .password("passworD321")
                .email(RandomStringUtils.randomAlphabetic(5).concat("@example.com"));
    }

    private List<Post> saveListPost() throws ApiException {
        List<Post> list = createPostList();
        List<Post> postList = new ArrayList<>();
        for (Post cp : list) {
            postList.add(postsApi.createPost(cp));
        }
        return postList;
    }

    private List<Post> createPostList() {
        List<Post> list = new ArrayList<>();
        list.add(createTestPost());
        list.add(createTestPost());
        list.add(createTestPost());
        list.add(createTestPost());
        return list;
    }

    private Post createTestPost() {
        return new Post().
                title(RandomStringUtils.randomAlphabetic(5)).
                text(RandomStringUtils.randomAlphabetic(5)).
                tags(Arrays.asList(new Tag().name(RandomStringUtils.randomAlphabetic(5))
                        , new Tag().name(RandomStringUtils.randomAlphabetic(5))));
    }


    private void assertUser(User saved, User update, User updated) {
        assertNotNull(updated);
        assertNotEquals(saved, updated);
        assertEquals(update.getFirstName(), updated.getFirstName());
        assertEquals(update.getLastName(), updated.getLastName());
    }

}
