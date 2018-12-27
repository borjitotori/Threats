public class Employee {

	private String name;
	private int id;
	

	public Employee (String name, int id) {

		this.name=name;
		this.id = id;
	}


	public void procesarCompra(Customer cliente, long timeStamp) {

		System.out.println("");
		System.out.println("nombre del empleado: " + this.name + "id del responsable" + this.id);
		System.out.println("nombre del cliente: " + cliente.getName());

		for (int i = 0; i < cliente.getCart().length; i++) { 
				this.wait(cliente.getCart()[i]); 
				System.out.println("Procesado el producto " + (i + 1) +  " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
		}

		System.out.println("");
		System.out.println("El empleado" + this.name + " ha prcesado su venta:" + cliente.getName() + " en" + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
		System.out.println("");

	}


	private void wait(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}