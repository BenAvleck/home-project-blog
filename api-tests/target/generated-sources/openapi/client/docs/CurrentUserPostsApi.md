# CurrentUserPostsApi

All URIs are relative to *http://localhost:8080/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPostByCurrentUser**](CurrentUserPostsApi.md#getPostByCurrentUser) | **GET** /users/current/posts/{id} | Get Post by ID and Current User
[**getPostsByCurrentUser**](CurrentUserPostsApi.md#getPostsByCurrentUser) | **GET** /users/current/posts | Get posts by Current User
[**removePostByCurrentUser**](CurrentUserPostsApi.md#removePostByCurrentUser) | **DELETE** /users/current/posts/{id} | Remove Post by Current User
[**updatePostByCurrentUser**](CurrentUserPostsApi.md#updatePostByCurrentUser) | **PUT** /users/current/posts/{id} | Update Post by Current User



## getPostByCurrentUser

> Post getPostByCurrentUser(id)

Get Post by ID and Current User

Retrieves an existing Post associated with the specified ID and Current User.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.model.*;
import com.softserveinc.ita.homeproject.blog.client.api.CurrentUserPostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CurrentUserPostsApi apiInstance = new CurrentUserPostsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        try {
            Post result = apiInstance.getPostByCurrentUser(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentUserPostsApi#getPostByCurrentUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  |

### Return type

[**Post**](Post.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The payload contains an error. |  -  |
| **401** | Unauthorized. |  -  |
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## getPostsByCurrentUser

> List&lt;Post&gt; getPostsByCurrentUser(id, tagId, tagName, sort, pageNum, pageSize)

Get posts by Current User

Uses query keys to retrieve a subset of existing posts assosiated with Current User.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.model.*;
import com.softserveinc.ita.homeproject.blog.client.api.CurrentUserPostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CurrentUserPostsApi apiInstance = new CurrentUserPostsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        String tagId = "tagId_example"; // String | 
        String tagName = "tagName_example"; // String | 
        String sort = "-id"; // String | In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* 
        Integer pageNum = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            List<Post> result = apiInstance.getPostsByCurrentUser(id, tagId, tagName, sort, pageNum, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentUserPostsApi#getPostsByCurrentUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  | [optional]
 **tagId** | **String**|  | [optional]
 **tagName** | **String**|  | [optional]
 **sort** | **String**| In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  | [optional] [default to -id] [enum: id, -id, title, -title]
 **pageNum** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;Post&gt;**](Post.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Total-Count -  <br>  |
| **401** | Unauthorized. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## removePostByCurrentUser

> removePostByCurrentUser(id)

Remove Post by Current User

Deletes a Post associated with a specified ID and Current User.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.model.*;
import com.softserveinc.ita.homeproject.blog.client.api.CurrentUserPostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CurrentUserPostsApi apiInstance = new CurrentUserPostsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        try {
            apiInstance.removePostByCurrentUser(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentUserPostsApi#removePostByCurrentUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The request was succesfully processed. |  -  |
| **400** | The payload contains an error. |  -  |
| **401** | Unauthorized. |  -  |
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## updatePostByCurrentUser

> Post updatePostByCurrentUser(id, post)

Update Post by Current User

Updates information on a Post that exists in the system by the specified ID and Current User.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.model.*;
import com.softserveinc.ita.homeproject.blog.client.api.CurrentUserPostsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CurrentUserPostsApi apiInstance = new CurrentUserPostsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        Post post = new Post(); // Post | 
        try {
            Post result = apiInstance.updatePostByCurrentUser(id, post);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CurrentUserPostsApi#updatePostByCurrentUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **BigDecimal**|  |
 **post** | [**Post**](Post.md)|  |

### Return type

[**Post**](Post.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | The payload contains an error. |  -  |
| **401** | Unauthorized. |  -  |
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |

