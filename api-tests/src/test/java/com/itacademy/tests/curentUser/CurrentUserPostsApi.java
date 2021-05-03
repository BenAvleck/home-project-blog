package com.itacademy.tests.curentUser;

import com.itacademy.tests.utils.ApiClientUtil;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.client.api.PostsApi;
import com.softserveinc.ita.homeproject.blog.client.model.Post;
import com.softserveinc.ita.homeproject.blog.client.model.Tag;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CurrentUserPostsApi {
    private final PostsApi postsApi = new PostsApi(ApiClientUtil.getClient());


    @Test
    void updatePostByCurrentUser() {
    }
    @Test
    void removePostByCurrentUser() {
    }
    @Test
    void getPostsByCurrentUser() {
    }
    @Test
    void getPostByCurrentUser() {
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
}
