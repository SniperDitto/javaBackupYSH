create table mvc_board(
        bId number primary key,
        bName VARCHAR2(200),
        bTitle VARCHAR2(600),
        bContent VARCHAR2(2000),
        bDate date default sysdate,
        bHit number default 0,
        bGroup number,
        bStep number,
        bIndent number);
        
--sequence : 자동으로 카운트, 서버 껐다 켜면 날아감
create sequence mvc_board_seq;
select mvc_board_seq.nextval,mvc_board_seq.currval from dual;

insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent)
values(mvc_board_seq.nextval,'asdf','title','content',0,MVC_BOARD_SEQ.currval,0,0);

insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent)
values(mvc_board_seq.nextval,'qwer','title','content',0,MVC_BOARD_SEQ.currval,0,0);

insert into mvc_board(bId,bName,bTitle,bContent,bHit,bGroup,bStep,bIndent)
values(mvc_board_seq.nextval,'zxcv','title','content',0,MVC_BOARD_SEQ.currval,0,0);

commit;

