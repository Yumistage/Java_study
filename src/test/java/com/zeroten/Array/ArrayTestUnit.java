package com.zeroten.Array;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayTestUnit {
    @Test
    public void test数组定义() {
        int[] arr1;
        String[] arr2;
        int arr3[];
        String arr4[];
    }

    @Test
    public void test赋值() {
        int[] arr1 = new int[5];
        System.out.println(Arrays.toString(arr1));

        boolean[] arr2 = new boolean[3];
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = new String[3];
        System.out.println(Arrays.toString(arr3));


    }

    @Test
    public void test数组的遍历() {
        Integer[] arr = {1, 2, 3, 4, 5};

        //for循环
        System.out.println("for循环");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //foreach
        System.out.println("foreach循环");
        for (int a : arr) {
            System.out.println(a);
        }

        //java8中新增的Lambda表达式
        System.out.println("Lambda循环");

        Arrays.asList(arr).forEach(val -> {
            System.out.println(val);
            if (val % 2 == 0) {
                System.out.println(String.format("%d 是偶数", val));
            } else {
                System.out.println(String.format("%d 是奇数", val));
            }

        });

    }

    @Test
    public void test数组拷贝() {

        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {6, 7, 8, 9, 10};

        //拷贝arr1的前3个元素生成一个新的数组
        Integer[] arr3 = Arrays.copyOf(arr1, 3);
        System.out.println(Arrays.toString(arr3));

        //拷贝arr2的后3个元素生成一个新的数组
        Integer[] arr4 = Arrays.copyOfRange(arr2, 2, 4);
        System.out.println(Arrays.toString(arr4));

        //把arr2的后三位拷贝到arr1的后三位
        System.arraycopy(arr2, arr2.length - 3, arr1, arr1.length - 3, 3);
        System.out.println(Arrays.toString(arr1));


    }

    @Test
    public void test数组填充() {
        int[] arr = new int[10];

        //填充数组为5
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));

        for (int index = arr.length - 3; index < arr.length; index++) {
            arr[index] = 3;
        }
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 0, 6, 5);
        Arrays.fill(arr, 7, arr.length, 3);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test数组排序() {
        //定义一个大小为100的int数组，随机给每一位赋值一个0~100的数值，然后排序并打印结果
        int[] arr = new int[100];
        for (int index = 0; index < 100; index++) {
            arr[index] = new Random().nextInt(100);
        }
        System.out.println("排序前： " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后： " + Arrays.toString(arr));
    }

    @Test
    public void test多维数组和不规则数组() {
        //定义一个二维数组，第一维标识用户，第二维表示用户具体信息（1.编码 2.姓名 3.性别 4.年龄）
        String[][] users = new String[3][];
        users[0] = new String[4];
        users[0][0] = "001";
        users[0][1] = "张三";
        users[0][2] = "男";
        users[0][3] = "20";

        System.out.println(Arrays.toString(users[0]));
        users[1] = new String[4];
        users[1][0] = "002";
        users[1][1] = "李四";
        users[1][2] = "男";
        users[1][3] = "22";
        System.out.println(Arrays.toString(users[1]));
        users[2] = new String[]{"003", "王五", "男", "22"};

        System.out.println(Arrays.toString(users[2]));

        System.out.println("打印方式:for");

        for (int index = 0; index < users.length; index++) {
            System.out.println(Arrays.toString(users[index]));
        }

        System.out.println("打印方式:foreach");
        for (String[] user : users) {
            System.out.println(Arrays.toString(user));
        }

        System.out.println("打印方式:Lambda");
        Arrays.asList(users).forEach(user -> System.out.println(Arrays.toString(user)));


    }

    @Test
    public void test应用练习() {
        //给定一个整数素组nums和一个目标值target，请你再该数组中找出和为目标值的那两个整数，
        //并返回他们的组数的下标
        //举例：{2，7，11，15} target=9
        System.out.println("方法1");
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println("方法2");
        System.out.println(Arrays.toString(twoSum2(new int[]{2, 7, 11, 15}, 9)));
    }

    //方法1
    public int[] twoSum(int[] nums, int target) {

        for (int iloop = 0; iloop < nums.length - 1; iloop++) {
            for (int jloop = iloop + 1; jloop < nums.length - 1; jloop++) {
                if (nums[iloop] + nums[jloop] == target) {
                    return new int[]{iloop, jloop};
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    //方法2
    public int[] twoSum2(int[] nums, int target) {
        System.out.println("排序前" + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("排序后" + Arrays.toString(nums));
        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] > target) {
                return null;
            }
            for (int twoindex = index + 1; twoindex < nums.length; twoindex++) {
                if (nums[twoindex] > target) {
                    break;
                }
                if (nums[index] + nums[twoindex] == target) {
                    return new int[]{index, twoindex};
                }
            }
        }
        return  null;
    }

}
