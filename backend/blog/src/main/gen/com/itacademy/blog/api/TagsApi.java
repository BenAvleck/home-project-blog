/*
  NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
  https://openapi-generator.tech
  Do not edit the class manually.
 */
package com.itacademy.blog.api;

import java.math.BigDecimal;
import com.itacademy.blog.model.Error;
import com.itacademy.blog.model.Post;
import com.itacademy.blog.model.Tag;
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
@Api(value = "tags", description = "the tags API")
public interface TagsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /tags/{tag_id} : Delete a tag by ID
     *
     * @param tagId  (required)
     * @return OK (status code 204)
     *         or The payload contains an error (status code 400)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Delete a tag by ID", nickname = "deleteTag", notes = "", response = Post.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "OK", response = Post.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @DeleteMapping(
        value = "/tags/{tag_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Post> deleteTag(@ApiParam(value = "",required=true) @PathVariable("tag_id") BigDecimal tagId) {
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
     * GET /tags
     *
     * @param id Find by id (optional)
     * @param name Find by name (optional)
     * @param sort In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to name)
     * @param pageNum  (optional)
     * @param pageSize  (optional)
     * @return OK (status code 200)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "", nickname = "getAllTags", notes = "", response = Tag.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Tag.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/tags",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Tag>> getAllTags(@ApiParam(value = "Find by id") @Valid @RequestParam(value = "id", required = false) BigDecimal id,@ApiParam(value = "Find by name") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id, name, -name", defaultValue = "name") @Valid @RequestParam(value = "sort", required = false, defaultValue="name") String sort,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 6.027456183070403 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tags/{tag_id} : Find tag by ID
     * Returns a tag
     *
     * @param tagId  (required)
     * @return OK (status code 200)
     *         or The payload contains an error (status code 400)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Find tag by ID", nickname = "getTag", notes = "Returns a tag", response = Tag.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Tag.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/tags/{tag_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Tag> getTag(@ApiParam(value = "",required=true) @PathVariable("tag_id") BigDecimal tagId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 6.027456183070403 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /tags/{tag_id} : Update tag by ID
     *
     * @param tagId  (required)
     * @param tag  (required)
     * @return OK (status code 200)
     *         or The payload contains an error (status code 400)
     *         or The specified resource was not found (status code 404)
     *         or The unknown error appeard. Check you payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Update tag by ID", nickname = "updateTag", notes = "", response = Tag.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Tag.class),
        @ApiResponse(code = 400, message = "The payload contains an error", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check you payload or contact support.", response = Error.class) })
    @PutMapping(
        value = "/tags/{tag_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Tag> updateTag(@ApiParam(value = "",required=true) @PathVariable("tag_id") BigDecimal tagId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Tag tag) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : 6.027456183070403 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
