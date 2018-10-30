import java.util.Scanner;

public class Main {
    public static void getFullInfo(Appliances[] appliances){
        for (int i = 0; i < appliances.length; i++){
            System.out.printf("%30s\t%30s\t%30s\t%30s\t%30s\t%30s\t%30s\t%30s\n", "Номер", "Тип", "Модель", "Название", "Фирма", "Количество",
                    "Цена", "Дата изготовления");
            System.out.printf("%30d\t%30s\t%30s\t%30s\t%30s\t%30d\t%30d\t%30s", appliances[i].getNumber(), appliances[i].getType(),
                    appliances[i].getModel(), appliances[i].getName(), appliances[i].getFirm(), appliances[i].getCount(),
                    appliances[i].getPrice(), appliances[i].getDate());
            System.out.println();
        }
    }

    public static void addNewApplience(Appliances[] appliances, int index){
        Scanner sc = new Scanner(System.in);
        appliances[index] = new Appliances();
        System.out.println("Введите информацию о бытовой технике.");
        System.out.println("Номер: ");
        appliances[index].setNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("Тип: ");
        appliances[index].setType(sc.nextLine());
        System.out.println("Модель: ");
        appliances[index].setModel(sc.nextLine());
        System.out.println("Название: ");
        appliances[index].setName(sc.nextLine());
        System.out.println("Фирма: ");
        appliances[index].setFirm(sc.nextLine());
        System.out.println("Количество: ");
        appliances[index].setCount(sc.nextInt());
        System.out.println("Цена: ");
        appliances[index].setPrice(sc.nextInt());
        sc.nextLine();
        System.out.println("Дата изготовления: ");
        appliances[index].setDate(sc.nextLine());
    }

    public static Appliances[] createAppliances(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество бытовой техники: ");
        int count = scan.nextInt();
        Appliances[] appliances = new Appliances[count];
        for (int i = 0; i < count; i++){
            addNewApplience(appliances, i);
        }
        return appliances;
    }

    public static void chosenType(Appliances[] appliances){
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой тип хотите найти?");
        String type = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < appliances.length; i++){
            if (type.equals(appliances[i].getType())){
                System.out.printf("%30s\t%30s\t%30s\t%30s\t%30s\t%30s\t%30s\t%30s\n", "Номер", "Тип", "Модель", "Название", "Фирма", "Количество",
                        "Цена", "Дата изготовления");
                System.out.printf("%30d\t%30s\t%30s\t%30s\t%30s\t%30d\t%30d\t%30s", appliances[i].getNumber(), appliances[i].getType(),
                        appliances[i].getModel(), appliances[i].getName(), appliances[i].getFirm(), appliances[i].getCount(),
                        appliances[i].getPrice(), appliances[i].getDate());
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("Бытовой техники такого типа нет в списке");
        }
    }

    public static void lessCost(Appliances[] appliances){
        boolean flag = false;
        for (int i = 0; i < appliances.length; i++){
            if (appliances[i].getPrice() < 500){
                System.out.printf("%30s\t%30s\t%30s\t%30s\t%30s\t%30s\t%30s\t%30s\n", "Номер", "Тип", "Модель", "Название", "Фирма", "Количество",
                        "Цена", "Дата изготовления");
                System.out.printf("%30d\t%30s\t%30s\t%30s\t%30s\t%30d\t%30d\t%30s", appliances[i].getNumber(), appliances[i].getType(),
                        appliances[i].getModel(), appliances[i].getName(), appliances[i].getFirm(), appliances[i].getCount(),
                        appliances[i].getPrice(), appliances[i].getDate());
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("Техники со стоимостью меньше 500 нет.");
        }
    }

    public static void chosenFirm(Appliances[] appliances){
        Scanner sc = new Scanner(System.in);
        System.out.println("Какую фирму хотите найти?");
        String firm = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < appliances.length; i++){
            if (firm.equals(appliances[i].getFirm())){
                System.out.printf("%30s\t%30s\t%30s\t%30s\t%30s\t%30s\t%30s\t%30s\n", "Номер", "Тип", "Модель", "Название", "Фирма", "Количество",
                        "Цена", "Дата изготовления");
                System.out.printf("%30d\t%30s\t%30s\t%30s\t%30s\t%30d\t%30d\t%30s", appliances[i].getNumber(), appliances[i].getType(),
                        appliances[i].getModel(), appliances[i].getName(), appliances[i].getFirm(), appliances[i].getCount(),
                        appliances[i].getPrice(), appliances[i].getDate());
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("Такой фирмы нет.");
        }
    }

    public static void chooseList(Appliances[] appliances){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Выберите список, который хотите получить: \n 1 - Список бытовой техники по заданному типу." +
                    "\n 2 - Список бытовой техники, стоимость которой меньше 500грн." +
                    "\n 3 - Список бытовой техники по заданной фирме\n" +
                    "Чтобы выйти нажмите 4\n");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    chosenType(appliances);
                    break;
                case 2:
                    lessCost(appliances);
                    break;
                case 3:
                    chosenFirm(appliances);
                    break;
                case 4:
                    System.exit(0);
                    default:
                        System.out.println("Выбран неверный вариант, попробуйте еще раз!");
            }
        }

    }

    public static void main(String[] args) {
        Appliances[] appliances = createAppliances();
        getFullInfo(appliances);
        chooseList(appliances);
    }
}
