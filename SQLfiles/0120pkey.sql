--primary key
create table test1(
    a1 number primary key,
    a2 number,
    a3 number);
    
insert into test1 values(1,1,1);
insert into test1 values(2,1,1);
insert into test1 values(2,3,4);--a1에 이미 2라는 값이 있음
commit;

--두 개의 column을 하나의 primary key로 사용 가능
create table test2(
    a1 number,
    a2 number,
    a3 number,
    primary key(a1,a2)--a1,a2 두개의 column이 하나의 key가 됨
);
insert into test2 values(1,1,1);
insert into test2 values(2,1,1);
insert into test2 values(2,3,4);
insert into test2 values(2,3,6);--a1,a2에 이미 2,3 존재
insert into test2 values(3,1,1);
insert into test2 values(2,1,5);--a1.a2에 이미 2,1 존재
commit;

--foreign key
create table test3(
    a1 number primary key,
    a2 number,
    a3 number references test1(a1)
);

insert into test3 values(1,1,1);
insert into test3 values(2,1,1);
insert into test3 values(2,2,4);--a1이 중복
insert into test3 values(3,1,5);--fk오류


create table test4(
    a1 number unique,
    a2 number not null,
    a3 number not null unique,
    a4 number check(a4>0),
    a5 number default 1
);

insert into test4 values(1,1,1,1,1);
insert into test4 values(-1,-1,-1,-1,-1);--a4범위
insert into test4 values(1,null,1,1,1);--not null
insert into test4 values(null,1,2,1,1);
insert into test4 values(null,1,3,1,1);--pk null 중복가능
insert into test4 values(null,1,null,1,1);



create view view_ed as 
select employees.first_name,departments.department_name from employees,departments
where employees.department_id=departments.department_id;

select * from tab;
select * from view_ed;

create sequence testSequence;
select testSequence.nextVal from dual;
select testSequence.currVal from dual;
drop sequence testSequence;




