select emp.name as name,empu.unique_id as unique_id
from employees emp
left join employeeuni empu on empu.id=emp.id


