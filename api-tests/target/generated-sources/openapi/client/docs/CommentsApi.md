# CommentsApi

All URIs are relative to *http://localhost:8080/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComment**](CommentsApi.md#createComment) | **POST** /posts/{post_id}/comments | Create Comment
[**getComment**](CommentsApi.md#getComment) | **GET** /posts/{post_id}/comments/{id} | Get Comment by ID.
[**getComments**](CommentsApi.md#getComments) | **GET** /posts/{post_id}/comments | Get comments
[**removeComment**](CommentsApi.md#removeComment) | **DELETE** /posts/{post_id}/comments/{id} | Remove Comment
[**updateComment**](CommentsApi.md#updateComment) | **PUT** /posts/{post_id}/comments/{id} | Update Comment



## createComment

> Comment createComment(postId, comment)

Create Comment

Create a new Comment.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.CommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CommentsApi apiInstance = new CommentsApi(defaultClient);
        BigDecimal postId = new BigDecimal(); // BigDecimal | 
        Comment comment = new Comment(); // Comment | 
        try {
            Comment result = apiInstance.createComment(postId, comment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentsApi#createComment");
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
 **postId** | **BigDecimal**|  |
 **comment** | [**Comment**](Comment.md)|  |

### Return type

[**Comment**](Comment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | The payload contains an error. |  -  |
| **401** | Unauthorized. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## getComment

> Comment getComment(postId, id)

Get Comment by ID.

Retrieves an existing Comment associated with the specified ID.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.CommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CommentsApi apiInstance = new CommentsApi(defaultClient);
        BigDecimal postId = new BigDecimal(); // BigDecimal | 
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        try {
            Comment result = apiInstance.getComment(postId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentsApi#getComment");
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
 **postId** | **BigDecimal**|  |
 **id** | **BigDecimal**|  |

### Return type

[**Comment**](Comment.md)

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
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## getComments

> List&lt;Comment&gt; getComments(postId, id, userName, userId, sort, pageNum, pageSize)

Get comments

Uses query keys to retrieve a subset of existing comments.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.CommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CommentsApi apiInstance = new CommentsApi(defaultClient);
        BigDecimal postId = new BigDecimal(); // BigDecimal | 
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        String userName = "userName_example"; // String | 
        String userId = "userId_example"; // String | 
        String sort = "-id"; // String | In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* 
        Integer pageNum = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            List<Comment> result = apiInstance.getComments(postId, id, userName, userId, sort, pageNum, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentsApi#getComments");
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
 **postId** | **BigDecimal**|  |
 **id** | **BigDecimal**|  | [optional]
 **userName** | **String**|  | [optional]
 **userId** | **String**|  | [optional]
 **sort** | **String**| In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  | [optional] [default to -id] [enum: id, -id]
 **pageNum** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;Comment&gt;**](Comment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Total-Count -  <br>  |
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## removeComment

> removeComment(postId, id)

Remove Comment

Deletes a Comment associated with a specified ID.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.CommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CommentsApi apiInstance = new CommentsApi(defaultClient);
        BigDecimal postId = new BigDecimal(); // BigDecimal | 
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        try {
            apiInstance.removeComment(postId, id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentsApi#removeComment");
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
 **postId** | **BigDecimal**|  |
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
| **403** | Forbidden. |  -  |
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## updateComment

> Comment updateComment(postId, id, comment)

Update Comment

Updates information on a Comment that exists in the system by the specified ID and post ID.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.CommentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CommentsApi apiInstance = new CommentsApi(defaultClient);
        BigDecimal postId = new BigDecimal(); // BigDecimal | 
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        Comment comment = new Comment(); // Comment | 
        try {
            Comment result = apiInstance.updateComment(postId, id, comment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommentsApi#updateComment");
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
 **postId** | **BigDecimal**|  |
 **id** | **BigDecimal**|  |
 **comment** | [**Comment**](Comment.md)|  |

### Return type

[**Comment**](Comment.md)

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
| **403** | Forbidden. |  -  |
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |

