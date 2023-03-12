import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        /*Syantax :- ArrayList<Integer> list = new ArrayList<>(); */
        // ArrayList <Integer> list = new ArrayList<>();
        // list.add(45);
        // list.add(50);
        // System.out.println(list);
        // System.out.println(list.contains(50));

//Taking input in array list

        Scanner sc = new Scanner (System.in);
        ArrayList <Integer>list = new ArrayList <> (10); // 
        for (int i = 0; i <10; i++) {
            list.add(sc.nextInt()); 
        }
        System.out.println(list);
    }
}

/*In array list we can take as many inputs as we want but the logic behind this is :- in the above program we have
 taken 10 in initial capasity so when the array gets 50% full it will double the size of the array means 10 becomes
  20 and when again the 50% is full of the array it will create the size as 40. so that's how we can take the 
  unlimited input in arraylist.*/
