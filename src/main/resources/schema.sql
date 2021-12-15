/*
 * Enterprise Java Development - Assignment 4
 * Due December 15th 2021       
 * Authors: Camila Barbosa 192622796, Nicholas Carvalho 991634372
 */

CREATE TABLE book(
id int NOT NULL PRIMARY KEY ,
title varchar(150) NOT NULL,
authors varchar(50) NOT NULL);

INSERT INTO book (id, title, authors)
VALUES (1001, 'Cinder', ' J. Bries');

INSERT INTO book (id, title, authors)
VALUES (1011, 'Caraval', ' S. Garber');

INSERT INTO book (id, title, authors)
VALUES (1021, 'Speaker', ' B. Oracle');

INSERT INTO book (id, title, authors)
VALUES (1031, 'Fairest', ' G. Potter');


CREATE TABLE review (
    id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    review varchar(50) NOT NULL,
    book_Id int  NOT NULL,
    CONSTRAINT FK_Bookreview FOREIGN KEY  (book_Id) REFERENCES book(id)
);


INSERT INTO review (book_Id, review)
VALUES (1021, ' Really good Book');

INSERT INTO review (book_Id, review)
VALUES (1011, ' Note really good');

INSERT INTO review (book_Id, review)
VALUES (1011, ' Really good');

INSERT INTO review (book_Id, review)
VALUES (1031, ' The best Book ever');

INSERT INTO review (book_Id, review)
VALUES (1001, ' Nothing more than expected');