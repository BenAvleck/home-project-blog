package com.itacademy.blog.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private NameEnum name = NameEnum.BLOGGER;

    public enum NameEnum {

        BLOGGER(Set.of()),

        MODERATOR(Set.of(Permission.TAG_REMOVE
                ,Permission.POST_UPDATE
                ,Permission.POST_DELETE
                ,Permission.COMMENTS_UPDATE
                ,Permission.COMMENTS_DELETE)),

        ADMIN(Set.of(Permission.USER_MANAGEMENT
                ,Permission.TAG_REMOVE
                ,Permission.POST_UPDATE
                ,Permission.POST_DELETE
                ,Permission.COMMENTS_UPDATE
                ,Permission.COMMENTS_DELETE
                ,Permission.ROLE_MANAGEMENT));

        private final Set<Permission> permissions;

        NameEnum(Set<Permission> permissions) {
            this.permissions = permissions;
        }

        public Set<Permission> getPermissions() {
            return permissions;
        }

        public Set<SimpleGrantedAuthority> getAuthorities() {
            return getPermissions().stream()
                    .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                    .collect(Collectors.toSet());
        }
    }

}

