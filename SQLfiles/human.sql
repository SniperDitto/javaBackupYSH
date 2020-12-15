
drop table human;
create table human(
    name varchar2(50),
    height number(4,1),
    age number(3),
    birthday date);
    
insert into human values ('홍길동',  152.1,30, to_date('2000:02:03 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
insert into human values ('홍길남',  156.4,31, to_date('2001:02:03 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
insert into human values ('홍길영',  173.5,30, to_date('2000:12:21 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
insert into human values ('홍길아',  143.2,21, to_date('2011:04:17 00:00:00', 'YYYY:MM:DD HH24:MI:SS'));
commit;

select * from human;
desc human;
