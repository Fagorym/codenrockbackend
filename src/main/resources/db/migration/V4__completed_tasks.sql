create table completed_tasks
(
    user_id  bigserial references users (id),
    tasks_id bigserial references task (id)
)