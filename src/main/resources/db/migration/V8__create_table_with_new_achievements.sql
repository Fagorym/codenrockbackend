create table new_achievements
(
    user_id        bigserial references users (id),
    achievement_id bigserial references achievement (id)
);