package com.itacademy.blog.api.mapper;

import com.itacademy.blog.data.entity.Tag;
import com.itacademy.blog.data.entity.Tag.TagBuilder;
import com.itacademy.blog.data.entity.User.UserBuilder;
import com.itacademy.blog.model.Post;
import com.itacademy.blog.model.User;
import com.itacademy.blog.model.User.RoleEnum;
import com.itacademy.blog.services.DTO.PostDTO;
import com.itacademy.blog.services.DTO.PostDTO.PostDTOBuilder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-26T17:38:16+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class PostMapperImpl implements PostMapper {

    @Override
    public PostDTO convert(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDTOBuilder postDTO = PostDTO.builder();

        postDTO.user( userToUser( post.getUser() ) );
        if ( post.getId() != null ) {
            postDTO.id( post.getId().longValue() );
        }
        postDTO.tags( tagListToTagList( post.getTags() ) );
        postDTO.createdOn( post.getCreatedOn() );
        postDTO.text( post.getText() );
        postDTO.title( post.getTitle() );
        postDTO.previewAttachment( post.getPreviewAttachment() );
        postDTO.updatedOn( post.getUpdatedOn() );

        return postDTO.build();
    }

    @Override
    public Post convert(PostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Post post = new Post();

        post.setUser( userToUser1( postDTO.getUser() ) );
        if ( postDTO.getId() != null ) {
            post.setId( BigDecimal.valueOf( postDTO.getId() ) );
        }
        post.setTags( tagListToTagList1( postDTO.getTags() ) );
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

    protected com.itacademy.blog.data.entity.User.RoleEnum roleEnumToRoleEnum(RoleEnum roleEnum) {
        if ( roleEnum == null ) {
            return null;
        }

        com.itacademy.blog.data.entity.User.RoleEnum roleEnum1;

        switch ( roleEnum ) {
            case BLOGGER: roleEnum1 = com.itacademy.blog.data.entity.User.RoleEnum.BLOGGER;
            break;
            case MODERATOR: roleEnum1 = com.itacademy.blog.data.entity.User.RoleEnum.MODERATOR;
            break;
            case ADMIN: roleEnum1 = com.itacademy.blog.data.entity.User.RoleEnum.ADMIN;
            break;
            case EXPERT: roleEnum1 = com.itacademy.blog.data.entity.User.RoleEnum.EXPERT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + roleEnum );
        }

        return roleEnum1;
    }

    protected com.itacademy.blog.data.entity.User userToUser(User user) {
        if ( user == null ) {
            return null;
        }

        UserBuilder user1 = com.itacademy.blog.data.entity.User.builder();

        if ( user.getId() != null ) {
            user1.id( user.getId().longValue() );
        }
        user1.name( user.getName() );
        user1.firstName( user.getFirstName() );
        user1.lastName( user.getLastName() );
        user1.email( user.getEmail() );
        user1.password( user.getPassword() );
        user1.role( roleEnumToRoleEnum( user.getRole() ) );

        return user1.build();
    }

    protected Tag tagToTag(com.itacademy.blog.model.Tag tag) {
        if ( tag == null ) {
            return null;
        }

        TagBuilder tag1 = Tag.builder();

        if ( tag.getId() != null ) {
            tag1.id( tag.getId().longValue() );
        }
        tag1.name( tag.getName() );

        return tag1.build();
    }

    protected List<Tag> tagListToTagList(List<com.itacademy.blog.model.Tag> list) {
        if ( list == null ) {
            return null;
        }

        List<Tag> list1 = new ArrayList<Tag>( list.size() );
        for ( com.itacademy.blog.model.Tag tag : list ) {
            list1.add( tagToTag( tag ) );
        }

        return list1;
    }

    protected RoleEnum roleEnumToRoleEnum1(com.itacademy.blog.data.entity.User.RoleEnum roleEnum) {
        if ( roleEnum == null ) {
            return null;
        }

        RoleEnum roleEnum1;

        switch ( roleEnum ) {
            case BLOGGER: roleEnum1 = RoleEnum.BLOGGER;
            break;
            case MODERATOR: roleEnum1 = RoleEnum.MODERATOR;
            break;
            case ADMIN: roleEnum1 = RoleEnum.ADMIN;
            break;
            case EXPERT: roleEnum1 = RoleEnum.EXPERT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + roleEnum );
        }

        return roleEnum1;
    }

    protected User userToUser1(com.itacademy.blog.data.entity.User user) {
        if ( user == null ) {
            return null;
        }

        User user1 = new User();

        if ( user.getId() != null ) {
            user1.setId( BigDecimal.valueOf( user.getId() ) );
        }
        user1.setName( user.getName() );
        user1.setFirstName( user.getFirstName() );
        user1.setLastName( user.getLastName() );
        user1.setEmail( user.getEmail() );
        user1.setRole( roleEnumToRoleEnum1( user.getRole() ) );

        user1.setPassword( "********" );

        return user1;
    }

    protected com.itacademy.blog.model.Tag tagToTag1(Tag tag) {
        if ( tag == null ) {
            return null;
        }

        com.itacademy.blog.model.Tag tag1 = new com.itacademy.blog.model.Tag();

        if ( tag.getId() != null ) {
            tag1.setId( BigDecimal.valueOf( tag.getId() ) );
        }
        tag1.setName( tag.getName() );

        return tag1;
    }

    protected List<com.itacademy.blog.model.Tag> tagListToTagList1(List<Tag> list) {
        if ( list == null ) {
            return null;
        }

        List<com.itacademy.blog.model.Tag> list1 = new ArrayList<com.itacademy.blog.model.Tag>( list.size() );
        for ( Tag tag : list ) {
            list1.add( tagToTag1( tag ) );
        }

        return list1;
    }
}
