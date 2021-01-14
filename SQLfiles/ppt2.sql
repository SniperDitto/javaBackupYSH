
select count(*), count(comm) from emp;
select count(comm) from emp where deptno=10;

select count(distinct job) from emp;
select sum(sal),avg(sal) from emp where job='SALESMAN';

select avg(sal) from emp;
select count(*),avg(nvl(comm,0))from emp;
select count(*),sum(nvl(comm,0)),count(comm),avg(nvl(comm,0)) from emp;

select max(sal),min(sal) from emp;
select max(ename),min(ename),max(hiredate),min(hiredate) from emp;

select sum(sal) from emp;
select count(*),sum(decode(to_char(hiredate,'YYYY'),1980,1,0)) as "1980",
sum(decode(to_char(hiredate,'YYYY'),1981,1,0)) as "1981",
sum(decode(to_char(hiredate,'YYYY'),1982,1,0)) as "1980"
from emp;

select sum(sal)from emp;
select deptno,sum(sal) from emp group by deptno;
select deptno,trunc(avg(sal)) from emp group by deptno;
select deptno,count(comm) from emp group by deptno;
select deptno,max(sal),min(sal) from emp group by deptno;
select count(*) from emp group by deptno;

select deptno,count(deptno) from emp group by deptno;
select job,count(job) from emp group by job;
select deptno,job,count(*) from emp group by deptno,job order by deptno;
select round(max(avg(sal))) from emp group by deptno;

select deptno,round(avg(sal)) from emp group by deptno having avg(sal)>=2000;
select deptno,round(avg(sal)) from emp where sal>=1000 group by deptno having avg(sal)>=2000;

select deptno,round(max(sal)) from emp where deptno=10 or deptno=20 group by deptno order by deptno;