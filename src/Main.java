import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
	
	static List<B_data> books_list = new ArrayList<B_data>();
	static List<M_data> movie_list = new ArrayList<M_data>();
	
	public static void main(String[] args){
		books_list.add(new B_data("Horror", "Varufaruco", "Capcom", 19 ));
		books_list.add(new B_data("Accion", "Deviljho", "Tarantulino", 14 ));
		books_list.add(new B_data("Aventuras", "Nergigante", "Capcom", 17 ));
		books_list.add(new B_data("Aventuras", "Aventura nº1", "Samael", 20 ));
		books_list.add(new B_data("Horror", "Dinobalbo", "Capcom", 19));
		movie_list.add(new M_data("Horror", "Stan", "Stan", 22));
		movie_list.add(new M_data("Horror", "Stan", "Stan", 22));
		movie_list.add(new M_data("Horror", "Stan", "Stan", 22));
		movie_list.add(new M_data("Horror", "Stan", "Stan", 22));
		Interface threat = new Process();
		Interface exit = new Exit();
		Interface BList = new Opt_1();
		Interface MList = new Opt_2();

		
		@SuppressWarnings("resource")
		Scanner choice1 = new Scanner (System.in);
		int choice = 0;
		while (choice!=3) {
			

			System.out.println("select 1, 2 or 3");
			System.out.println("");


			Docker contenedor = new Docker(threat); 
		    contenedor.mensaje();
			
		    contenedor = new Docker(BList);
			contenedor.mensaje();
			
			contenedor = new Docker(MList);
			contenedor.mensaje();
		    
		    contenedor = new Docker(exit);
			contenedor.mensaje();
			
			
		  
			choice = choice1.nextInt();

			switch(choice){

			case 1:
				
				Customer cliente1 = new Customer("User1", new int[] { 1, 1, 3, 1, 2, 3 });
				Customer cliente2 = new Customer("User2", new int[] { 2, 2, 3, 1, 2, 3 });
				Customer cliente3 = new Customer("User3", new int[] { 3, 3, 2, 1, 2, 3 });


				Employee employee1 = new Employee("Emp1", 001);
				Employee employee2 = new Employee("Emp2", 002);
				Employee employee3 = new Employee("Emp2", 003);


				long initialTime = System.currentTimeMillis();

				employee1.procesarCompra(cliente1, initialTime);
				employee2.procesarCompra(cliente2, initialTime);
				employee3.procesarCompra(cliente3, initialTime);


				break;
			case 2:
				for (int i=0; i<=books_list.size() -1 ; i++) {
		    		   
		   			System.out.println("categorie name: " + books_list.get(i).category + "Book name: " + books_list.get(i).name + "Author name: " + books_list.get(i).author + "Book price: " + books_list.get(i).price);

		    	   }	
				break;
				
			case 3:
				for (int i=0; i<=books_list.size() -1 ; i++) {
		    		   
		   			System.out.println("category name: " + movie_list.get(i).category + "Movie name: " + movie_list.get(i).name + "Author name: " + movie_list.get(i).author + "Movie price: " + movie_list.get(i).price);

		    	   }
				break;
			case 4:
				break;
			}		
		}	
		System.out.println("\tThanks for coming come back soon");	
	}
}
