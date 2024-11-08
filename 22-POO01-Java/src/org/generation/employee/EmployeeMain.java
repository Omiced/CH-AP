package org.generation.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// Instanciar los objetos de tipo Employee (class Employee)
		Employee daniel = new Employee("Daniel", "Maldonado", 37, 10366.32f, "Instructor");
		System.out.println(daniel);
		
		Employee orlando = new Employee("Orlando", "Lopez", 29, 10855.47f, "Java Dev");
		System.out.println(orlando);
		
		Employee ale = new Employee("Alejandra", "Moreno", 24, 21558.27f, "Java Dev");
		System.out.println(ale);
		
		// Invocando métodos de comportamiento
		orlando.trabajar();
		ale.calcularSalario();
		daniel.infoGeneral();
		ale.infoGeneral();
		orlando.infoGeneral();
		
		// Acceder a los datos de cada atributo de las instancias (getters)
		System.out.println(ale.getNombre() + " gana $" + ale.getSalario() + " en la posición " + ale.getPuesto());
		
		System.out.println(orlando.getNombre() + " gana $" + orlando.getSalario() + " y se le aumentan $2000 quedando en $" + (orlando.getSalario() + 2000));
		
		orlando.calcularSalario(); // El salario no se modificó ya que solo se realizó una operación matemática con base en el salario
		
		// Modificar el dato de la variable de instancia (setter)
		float nuevoSalario = orlando.getSalario() + 2000;
		orlando.setSalario(nuevoSalario);
		
		orlando.calcularSalario(); // Ya se muestra el nuevo salario como parte del dato de la variable de instancia del objeto Orlando
		
		

	}

}
