public class task_three {

    public static void main(String[] args) {


        String[] Name = {"Валера", "Коля", "Маша", "Даша", "Толя"};


        for (int i = 0; i < 5; i++) {
            if (Name[i] == "Коля") {
                System.out.println(Name[i] + " пока");
            }
            else if (Name[i] == "Маша") {
                System.out.println(Name[i] + " как дела");
            }
            else if (Name[i] == "Даша") {
                System.out.println(Name[i] + " empty");
            }
            else if (Name[i] == "Толя") {
                System.out.println(Name[i] + " а это кто?");
            }
            else if (Name[i] == "Валера") {
                System.out.println(Name[i] + " о, Валера!");
            }

        }
    }
}
