# Threads

##Classes

First we have the classes for customers and employees, then there are the classes for threads and the functions implemented for buy things and show the processes while buying and which emplpoyee sell each thing.

##Threads

Almost all the threads are implemented on yhe class *Buy_threat* where are also implemented the customers and the employees
> public class Buy_threat implements Runnable{

	private Customer cliente;
	private Employee cajera;
	private long initialTime;
	
	public Buy_threat (Customer cliente, Employee cajera, long initialTime){
		this.cajera = cajera;
		this.cliente = cliente;
		this.initialTime = initialTime;
	}
	public static void main(String[] args) {
		
		Customer cliente1 = new Customer("User1", new int[] { 1, 1, 3, 1, 2, 3 });
		Customer cliente2 = new Customer("User2", new int[] { 2, 2, 3, 1, 2, 3 });
		Customer cliente3 = new Customer("User3", new int[] { 3, 3, 2, 1, 2, 3 });

		
		Employee cajera1 = new Employee("Emp1", 001);
		Employee cajera2 = new Employee("Emp2", 002);
		Employee cajera3 = new Employee("Emp3", 003);
		
		long initialTime = System.currentTimeMillis();
		
		Runnable proceso1 = new Buy_threat(cliente1, cajera1, initialTime);
		Runnable proceso2 = new Buy_threat(cliente2, cajera2, initialTime);
		Runnable proceso3 = new Buy_threat(cliente3, cajera3, initialTime);

		new Thread(proceso1).start();
		new Thread(proceso2).start();
		new Thread(proceso3).start();
	}
	@Override
	public void run() {
		this.cajera.procesarCompra(this.cliente, this.initialTime);
	}
}

Alos test will be added on later versions.

