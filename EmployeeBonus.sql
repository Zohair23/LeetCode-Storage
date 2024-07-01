# Write your MySQL query statement below
SELECT Employee.name, Bonus.bonus
FROM Employee
LEFT JOIN Bonus ON Bonus.empID = Employee.empID
WHERE (Employee.empID = Bonus.empID AND Bonus.bonus < 1000) OR Bonus.empID is null
