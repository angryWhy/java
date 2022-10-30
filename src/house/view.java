package house;

import java.util.Scanner;

public class view {
    private boolean loop = true;
    private String key ;
    private Scanner sc;
    private service houseService = new service(10);
    public void mainMenu(){
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("========房屋出租系统========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 信 息");
            System.out.println("\t\t\t5 显 示 列 表");
            System.out.println("\t\t\t6 退      出");
            key = in.next();
            switch (key){
                case "1":
                    addHouse();
                    break;
                case "2":
                    System.out.println("查找");
                    break;
                case "3":
                    delHouse();
                    break;
                case "4":
                    System.out.println("修改");
                    break;
                case "5":
                    listHouses();
                    break;
                case "6":
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        }while(loop);
    }
    public void listHouses(){
        System.out.println("=========房屋列表========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        domain[] houses = houseService.list();
        for(int i = 0;i<houses.length;i++){
            System.out.println(houses[i]);
        }
        System.out.println("=========房屋展示完毕========");
    }
    public void addHouse(){
        Scanner in = new Scanner(System.in);
        System.out.println("=========添加房屋========");
        System.out.println("姓名：");
        String name = in.next();
        System.out.println("电话：");
        String phone = in.next();
        System.out.println("地址：");
        String address = in.next();
        System.out.println("月租：");
        int rent = in.nextInt();
        System.out.println("状态：");
        String state = in.next();
        domain house = new domain(0,name,phone,address,rent,state);
        if(houseService.addHouse(house)){
            System.out.println("=========添加成功========");
        }else {
            System.out.println("=========添加失败========");
        }
    }
    public void delHouse(){
        Scanner in = new Scanner(System.in);
        System.out.println("=========删除房屋========");
        System.out.println("请输入房屋编号：");
        int id = in.nextInt();
        if(id == -1){
            return;
        }else {
            houseService.delHouse(id);
            System.out.println("删除房屋信息成功！");
        }

    }
}
