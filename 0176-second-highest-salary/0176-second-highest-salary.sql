select(
    select distinct salary from employee order by salary desc 
    limit 1 OFFSET 1
) as SecondHighestSalary