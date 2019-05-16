/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testData;

import subbuisnesstier.entities.Client;

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
    
    public String equipmentData[][]={
      {"Plyn hamulcowy SHIMANO", "10","2"},
        {"Tarcze hamulcowe 180", "140","0"},
        {"Koło ", "190","13"},
        {"Rama", "1460","10"}
};

public Client[] clients = {
    new Client("Marian", "Kowalski", "marian.kowalski@gmail.com"),
    new Client  ("Harry ", "Potter", "Harry123@gmail.com"),
    new Client("John", "Snow", "white@onet.pl")};

}








