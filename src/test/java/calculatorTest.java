import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    calculator cal = new calculator(); //Baris ini membuat objek dari kelas calculator yang akan diuji.

    @org.junit.jupiter.api.Test
    @DisplayName("Add two numbers")
    void add() { //Baris ini mendefinisikan metode pengujian add. Metode ini akan memeriksa hasil dari metode add dalam kelas calculator.
        assertEquals(4, cal.add(2, 2));//Baris ini menggunakan metode assertEquals dari kelas Assertions
        // untuk memeriksa apakah hasil dari cal.add(2, 2) sama dengan 4.
    }

    @org.junit.jupiter.api.Test
    void multiply() {//Baris ini mendefinisikan metode pengujian multiply. Metode ini akan digunakan untuk menguji metode multiply dalam kelas calculator.
    }
}