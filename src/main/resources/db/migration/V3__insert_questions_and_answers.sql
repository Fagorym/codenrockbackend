insert into question(id, text, task_id)
VALUES (0, 'Чего нельзя делать при работе с компьютером?', 1);
insert into question(id, text, task_id)
values (1, 'Как нельзя ставить ноги при работе с компьютером?', 1);

insert into question(id, text, task_id)
VALUES (2, 'Чего нужно опасаться при работе с компьютером?', 1);
insert into question(id, text, task_id)
values (3, 'Назовите основной принцип информационной безопасности', 1);


insert into answer(text, question_id, is_right)
VALUES ('Нельзя есть перед компьютером', 0, true);

insert into answer(text, question_id, is_right)
VALUES ('Нельзя работать перед компьютером', 0, false);

insert into answer(text, question_id, is_right)
VALUES ('Нельзя сидеть перед компьютером', 0, false);


insert into answer(text, question_id, is_right)
VALUES ('Нельзя ставить ноги на стол', 1, true);

insert into answer(text, question_id, is_right)
VALUES ('Нельзя ставить ноги под стол', 1, false);

insert into answer(text, question_id, is_right)
VALUES ('Нельзя ставить ногу на ногу', 1, false);

insert into answer(text, question_id, is_right)
VALUES ('Землятрясения', 2, true);

insert into answer(text, question_id, is_right)
VALUES ('Акул', 2, false);

insert into answer(text, question_id, is_right)
VALUES ('Компьютерных вирусов и мошенников', 2, true);

insert into answer(text, question_id, is_right)
VALUES ('Выживает сильнейший', 3, false);

insert into answer(text, question_id, is_right)
VALUES ('Не имей сто рублей, а имей сто друзей', 3, false);

insert into answer(text, question_id, is_right)
VALUES ('Если ты запустил чужой код на своем компьютере, то это уже не твой компьютер', 3, true);



insert into question(id, text, task_id)
VALUES (4, 'Чего нельзя делать при работе с компьютером?', 2);
insert into question(id, text, task_id)
values (5, 'Как нельзя ставить ноги при работе с компьютером?', 2);

insert into question(id, text, task_id)
VALUES (6, 'Чего нужно опасаться при работе с компьютером?', 2);
insert into question(id, text, task_id)
values (7, 'Назовите основной принцип информационной безопасности', 2);


insert into answer(text, question_id, is_right)
VALUES ('Нельзя есть перед компьютером', 4, true);

insert into answer(text, question_id, is_right)
VALUES ('Нельзя работать перед компьютером', 4, false);

insert into answer(text, question_id, is_right)
VALUES ('Нельзя сидеть перед компьютером', 4, false);


insert into answer(text, question_id, is_right)
VALUES ('Нельзя ставить ноги на стол', 5, true);

insert into answer(text, question_id, is_right)
VALUES ('Нельзя ставить ноги под стол', 5, false);

insert into answer(text, question_id, is_right)
VALUES ('Нельзя ставить ногу на ногу', 5, false);

insert into answer(text, question_id, is_right)
VALUES ('Землятрясения', 6, true);

insert into answer(text, question_id, is_right)
VALUES ('Акул', 6, false);

insert into answer(text, question_id, is_right)
VALUES ('Компьютерных вирусов и мошенников', 6, true);

insert into answer(text, question_id, is_right)
VALUES ('Выживает сильнейший', 7, false);

insert into answer(text, question_id, is_right)
VALUES ('Не имей сто рублей, а имей сто друзей', 7, false);

insert into answer(text, question_id, is_right)
VALUES ('Если ты запустил чужой код на своем компьютере, то это уже не твой компьютер', 7, true);