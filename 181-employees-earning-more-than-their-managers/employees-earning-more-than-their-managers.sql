# Write your MySQL query statement below
select t1.name as Employee
from Employee as t1
join Employee as t2
on t2.id=t1.managerId
and t1.salary>t2.salary;