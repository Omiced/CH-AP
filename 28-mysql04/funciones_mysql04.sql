SHOW TABLES;

-- Mostrando las columnas de las tablas
SHOW COLUMNS FROM bonus;
SHOW COLUMNS FROM employee;
SHOW COLUMNS FROM title;

-- Consultar la información de cada tabla
SELECT * FROM bonus;
SELECT * FROM employee;
SELECT * FROM title;

-- Manejar Funciones para calcular datos significativos
-- MIN() Nos permite obtener el valor mínimo de una columna
SELECT min(salary) AS "Salario mínimo"
FROM employee;

-- MAX() Nos permite obtener el valor máximo de una columna
SELECT max(salary) AS "Salario máximo"
FROM employee;

-- Aplicando MIN y MAX en una columna de tipo VARCHAR se toma como referencia la tabla ASCII
SELECT min(first_name) AS "Nombre mínimo"
FROM employee;

SELECT max(first_name) AS "Nombre máximo"
FROM employee;

-- CONCAT() permite concatenar los datos de dos o más columnas
SELECT concat(employee.first_name, " ", employee.last_name) AS "Nombre completo",
		salary AS "Salario"
FROM employee;
-- ORDER BY salary ASC;

-- AVG() permite obtener el valor promedio de los datos de una columna de tipo numérico
SELECT avg(salary) AS "Promedio de salarios"
FROM employee;

-- COUNT() permite retornar el número total de registros en una columna
SELECT count(salary) 
FROM employee;

-- SUM() permite calcular la suma total de los registros de una columna
SELECT sum(salary)
FROM employee;

-- Consultar el gasto de salario, el promedio de salario, el salario mínimo y máximo por departamento sin tomar en cuenta los bonos.
SELECT
	department AS "Departamento",
    sum(salary) AS "Gasto total",
    avg(salary) AS "Promedio de salario",
    min(salary) AS "Salario Mínimo",
    max(salary) AS "Salario Máximo"
FROM employee
GROUP BY department;

-- Calcular el total de monto obtenido por bonos del employee con el id 01
-- Reviso quién es el empleado con el id 01
SELECT first_name AS "nombre"
FROM employee
WHERE employee_id = 1;

SELECT
	sum(bonus_amount) AS "Monto obtenido por bonos"
FROM bonus
WHERE employee_id_fk = 1;

-- Aplicando JOIN para consultar el nombre, apellido y monto obtenido por bono del employee con el id 01
SELECT 
	concat(employee.first_name, " ", employee.last_name) AS "Nombre completo",
    sum(bonus.bonus_amount) AS "Monto obtenido por bonos"
FROM employee
INNER JOIN bonus
-- JOIN bonus porque es el JOIN natural (INNER JOIN)
ON employee.employee_id = bonus.employee_id_fk
WHERE bonus.employee_id_fk = 1;


