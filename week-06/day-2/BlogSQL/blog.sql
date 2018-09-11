create database blog;

use blog;

create table users (
	id int primary key auto_increment,
    name varchar(30),
    age int
);

insert into users (name, age) values ('Sanyi', 30);
insert into users (name, age) values ('Tomi', 28);
insert into users (name, age) values ('Zsófi', 25);

select * from users;

create table posts (
	id int primary key auto_increment,
    title varchar(100),
    content text,
    author_id int
);

insert into posts (title, content, author_id) 
values ('Halak', 'Erdekes tudnivalok a halakrol', 1);
insert into posts (title, content, author_id) 
values ('Madarak', 'Minden amit a madarakrol tudni erdemes', 1);
insert into posts (title, content, author_id) 
values ('Autók', 'A negy kereken gurulo szornyetegekrol', 2);

select name, count(posts.id) from users
left join posts on posts.author_id = users.id
group by users.name
order by users.name;

update posts 
set content = 'Sokminden amit a madarakrol valoban tudni erdemes'
where id = 2;

/*delete from posts where id = 2;*/

select * from posts;