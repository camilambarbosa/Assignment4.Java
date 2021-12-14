/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  camilabarbosa
 * Created: Dec. 13, 2021
 */

CREATE TABLE book(
id int NOT NULL PRIMARY KEY ,
title varchar(150) NOT NULL,
authors varchar(50) NOT NULL);

INSERT INTO book (id, title, authors)
VALUES (1, 'Cinder', ' J. Bries');

INSERT INTO book (id, title, authors)
VALUES (11, 'Caraval', ' S. Garber');

INSERT INTO book (id, title, authors)
VALUES (21, 'Speaker', ' B. Oracle');

INSERT INTO book (id, title, authors)
VALUES (31, 'Fairest', ' G. Potter');


CREATE TABLE review (
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
bookId varchar(150) NOT NULL,
review varchar(50) NOT NULL);


INSERT INTO review (bookId, review)
VALUES (21, ' Really good Book');

INSERT INTO review (bookId, review)
VALUES (11, ' Note really good');

INSERT INTO review (bookId, review)
VALUES (31, ' The best Book ever');

INSERT INTO review (bookId, review)
VALUES (01, ' Nothing more than expected');