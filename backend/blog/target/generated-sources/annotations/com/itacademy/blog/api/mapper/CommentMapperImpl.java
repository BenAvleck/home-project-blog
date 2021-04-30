package com.itacademy.blog.api.mapper;

import com.itacademy.blog.model.Author;
import com.itacademy.blog.model.Comment;
import com.itacademy.blog.services.DTO.CommentDTO;
import com.itacademy.blog.services.DTO.UserDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-30T22:35:21+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentDTO convert(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDTO commentDTO = new CommentDTO();

        commentDTO.setUser( authorToUserDTO( comment.getUser() ) );
        if ( comment.getId() != null ) {
            commentDTO.setId( comment.getId().longValue() );
        }
        commentDTO.setText( comment.getText() );
        commentDTO.setCreatedOn( comment.getCreatedOn() );
        commentDTO.setUpdatedOn( comment.getUpdatedOn() );

        return commentDTO;
    }

    @Override
    public Comment convert(CommentDTO commentDTO) {
        if ( commentDTO == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setUser( userDTOToAuthor( commentDTO.getUser() ) );
        if ( commentDTO.getId() != null ) {
            comment.setId( BigDecimal.valueOf( commentDTO.getId() ) );
        }
        comment.setText( commentDTO.getText() );
        comment.setCreatedOn( commentDTO.getCreatedOn() );
        comment.setUpdatedOn( commentDTO.getUpdatedOn() );

        return comment;
    }

    @Override
    public List<CommentDTO> convert(List<Comment> commentEntities) {
        if ( commentEntities == null ) {
            return null;
        }

        List<CommentDTO> list = new ArrayList<CommentDTO>( commentEntities.size() );
        for ( Comment comment : commentEntities ) {
            list.add( convert( comment ) );
        }

        return list;
    }

    protected UserDTO authorToUserDTO(Author author) {
        if ( author == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setName( author.getName() );
        userDTO.setFirstName( author.getFirstName() );
        userDTO.setLastName( author.getLastName() );

        return userDTO;
    }

    protected Author userDTOToAuthor(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        Author author = new Author();

        author.setName( userDTO.getName() );
        author.setFirstName( userDTO.getFirstName() );
        author.setLastName( userDTO.getLastName() );

        return author;
    }
}
