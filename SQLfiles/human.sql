drop table member;
create table member(
    mNo number,
    hp nvarchar2(100),
    addr nvarchar2(100),
    mName nvarchar2(100)
)
insert into member values(1111,'1111','asd','asdf');
insert into member values(2222,'2222','asd2','asdf2');
insert into member values(3333,'3333','asd3','asdf3');
insert into member values(4444,'4444','asd4','asdf4');
commit;

select * from  member;
