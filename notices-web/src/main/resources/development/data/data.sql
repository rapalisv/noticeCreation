-- INSERT INTO USER TABLE
insert into user (id, email, name, password, registration_date) values (1,'max@email.com','Max', 'Password', CURRENT_DATE());
insert into user (id, email, name, password, registration_date) values (2,'adam@email.com','Adam', 'Password', CURRENT_DATE());
insert into user (id, email, name, password, registration_date) values (3,'Mike@email.com','Mike', 'Password', CURRENT_DATE());

-- INSERT INTO NOTICE TABLE
insert into notice (id, creation_date, notice_name, update_date) values (1, CURRENT_DATE(), 'Notice 1', CURRENT_DATE());
insert into notice (id, creation_date, notice_name, update_date) values (2, CURRENT_DATE(), 'Notice 2', CURRENT_DATE());
insert into notice (id, creation_date, notice_name, update_date) values (3, CURRENT_DATE(), 'Notice 3', CURRENT_DATE());

-- INSERT INTO USER_HAS_NOTICE TABLE
insert into user_has_notice (user_id, notice_id) values (1,1);
insert into user_has_notice (user_id, notice_id) values (2,2);
insert into user_has_notice (user_id, notice_id) values (3,3);