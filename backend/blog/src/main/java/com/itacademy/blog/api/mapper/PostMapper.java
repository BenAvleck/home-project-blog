package com.itacademy.blog.api.mapper;


import com.itacademy.blog.model.Author;
import com.itacademy.blog.model.Post;
import com.itacademy.blog.services.DTO.PostDTO;
import com.itacademy.blog.services.DTO.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PostMapper {
    PostMapper INSTANCE = Mappers.getMapper( PostMapper.class );

    @Mapping(source = "author", target = "user")
    PostDTO convert(Post post);

    Author convert(UserDTO user );
    @Mapping(source = "user", target = "author")
    Post convert(PostDTO postDTO);

    List<Post> convert(List<PostDTO> postDTOList);
}
