package ArrayList;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> firstFivePrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        List<Integer> nextFivePrimeNumber = new ArrayList<>();

        nextFiveprimeNumber.add(13);
        nextFiveprimeNumber.add(17);
        nextFiveprimeNumber.add(19);
        nextFiveprimeNumber.add(23);
        nextFiveprimeNumber.add(29);

        firstTenPrimeNumber.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);
    }
}
