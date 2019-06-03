package mianshi.s45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 美团 字符编码
 */
public class s45 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i <= n; i ++ )
                list.add(i);
            while (list.size() != 1) {
                // 从0开始list移除一次,i再加一次,i始终指向奇数位
                for (int i = 0; i < list.size(); i = i + 1)
                    list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }

}
