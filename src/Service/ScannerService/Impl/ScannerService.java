package Service.ScannerService.Impl;

import Service.ScannerService.ScannerInterface;

import java.util.Scanner;

public class ScannerService implements ScannerInterface {

    Scanner sc = new Scanner(System.in);

    @Override
    public int leerSiguiente() {
        int x = sc.nextInt();
        return x;
    }

}
