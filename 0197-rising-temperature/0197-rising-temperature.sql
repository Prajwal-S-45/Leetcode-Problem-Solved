# Write your MySQL query statement below
#select w1.id 
#from Weather w1, Weather w2 
#where DATEDIFF(w1.recordDate, w2.recordDate) = 1
#AND w1.temperature > w2.temperature;

#OR
select w1.id 
from Weather w1, Weather w2
where w1.temperature > w2.temperature 
AND SUBDATE(w1.recordDate, 1) = w2.recordDate;