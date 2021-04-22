/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.itacademy.blog.api;

import java.math.BigDecimal;
import com.itacademy.blog.model.Comment;
import com.itacademy.blog.model.Error;
import com.itacademy.blog.model.Post;
import com.itacademy.blog.model.User;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-22T13:30:27.722673500+03:00[Europe/Kiev]")
@Validated
@Api(value = "users", description = "the users API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users : Create User
     * Create a new User.
     *
     * @param user  (required)
     * @return OK (status code 201)
     *         or The payload contains an error. (status code 400)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Create User", nickname = "createUser", notes = "Create a new User.", response = User.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = User.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @PostMapping(
        value = "/users",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<User> createUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/current/comments/{id} : Get Comment by ID and Current User
     * Retrieves an existing Comment associated with the specified ID and Current User.
     *
     * @param id  (required)
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Get Comment by ID and Current User", nickname = "getCommentByCurrentUser", notes = "Retrieves an existing Comment associated with the specified ID and Current User.", response = Comment.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User Comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/users/current/comments/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Comment> getCommentByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"user\" : \"\", \"createdOn\" : \"2017-07-21T17:32:28Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/current/comments : Get comments by Current User
     * Uses query keys to retrieve a subset of existing comments assosiated with Current User.
     *
     * @param id  (optional)
     * @param sort In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to -id)
     * @param pageNum  (optional)
     * @param pageSize  (optional)
     * @return OK (status code 200)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Get comments by Current User", nickname = "getCommentsByCurrentUser", notes = "Uses query keys to retrieve a subset of existing comments assosiated with Current User.", response = Comment.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User Comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/users/current/comments",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Comment>> getCommentsByCurrentUser(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) BigDecimal id,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id", defaultValue = "-id") @Valid @RequestParam(value = "sort", required = false, defaultValue="-id") String sort,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"user\" : \"\", \"createdOn\" : \"2017-07-21T17:32:28Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/current : Return current User
     * Retrieves the current logged User.
     *
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Return current User", nickname = "getCurrentUser", notes = "Retrieves the current logged User.", response = User.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/users/current",
        produces = { "application/json" }
    )
    default ResponseEntity<User> getCurrentUser() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/current/posts/{id} : Get Post by ID and Current User
     * Retrieves an existing Post associated with the specified ID and Current User.
     *
     * @param id  (required)
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Get Post by ID and Current User", nickname = "getPostByCurrentUser", notes = "Retrieves an existing Post associated with the specified ID and Current User.", response = Post.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User Posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Post.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/users/current/posts/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Post> getPostByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"previewAttachment\" : \"previewAttachment\", \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"title\" : \"title\", \"createdOn\" : \"2017-07-21T17:32:28Z\", \"user\" : \"\", \"tags\" : [ { \"name\" : \"Java8\", \"id\" : 6.027456183070403 }, { \"name\" : \"Java8\", \"id\" : 6.027456183070403 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/current/posts : Get posts by Current User
     * Uses query keys to retrieve a subset of existing posts assosiated with Current User.
     *
     * @param id  (optional)
     * @param tagId  (optional)
     * @param tagName  (optional)
     * @param sort In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to -id)
     * @param pageNum  (optional)
     * @param pageSize  (optional)
     * @return OK (status code 200)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Get posts by Current User", nickname = "getPostsByCurrentUser", notes = "Uses query keys to retrieve a subset of existing posts assosiated with Current User.", response = Post.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User Posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Post.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/users/current/posts",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Post>> getPostsByCurrentUser(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) BigDecimal id,@ApiParam(value = "") @Valid @RequestParam(value = "tag_id", required = false) String tagId,@ApiParam(value = "") @Valid @RequestParam(value = "tag_name", required = false) String tagName,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id, title, -title", defaultValue = "-id") @Valid @RequestParam(value = "sort", required = false, defaultValue="-id") String sort,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"previewAttachment\" : \"previewAttachment\", \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"title\" : \"title\", \"createdOn\" : \"2017-07-21T17:32:28Z\", \"user\" : \"\", \"tags\" : [ { \"name\" : \"Java8\", \"id\" : 6.027456183070403 }, { \"name\" : \"Java8\", \"id\" : 6.027456183070403 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/{id} : Get User by ID
     * Retrieves an existing User associated with the specified ID.
     *
     * @param id  (required)
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Get User by ID", nickname = "getUser", notes = "Retrieves an existing User associated with the specified ID.", response = User.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/users/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<User> getUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users : Get users
     * Uses query keys to retrieve a subset of existing users.
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param sort In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to -id)
     * @param pageNum  (optional)
     * @param pageSize  (optional)
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Get users", nickname = "getUsers", notes = "Uses query keys to retrieve a subset of existing users.", response = User.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/users",
        produces = { "application/json" }
    )
    default ResponseEntity<List<User>> getUsers(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) BigDecimal id,@ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id, name, -name", defaultValue = "-id") @Valid @RequestParam(value = "sort", required = false, defaultValue="-id") String sort,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /users/current/comments/{id} : Remove Comment by Current User
     * Deletes a Comment associated with a specified ID and Current User.
     *
     * @param id  (required)
     * @return The request was succesfully processed. (status code 204)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Remove Comment by Current User", nickname = "removeCommentByCurrentUser", notes = "Deletes a Comment associated with a specified ID and Current User.", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User Comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The request was succesfully processed."),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @DeleteMapping(
        value = "/users/current/comments/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> removeCommentByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /users/current/posts/{id} : Remove Post by Current User
     * Deletes a Post associated with a specified ID and Current User.
     *
     * @param id  (required)
     * @return The request was succesfully processed. (status code 204)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Remove Post by Current User", nickname = "removePostByCurrentUser", notes = "Deletes a Post associated with a specified ID and Current User.", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User Posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The request was succesfully processed."),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @DeleteMapping(
        value = "/users/current/posts/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> removePostByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /users/{id} : Remove User
     * Deletes a User associated with a specified ID.
     *
     * @param id  (required)
     * @return The request was succesfully processed. (status code 204)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Remove User", nickname = "removeUser", notes = "Deletes a User associated with a specified ID.", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The request was succesfully processed."),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @DeleteMapping(
        value = "/users/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> removeUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /users/current/comments/{id} : Update Comment by Current User
     * Updates information on a Comment that exists in the system by the specified ID and Current User.
     *
     * @param id  (required)
     * @param comment  (required)
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Update Comment by Current User", nickname = "updateCommentByCurrentUser", notes = "Updates information on a Comment that exists in the system by the specified ID and Current User.", response = Comment.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User Comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @PutMapping(
        value = "/users/current/comments/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<Comment>> updateCommentByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Comment comment) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"user\" : \"\", \"createdOn\" : \"2017-07-21T17:32:28Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /users/current : Update Current User
     * Updates information on a Current User.
     *
     * @param user  (required)
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Update Current User", nickname = "updateCurrentUser", notes = "Updates information on a Current User.", response = User.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @PutMapping(
        value = "/users/current",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<User> updateCurrentUser(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /users/current/posts/{id} : Update Post by Current User
     * Updates information on a Post that exists in the system by the specified ID and Current User.
     *
     * @param id  (required)
     * @param post  (required)
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Update Post by Current User", nickname = "updatePostByCurrentUser", notes = "Updates information on a Post that exists in the system by the specified ID and Current User.", response = Post.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Current User Posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Post.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @PutMapping(
        value = "/users/current/posts/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Post> updatePostByCurrentUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Post post) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"previewAttachment\" : \"previewAttachment\", \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"title\" : \"title\", \"createdOn\" : \"2017-07-21T17:32:28Z\", \"user\" : \"\", \"tags\" : [ { \"name\" : \"Java8\", \"id\" : 6.027456183070403 }, { \"name\" : \"Java8\", \"id\" : 6.027456183070403 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /users/{id} : Update User
     * Updates information on a User that exists in the system by the specified ID.
     *
     * @param id  (required)
     * @param user  (required)
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Update User", nickname = "updateUser", notes = "Updates information on a User that exists in the system by the specified ID.", response = User.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @PutMapping(
        value = "/users/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<User> updateUser(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
