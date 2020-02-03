package homework;

public class SortingMassiv {

    public static void main(String[] args) {
        String[] arrayProduct = new String[]{"Drum", "Druai", "Fuser", "Fusea","Feed roll","Feeder roll", "Nudger roll"};
        arrayProduct = sortProduct(arrayProduct);
        for (String s : arrayProduct) {
            System.out.println(s);
        }
    }


    private static String[] sortProduct(String[] arrayProduct) {

        String tempArray;
        int minId;

        for (int i = 0; i < arrayProduct.length; i++) {
            tempArray = arrayProduct[i];
            minId = i;
            for (int j = i + 1; j < arrayProduct.length; j++) {

                int minLengthId = minId;
                if ((arrayProduct[j].charAt(0) <= tempArray.charAt(0)) && (minId != j)) {
                    if (arrayProduct[j].charAt(0) == tempArray.charAt(0)) {
                        if (arrayProduct[j].length() < tempArray.length()) {
                            minLengthId = j;
                        }
                        int n = 1;
                        while ((n < arrayProduct[minLengthId].length()) && (arrayProduct[j].charAt(n) <= tempArray.charAt(n))) {
                            if ((arrayProduct[j].charAt(n) < tempArray.charAt(n)) && (minId != j)) {
                                tempArray = arrayProduct[j];
                                minId = j;
                            }
                            n++;
                        }
                    } else {
                        tempArray = arrayProduct[j];
                        minId = j;
                    }
                }
            }
            if (i != minId) {
                arrayProduct[minId] = arrayProduct[i];
                arrayProduct[i] = tempArray;

            }
        }
        return arrayProduct;

    }
}