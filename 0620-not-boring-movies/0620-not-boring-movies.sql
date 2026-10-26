# Write your MySQL query statement below
select id, movie, description, rating 
from cinema
where description != 'boring' AND id %2 != 0
Order by rating DESC;