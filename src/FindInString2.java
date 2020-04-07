import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FindInString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao chuoi : ");
        String str = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        //T(for) =O(n^2) (n = str.length)
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (max.size() < list.size()) {
                max.clear();
                max.addAll(list);
                list.clear();
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
    }
}