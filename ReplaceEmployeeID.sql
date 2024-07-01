# Write your MySQL query statement below
SELECT EmployeeUNI.unique_id, Employees.name 
FROM Employees
LEFT JOIN EmployeeUNI ON Employees.id = EmployeeUNI.id
WHERE EmployeeUNI.unique_id is null OR Employees.id = EmployeeUNI.id
