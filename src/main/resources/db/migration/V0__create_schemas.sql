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
    is_necessary bool,
    count       int4

);

create table task
(
    id           bigserial primary key,
    number       int4,
    name         varchar,
    description  varchar,
    type         int4,
    group_id     bigserial references task_group (id)
)