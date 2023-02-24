package Seminar_05;

import java.util.*;;

public class task_01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        
        while (true) {
            try {
                System.out.println("\nТелефонная книга.");
                System.out.println("Команды:\n1 - добавить контакт или обновить;\n2 - удалить контакт;\n3 - найти контакт;");
                System.out.println("4 - вывести на печать весю телефонную книгу;");
                System.out.println("5 - очистить всю книгу;\n6 - выход из программы.");
                System.out.print("Введите команду для работы с телефонной книгой: ");
                int command = input.nextInt();
                input.nextLine();
                if (command < 1 || command > 6) {
                    System.out.println("\nТакой команды нет. Попробуйте ввести заново.");
                } else if (command == 1) {
                    addContakt(phoneBook);
                } else if (command == 2) {
                    dellContakt(phoneBook);
                } else if (command == 3) {
                    findContakt(phoneBook);
                } else if (command == 4) {
                    printPhBook(phoneBook);
                } else if (command == 5) {
                    dellContaktsPhBook(phoneBook);
                } else if (command == 6) {
                    System.out.println("\nВы вышли из программы.");
                    break;
                }
            } catch (Exception ex) {
                System.out.println("Ошибка. Введена не цифровая команда. Начните заново.");
                break;
            }    
        }
    }

    private static void addContakt(HashMap<String, List<String>> phBook) {
        System.out.println("\nКоманда добавить контакт или обновить. ");
        System.out.println("  Введите фамилию (и/или) имя контакта: ");
        String name = input.nextLine();
        System.out.println("  Введите номер или номера телефонов через пробел: ");
        String numberPhone = input.nextLine();
        String[] nPh = numberPhone.split(" ");

        List<String> contactList = new ArrayList<>();
        contactList = Arrays.asList(nPh);
        if (! phBook.containsKey(name)) {
            phBook.put(name, contactList);
        } else {
            phBook.replace(name, contactList);
        }
    }

    private static void dellContakt(HashMap<String, List<String>> phBook) {
        System.out.println("\nКоманда удаления контакта. ");
        System.out.println("  Введите фамилию (и/или) имя контакта: ");
        String name = input.nextLine();

        if (phBook.containsKey(name)) {
            phBook.remove(name);
            System.out.printf("Контакт %s удалён из телефонной книги.", name);
        } else {
            System.out.printf("Контакт %s отсутствует в телефонной книге.", name);
        }
    }

    private static void findContakt (HashMap<String, List<String>> phBook) {
        System.out.println("\nКоманда поиска списка телефонов по имени.");
        System.out.println("  Введите фамилию (и/или) имя контакта: ");
        String name = input.nextLine();

        if (phBook.containsKey(name)) {
            System.out.printf("Телефоны %s: ", name);
            System.out.println(phBook.get(name).toString());
        } else {
            System.out.printf("Контакт %s отсутствует в телефонной книге.", name);
        }       
    }

    private static void printPhBook (HashMap<String, List<String>> phBook) {
        System.out.println("\nВывод всей телефонной книги: ");
        System.out.println(phBook);
    }

    private static void dellContaktsPhBook(HashMap<String, List<String>> phBook) {
        phBook.clear();
        System.out.println("\n  Удалены все контакты телефонной книги. ");
    }
}