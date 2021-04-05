/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.itacademy.blog.api;

import java.math.BigDecimal;
import com.itacademy.blog.model.Comment;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-05T10:45:48.815140100+03:00[Europe/Kiev]")
@Validated
@Api(value = "comments", description = "the comments API")
public interface CommentsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /comments/{comment_id} : Delete post by ID
     * Delete a post
     *
     * @param commentId  (required)
     * @return OK (status code 204)
     *         or BAD REQUEST (status code 400)
     *         or NOT FOUND (status code 404)
     */
    @ApiOperation(value = "Delete post by ID", nickname = "deleteComment", notes = "Delete a post", response = Comment.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "OK", response = Comment.class),
        @ApiResponse(code = 400, message = "BAD REQUEST"),
        @ApiResponse(code = 404, message = "NOT FOUND") })
    @DeleteMapping(
        value = "/comments/{comment_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Comment> deleteComment(@ApiParam(value = "",required=true) @PathVariable("comment_id") BigDecimal commentId) {
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
     * GET /comments/{post_id} : This gets all comments to post
     * In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desk* sorting must be specified in the query parameter *-id*
     *
     * @param postId  (required)
     * @param userId Find by id (optional)
     * @param id Find by id (optional)
     * @param userName Find by name (optional)
     * @param sort  (optional, default to -id)
     * @param pageNum  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @return OK (status code 200)
     *         or NOT FOUND (status code 404)
     */
    @ApiOperation(value = "This gets all comments to post", nickname = "getAllComments", notes = "In order to execute *asc*, you need to specify in the search *id* parameter. In order to complete the *desk* sorting must be specified in the query parameter *-id*", response = Comment.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "NOT FOUND") })
    @GetMapping(
        value = "/comments/{post_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Comment>> getAllComments(@ApiParam(value = "",required=true) @PathVariable("post_id") BigDecimal postId,@ApiParam(value = "Find by id") @Valid @RequestParam(value = "user_id", required = false) BigDecimal userId,@ApiParam(value = "Find by id") @Valid @RequestParam(value = "id", required = false) BigDecimal id,@ApiParam(value = "Find by name") @Valid @RequestParam(value = "user_name", required = false) String userName,@ApiParam(value = "", allowableValues = "id, -id", defaultValue = "-id") @Valid @RequestParam(value = "sort", required = false, defaultValue="-id") String sort,@ApiParam(value = "", defaultValue = "1") @Valid @RequestParam(value = "page_num", required = false, defaultValue="1") Integer pageNum,@ApiParam(value = "", defaultValue = "20") @Valid @RequestParam(value = "page_size", required = false, defaultValue="20") Integer pageSize) {
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
     * GET /comments/{comment_id} : Find comment by ID
     * Returns a single comment
     *
     * @param commentId  (required)
     * @return OK (status code 200)
     *         or BAD REQUEST (status code 400)
     *         or NOT FOUND (status code 404)
     */
    @ApiOperation(value = "Find comment by ID", nickname = "getCommentById", notes = "Returns a single comment", response = Comment.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class),
        @ApiResponse(code = 400, message = "BAD REQUEST"),
        @ApiResponse(code = 404, message = "NOT FOUND") })
    @GetMapping(
        value = "/comments/{comment_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Comment> getCommentById(@ApiParam(value = "",required=true) @PathVariable("comment_id") Integer commentId) {
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
     * POST /comments/{post_id} : Leave a Comment
     *
     * @param postId  (required)
     * @param comment  (required)
     * @return CREATED (status code 201)
     *         or BAD REQUEST (status code 400)
     */
    @ApiOperation(value = "Leave a Comment", nickname = "leaveAComment", notes = "", response = Comment.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "CREATED", response = Comment.class),
        @ApiResponse(code = 400, message = "BAD REQUEST") })
    @PostMapping(
        value = "/comments/{post_id}",
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
     * PUT /comments/{comment_id} : Update commet by ID
     * Updates a comment
     *
     * @param commentId  (required)
     * @param comment some parameters (required)
     * @return OK (status code 200)
     *         or BAD REQUEST (status code 400)
     *         or NOT FOUND (status code 404)
     */
    @ApiOperation(value = "Update commet by ID", nickname = "updateComment", notes = "Updates a comment", response = Comment.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "comments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Comment.class),
        @ApiResponse(code = 400, message = "BAD REQUEST"),
        @ApiResponse(code = 404, message = "NOT FOUND") })
    @PutMapping(
        value = "/comments/{comment_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Comment> updateComment(@ApiParam(value = "",required=true) @PathVariable("comment_id") BigDecimal commentId,@ApiParam(value = "some parameters" ,required=true )  @Valid @RequestBody Comment comment) {
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

}
