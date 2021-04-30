package com.itacademy.blog.services.mapper;

import com.itacademy.blog.data.entity.Role;
import com.itacademy.blog.data.entity.User;
import com.itacademy.blog.services.DTO.NameEnum;
import com.itacademy.blog.services.DTO.RoleDTO;
import com.itacademy.blog.services.DTO.UserDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-04-30T22:35:20+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO convert(User user) {
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
        userDTO.setRole( convert( user.getRole() ) );

        userDTO.setPassword( "********" );

        return userDTO;
    }

    @Override
    public User convert(UserDTO userDTO) {
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
        user.setRole( convert( userDTO.getRole() ) );

        return user;
    }

    @Override
    public RoleDTO convert(Role value) {
        if ( value == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setName( nameEnumToNameEnum( value.getName() ) );

        return roleDTO;
    }

    @Override
    public Role convert(RoleDTO value) {
        if ( value == null ) {
            return null;
        }

        Role role = new Role();

        role.setName( nameEnumToNameEnum1( value.getName() ) );

        return role;
    }

    @Override
    public List<UserDTO> convert(List<User> userEntities) {
        if ( userEntities == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( userEntities.size() );
        for ( User user : userEntities ) {
            list.add( convert( user ) );
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
}
