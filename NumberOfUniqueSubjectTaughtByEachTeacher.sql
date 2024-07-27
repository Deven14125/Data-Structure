--table: Teacher

-- +-------------+------+
-- | Column Name | Type |
-- +-------------+------+
-- | teacher_id  | int  |
-- | subject_id  | int  |
-- | dept_id     | int  |
-- +-------------+------+
-- (subject_id, dept_id) is the primary key (combinations of columns with unique values) of this table.
-- Each row in this table indicates that the teacher with teacher_id teaches the subject subject_id in the department dept_id.

-- Explanation: 
-- Teacher 1:
--   - They teach subject 2 in departments 3 and 4.
--   - They teach subject 3 in department 3.
-- Teacher 2:
--   - They teach subject 1 in department 1.
--   - They teach subject 2 in department 1.
--   - They teach subject 3 in department 1.
--   - They teach subject 4 in department 1.


# Write your MySQL query statement below
select teacher_id,count(distinct subject_id) as cnt from teacher group by teacher_id