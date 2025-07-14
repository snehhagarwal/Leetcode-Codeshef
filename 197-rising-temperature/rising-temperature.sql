# Write your MySQL query statement below
select t1.id as Id
from weather as t1
join weather as t2
on datediff(t1.recorddate,t2.recorddate)=1
where t1.temperature>t2.temperature