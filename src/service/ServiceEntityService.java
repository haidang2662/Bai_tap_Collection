package service;

import entities.ServiceEntity;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceEntityService {
    public void inputServiceEntity(){
        ServiceEntity serviceEntity = new ServiceEntity();
        ArrayList<ServiceEntity> serviceEntities = new ArrayList<>();
        System.out.println("Moi ban nhap so luong hoa don muon nhap : ");
        int numberService = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberService; i++) {
            System.out.println("Moi ban nhap ten dich vu : ");
            serviceEntity.setName(new Scanner(System.in).nextLine());
            System.out.println("Moi ban nhap gia dich vu : ");
            serviceEntity.setPrice(new Scanner(System.in).nextDouble());
            System.out.println("Moi ban nhap don vi : ");
            serviceEntity.setUnit(new Scanner(System.in).nextLine());

        }
        serviceEntities.add(serviceEntity);
        System.out.println(serviceEntities);
    }
}
