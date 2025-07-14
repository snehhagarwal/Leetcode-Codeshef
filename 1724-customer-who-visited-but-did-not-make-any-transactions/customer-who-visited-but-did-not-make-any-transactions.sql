# Write your MySQL query statement below
select t1.customer_id,count(t1.visit_id) as count_no_trans
from visits as t1
left join transactions as t2
on t1.visit_id=t2.visit_id
where transaction_id is null
group by t1.customer_id