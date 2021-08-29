-- -- insert into bus (id , name , model , cost) values
-- --  (1111 ,'Suzuki', 'Hayabusa' , 50000),
-- --  (1112 ,'BMW', 'Antilia' ,10000);
-- --
--
-- --bus
-- insert into bus  (id , name, model , cost ) values(1, 'BMW','x1', 10000.0);
-- insert into bus  (id , name, model , cost ) values(2, 'mercedes','x1', 10000.0);
-- insert into bus (id , name, model , cost ) values(3, 'suzuki','sz1', 12000.0);
--
-- --person
-- insert into person ( first_name , last_name , address , bus_id , person_id) values( 'ram','smith', 'warsaw' ,1 , 1);
-- insert into person (first_name , last_name , address , bus_id , person_id) values('Kunal','yap', 'warsaw' ,2 , 2);
-- insert into person (first_name , last_name , address , bus_id , person_id) values('karan','kash', 'warsaw' ,3 , 3);
-- insert into person (first_name , last_name , address , bus_id , person_id) values('Pra','jha', 'warsaw' ,3 , 4);
--
-- -- Teacher
-- insert into teacher(id , subject_teaching, salary ,person_id) values(1, 'IT', 10000.0 ,2 );
-- insert into teacher(id , subject_teaching, salary, person_id) values(2, 'management', 12000.0 ,3);
--
-- --Student
-- insert into student(id, person_id, year) values(1, 1, 2);
-- insert into student(id, person_id, year) values(2, 4, 3);
--
-- --Assigned
-- insert into assigned(id , start_date , end_date , assignment_id , student_id , assigned_id) values (1, '2021-06-21' ,'2021-06-29' ,1 ,1,1);
-- insert into assigned(id , start_date , end_date , assignment_id , student_id , assigned_id) values (2, '2021-06-22' ,'2021-06-30' ,2 ,2,2);
--
-- --Assignment
-- insert into assignment (id, min_words , topic , assignment_id) values ( 1 , 100.0 , 'MAS' , 1);
-- insert into assignment (id, min_words , topic , assignment_id) values ( 2, 200.0 , 'MAS' , 2);
--
-- --qualification
-- insert into qualification (id , description, min_percentage, qualification_id) values(1, 5, 50 , 1);
-- insert into qualification (id , description, min_percentage, qualification_id) values(2, 6, 60 , 2);
--
-- --Submission
-- insert into submission (id , certificates, file_name , qualification_id , student_id ,submission_id ) values (1 , 'Marksheet' ,'university documents' ,1 , 1 ,1);
-- insert into submission (id , certificates, file_name , qualification_id , student_id ,submission_id ) values (2 , 'Marksheet' ,'university documents' ,2 , 2 ,2);
--
--
-- -- program
-- insert into program (id , duration , name , semester , qualification_id ,program_id) values (1, 3, 'Computer Science' , 1 , 1 ,1);
-- insert into program (id , duration , name , semester , qualification_id ,program_id) values (2, 3, 'Arts' , 1 , 2 ,2);
--
-- --Registration
-- insert into registration (id , reg_date, semester , verification , program_id , student_id , registration_id) values (1 , '2021-06-21' , 1 , 1 , 1,1,1  );
-- insert into registration (id , reg_date, semester , verification , program_id , student_id , registration_id) values (2 , '2021-06-22' , 1 , 1 , 2,2,2  );
--
-- --Course
-- insert into course (id , course_name , credit , semester , program_id , teacher_id ,course_id) values(1, 1 ,5,1,1,1,1);
-- insert into course (id , course_name , credit , semester , program_id , teacher_id ,course_id) values(2, 2 ,5,1,2,2,2);
--
-- --Fee
-- insert into fee(program_id , amount , extra_charges) values (1, 5000.0 , 50.0);
-- insert into fee(program_id , amount , extra_charges) values (2, 5000.0 , 50.0);
--
-- --change
-- insert into change(id, student_id ,date , reason , type , change_id) values (1,1,'2021-06-25',1,1,1);
-- insert into change(id, student_id ,date , reason , type , change_id) values (2,2,'2021-06-25',2,2,2);
--
-- --session
-- insert into session(id , from_date , session_code , to_date, registration_id , session_id) values (1, '2021-06-29', 12 , '2022-06-29' , 1 , 1);
-- insert into session(id , from_date , session_code , to_date, registration_id , session_id) values (2, '2021-06-29', 12 , '2022-06-29' , 2 , 2);


