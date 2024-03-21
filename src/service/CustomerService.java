package service;

import entities.Customer;
import entities.CustomerType;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
    public void inputCustomer(){
        ArrayList<Customer> customers = new ArrayList<>();
        System.out.println("Moi ban nhap so luong khach hang muon them moi : ");
        int numberCustomer = new Scanner(System.in).nextInt();
        for (int i = 0; i < numberCustomer; i++) {
            System.out.println("Moi ban nhap thong tin cho khach hang thu "+(i+1));
            Customer customer = new Customer();
            System.out.println("Moi ban nhap ten khah hang :");
            customer.setName(new Scanner(System.in).nextLine());
            System.out.println("Moi ban nhap dia chi :");
            customer.setAddress(new Scanner(System.in).nextLine());
            System.out.println("Moi ban nhap so dien thoai");
            customer.setTelephone(new Scanner(System.in).nextLine());
            System.out.println("Moi ban chon loai khach hang : ");
            System.out.println("1 : Khach hang ca nhan ");
            System.out.println("2 : Khach hang don vi hanh chinh ");
            System.out.println("3 : Khach hang don vi kinh doanh ");
            System.out.println("Xin moi chon ");
            int customerType = new Scanner(System.in).nextInt();
            switch (customerType){
                case 1:
                    customer.setType(CustomerType.PERSONAL);
                    break;
                case 2:
                    customer.setType(CustomerType.administrativeUnit);
                    break;
                case 3:
                    customer.setType(CustomerType.BusinessUnit);
                    break;
            }
            customers.add(customer);
        }
        System.out.println(customers);

    }
}
