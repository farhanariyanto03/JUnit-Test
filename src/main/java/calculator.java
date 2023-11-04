import java.util.stream.DoubleStream; // Kelas ini digunakan untuk melakukan operasi streaming pada bilangan pecahan ganda (double).

public class calculator {
    //Baris ini mendefinisikan metode statis bernama add dengan tipe pengembalian double.
    static double add(double... operands) {
        //digunakan untuk mengubah larik (array) bilangan pecahan ganda (operands) menjadi
        // sebuah aliran (stream) bilangan pecahan ganda.
        return DoubleStream.of(operands)
                .sum(); //digunakan untuk menghitung jumlah dari semua elemen
    }

    static double multiply(double... operands) { // Baris ini mendefinisikan metode statis bernama multiply dengan tipe pengembalian double.
        return DoubleStream.of(operands)//digunakan untuk mengubah larik (array) bilangan pecahan ganda (operands) menjadi sebuah aliran (stream) bilangan pecahan ganda.
                .reduce(1, (a, b) -> a * b);//digunakan untuk menggabungkan elemen-elemen dalam aliran dengan suatu operasi yang ditentukan
    }
}
