# UsersApi

All URIs are relative to *http://localhost:8080/api/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUser**](UsersApi.md#createUser) | **POST** /users | Create User
[**getUser**](UsersApi.md#getUser) | **GET** /users/{id} | Get User by ID
[**getUserRole**](UsersApi.md#getUserRole) | **GET** /users/{id}/role | Get User Role by ID
[**getUsers**](UsersApi.md#getUsers) | **GET** /users | Get users
[**removeUser**](UsersApi.md#removeUser) | **DELETE** /users/{id} | Remove User
[**updateUser**](UsersApi.md#updateUser) | **PUT** /users/{id} | Update User
[**updateUserRole**](UsersApi.md#updateUserRole) | **PUT** /users/{id}/role | Update User Role



## createUser

> User createUser(user)

Create User

Create a new User.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        User user = new User(); // User | 
        try {
            User result = apiInstance.createUser(user);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#createUser");
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
 **user** | [**User**](User.md)|  |

### Return type

[**User**](User.md)

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
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## getUser

> User getUser(id)

Get User by ID

Retrieves an existing User associated with the specified ID.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        try {
            User result = apiInstance.getUser(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUser");
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

[**User**](User.md)

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
| **403** | Forbidden. |  -  |
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## getUserRole

> Role getUserRole(id)

Get User Role by ID

Retrieves an existing User Role associated with the specified ID.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        try {
            Role result = apiInstance.getUserRole(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUserRole");
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

[**Role**](Role.md)

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
| **403** | Forbidden. |  -  |
| **404** | The specified resource was not found. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## getUsers

> List&lt;User&gt; getUsers(id, name, sort, pageNum, pageSize)

Get users

Uses query keys to retrieve a subset of existing users.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        String name = "name_example"; // String | 
        String sort = "-id"; // String | In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* 
        Integer pageNum = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            List<User> result = apiInstance.getUsers(id, name, sort, pageNum, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsers");
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
 **sort** | **String**| In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  | [optional] [default to -id] [enum: id, -id, name, -name]
 **pageNum** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Total-Count -  <br>  |
| **400** | The payload contains an error. |  -  |
| **401** | Unauthorized. |  -  |
| **403** | Forbidden. |  -  |
| **0** | The unknown error appeard. Check your payload or contact support. |  -  |


## removeUser

> removeUser(id)

Remove User

Deletes a User associated with a specified ID.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        try {
            apiInstance.removeUser(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#removeUser");
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


## updateUser

> User updateUser(id, user)

Update User

Updates information on a User that exists in the system by the specified ID.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        User user = new User(); // User | 
        try {
            User result = apiInstance.updateUser(id, user);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUser");
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
 **user** | [**User**](User.md)|  |

### Return type

[**User**](User.md)

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


## updateUserRole

> Role updateUserRole(id, role)

Update User Role

Updates Role on a User that exists in the system by the specified ID.

### Example

```java
// Import classes:
import com.softserveinc.ita.homeproject.blog.ApiClient;
import com.softserveinc.ita.homeproject.blog.ApiException;
import com.softserveinc.ita.homeproject.blog.Configuration;
import com.softserveinc.ita.homeproject.blog.auth.*;
import com.softserveinc.ita.homeproject.blog.models.*;
import com.softserveinc.ita.homeproject.blog.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api/1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        UsersApi apiInstance = new UsersApi(defaultClient);
        BigDecimal id = new BigDecimal(); // BigDecimal | 
        Role role = new Role(); // Role | 
        try {
            Role result = apiInstance.updateUserRole(id, role);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUserRole");
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
 **role** | [**Role**](Role.md)|  |

### Return type

[**Role**](Role.md)

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

