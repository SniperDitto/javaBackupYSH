
select ename,dname 
from emp, dept
where emp.deptno=dept.deptno;

select ename,dname 
from emp, dept
where emp.deptno=dept.deptno and ename='SCOTT';

select ename,dname
from emp,dept
where emp.deptno=dept.deptno and sal*12>=3000;

select * from salgrade;

--non-equi join
select e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

--self join
select e.ename || '의 매니저는 ' || m.ename || ' 입니다.'
from emp e, emp m
where e.mgr=m.empno;

--outer join
select e.ename ||'의 매니저는 '|| m.ename ||' 입니다.'
from emp e,emp m
where e.mgr=m.empno(+);

select e.ename, d.dname
from emp e, dept d
where e.deptno(+)=d.deptno;

select e.ename,d.deptno, d.dname
from emp e, dept d
where e.deptno(+)=d.deptno;

select e.ename,e.job, d.deptno, d.loc
from emp e, dept d
where e.deptno(+)=d.deptno and e.deptno=30;

select e.ename,e.comm,d.dname,d.loc
from emp e, dept d
where e.deptno(+)=d.deptno and nvl(e.comm,0)>0;

select e.ename,e.job,d.deptno,d.dname
from emp e, dept d
where e.deptno(+)=d.deptno and d.loc='DALLAS';

select e.ename,d.dname
from emp e, dept d
where e.deptno(+)=d.deptno and e.ename like '%A%';

select e.job,e.sal,s.grade
from emp e, salgrade s
where e.sal between s.losal and s.hisal;

select e.ename,d.deptno,em.ename
from emp e, dept d, emp em
where e.deptno(+)=d.deptno and em.deptno(+)=d.deptno
order by deptno;

--ansi equi
select ename,dname from emp inner join dept on emp.deptno=dept.deptno;
select e.ename,m.ename as manager from emp e left outer join emp m on e.mgr=m.empno;
select e.ename,d.dname from emp e right outer join dept d on e.deptno=d.deptno;

select * from emp e full outer join dept d on e.deptno=d.deptno;