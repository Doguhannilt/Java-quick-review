
package OOP.Calculator;

public class Calculator {
    // Burada Sınıf Adına Deği;ken Oluştur.
    public int number1;
    public int number2;

    // Burada Constructor Oluştur ve Parametreleri Ekle.
    Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Burada Metod Oluştur.
    void add() {
        System.out.println(this.number1 + this.number2);
    }

    // Burada Metod Oluştur.
    public int multiply() {
        int result = this.number1 * this.number2;
        return result;
    }
    

}