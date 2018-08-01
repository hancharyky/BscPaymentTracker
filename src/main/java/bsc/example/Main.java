package bsc.example;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Yahor
 */
public class Main {

    /**
     * Creates resources needed for application run and prints welcome note
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        InputProcessor inputProcessor = new InputProcessor(new BankAccount());

        String fileName = "balance.txt";
        BufferedReader bufferedFileReader = new BufferedReader(new FileReader(fileName));
        BufferedReader bufferedConsoleReader = new BufferedReader(new InputStreamReader(System.in));


        /*ExecutorService myExecutor = Executors.newCachedThreadPool();

        myExecutor.execute(new Runnable() {
            public void run() {
                try {

                    while (true){
                        Thread.sleep(60*1000);
                        System.out.println(inputProcessor.getBankAccount().toString());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });*/


        inputProcessor.processInput(bufferedFileReader,"FILE");

        System.out.println("Welcome to you payment tracker program! To exit, enter \"quit\"\n" +
                "If you want to proceed, please, enter payment currency code and amount:");

        inputProcessor.processInput(bufferedConsoleReader,"CONSOLE");


    }


}
