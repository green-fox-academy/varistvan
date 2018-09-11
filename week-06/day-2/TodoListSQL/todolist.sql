create database todolist;

use todolist;

create table todolist (
	id int primary key auto_increment,
    task varchar(100),
    done boolean not null default false
);

insert into todolist (task, done) values ('Buy milk', true);
insert into todolist (task, done) values ('walk dog', false);
insert into todolist (task) values ('go to gym');
insert into todolist (task, done) values ('Do homework', true);

select * from todolist;