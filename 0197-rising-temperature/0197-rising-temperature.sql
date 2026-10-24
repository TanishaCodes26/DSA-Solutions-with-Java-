select today.id from weather today
join weather yesterday
on DATEDIFF(today.recordDate, yesterday.recordDate) = 1
where today.temperature > yesterday.temperature;