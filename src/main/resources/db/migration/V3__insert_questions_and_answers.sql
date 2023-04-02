insert into question(id, text, task_id)
VALUES (0, 'Что не предусматривают правила внутреннего трудового распорядка и график работы?', 2);
insert into question(id, text, task_id)
values (1,
        'В каких местах в офисе (или около него) можно курить сигареты (или использовать другие никотиносодержащие устройства)?',
        2);
insert into question(id, text, task_id)
VALUES (2, 'Что важно делать при использовании в работе горючих и легковоспламеняющихся веществ?', 2);

insert into answer(text, question_id, is_right)
VALUES ('Звонки с работы по выходным', 0, true);
insert into answer(text, question_id, is_right)
VALUES ('Время начала и окончания работы', 0, false);
insert into answer(text, question_id, is_right)
VALUES ('Время для отдыха и питания', 0, false);
insert into answer(text, question_id, is_right)
VALUES ('Чередование смен', 0, false);

insert into answer(text, question_id, is_right)
VALUES ('В специально отведённых местах', 1, true);
insert into answer(text, question_id, is_right)
VALUES ('В туалете', 1, false);
insert into answer(text, question_id, is_right)
VALUES ('На крыльце', 1, false);
insert into answer(text, question_id, is_right)
VALUES ('В кабинете, если разрешил босс', 1, false);

insert into answer(text, question_id, is_right)
VALUES ('Не отрывать от них глаз', 2, false);
insert into answer(text, question_id, is_right)
VALUES ('Работать с ними только с коллегами', 2, false);
insert into answer(text, question_id, is_right)
VALUES ('Убирать их в безопасное место', 2, true);
insert into answer(text, question_id, is_right)
VALUES ('Медленно их перемещать', 2, false);
