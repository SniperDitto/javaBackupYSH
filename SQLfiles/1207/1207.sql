
create user scott identified by tigger;
grant connect,resource,dba to scott;
conn scott;

create table EMP(
    empno number(8),
    ename varchar2(50) not null,
    job varchar2(50),
    mgr number(4),
    hiredate date,
    sal number(10,2),
    comm number(10,2),
    deptno number(4)
);
create table DEPT(
    deptno number(4),
    dname varchar2(50) not null,
    loc varchar2(50)
);
create table BONUS(
    ename varchar2(50) not null,
    job varchar2(50),
    sal number(10,2) not null,
    comm number(10,2)
);
create table SALGRADE(
    grade number not null,
    losal number,
    hisal number
);
commit;
insert into DEPT values(1111,'SALES','SEOUL');
insert into DEPT values(2222,'OPERATIONS','BUSAN');
insert into DEPT values(3333,'ACCOUNTING','INCHEON');
insert into DEPT values(4444,'RESEARCH','DAEJEON');
insert into EMP values(20201111,'홍길동','SALESMAN',1111,to_date('12-01-2020','dd-mm-yyyy'),800,null,1111);
insert into EMP values(20202222,'홍길남','CLARK',2222,to_date('11-01-2010','dd-mm-yyyy'),700,100,2222);
insert into EMP values(20203333,'김철수','MANAGER',3333,to_date('07-11-2013','dd-mm-yyyy'),1200,null,3333);
insert into EMP values(20201313,'홍길영','MANAGER',1111,to_date('12-21-2017','dd-mm-yyyy'),1000,100,4444);
commit;
insert into BONUS values('홍길동','SALESMAN',100,100);
insert into SALGRADE values(1,500,1000);
insert into SALGRADE values(2,1000,3000);
insert into SALGRADE values(3,3000,5000);
commit;

