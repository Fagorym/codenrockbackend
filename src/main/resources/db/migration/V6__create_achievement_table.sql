create table achievement
(
    id          bigserial primary key,
    name        varchar,
    description varchar,
    max_score   int4
);

create table user_achievement
(
    user_id        bigserial references users (id),
    achievement_id bigserial references achievement (id),
    user_score     int4
);