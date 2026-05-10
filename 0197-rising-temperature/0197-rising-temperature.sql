# Write your MySQL query statement below
SELECT 
    today.id
FROM 
    Weather as today
LEFT JOIN  Weather as yesterday
    ON today.recordDate = DATE_ADD(yesterday.recordDate, INTERVAL 1 DAY)
Where today.temperature > yesterday.temperature;
