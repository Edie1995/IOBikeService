/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testData;

import subbuisnesstier.entities.Client;
import subbuisnesstier.entities.Equipment;
import subbuisnesstier.entities.Order;
import subbuisnesstier.entities.Service;
import subbuisnesstier.entities.ServiceType;
import subbuisnesstier.entities.Status;

/**
 *
 * @author Magda
 */
public class Data {

    public String clientData[][] = {
        {"Marian", "Kowalski", "marian.kowalski@gmail.com"},
        {"Harry ", "Potter", "Harry123@gmail.com"},
        {"Tyrion", "Lanister", "lubiesmoki@gmail.com"},
        {"Denerys", "Targaryen", "danka1234@gmail.com"},
        {"John", "Snow", "white@onet.pl"}};

    public Client[] clients = {
        new Client("Marian", "Kowalski", "marian.kowalski@gmail.com"),
        new Client("Harry ", "Potter", "Harry123@gmail.com"),
        new Client("Tyrion", "Lanister", "lubiesmoki@gmail.com"),
        new Client("Denerys", "Targaryen", "danka1234@gmail.com"),
        new Client("John", "Snow", "white@onet.pl"),
        new Client("Tyrion", "Lanister", "lubiesmoki@gmail.com")};

    public String equipmentData[][] = {
        {"Plyn hamulcowy SHIMANO", "10", "2"},
        {"Tarcze hamulcowe 180", "140", "0"},
        {"Koło ", "190", "13"},
        {"Rama", "1460", "10"}
    };

    public Equipment equipments[] = {
        new Equipment("Plyn hamulcowy SHIMANO", "10", "2"),
        new Equipment("Tarcze hamulcowe 180", "140", "0"),
        new Equipment("Koło ", "190", "13"),
        new Equipment("Rama", "1460", "10"),
        new Equipment("Rama", "1460", "10")
    };

    public String serviceTypeData[][] = {
        {"Wymiana", "2"},
        {"Naprawa", "4"},
        {"Konserwacja", "1"},
        {"Czyszczenie", "1"}
    };
    public ServiceType types[] = {
        new ServiceType("Wymiana", "2"),
        new ServiceType("Naprawa", "4"),
        new ServiceType("Konserwacja", "1"),
        new ServiceType("Czyszczenie", "1")
    };

    public String serviceData[][] = {
        {"Wymiana kola od roweru", "2"},
        {"Naprawa hamulcow", "1"},
        {"Konserwacja lakieru", "3"},
        {"Czyszczenie", "0"}
    };

    public Service services[] = {
        new Service("Wymiana kola od roweru", "2", types[0]),
        new Service("Naprawa hamulcow", "1", types[1]),
        new Service("Konserwacja lakieru", "3", types[2]),
        new Service("Czyszczenie", "0", types[3])
    };

    public String orderData[][] = {
        {"Zamowienie brakujacych czesci"},
        {"Zamowienie kol"},
        {"Nowe kierownice"}
    };

    public Order orders[] = {
        new Order("Zamowienie brakujacych czesci"),
        new Order("Zamowienie kol"),
        new Order("Nowe kierownice"),
        new Order("Nowe kierownice")
    };

    public Status status[] = {
        Status.PRZYJETE,
        Status.WYSLANE,
        Status.W_TRAKCIE_REALIZACJI,
        Status.ZAKONCZONE
    };

}
