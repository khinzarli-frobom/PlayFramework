# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  user_id                       bigint,
  user_name                     varchar(255),
  user_email                    varchar(255),
  user_password                 varchar(255)
);


# --- !Downs

drop table if exists user;

