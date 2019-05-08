
import subbuisnesstier.Facade;

public class Test {

    public static void main(String[] args) {
        Facade facade = new Facade();

        //Przykladowa funkcjonalnosc programu
        //W pierwszym kroku nalezy podac dane klienta
        String[] clientData = {"Marian", "Kowalski", "marian.kowalski@gmail.com"};
        String[] clientData2 = {"Harry ", "Potter", "Harry123@gmail.com"};
        String[] clientData3 = {"Edyta", "Krukowska", "Eddie1995@gmail.com"};
        //Dany ekwipunek potrzebny do naprawy
        String[] equipmentData2 = {"Plyn hamulcowy SHIMANO", "10","2"};
        // Numer zamowienia (domyslnie bedzie okreslany na podstawie bazy danych)
        String orderName[] = {"Zamowienie1"};
        String amount[] = {"2"};
        // Rodzaj przeprowadzanej uslugi i czas potrzebny na jej wykonanie
        String serviceType1[] = {"Wymiana", "2"};
        // Opis serwisu
        String service1[] = {"Serwis", "0"};
        String service2[] = {"Serwis2", "2"};

        String[] equipmentData3 = {"Rower Gorski", "15.99","2"};

        //Funkcjonalnosc serwisu krok po kroku:
        //1.Dodajemy klienta z podanymi danymi w clientData
        System.out.println("\n" + facade.addClient(clientData));
        System.out.println(facade.addClient(clientData2));
        System.out.println(facade.addClient(clientData3));
        //Proba ponownego dodania tego samego klienta
        System.out.println(facade.addClient(clientData));
        System.out.println("-----------------------------------------------------------------------\n");

        //2.Dodajemy typ serwisu o okreslonym czasie potrzebnym na jego przeprowadzenie
        System.out.println(facade.addServiceType(serviceType1));
        //Proba dodania takiego samego typu
        System.out.println(facade.addServiceType(serviceType1));
        System.out.println("-----------------------------------------------------------------------\n");

        //3. Do listy przechowujacej serwisy w fasadzie dodajemy serwisy
        System.out.println(facade.addService(clientData, serviceType1, service1));
        System.out.println(facade.addService(clientData, serviceType1, service2));
        //Proba dodania takiego samego serwisu do klienta
        System.out.println(facade.addService(clientData, serviceType1, service1));

        // Wyswietla typy serwisow
        System.out.println(facade.getServicesTypes());
        System.out.println("-----------------------------------------------------------------------\n");

        //Wyswietla serwisy dla kienta
        System.out.println(facade.getClients().get(0).getServices());

        //5. Dodanie do listy w fasadzie ekwipunku ktory bedzie mozna zamawiac lub zuzywac
        System.out.println(facade.addEquipment(equipmentData2));
        System.out.println(facade.addEquipment(equipmentData3));
        System.out.println("-----------------------------------------------------------------------\n");

        //6. Sprawdzenie ilosci ekwipunku "na stanie"
        System.out.println(facade.checkAvailability(equipmentData2));
        System.out.println(facade.checkAvailability(equipmentData3));
        System.out.println("-----------------------------------------------------------------------\n");

        // 7. przyporzadkowanie konkretnego ekwipunku do serwisu.
        System.out.println(facade.addEquipmentToService(clientData, serviceType1, service1, equipmentData2));
        //proba dodania narzedzia ktorego ilos na stanie jest rowna 0
        System.out.println(facade.addEquipmentToService(clientData, serviceType1, service1, equipmentData2));
        System.out.println("-----------------------------------------------------------------------\n");

        // 8. dodanie zamowienia do listy (zamowienia beda wykonywane gdy jakiegos ekwipunku nie bedzie na stanie)
        System.out.println(facade.addOrder(orderName));
        System.out.println("-----------------------------------------------------------------------\n");

        //9.Dodanie potrzebnego nam ekwipunku do zamowienia.
        // Jestesmy informowani czy udalo sie dodac , lub w p.p metoda zwraca "Nie ma takiego produktu"
        System.out.println(facade.addEquipmentToOrder(orderName, equipmentData2));
        //Proba dodania takiego samego ekwipunku do zamowienia
        System.out.println(facade.addEquipmentToOrder(orderName, equipmentData2));
        System.out.println(facade.addEquipmentToOrder(orderName, equipmentData3));
        System.out.println("-----------------------------------------------------------------------\n");
        //Sytuacja gdy dodajemy cos czego nie mamy
        System.out.println(facade.addEquipmentToOrder(orderName, new String[]{"Pedaly", "10.0"}));
        System.out.println(facade.addEquipmentToOrder(orderName, new String[]{"Kolo", "25.50"}));
        System.out.println("-----------------------------------------------------------------------\n");

        //10. Zmiana stanu na zakonczony po wykaniu serwisu
        System.out.println(facade.changeOrderStatusToEnd(orderName));
        System.out.println(facade.getOrders().get(0));
        //Zmiana ilosci dostepnych narzedzi w serwisie i wyzerowanie zamowien
        System.out.println(facade.getEquipments());
        System.out.println("-----------------------------------------------------------------------\n");

        // Mozemy sobie wypisac klientuw i przyporzadkowane do nich serwisy.
        System.out.println(facade.getClients());

    }
}
