insert into question(id, text, task_id)
VALUES (0, 'Какой самый большой блок текст в мире?', 1);
insert into question(id, text, task_id)
values (1, 'Где самые большие ставки на спорт', 1);


insert into question(id, text, task_id)
VALUES (2, 'Самокат или бровь?', 0);
insert into question(id, text, task_id)
values (3, 'Двадцать пять солдатов?', 0);


insert into answer(id, text, question_id, is_right)
VALUES (0, 'Да', 0, false);

insert into answer(id, text, question_id, is_right)
VALUES (1, 'Нет', 0, true);

insert into answer(id, text, question_id, is_right)
VALUES (2, 'Не знаю', 0, false);


insert into answer(id, text, question_id, is_right)
VALUES (3, '3', 1, false);

insert into answer(id, text, question_id, is_right)
VALUES (4, '5', 1, true);

insert into answer(id, text, question_id, is_right)
VALUES (5, '9', 1, false);


insert into answer(id, text, question_id, is_right)
VALUES (6, 'Длинный текстДлинный ' ||
           'Длинный текстДлинный текстДлинный текст' ||
           'Длинный текстДлинный текстДлинный текст' ||
           'текстДлинный текстДлинный текстДл' ||
           'Длинный текст' ||
           'Длинный текст' ||
           'Длинный текст' ||
           'Длинный текст' ||
           'Длинный текст' ||
           'Длинный текст' ||
           'Длинный текст' ||
           'Длинный текстинный текстДлинный текст', 2, false);

insert into answer(id, text, question_id, is_right)
VALUES (7, 'Нет', 2, true);

insert into answer(id, text, question_id, is_right)
VALUES (8, 'Не знаю', 2, false);


insert into answer(id, text, question_id, is_right)
VALUES (9, 'Gjgeufq', 3, true);

insert into answer(id, text, question_id, is_right)
VALUES (10, 'FDKfsdkl ', 3, false);

insert into answer(id, text, question_id, is_right)
VALUES (11, 'dsakdsakdsald', 3, false);