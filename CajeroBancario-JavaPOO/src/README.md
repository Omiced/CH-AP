# Bank of Gen.

Programa que permite realizar operaciones bancarias básicas a partir de cuentas bancarias de nuevos usuarios y usuarios existentes.

> **Requerimientos**

1. Trabajar con el paradigma de Programación Orientada a Objetos.
2. Aplicar encapsulamiento en clases Java.
3. Manejar excepciones.
4. Organizar el proyecto en paquetes.
5. Recibir clientes nuevos (inician con saldo de $0).
6. Recibir clientes existentes (con cuenta bancaria previa).
7. Operaciones básicas: 
    - Consultar saldo
    - Retirar dinero
    - Ingresar dinero
    - Salir de la cuenta
    
*Clases Java*
1. Modelo de mi objeto -> model -> CuentaBancaria.java
2. Lógica del programa -> logic -> CuentaBancariaService.java
3. Definir Excepciones -> exceptions -> FondosInsuficientesException.java
4. Main (instancias) -> model -> BancoMain.java