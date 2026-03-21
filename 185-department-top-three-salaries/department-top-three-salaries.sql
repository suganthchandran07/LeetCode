# Write your MySQL query statement below
SELECT Department, Employee, Salary
FROM (
    SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary,
    dense_rank() OVER (PARTITION BY d.id ORDER BY e.salary DESC) AS r
    FROM employee e INNER JOIN department d
    ON e.departmentId = d.id
) t
where r <= 3