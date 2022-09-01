/*
 * table명 : memberInfo
 * varchar2 문자(크기 30) id,
 * 문자(크기 30) pw,
 * 문자(크기 30)  nick,
 * 숫자(20) age
 *
 *를 구성하는 테이블 생성
 */
create table memberInfo(
	id varchar2(30),
	pw varchar2(30),
	nick varchar2(30),
	age number(20)
	);
	
	insert into memberinfo values('test1','123','test1',20);
	insert into memberinfo values('test2','123','test2',30);
	insert into memberinfo values('test3','123','test3',25);
	insert into memberinfo values('test4','123','test4',29);
	
	select id, nick from memberInfo
	
	select *from memberInfo;