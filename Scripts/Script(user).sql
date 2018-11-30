show tables;

select * from courses;

select stud_id as studid, name, email, dob,phone
from students
where stud_id=1;

insert into students values("")

select *
from students;

select Stud_id, name, email, phone, A.addr_id, street, city, state, zip, country
from students s left outer join addresses A on s.ADDR_ID=a.ADDR_ID
where stud_id=1;
