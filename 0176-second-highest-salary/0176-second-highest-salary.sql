# Write your MySQL query statement below
select Max(salary) as SecondHighestSalary from Employee where salary < (Select Max(Salary) from employee);
