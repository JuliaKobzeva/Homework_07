public class Main {
    public static void main(String[] args) {
       //Задание 1

        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2

        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);

        //Задание 3

        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName3);

        //Задание 4
        String fullName4 = "Ivanov Ivan Ivanovich";
        int index1 = fullName4.indexOf(' ');
        int index2 = fullName4.lastIndexOf(' ');
        int index3 = fullName4.length();
        String lastName4 = fullName4.substring(0, index1);
        String firstName4 = fullName4.substring(index1, index2);
        firstName4 = firstName4.replace(" ", "");
        String middleName4 = fullName4.substring(index2, index3);
        middleName4 = middleName4.replace(" ", "");
        System.out.println("Фамилия сотрудника - " + lastName4);
        System.out.println("Имя сотрудника - " + firstName4);
        System.out.println("Отчество сотрудника - " + middleName4);

        //Задание 5
        String fullName5 = "ivanov ivan ivanovich";

        String lastName5 = fullName5.substring(0, index1);
        String firstName5 = fullName5.substring(index1, index2);
        firstName5 = firstName5.replace(" ", "");
        String middleName5 = fullName5.substring(index2, index3);
        middleName5 = middleName5.replace(" ", "");

        lastName5.substring(0,1).toUpperCase();
        firstName5.substring(0,1).toUpperCase();
        middleName5.substring(0,1).toUpperCase();

        fullName5 = lastName5 + " " + firstName5 + " " + middleName5;
        System.out.println("Верное написание Ф.И.О. сотрудника с заглавных букв - " + fullName5);

        //Задание 6

        StringBuilder number1 = new StringBuilder("135");
        StringBuilder number2 = new StringBuilder("246");
        char a = number2.charAt(0);
        char b = number2.charAt(1);
        char c = number2.charAt(2);
        number1.insert(1, a);
        number1.insert(3, b);
        number1.insert(5, c);
        System.out.println("Данные строки - " + number1);

        //Задание 7

        String Letters = "aabccddefgghiijjkk";

        char[] LE = Letters.toCharArray();
        for (int i = 0; i < Letters.length(); i++) {
            for (int j = i + 1; j < Letters.length(); j++) {
                if (LE[i] == LE[j]) {
                    System.out.print(LE[j] + " ");
                    break;
                }
            }
        }

    }
}