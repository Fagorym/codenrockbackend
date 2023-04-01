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

create table task
(
    id          bigserial primary key,
    name        varchar,
    description varchar,
    type        int4,
    is_necessary bool,
    group_id    bigserial references task_group (id)
)