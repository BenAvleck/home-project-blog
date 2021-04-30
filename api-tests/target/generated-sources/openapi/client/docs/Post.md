

# Post

A representation of Post entity.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **BigDecimal** | The ID of the Post. |  [optional] [readonly]
**tags** | [**List&lt;Tag&gt;**](Tag.md) | The subset of assosiated tags to the Post. |  [optional]
**createdOn** | **OffsetDateTime** | The Post creation date. |  [optional] [readonly]
**user** | [**User**](User.md) | The creator of the Post. |  [optional] [readonly]
**text** | **String** | The content of the Post. |  [optional]
**title** | **String** | The summary of the Post. | 
**previewAttachment** | **String** | URL of the resource that will be used as an preview of the Post. | 
**updatedOn** | **OffsetDateTime** | The Post update date. |  [optional] [readonly]



