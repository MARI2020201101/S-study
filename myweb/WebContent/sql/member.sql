--member.sql

--회원등급 
A1 : 관리자
B1 : 중간 관리자
C1 : 우수 사용자
D1 : 일반 사용자 (기본)
E1 : 비회원
F1 : 탈퇴한 회원

-- 회원테이블
CREATE TABLE member (
    id       VARCHAR(10)  NOT NULL, -- 아이디, 중복 안됨.
    passwd   VARCHAR(10)  NOT NULL, -- 패스워드
    mname    VARCHAR(20)  NOT NULL, -- 성명
    tel      VARCHAR(14)  NULL,     -- 전화번호
    email    VARCHAR(50)  NOT NULL  UNIQUE, -- 전자우편 주소, 중복 안됨
    zipcode  VARCHAR(7)   NULL,     -- 우편번호, 12345
    address1 VARCHAR(255) NULL,     -- 주소 1
    address2 VARCHAR(255) NULL,     -- 주소 2(나머지주소)
    job      VARCHAR(20)  NOT NULL, -- 직업
    mlevel   CHAR(2)      NOT NULL, -- 회원 등급, A1, B1, C1, D1, E1, F1
    mdate    DATE         NOT NULL, -- 가입일    
    PRIMARY KEY (id)
);

--로그인 성공하면 회원등급 가져오기
select mlevel from member where id=? and passwd=?
and mlevel in('A1', 'B1', 'C1', 'D1')

--아이디 중복확인
select count(id) as cnt from member where id=?

--회원등급이 A이상인 사람만 게시판 글 삭제가능