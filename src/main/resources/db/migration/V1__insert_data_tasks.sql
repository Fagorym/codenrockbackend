insert into knowledge_base(id, content, was_read)
values (0, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (1, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (2, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (3, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (4, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (5, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (6, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (7, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (8, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (9, 'Информация про самую лучшую компанию. Очень много информации.', false);

insert into knowledge_base(id, content, was_read)
values (10, 'Информация про самую лучшую компанию. Очень много информации.', false);



insert into task_group(id, name, description, image, count, is_necessary, knowledge_base_id)
values (0, 'Безопасность', 'Система организационных и технических мероприятий и средств, ' ||
                           'предотвращающих воздействие на работающих опасных производственных ' ||
                           'факторов и направленных на охрану труда, на обеспечение безопасных для жизни и здоровья человека условий ' ||
                           'производственной деятельности.', 'some_image', '16', true, 0);
insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('Рабочее место', 'Блок посвященный рабочему месту', 'some_image', '8', true, 1);
insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('ЧС и Эвакуация', 'Блок посвященный рабочему месту', 'some_image', '8', true, 2);
insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('Инструктаж #1', 'Блок посвященный инструктажу 1', 'some_image', '4', true, 3);
insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('Инструктаж #2', 'Блок посвященный инструктажу 2', 'some_image', '4', true, 4);
insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('RNS WEB', 'Блок посвященный RNS WEB', 'some_image', '2', true, 5);


insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('О компании', 'Блок о блок о блок', 'some_image', '1', false, 6);

insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('Мерроприятия', 'Блок о блок о блок', 'some_image', '1', false, 7);


insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('Офис', 'Блок о блок о блок', 'some_image', '1', false, 8);


insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('Команда', 'Блок о блок о блок', 'some_image', '1', false, 9);


insert into task_group(name, description, image, count, is_necessary, knowledge_base_id)
values ('Руководители', 'Блок о блок о блок', 'some_image', '1', false, 10);