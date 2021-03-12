
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result;
        result = calculator.add(2,3);
        System.out.println("Add: "+result);
        result = calculator.substract(4, 5);
        System.out.println("Substract: "+result);
    }
}
