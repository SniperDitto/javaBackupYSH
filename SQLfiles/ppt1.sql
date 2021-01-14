desc dept;
desc emp;

select * from dept;
select * from emp;


select empno,ename from emp;
select ename,sal,hiredate from emp;

select ename,sal*12 from emp;
select ename,sal*12 as Annsal from emp;

select ename,' is a',  job from emp;
select ename || ' is a '|| job from emp;

select deptno from emp;
select distinct deptno from emp;

select job from emp;
select distinct job from emp;

select * from emp where deptno=10;
select * from emp where sal>2000;

select empno,ename from emp where ename='JAMES';
select ename,hiredate from emp where hiredate>='1982-01-01';

select ename, empno, job, deptno from emp where deptno=10 and job='CLERK';
select ename,hiredate from emp where hiredate>='1982-01-01' or job='MANAGER';
select empno,ename,deptno from emp where deptno!=10;

select empno,ename from emp where ename like 'J%';
select empno,ename from emp where ename like '%A%';
select empno,ename from emp where ename like '%N';
select empno,ename from emp where ename not like '%A%';

select empno,ename from emp where ename like '_A%';
select empno,ename from emp where ename like '%A%';
select empno,ename from emp where ename like '%_%';

select empno,ename,comm from emp where comm=300 or comm=500 or comm=1400;
select empno,ename,comm from emp where comm in(300,500,1400);
select empno,ename,comm from emp where comm not in(300,500,1400);

select empno,ename,sal from emp where sal>=500 and sal<=4000;
select empno,ename,sal from emp where sal between 500 and 4000;
select empno,ename,sal from emp where sal<500 and sal>4000;
select empno,ename,sal from emp where sal not between 500 and 4000;

select empno,ename from emp where ename like '%A%';
select empno,ename from emp where ename not like '%A%';

select ename,mgr from emp where mgr is null;
select ename,mgr from emp where mgr is not null;

select round(777.77777,2) from dual;
select round(777.77777,0) from dual;
select trunc(777.77777,2) from dual;

select mod(sal,100) from emp;
select ename from emp where mod(empno,2)!=0;

select upper('Welcome to Oracle 10g') from dual;
select upper(ename) from emp;
select lower('Welcome to Oracle 10g') from dual;
select lower(ename) from emp;

select initcap('welcome to Oracle 10g') from dual;
select initcap(ename) from emp;

select length('Welcome to Oracle 10g') from dual;
select ename,length(ename) from emp;

select instr('Welcome to Oracle 10g','o',3,2) from dual;
select instr('Welcome to Oracle 10g','o') from dual;
select instr(ename,'A') from emp;

select substr('Welcome to Oracle 10g',4,3) from dual;
select empno,hiredate,'19'||substr(hiredate,1,2) from emp;
select substr(ename,-3,2) from emp;

select lpad('asdf',20,'#') from dual;
select rpad('asdf',20,'#') from dual;

select ltrim('aaWelcome to Oracle 10g','a')from dual;
select ltrim('         Welcome to Oracle 10g',' ')from dual;

select rtrim('Welcome to Oracle 10gxxx','x')from dual;
select rtrim('Welcome to Oracle 10g        ',' ')from dual;
select trim('aaWelcome to Oracle 10gaa','a')from dual;

select * from emp where 'smith'=lower(ename);
select * from emp where ename like '__R%';
select * from emp where ename like '%N';

select concat('abc','def') from dual;

select * from emp where substr(hiredate,1,2)='82';
select lower(ename),hiredate,sal from emp where length(ename)=5;

select sysdate from dual;
select sysdate-1 from dual;
select ename,hiredate,trunc(sysdate-hiredate) from emp;

select trunc(months_between(sysdate,hiredate)) from emp;
select add_months(hiredate,6) from emp;

select last_day(hiredate)from emp;
select next_day(hiredate,6) from emp;

select last_day(sysdate),next_day(sysdate,1) from dual;
select next_day(add_months(hiredate,6),7) from emp;

select sysdate,trunc(sysdate-to_date('2006/01/01','YYYY/MM/DD')) from dual;

select to_char(sysdate,'YYYY/MM/DD, HH24:MI:SS') from dual;
select to_char(sysdate+3/24, 'yyyy"년" mm"월" dd"일" hh"시" mi"분" ') from dual;

select ename,to_char(sal,'$999,999') from emp;
select ename,to_char(sal,'L999,999') from emp;

select ename,sal,comm,sal*12+nvl(comm,0) from emp;
select ename,nvl(mgr,'CEO') from emp;
select ename,nvl(to_char(mgr,'9999'),'CEO') from emp;

select ename,deptno,decode(deptno,10,'accounting',20,'research',30,'sales',40,'operations') as dname from emp;
select ename,job,decode(job,'MANAGER',sal*1.15,'CLERK',sal*1.05,sal) as upsal from emp;

select ename,deptno,case when deptno=10 then 'accounting' 
when deptno=20 then 'research'
when deptno=30 then 'sales'
when deptno=40 then 'operations'
else 'none'
end
as dept from emp;

select ename,job,sal, case when job='CLERK' then sal*1.2
when job='ANALYST' then sal*1.15
when job='MANAGER' then sal*1.1
else sal*1.05
end
as upsal from emp;






