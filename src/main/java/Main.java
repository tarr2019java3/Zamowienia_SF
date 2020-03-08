public class Main {

    public static void main(String[] args) {


        Customer customer = new Customer("Jan","Kowalski",45, "dupa@wp.pl");
        Customer customer1 = new Customer ("Piotr", "Nowak",32,"toxicwp.pl");
        Customer customer2 = new Customer("Marek", "Fikol", 12,"pilka@wp.pl");


        Product product = new Product("widelec",9,Category.B);
        Product product1 = new Product("lyzka",5,Category.A);
        Product product2 = new Product("noz",2,Category.C);


        Order order = new Order(customer,product,1,12/31/2021);
        Order order1 = new Order(customer1,product1,3,12/3/2018);
        Order order2 = new Order(customer2,product2,5,21/5/2021);


    }
}
