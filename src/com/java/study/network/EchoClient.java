package com.java.study.network;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Crete by Marlon
 * Create Date: 2018/3/7
 * Class Describe
 **/

public class EchoClient {

    public static void main(String[] args) throws IOException {

        Socket client = new Socket("localhost", 8888);
        Scanner keyScan = new Scanner(System.in);
        keyScan.useDelimiter("\n");
        Scanner netScan = new Scanner(client.getInputStream());
        netScan.useDelimiter("\n");
        PrintStream netOut = new PrintStream(client.getOutputStream());
        boolean flag = true;
        while (flag) {
            System.out.println("������Ҫ���͵���Ϣ");
            if (keyScan.hasNext()) {
                String str = keyScan.next();
                //���͸���������
                netOut.println(str);
                //���������л�Ӧ
                if (netScan.hasNext()) {
                    System.out.println(netScan.next());
                }
                if ("byebye".equalsIgnoreCase(str)) {
                    flag = false;
                    break;
                }

            }
        }
        keyScan.close();
        netScan.close();
        client.close();

    }


}