-- insert into bus (id , name , model , cost) values
--  (1111 ,'Suzuki', 'Hayabusa' , 50000),
--  (1112 ,'BMW', 'Antilia' ,10000);
--

--bus
insert into bus  (id , name, model , cost ) values(1, 'BMW','x1', 10000.0);
insert into bus  (id , name, model , cost ) values(2, 'mercedes','x1', 10000.0);
insert into bus (id , name, model , cost ) values(3, 'suzuki','sz1', 12000.0);

--person
insert into person ( first_name , last_name , address , bus_id , person_id) values( 'ram','smith', 'warsaw' ,1 , 1);
insert into person (first_name , last_name , address , bus_id , person_id) values('Kunal','yap', 'warsaw' ,2 , 2);
insert into person (first_name , last_name , address , bus_id , person_id) values('karan','kash', 'warsaw' ,3 , 3);
insert into person (first_name , last_name , address , bus_id , person_id) values('Pra','jha', 'warsaw' ,3 , 4);

-- Teacher
insert into teacher( subject_teaching, salary ,person_id) values( 'IT', 10000.0 ,2 );
insert into teacher(subject_teaching, salary, person_id) values( 'management', 12000.0 ,3);

--Student
insert into student( person_id, year) values( 1, 2);
insert into student( person_id, year) values( 4, 3);

--Assignment
insert into assignment ( min_words , topic , assignment_id) values ( 100.0 , 'MAS' , 1);
insert into assignment ( min_words , topic , assignment_id) values ( 200.0 , 'MAS' , 2);

--Assigned
insert into assigned(start_date , end_date , assignment_id , student_id , assigned_id) values ( '2021-06-21' ,'2021-06-29' ,1 ,1,1);
insert into assigned( start_date , end_date , assignment_id , student_id , assigned_id) values ( '2021-06-22' ,'2021-06-30' ,2 ,4,2);

--qualification
insert into qualification ( description, min_percentage, qualification_id) values( 5, 50 , 1);
insert into qualification ( description, min_percentage, qualification_id) values( 6, 60 , 2);

--Submission
insert into submission ( certificates, file_name , qualification_id , student_id ,submission_id ) values ( 'Marksheet' ,'university documents' ,1 , 1 ,1);
insert into submission ( certificates, file_name , qualification_id , student_id ,submission_id ) values ( 'Marksheet' ,'university documents' ,2 , 4 ,2);


-- program
insert into program ( duration , name , semester , qualification_id ,program_id) values ( 3, 'Computer Science' , 1 , 1 ,1);
insert into program ( duration , name , semester , qualification_id ,program_id) values ( 3, 'Arts' , 1 , 2 ,2);

--Registration
insert into registration ( reg_date, semester , verification , program_id , student_id , registration_id) values ( '2021-06-21' , 1 , 1 , 1,1,1  );
insert into registration ( reg_date, semester , verification , program_id , student_id , registration_id) values ( '2021-06-22' , 1 , 1 , 2,4,2  );

--Course
insert into course ( course_name , credit , semester , program_id , teacher_id ,course_id) values( 1 ,5,1,1,3,1);
insert into course ( course_name , credit , semester , program_id , teacher_id ,course_id) values( 2 ,5,1,2,2,2);

--Fee
insert into fee(program_id , amount , extra_charges) values (1, 5000.0 , 50.0);
insert into fee(program_id , amount , extra_charges) values (2, 5000.0 , 50.0);

--change
insert into change( student_id ,date , reason , type , change_id) values (1,'2021-06-25',1,1,1);
insert into change( student_id ,date , reason , type , change_id) values (4,'2021-06-25',2,2,2);

--session
insert into session( from_date , session_code , to_date, registration_id , session_id) values ( '2021-06-29', 12 , '2022-06-29' , 1 , 1);
insert into session( from_date , session_code , to_date, registration_id , session_id) values ( '2021-06-29', 12 , '2022-06-29' , 2 , 2);

--topic
insert into topic (topic_id , description , name , owner_id) values( 1,10, 5, 1);

--
insert into student_subjects (student_id , subject) values (1, 5);
insert into student_subjects (student_id , subject) values (4, 6);