# Write your MySQL query statement below
SELECT DISTINCT num AS "ConsecutiveNums"
FROM (
    SELECT num,
    lead(num, 1) OVER (ORDER BY id) AS num1,
    lead(num, 2) OVER (ORDER BY id) AS num2
    FROM logs
) t
WHERE num = num1 AND num = num2;