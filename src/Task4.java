import java.util.Scanner;

public class Task4 {
    public Task4() {
    }

    public void t4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input text");
        String text = input.nextLine();
        System.out.println("Entered text: \n"+text);
        System.out.println("Text of words with duplicates of letters: ");
        for(String word : text.split(" ")){
            char[] x = word.toCharArray();
            boolean duplicates = false;
            if ((x[0] >= 'a' && x[0] <= 'z')|| (x[0] >= 'A' && x[0] <= 'Z')) {
                for (int j = 0; j < x.length; j++) {
                    for (int k = j + 1; k < x.length; k++) {
                        if (x[k] == x[j]) {
                            duplicates = true;
                        }
                    }
                }
                if(duplicates==true){
                    System.out.print(word+ " ");
                }
            }
        }

        System.out.println("\n Text without words with duplicates of letters: ");
        for(String word : text.split(" ")){
            char[] x = word.toCharArray();
            boolean duplicates = false;
            if ((x[0] >= 'a' && x[0] <= 'z')||(x[0] >= 'A' && x[0] <= 'Z')) {
                for (int j = 0; j < x.length; j++) {
                    for (int k = j + 1; k < x.length; k++) {
                        if (x[k] == x[j]) {
                            duplicates = true;
                        }
                    }
                }
                if(duplicates==false){
                    System.out.print(word+ " ");
                }
            }
        }
    }
}

