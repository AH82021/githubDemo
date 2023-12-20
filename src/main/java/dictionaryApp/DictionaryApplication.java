package dictionaryApp;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionaryApplication {
    private final Map<String, String>  dictionary = new HashMap<>();

    public void addWord(String word,String meaning) {
        dictionary.put(word,meaning);
    }

    public String getMeaning(String word) {
        return dictionary.get(word);

    }

    public Set<String> getAllWords() {
        return dictionary.keySet();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Welcome to the dictionary application
                   please enter your choice 
                   1- Add a word 
                   2- Get Meaning
                   3- Get All Words
                   4-Exit
                    """);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter a word ");
                    String word = scanner.nextLine();
                    System.out.println("Enter the meaning ");
                    String meaning = scanner.nextLine();
                    addWord(word,meaning);
                    System.out.println("Word added Successfully ");
                    break;
                case 2:
                    System.out.println("Enter a word ");
                    String lookupWord = scanner.nextLine();
                 String lookUpMeaning =    getMeaning(lookupWord);
                 if(lookUpMeaning == null){
                     System.out.println("Word not found in this dictionary");
                 } else {
                     System.out.println(lookupWord+" : "+lookUpMeaning);
                 }
                 break;

                case 3:
                    Set<String> words =  getAllWords();
                    if(words.isEmpty()){
                        System.out.println("Dictionary is empty ");
                    } else {
                        for (String w : words) {
                            System.out.println(w);
                        }
                    }

                    break;
                    case 4:
                        System.out.println("Exiting dictionary ...");
                        System.exit(0);
                        break;
                default:
                    System.out.println(" Invalid choice , Please try again ");
            }

        }

    }

    public static void main(String[] args) {
//        DictionaryApplication app = new DictionaryApplication();
//        app.run();

        System.out.println(sol("Matthew"));
    }
    //
    //
    public static Map<Character,Integer> sol(String s){
        s = s.toLowerCase();
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i),1);
            }
        }




        return map;


    }
}
