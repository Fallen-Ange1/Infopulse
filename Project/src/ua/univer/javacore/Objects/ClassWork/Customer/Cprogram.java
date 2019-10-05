package ua.univer.javacore.Objects.ClassWork.Customer;

public class Cprogram {
    public static void main(String[] args) {
        Customer[] customers = new Customer[4];
        customers[0] = new Customer(5542, "Petrenko P.P.", "Karabasa 5", 553214563, 523421456);
        customers[1] = new Customer(3124, "Dmytrenko D.D.", "Saburova 46", 312456678, 324325678);
        customers[2] = new Customer(9812, "Ivanov I.I.", "Miloslavska 11", 124325678, 786545321);
        customers[3] = new Customer(7453, "Vasiliev V.V.", "Shevchenka 89a", 43256781, 325236575);
        CustomerList.printAlphabetical(customers);
        System.out.println("-----------------------------------------");
        CustomerList.customerCardInBondaries(customers);
    }
}
