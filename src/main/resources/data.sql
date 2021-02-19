insert into university(id, name) values (0, 'National university Lviv Polytechnic');
insert into university(id, name) values (1, 'Lviv National university');

insert into degree(id, name) values (0, 'assistant'), (1,'associate professor'), (2, 'professor');
insert into departament (id, name, head, un_id) values (2, 'Economic', 'Vasyl Lypytskyi', 1);
insert into departament (id, name, head, un_id) values (3, 'Pravo', 'Nazar Bobko', 1);
insert into lector(id, name, age, salary, un_id, deg_id, dep_id) values (2, 'Piatov Andriy', 35, 11000, 1, 2, 3);
insert into lector(id, name, age, salary, un_id, deg_id, dep_id) values (3, 'Cristiano Ronaldo', 36, 17000, 1, 1, 2);
insert into lector(id, name, age, salary, un_id, deg_id, dep_id) values (4, 'Leo Messi', 33, 14000, 1, 1, 2);

insert into departament (id, name, head, un_id) values (0, 'Automated Systems of Control', 'Andriy Valera', 0);
insert into departament (id, name, head, un_id) values (1, 'Artifical Intelligence', 'Roman Syschenko', 0);
insert into lector(id, name, age, salary, un_id, deg_id, dep_id) values (0, 'Zinchenko Oleksandr', 10000, 25, 0, 1, 0);
insert into lector(id, name, age, salary, un_id, deg_id, dep_id) values (1, 'Gusiev Roman', 14000, 22, 0, 2, 1);


