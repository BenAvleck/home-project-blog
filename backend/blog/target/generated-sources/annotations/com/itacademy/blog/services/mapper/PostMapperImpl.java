package com.itacademy.blog.services.mapper;

import com.itacademy.blog.data.entity.Post;
import com.itacademy.blog.data.entity.Role;
import com.itacademy.blog.data.entity.Tag;
import com.itacademy.blog.data.entity.User;
import com.itacademy.blog.services.DTO.NameEnum;
import com.itacademy.blog.services.DTO.PostDTO;
import com.itacademy.blog.services.DTO.RoleDTO;
import com.itacademy.blog.services.DTO.UserDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-29T21:57:45+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDTO convert(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDTO postDTO = new PostDTO();

        postDTO.setUser( userToUserDTO( post.getUser() ) );
        postDTO.setId( post.getId() );
        List<Tag> list = post.getTags();
        if ( list != null ) {
            postDTO.setTags( new ArrayList<Tag>( list ) );
        }
        postDTO.setCreatedOn( post.getCreatedOn() );
        postDTO.setText( post.getText() );
        postDTO.setTitle( post.getTitle() );
        postDTO.setPreviewAttachment( post.getPreviewAttachment() );
        postDTO.setUpdatedOn( post.getUpdatedOn() );

        return postDTO;
    }

    @Override
    public Post convert(PostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Post post = new Post();

        post.setUser( userDTOToUser( postDTO.getUser() ) );
        post.setId( postDTO.getId() );
        List<Tag> list = postDTO.getTags();
        if ( list != null ) {
            post.setTags( new ArrayList<Tag>( list ) );
        }
        post.setCreatedOn( postDTO.getCreatedOn() );
        post.setText( postDTO.getText() );
        post.setTitle( postDTO.getTitle() );
        post.setPreviewAttachment( postDTO.getPreviewAttachment() );
        post.setUpdatedOn( postDTO.getUpdatedOn() );

        return post;
    }

    @Override
    public List<PostDTO> convert(List<Post> postEntities) {
        if ( postEntities == null ) {
            return null;
        }

        List<PostDTO> list = new ArrayList<PostDTO>( postEntities.size() );
        for ( Post post : postEntities ) {
            list.add( convert( post ) );
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
        userDTO.setRole( roleToRoleDTO( user.getRole() ) );

        userDTO.setPassword( "********" );

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

        User user = new User();

        if ( userDTO.getId() != null ) {
            user.setId( userDTO.getId().longValue() );
        }
        user.setName( userDTO.getName() );
        user.setFirstName( userDTO.getFirstName() );
        user.setLastName( userDTO.getLastName() );
        user.setEmail( userDTO.getEmail() );
        user.setPassword( userDTO.getPassword() );
        user.setRole( roleDTOToRole( userDTO.getRole() ) );

        return user;
    }
}
