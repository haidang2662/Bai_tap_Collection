package view;

import entities.Customer;
import service.CustomerService;
import service.ServiceEntityService;

import java.util.Scanner;

public class Menu {
    public void display(){
        System.out.println("========= Chao mung ban den voi phan mem nhap hoa don ============");
        System.out.println("Moi ban chon chuc nang : ");
        System.out.println(" 1 : Nhập danh sách khách hàng. In ra danh sách khách hàng đã có ");
        System.out.println(" 2 : Nhập danh sách dịch vụ. In ra danh sách dịch vụ đã có");
        System.out.println(" 3 : Nhập hóa đơn cho mỗi khách hàng đã có ");
        System.out.println(" 4 : Sắp xếp danh sách hóa đơn theo họ tên khách hàng ");
        System.out.println(" 5 : Sắp xếp danh sách hóa đơn theo số lượng sử dụng ");
        System.out.println(" 6 : Lập bảng thống kê số tiền phải trả cho mỗi khách hàng ");
        int choice = new Scanner(System.in).nextInt();
        CustomerService customerService = new CustomerService();
        ServiceEntityService serviceEntityService = new ServiceEntityService();
        switch (choice){
            case 1:
                customerService.inputCustomer();
                break;
            case 2:
                serviceEntityService.inputServiceEntity();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;

        }
    }
}
