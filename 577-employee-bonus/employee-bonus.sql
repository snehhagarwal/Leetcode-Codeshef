# Write your MySQL query statement below
select employee.name,t1.bonus
from employee
left join bonus as t1
on employee.empId=t1.empId
where t1.bonus<1000 or t1.bonus is null