import java.sql.SQLOutput;
import java.util.*;

import static jdk.internal.module.IllegalAccessMaps.generate;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = List.of("maks", "max", "max", "naks", "doc");
       task1(nums);
       task2(nums);
       task3(words);
       task4(words);
    }

    private static List<String> generate(int a) {
        List<String> list = new ArrayList<>(a);
        int length = 8;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a; i++) {
            stringBuilder.append((char)RANDOM.nextInt('a'));

            list.add(stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.length());
        }
        return list;

    }






    public static void task1(List<Integer> nums){
       System.out.println("Задание 1.");

              for (int i = 0; i < nums.size(); i++) {
           if(nums.get(i) % 2 == 1) {
               System.out.print( nums.get(i) + " ");
            }
       }
       System.out.println();
   }
   public static void task2(List<Integer> nums){
       System.out.println("Задание 2.");
       Set <Integer> set = new TreeSet<>(nums);
             for (Integer number : set) {
              if (number %2 != 1){
                  System.out.print( number + " ");
              }
       }
       System.out.println();
   }
   public static void task3(List<String> words){
       System.out.println("Задание 3.");
   for (String word : words){
       if (Collections.frequency(words, word ) == 1) {
           System.out.print( word + " ");
       }
   }
       System.out.println();
   }
   public static void  task4(List<String> words){
       System.out.println("Задание 4.");
       Map<String, Integer> map = new TreeMap<>();
       for (String word : words){
           if (!map.containsKey(word) )  {
               map.put(word,1);
           } else { map.replace(word, map.get(word)+1);}

           }
       System.out.println(map);
       }



}
