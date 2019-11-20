public class task_two {

    public static void main(String[] args) {


        String[] Name = {"Lol", "Kek", "Cheburek", "Vitalaiser"};

        int[] Age = {12, 56, 21, 32};


        for (int i = 0; i < 4; i++) {
            if (Age[i] > 20) {
                System.out.println(Name[i] + " = " + Age[i] + " > 20 лет ");
            } else {
                System.out.println(Name[i] + " = " + Age[i] + " < 20 лет ");
                ;
            }

        }
    }


}
