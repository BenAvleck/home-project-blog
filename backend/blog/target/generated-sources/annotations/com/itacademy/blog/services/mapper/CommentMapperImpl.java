package com.itacademy.blog.services.mapper;

import com.itacademy.blog.data.entity.Comment;
import com.itacademy.blog.data.entity.Comment.CommentBuilder;
import com.itacademy.blog.data.entity.Role;
import com.itacademy.blog.data.entity.User;
import com.itacademy.blog.data.entity.User.UserBuilder;
import com.itacademy.blog.services.DTO.CommentDTO;
import com.itacademy.blog.services.DTO.NameEnum;
import com.itacademy.blog.services.DTO.RoleDTO;
import com.itacademy.blog.services.DTO.UserDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-29T21:58:17+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class CommentMapperImpl implements CommentMapper {

    @Override
    public CommentDTO convert(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDTO commentDTO = new CommentDTO();

        commentDTO.setUser( userToUserDTO( comment.getUser() ) );
        commentDTO.setId( comment.getId() );
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

        CommentBuilder comment = Comment.builder();

        comment.user( userDTOToUser( commentDTO.getUser() ) );
        comment.id( commentDTO.getId() );
        comment.text( commentDTO.getText() );
        comment.createdOn( commentDTO.getCreatedOn() );
        comment.updatedOn( commentDTO.getUpdatedOn() );

        return comment.build();
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

    protected NameEnum nameEnumToNameEnum(com.itacademy.blog.data.entity.Role.NameEnum nameEnum) {
        if ( nameEnum == null ) {
            return null;
        }

        NameEnum nameEnum1;

        switch ( nameEnum ) {
            case BLOGGER: nameEnum1 = NameEnum.BLOGGER;
            break;
            case MODERATOR: nameEnum1 = NameEnum.MODERATOR;
            break;
            case ADMIN: nameEnum1 = NameEnum.ADMIN;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + nameEnum );
        }

        return nameEnum1;
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setName( nameEnumToNameEnum( role.getName() ) );

        return roleDTO;
    }

    protected UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        if ( user.getId() != null ) {
            userDTO.setId( BigDecimal.valueOf( user.getId() ) );
        }
        userDTO.setName( user.getName() );
        userDTO.setFirstName( user.getFirstName() );
        userDTO.setLastName( user.getLastName() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setPassword( user.getPassword() );
        userDTO.setRole( roleToRoleDTO( user.getRole() ) );

        return userDTO;
    }

    protected com.itacademy.blog.data.entity.Role.NameEnum nameEnumToNameEnum1(NameEnum nameEnum) {
        if ( nameEnum == null ) {
            return null;
        }

        com.itacademy.blog.data.entity.Role.NameEnum nameEnum1;

        switch ( nameEnum ) {
            case BLOGGER: nameEnum1 = com.itacademy.blog.data.entity.Role.NameEnum.BLOGGER;
            break;
            case MODERATOR: nameEnum1 = com.itacademy.blog.data.entity.Role.NameEnum.MODERATOR;
            break;
            case ADMIN: nameEnum1 = com.itacademy.blog.data.entity.Role.NameEnum.ADMIN;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + nameEnum );
        }

        return nameEnum1;
    }

    protected Role roleDTOToRole(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setName( nameEnumToNameEnum1( roleDTO.getName() ) );

        return role;
    }

    protected User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        if ( userDTO.getId() != null ) {
            user.id( userDTO.getId().longValue() );
        }
        user.name( userDTO.getName() );
        user.firstName( userDTO.getFirstName() );
        user.lastName( userDTO.getLastName() );
        user.email( userDTO.getEmail() );
        user.password( userDTO.getPassword() );
        user.role( roleDTOToRole( userDTO.getRole() ) );

        return user.build();
    }
}
