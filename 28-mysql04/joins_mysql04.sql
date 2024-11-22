USE generation;

SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;

-- ---------------- JOINS ---------------------
-- INNER JOIN
-- --------------------------------------------

-- Consultar la información de los estudiantes y toda la información de su nacionalidad
SELECT *
FROM students	
JOIN countries
ON students.nationality = countries.idCountries;

-- Consultar información estructurada (idStudent, name, last_name, email, address, país)
SELECT
	students.idStudent AS "Matrícula",
    concat(students.name, " ", students.last_name) AS "Nombre completo",
    students.email AS "Email",
    students.address AS "Dirección",
    countries.name AS "País"
    -- concat(students.address, ", ", countries.name) AS "Domicilio"
FROM students
JOIN countries
ON students.nationality = countries.idCountries;

-- Filtrar información de estudiantes mediante el nombre del país
SELECT 
	students.*,
    countries.name
FROM students
INNER JOIN countries
ON students.nationality = countries.idCountries
WHERE countries.name = "Austria";

-- -----------------------------------------
-- RIGHT JOIN y LEFT JOIN
-- -----------------------------------------
-- RIGHT
SELECT 
	concat(students.name, " ", students.last_name) AS "Nombre del estudiante",
    countries.name AS "País"
FROM students
RIGHT JOIN countries
ON students.nationality = countries.idCountries;

-- LEFT
SELECT 
	concat(students.name, " ", students.last_name) AS "Nombre del estudiante",
    countries.name AS "País"
FROM countries
LEFT JOIN students
ON students.nationality = countries.idCountries;

/* 
----- Ejercicios de Consultas con Joins -----

1. Consultar la información de los estudiantes que tengan como nacionalidad el país 33, mostrando su nombre completo (nombre y apellido), email y país de nacionalidad
2. Consultar a los estudiantes que tengan como nacionalidad países que inicien con Ca
3. Consultar la información de los estudiantes y obtener el código del curso que estén cursando
4. Consultar el total de estudiantes inscritos en cada módulo (multiJoins)
*/

