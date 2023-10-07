public class Main {
    public static void main(String[] args) {
        double[] myList = {5.8,8.8,4.5,-6.3,3.2,-2.4,7.6,2.1,-1.2,1.2,4.4,7.8,2.3,4.3,5.1};
        double summa = 0;
        int kolichestvo = 0;
        boolean proverka = false;


        for (double nombers : myList
             ) {
            if (nombers < 0){
                proverka = true;

            } else if ( nombers > 0 && proverka) {
                summa += nombers;
                kolichestvo ++;
                System.out.println(nombers);

            }
        }
        System.out.println(" srednee arifmiticheskoe " + summa/kolichestvo);

    }
}