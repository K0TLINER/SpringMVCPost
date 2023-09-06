--import random
--for i in range(1, 41):
--    m = random.randint(1, 12) 
--    d = random.randint(1, 30) 
--    query = "insert into product values (seq_product_prod_no.nextval,'test{0}', 'test{0} detail','{1}', {2} , null, sysdate - 40 + {0});".format(i, "2023" + (('0' + str(m)) if m < 10 else str(m)) + (('0' + str(d)) if d < 10 else str(d)), random.randint(10000, 1000000) )
--    print(query)

DROP TABLE comments;
DROP TABLE posts;

DROP SEQUENCE seq_post_post_no;
DROP SEQUENCE seq_comment_comment_no;

CREATE SEQUENCE seq_post_post_no			 	INCREMENT BY 1 START WITH 10000;
CREATE SEQUENCE seq_comment_comment_no		 	INCREMENT BY 1 START WITH 10000;

CREATE TABLE posts (
	post_no					INTEGER			NOT NULL,
	post_title				VARCHAR(40)		NOT NULL,
	post_content			VARCHAR(500)	NOT NULL,
	reg_date				TIMESTAMP		NOT NULL,
	PRIMARY KEY(post_no)
);

CREATE TABLE comments(
    comment_no          INTEGER         NOT NULL,
    post_no             INTEGER         NOT NULL    REFERENCES posts(post_no),
    comment_content     VARCHAR(300)    NOT NULL,
    reg_date            TIMESTAMP       NOT NULL,
    PRIMARY KEY(comment_no)
);

INSERT INTO posts VALUES(seq_post_post_no.nextval, 'Title1', 'Content1', sysdate);
INSERT INTO posts VALUES(seq_post_post_no.nextval, 'Title2', 'Content2', sysdate);
INSERT INTO posts VALUES(seq_post_post_no.nextval, 'Title3', 'Content3', sysdate);

INSERT INTO comments VALUES(seq_comment_comment_no.nextval, 10000, 'ContentC-1', sysdate);
INSERT INTO comments VALUES(seq_comment_comment_no.nextval, 10000, 'ContentC-2', sysdate);
INSERT INTO comments VALUES(seq_comment_comment_no.nextval, 10000, 'ContentC-3', sysdate);

commit;
