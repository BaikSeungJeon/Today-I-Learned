-- https://school.programmers.co.kr/learn/courses/30/lessons/59413

WITH RECURSIVE HOURS AS (
    SELECT 0 AS NUM
    
    UNION ALL
    
    SELECT NUM + 1
    FROM HOURS
    WHERE NUM < 23
)

SELECT H.NUM AS HOUR, IFNULL(A.COUNT, 0) AS COUNT
FROM HOURS H
LEFT OUTER JOIN ( SELECT HOUR(DATETIME) AS HOUR, COUNT(ANIMAL_ID) AS COUNT
            FROM ANIMAL_OUTS
            GROUP BY HOUR
            ORDER BY HOUR) A
ON H.NUM = A.HOUR