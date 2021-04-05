/*
  NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
  https://openapi-generator.tech
  Do not edit the class manually.
 */
package com.itacademy.blog.api;

import java.math.BigDecimal;
import com.itacademy.blog.model.Comment;
import com.itacademy.blog.model.Error;
import com.itacademy.blog.model.Post;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-05T13:45:49.770317300+03:00[Europe/Kiev]")
@Validated
@Api(value = "posts", description = "the posts API")
public interface PostsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /posts : Create a Post
     *
     * @param post object Post (required)
     * @return CREATED (status code 201)
     *         or The payload contains an error (status code 400)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Create a Post", nickname = "create", notes = "", response = Post.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "CREATED", response = Post.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @PostMapping(
        value = "/posts",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Post> create(@ApiParam(value = "object Post" ,required=true )  @Valid @RequestBody Post post) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"previewAttachment\" : \"previewAttachment\", \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"title\" : \"title\", \"createdOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 6.027456183070403 }, { \"name\" : \"name\", \"id\" : 6.027456183070403 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /posts/{post_id}/comments/{comment_id} : Delete post by ID
     * Delete a post
     *
     * @param postId  (required)
     * @param commentId  (required)
     * @return OK (status code 204)
     *         or The payload contains an error (status code 400)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Delete post by ID", nickname = "deleteComment", notes = "Delete a post", response = Comment.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "OK", response = Comment.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @DeleteMapping(
        value = "/posts/{post_id}/comments/{comment_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Comment> deleteComment(@ApiParam(value = "",required=true) @PathVariable("post_id") BigDecimal postId,@ApiParam(value = "",required=true) @PathVariable("comment_id") BigDecimal commentId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0.8008281904610115, \"text\" : \"text\", \"postId\" : 6.027456183070403, \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"createdOn\" : \"2017-07-21T17:32:28Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /posts/{post_id} : Delete post by ID
     * Delete a post
     *
     * @param postId  (required)
     * @return OK (status code 204)
     *         or The payload contains an error (status code 400)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Delete post by ID", nickname = "deletePost", notes = "Delete a post", response = Post.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "OK", response = Post.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @DeleteMapping(
        value = "/posts/{post_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Post> deletePost(@ApiParam(value = "",required=true) @PathVariable("post_id") BigDecimal postId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"previewAttachment\" : \"previewAttachment\", \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"title\" : \"title\", \"createdOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 6.027456183070403 }, { \"name\" : \"name\", \"id\" : 6.027456183070403 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /posts/{post_id}/comments : This gets all comments to post
     *
     * @param postId  (required)
     * @param userId Find by id (optional)
     * @param id Find by id (optional)
     * @param userName Find by name (optional)
     * @param sort In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to -id)
     * @param pageNum  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @return OK (status code 200)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "This gets all comments to post", nickname = "getAllComments", notes = "", response = Comment.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/posts/{post_id}/comments",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Comment>> getAllComments(@ApiParam(value = "",required=true) @PathVariable("post_id") BigDecimal postId,@ApiParam(value = "Find by id") @Valid @RequestParam(value = "user_id", required = false) BigDecimal userId,@ApiParam(value = "Find by id") @Valid @RequestParam(value = "id", required = false) BigDecimal id,@ApiParam(value = "Find by name") @Valid @RequestParam(value = "user_name", required = false) String userName,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id", defaultValue = "-id") @Valid @RequestParam(value = "sort", required = false, defaultValue="-id") String sort,@ApiParam(value = "", defaultValue = "1") @Valid @RequestParam(value = "page_num", required = false, defaultValue="1") Integer pageNum,@ApiParam(value = "", defaultValue = "20") @Valid @RequestParam(value = "page_size", required = false, defaultValue="20") Integer pageSize) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0.8008281904610115, \"text\" : \"text\", \"postId\" : 6.027456183070403, \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"createdOn\" : \"2017-07-21T17:32:28Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /posts : This gets all posts
     *
     * @param id Find by id (optional)
     * @param tagId This gets all posts with the given tag (optional)
     * @param tagName This gets all posts with the given tag (optional)
     * @param userId This gets all user posts (optional)
     * @param sort In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to -id)
     * @param pageNum  (optional, default to 1)
     * @param pageSize  (optional, default to 30)
     * @return OK (status code 200)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "This gets all posts", nickname = "getAllPosts", notes = "", response = Post.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Post.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/posts",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Post>> getAllPosts(@ApiParam(value = "Find by id") @Valid @RequestParam(value = "id", required = false) BigDecimal id,@ApiParam(value = "This gets all posts with the given tag") @Valid @RequestParam(value = "tag_id", required = false) BigDecimal tagId,@ApiParam(value = "This gets all posts with the given tag") @Valid @RequestParam(value = "tag_name", required = false) String tagName,@ApiParam(value = "This gets all user posts") @Valid @RequestParam(value = "user_id", required = false) BigDecimal userId,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* or *title* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id, title, -title", defaultValue = "-id") @Valid @RequestParam(value = "sort", required = false, defaultValue="-id") String sort,@ApiParam(value = "", defaultValue = "1") @Valid @RequestParam(value = "page_num", required = false, defaultValue="1") Integer pageNum,@ApiParam(value = "", defaultValue = "30") @Valid @RequestParam(value = "page_size", required = false, defaultValue="30") Integer pageSize) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"previewAttachment\" : \"previewAttachment\", \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"title\" : \"title\", \"createdOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 6.027456183070403 }, { \"name\" : \"name\", \"id\" : 6.027456183070403 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /posts/{post_id}/comments/{comment_id} : Find comment by ID
     * Returns a single comment
     *
     * @param postId  (required)
     * @param commentId  (required)
     * @return OK (status code 200)
     *         or The payload contains an error (status code 400)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Find comment by ID", nickname = "getCommentById", notes = "Returns a single comment", response = Comment.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/posts/{post_id}/comments/{comment_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Comment> getCommentById(@ApiParam(value = "",required=true) @PathVariable("post_id") BigDecimal postId,@ApiParam(value = "",required=true) @PathVariable("comment_id") Integer commentId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0.8008281904610115, \"text\" : \"text\", \"postId\" : 6.027456183070403, \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"createdOn\" : \"2017-07-21T17:32:28Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /posts/{post_id} : Find post by ID
     * Returns a post
     *
     * @param postId  (required)
     * @param id Find by id (optional)
     * @param name Find by name (optional)
     * @return OK (status code 200)
     *         or The payload contains an error (status code 400)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Find post by ID", nickname = "getPost", notes = "Returns a post", response = Post.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Post.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/posts/{post_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Post> getPost(@ApiParam(value = "",required=true) @PathVariable("post_id") BigDecimal postId,@ApiParam(value = "Find by id") @Valid @RequestParam(value = "id", required = false) BigDecimal id,@ApiParam(value = "Find by name") @Valid @RequestParam(value = "name", required = false) String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"previewAttachment\" : \"previewAttachment\", \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"title\" : \"title\", \"createdOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 6.027456183070403 }, { \"name\" : \"name\", \"id\" : 6.027456183070403 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /posts/{post_id}/comments : Leave a Comment
     *
     * @param postId  (required)
     * @param comment  (required)
     * @return CREATED (status code 201)
     *         or The payload contains an error (status code 400)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Leave a Comment", nickname = "leaveAComment", notes = "", response = Comment.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "CREATED", response = Comment.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @PostMapping(
        value = "/posts/{post_id}/comments",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Comment> leaveAComment(@ApiParam(value = "",required=true) @PathVariable("post_id") BigDecimal postId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Comment comment) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0.8008281904610115, \"text\" : \"text\", \"postId\" : 6.027456183070403, \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"createdOn\" : \"2017-07-21T17:32:28Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /posts/{post_id}/comments/{comment_id} : Update commet by ID
     * Updates a comment
     *
     * @param postId  (required)
     * @param commentId  (required)
     * @param comment some parameters (required)
     * @return OK (status code 200)
     *         or The payload contains an error (status code 400)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Update commet by ID", nickname = "updateComment", notes = "Updates a comment", response = Comment.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @PutMapping(
        value = "/posts/{post_id}/comments/{comment_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Comment> updateComment(@ApiParam(value = "",required=true) @PathVariable("post_id") BigDecimal postId,@ApiParam(value = "",required=true) @PathVariable("comment_id") BigDecimal commentId,@ApiParam(value = "some parameters" ,required=true )  @Valid @RequestBody Comment comment) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0.8008281904610115, \"text\" : \"text\", \"postId\" : 6.027456183070403, \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"createdOn\" : \"2017-07-21T17:32:28Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /posts/{post_id} : Update post by ID
     * Updates a post
     *
     * @param postId  (required)
     * @param post some parameters (required)
     * @return OK (status code 200)
     *         or The payload contains an error (status code 400)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Update post by ID", nickname = "updatePost", notes = "Updates a post", response = Post.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "posts", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Post.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @PutMapping(
        value = "/posts/{post_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Post> updatePost(@ApiParam(value = "",required=true) @PathVariable("post_id") BigDecimal postId,@ApiParam(value = "some parameters" ,required=true )  @Valid @RequestBody Post post) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"previewAttachment\" : \"previewAttachment\", \"id\" : 0.8008281904610115, \"text\" : \"text\", \"updatedOn\" : \"2017-07-21T17:32:28Z\", \"title\" : \"title\", \"createdOn\" : \"2017-07-21T17:32:28Z\", \"user\" : { \"firstName\" : \"John\", \"lastName\" : \"Smith\", \"password\" : \"passworD321\", \"role\" : \"guest\", \"name\" : \"John78\", \"id\" : 0.8008281904610115, \"email\" : \"john.smith@example.com\" }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 6.027456183070403 }, { \"name\" : \"name\", \"id\" : 6.027456183070403 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
