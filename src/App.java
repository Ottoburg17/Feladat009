/*
* File: feladat009.java
* Author: Németh Ottó
* Copyright: 2023.11.26 Németh Ottó
* Group: Szoft II/1-E
* Date:  2023.11.26
* Github: https://github.com/Ottoburg17/Feladat009.git
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {

        Controller controller = new Controller();
        controller.start();
        controller.stop();
        controller.restart();
    }
}
