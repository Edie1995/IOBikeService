/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testData;

import java.time.LocalDate;

/**
 *
 * @author Magda
 */
public class Data {

    public String[] dataclients = {
        "Client{firstName=Marian, lastName=Kowalski, email=marian.kowalski@gmail.com, services=[]}",
        "Client{firstName=Harry, lastName=Potter, email=Harry123@gmail.com, services=[]}",
        "Client{firstName=Tyrion, lastName=Lanister, email=lubiesmoki@gmail.com,"
        + " services=[Service{name=Serwis, status=PRZYJETE, endTime=2019-05-25, "
        + "serviceType=Wymiana,equipments[Equipment{name=Plyn hamulcowy SHIMANO, price=10.0}]}"};
    public String[] dataDate = {
        LocalDate.now().plusDays(2).toString(), 
        LocalDate.now().plusDays(5).toString()};
    public String[] dataservice = {
        "Service{name=Wymiana klockow hamulcowych i linek, status=PRZYJETE, endTime="+dataDate[0]+", serviceType=Wymiana,equipments[]}",
        " Service{name=Serwis2, status=PRZYJETE, endTime="+dataDate[0]+", serviceType=Wymiana,equipments[]",
        "Service{name=Czyszczenie napedu, status=PRZYJETE, endTime="+dataDate[1]+", serviceType=Czyszczenie,equipments[]}"};

    public String[] dataservicetype = {
        "ServiceType{name=Wymiana, defaultEndTime=2, services=[]}",
        "ServiceType{name=Czyszczenie, defaultEndTime=5, services=[]}"};

    public String[] dataequipment = {
        "Equipment{name=Plyn hamulcowy SHIMANO, amount=1, orderAmount=0, price=10.0}"};

    public String[] outputMessages = {
        "Dodano wyposazenie do serwisu",
        "Zakonczono zamowienie",
        "dodano produkt do zamowienia"};

    public String[] dataorder = {
        "Order{name=Zamowienie1, status=PRZYJETE, equipments=[]}",
        "Order{name=Zamowienie1, status=ZAKONCZONE, equipments=[]}",
        "Order{name=Zamowienie2, status=ZAKONCZONE, equipments=[]}",
        "Order{name=Zamowienie1, status=ZAKONCZONE, "
        + "equipments=[Equipment{name=Plyn hamulcowy SHIMANO, amount=2, "
        + "orderAmount=0, price=10.0}, Equipment{name=Rower Gorski, amount=3,"
        + " orderAmount=0, price=15.99}]"};

}
