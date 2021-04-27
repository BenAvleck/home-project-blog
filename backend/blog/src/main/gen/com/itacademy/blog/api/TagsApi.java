/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.itacademy.blog.api;

import java.math.BigDecimal;
import com.itacademy.blog.model.Error;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-27T20:44:50.769328600+03:00[Europe/Kiev]")
@Validated
@Api(value = "tags", description = "the tags API")
public interface TagsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /tags/{id} : Get Tag by ID
     * Retrieves an existing Tag associated with the specified ID.
     *
     * @param id  (required)
     * @return OK (status code 200)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Get Tag by ID", nickname = "getTag", notes = "Retrieves an existing Tag associated with the specified ID.", response = Tag.class, authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Tag.class),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/tags/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Tag> getTag(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Java8\", \"id\" : 6.027456183070403 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tags : Get tags
     * Uses query keys to retrieve a subset of existing tags.
     *
     * @param id  (optional)
     * @param name  (optional)
     * @param sort In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id*  (optional, default to name)
     * @param pageNum  (optional)
     * @param pageSize  (optional)
     * @return OK (status code 200)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Get tags", nickname = "getTags", notes = "Uses query keys to retrieve a subset of existing tags.", response = Tag.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Tag.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @GetMapping(
        value = "/tags",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Tag>> getTags(@ApiParam(value = "") @Valid @RequestParam(value = "id", required = false) BigDecimal id,@ApiParam(value = "") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "In order to execute *asc*, you need to specify in the search *id* or *name* parameter. In order to complete the *desc* sorting must be specified in the query parameter *-id* ", allowableValues = "id, -id, name, -name", defaultValue = "name") @Valid @RequestParam(value = "sort", required = false, defaultValue="name") String sort,@ApiParam(value = "") @Valid @RequestParam(value = "page_num", required = false) Integer pageNum,@ApiParam(value = "") @Valid @RequestParam(value = "page_size", required = false) Integer pageSize) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Java8\", \"id\" : 6.027456183070403 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /tags/{id} : Remove Tag
     * Deletes a Tag associated with a specified ID.
     *
     * @param id  (required)
     * @return The request was succesfully processed. (status code 204)
     *         or The payload contains an error. (status code 400)
     *         or The specified resource was not found. (status code 404)
     *         or The unknown error appeard. Check your payload or contact support. (status code 200)
     */
    @ApiOperation(value = "Remove Tag", nickname = "removeTag", notes = "Deletes a Tag associated with a specified ID.", authorizations = {
        
        @Authorization(value = "basicAuth")
         }, tags={ "Tags", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The request was succesfully processed."),
        @ApiResponse(code = 400, message = "The payload contains an error.", response = Error.class),
        @ApiResponse(code = 404, message = "The specified resource was not found.", response = Error.class),
        @ApiResponse(code = 200, message = "The unknown error appeard. Check your payload or contact support.", response = Error.class) })
    @DeleteMapping(
        value = "/tags/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> removeTag(@ApiParam(value = "",required=true) @PathVariable("id") BigDecimal id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
