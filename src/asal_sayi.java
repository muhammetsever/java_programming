public class asal_sayi {
    public static void main(String[] args) {

        int sayac = 0;

        for( int i = 0 ; i <= 100 ; i++ ){

            for( int j = 1 ; j <= i ; j++ ){

                if( i % j == 0){
                    sayac++;

                }
            }

            if (sayac == 2){
                System.out.println(i);
            }
            sayac = 0;
        }
    }
}

