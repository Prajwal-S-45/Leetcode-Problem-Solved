# Write your MySQL query statement below
select distinct author_id as id 
from Views 
where viewer_id >= 1
and author_id = viewer_id 
order by viewer_id;