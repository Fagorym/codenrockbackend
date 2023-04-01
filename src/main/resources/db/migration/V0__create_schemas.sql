create table users
(
    id            bigserial primary key,
    name          varchar,
    level         int4,
    experience    int4,
    daily_score   int4,
    current_score int4
);

create table task_group
(
    id          bigserial primary key,
    name        varchar,
    description varchar,
    image       varchar,
    count       int4

);