package com.javacl.test;

/**
 * ��ת�������С����
 * Created by caoliang on 2015/9/22.
 */
public class Demo8 {

    public static void main(String[] args) {
        int[] n = {3, 4, 5,1, 2};
        System.out.println(min(n));
        int[] m = {1, 1, 1, 0, 1};
        System.out.println(min(m));
    }

    /**
     * ����ת��������С������
     * @param n
     * @return
     */
    public static int min(int[] n) {
        if (n == null || n.length <=0 ) {
            try {
                System.out.println("���鲻��Ϊ��");
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        int index1 = 0;             //ָ���һ��Ԫ��
        int index2 = n.length - 1;  //ָ�����һ��Ԫ��
        int indexMid = index1;
        while (n[index1] >= n[index2]) {
            if (index2 - index1 == 1) {
                indexMid = index2;
                break;
            }

            indexMid = (index1 + index2) / 2;

            //����±�Ϊindex1, index2, indexMid�����������ʱʹ��˳������ҳ���С������
            if (n[index1] == n[indexMid] && n[indexMid] == n[index2] && n[index1] == n[index2]) {
               indexMid = MininOrder(index1, index2, n);
            }

            if (n[indexMid] >= n[index1]) {
                index1 = indexMid;
            }

            if (n[indexMid] <= n[index2]) {
                index2 = indexMid;
            }
        }

        return n[indexMid];
    }

    public static int MininOrder(int index1, int index2, int[] n) {
        int result = index1;
        for (int i=index1; i<=index2; i++) {
            if (n[result] > n[i]) {
                result = i;
            }
        }
        return result;
    }

}
