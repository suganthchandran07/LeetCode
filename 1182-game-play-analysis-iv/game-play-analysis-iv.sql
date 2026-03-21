# Write your MySQL query statement below
SELECT ROUND((COUNT(a.player_id) / (SELECT COUNT(DISTINCT player_id) FROM activity)), 2) AS fraction
FROM activity a
JOIN (
    SELECT player_id, MIN(event_date) AS first_login
    FROM activity
    GROUP BY player_id
) as f 
ON a.player_id = f.player_id AND a.event_date = DATE_ADD(f.first_login, INTERVAL 1 DAY);