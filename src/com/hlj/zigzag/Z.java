package com.hlj.zigzag;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Z {
/**
 * 本题中n为4进行解析
 */
	    static int[][] a;  
	    static int t = 1;  
	  
	    public static void main(String[] args) {  
	        Scanner input = new Scanner(System.in);  
	        System.out.println("输入一个数(代表矩阵的规模):");  
	    
	        int n = Integer.valueOf(input.nextLine());  
	        //正常矩阵
	        mat1(n);
	        //s型矩阵
	        mat2(n);  
	        //回型
	        mat3(n);  
	        //z型
	        mat4(n);  
	    }  
	  
	    // 正常矩阵  
	    public static void mat1(int n) {  
	        a = new int[n][n];  
	        t = 1;  
	        for (int i = 0; i < n; i++) {  
	            for (int j = 0; j < n; j++) {  
	                a[i][j] = t++;  
	            }  
	        }  
	        System.out.println("\n\n正常矩阵");  
	        for (int i = 0; i < n; i++) {  
	            for (int j = 0; j < n; j++) {  
	                System.out.print(a[i][j] + "\t");  
	            }  
	            System.out.println();  
	        }  
	    }  
	  
	    // S形矩阵  
	    public static void mat2(int n) {  
	        a = new int[n][n];  
	        t = 1;  
	        for (int i = 0; i < n; i++) {  
	            for (int j = 0; j < n; j++) {  
	                if (i % 2 == 0) {  
	                    a[i][j] = t++;  
	                } else {  
	                    a[i][n - j - 1] = t++;  
	                }  
	  
	            }  
	        }  
	        System.out.println("\n\nS形矩阵");  
	        for (int i = 0; i < n; i++) {  
	            for (int j = 0; j < n; j++) {  
	                System.out.print(a[i][j] + "\t");  
	            }  
	            System.out.println();  
	        }  
	    }  
	  
	    // 回形矩阵  
	    public static void mat3(int n) {  
	        System.out.println("\n\n回形矩阵：");  
	        t = 1;  
	        a = new int[n][n];  
	        mat3_son(1, 0, 0, n);  
	        for (int i = 0; i < n; i++) {  
	            for (int j = 0; j < n; j++) {  
	                System.out.print(a[i][j] + "\t");  
	            }  
	            System.out.println();  
	        }  
	    }  
	  
	    public static void mat3_son(int tag, int x, int y, int num) {  
	  
	        if (t > a.length * a.length) {  
	            return;  
	        }  
	        if (tag == 1) {  
	            for (int i = y; i < y + num; i++) {  
	                a[x][i] = t++;  
	            }  
	            mat3_son(tag + 1, x + 1, y + num - 1, num - 1);  
	        } else if (tag == 2) {  
	            for (int i = x; i < x + num; i++) {  
	                a[i][y] = t++;  
	            }  
	            mat3_son(tag + 1, x + num - 1, y - 1, num);  
	        } else if (tag == 3) {  
	            for (int i = y; i > y - num; i--) {  
	                a[x][i] = t++;  
	            }  
	            mat3_son(tag + 1, x - 1, y - num + 1, num - 1);  
	        } else if (tag == 4) {  
	            for (int i = x; i > x - num; i--) {  
	                a[i][y] = t++;  
	            }  
	            mat3_son(tag - 3, x - num + 1, y + 1, num);  
	        }  
	    }  
	  
	    // Z形矩阵  
	    public static void mat4(int n) {  
	        a = new int[n][n];  
	        t = 1;  
	        int i = 0;  
	        int j = 0;  
	        a[0][0] = t++; //第一个数为1 确定
	        System.out.println(a[0][0]+"*********"); //结果是1
	        for (; t <= n * n;) {   
	        	//i最小为1 ，并且小于n      j+1小于n 
	            if (i < n && i - 1 >= 0 && j + 1 < n && a[i - 1][j + 1] == 0) {   //从 左下角延伸，不超过第一行和最后一列
	                a[i - 1][j + 1] = t++;  
	                i -= 1;  
	                j += 1;  
	              
	            } else if (i + 1 < n && j < n && j - 1 >= 0 && a[i + 1][j - 1] == 0) {   //从右上角向下延伸 不超过第一列和最后一行
	                a[i + 1][j - 1] = t++;  
	                i += 1;  
	                j -= 1;  
	            } else if (j == 0 && i + 1 < n) {    //第一列， j为0的数 也就是  1 2 6 7 
	                a[i + 1][j] = t++;  
	                i += 1;  
	            } else if (i == 0 && j + 1 < n) {    //第一行 i为0的数，也就是  1 3 4 10
	                a[i][j + 1] = t++;  
	                j += 1;   
	            } else if (i == n - 1 && j + 1 < n) {  //最后一行   7 13 14 16
	                a[i][j + 1] = t++;  
	                j += 1;  
	            } else if (j == n - 1 && i + 1 < n) {  //最后一列  10 11 15 16
	                a[i + 1][j] = t++;  
	                i += 1;  
	            }  
	  
	        }  
	        System.out.println("\n\n\nZ形矩阵：");  
	        for (i = 0; i < n; i++) {  
	            for (j = 0; j < n; j++) {  
	                System.out.print(a[i][j] + "\t");  
	            }  
	            System.out.println();  
	        }  
	    }  
	}  