# Write your MySQL query statement below
Select machine_id, ROUND(AVG(end - start), 3) AS processing_time
FROM 
(Select machine_id, process_id, 
    MAX(Case When activity_type = 'start' Then timestamp End) AS start,
    MAX(Case When activity_type = 'end' Then timestamp End) AS end
From Activity
    Group by machine_id, process_id) AS subq
Group by machine_id;