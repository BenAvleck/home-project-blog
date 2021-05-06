package com.itacademy.blog.api.mapper;

import com.itacademy.blog.model.Author;
import com.itacademy.blog.model.Comment;
import com.itacademy.blog.services.DTO.CommentDTO;
import com.itacademy.blog.services.DTO.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    @Mapping(source = "author", target = "user")
    CommentDTO convert(Comment comment);

    @Mapping(source = "user", target = "author")
    Comment convert(CommentDTO commentDTO);

    @Mapping(target = "firstName", source = "firstName")
    @Mapping(target = "lastName", source = "lastName")
    @Mapping(target = "name", source = "name")
    Author convert(UserDTO user);

    List<Comment> convert(List<CommentDTO> commentDTOList);
}
