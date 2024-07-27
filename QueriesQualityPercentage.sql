-- Table: Queries

-- +-------------+---------+
-- | Column Name | Type    |
-- +-------------+---------+
-- | query_name  | varchar |
-- | result      | varchar |
-- | position    | int     |
-- | rating      | int     |
-- +-------------+---------+
-- This table may have duplicate rows.
-- This table contains information collected from some queries on a database.
-- The position column has a value from 1 to 500.
-- The rating column has a value from 1 to 5. Query with rating less than 3 is a poor query.


# Write your MySQL query statement below
select query_name,round(avg(rating/position),2) as quality,round(sum(case when rating < 3 then 1 else 0 end)/count(*)*100,2) as poor_query_percentage from queries WHERE query_name is not null group by query_name 