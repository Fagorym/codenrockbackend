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
    id           bigserial primary key,
    name         varchar,
    description  varchar,
    image        varchar,
    is_necessary bool,
    count        int4

);

create table task
(
    id                bigserial primary key,
    number            int4,
    earned_experience int4,
    name              varchar,
    description       varchar,
    type              int4,
    group_id          bigserial references task_group (id)
);

create table question
(
    id      bigserial primary key,
    text    varchar,
    task_id bigserial references task (id)
);

create table answer
(
    id          bigserial primary key,
    text        varchar,
    question_id bigserial references question (id),
    is_right    boolean

)