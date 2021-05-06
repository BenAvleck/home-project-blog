create sequence comment_seq start with 1 increment by 50;
create sequence role_seq start with 4 increment by 50;
create sequence post_seq start with 1 increment by 50;
create sequence tag_seq start with 1 increment by 50;
create sequence user_seq start with 2 increment by 50;
create table comments
(
    id         bigint not null,
    created_on DATE,
    text       varchar(255),
    updated_on DATE,
    user_id    bigint,
    post_id    bigint,
    primary key (id)
);

create table posts
(
    id                 bigint not null,
    created_on         DATE,
    preview_attachment varchar(255),
    text               varchar(255),
    title              varchar(255),
    updated_on         DATE,
    user_id            bigint,
    primary key (id)
);
create table post_tag
(
    post_id bigint,
    tag_id  bigint
);
create table tags
(
    id   bigint       not null,
    name varchar(255) not null,
    primary key (id)
);
create table users
(
    id         bigint       not null,
    email      varchar(255) not null,
    first_name varchar(255),
    last_name  varchar(255),
    name       varchar(255) not null,
    password   varchar(255),
    role_id    bigint,
    primary key (id)
);
create table role
(
    id   bigint not null,
    name varchar(255),
    primary key (id)
);

alter table if exists tags add constraint tag_name unique (name);
alter table if exists users add constraint user_email unique (email);
alter table if exists users add constraint user_name unique (name);
alter table if exists comments add constraint comment_user_id foreign key (user_id) references users on delete set null;
alter table if exists comments add constraint comment_post foreign key (post_id) references posts on delete cascade;
alter table if exists posts add constraint post_user foreign key (user_id) references users on delete set null;
alter table if exists post_tag add constraint post_tag_tags foreign key (tag_id) references tags on delete cascade;
alter table if exists post_tag add constraint post_tag_posts foreign key (post_id) references posts on delete cascade;
alter table if exists users add constraint user_role_id foreign key (role_id) references role;

    insert into role values (1, 'BLOGGER');
    insert into role values (2, 'ADMIN');
    insert into role values (3, 'MODERATOR');
    insert into users values (1, 'test@admin.com', 'firstName', 'lastName', 'admin', '$2a$12$42BJ2.wFofODiUzisXte2uNWTve5Mo4/Xa2fGqCb.vAAOW.YI8k6C', 2);
