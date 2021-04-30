# TagsApi

All URIs are relative to *http://localhost:8080/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTag**](TagsApi.md#getTag) | **GET** /tags/{id} | Get Tag by ID
[**getTags**](TagsApi.md#getTags) | **GET** /tags | Get tags
[**removeTag**](TagsApi.md#removeTag) | **DELETE** /tags/{id} | Remove Tag



## getTag

> Tag getTag(id)

Get Tag by ID

Retrieves an existing Tag associated with the specified ID.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.model.*;
import com.softserveinc.ita.homeproject.blog.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TagsApi apiInstance = new TagsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        try {
            Tag result = apiInstance.getTag(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getTag");
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

[**Tag**](Tag.md)

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


## getTags

> List&lt;Tag&gt; getTags(id, name, sort, pageNum, pageSize)

Get tags

Uses query keys to retrieve a subset of existing tags.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.model.*;
import com.softserveinc.ita.homeproject.blog.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TagsApi apiInstance = new TagsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        String name = "name_example"; // String | 
        String sort = "name"; // String | In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* 
        Integer pageNum = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            List<Tag> result = apiInstance.getTags(id, name, sort, pageNum, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#getTags");
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
 **name** | **String**|  | [optional]
 **sort** | **String**| In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  | [optional] [default to name] [enum: id, -id, name, -name]
 **pageNum** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Total-Count -  <br>  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## removeTag

> removeTag(id)

Remove Tag

Deletes a Tag associated with a specified ID.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.model.*;
import com.softserveinc.ita.homeproject.blog.client.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        TagsApi apiInstance = new TagsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        try {
            apiInstance.removeTag(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#removeTag");
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
| **403** | Forbidden. |  -  |
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |

