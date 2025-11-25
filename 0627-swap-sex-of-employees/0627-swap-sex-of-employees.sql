# Write your MySQL query statement below
update Salary set sex= 
CASE sex 
when 'm' THEN 'f'else 'm'
END;