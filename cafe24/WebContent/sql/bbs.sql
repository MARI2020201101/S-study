--bbs.sql

 CREATE TABLE tb_bbs (
       bbsno        INT           NOT NULL AUTO_INCREMENT PRIMARY KEY
       ,wname       VARCHAR(20)   NOT NULL
       ,subject     VARCHAR(100)  NOT NULL
       ,content     TEXT          NOT NULL
       ,grpno       TINYINT       NOT NULL
       ,indent      TINYINT       DEFAULT 0    NOT NULL
       ,ansnum      TINYINT       DEFAULT 0    NOT NULL
       ,regdt       DATETIME      NOT NULL
       ,passwd      VARCHAR(15)   NOT NULL
       ,readcnt     INT           DEFAULT 0    NOT NULL
       ,ip          VARCHAR(15)   NOT NULL
  );