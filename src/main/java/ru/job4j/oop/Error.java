package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error firstError = new Error();
        firstError.printInfo();
        Error secondError = new Error(true, 400, "Hello");
        secondError.printInfo();
        Error thirdError = new Error(false, 200, "Bye");
        thirdError.printInfo();
    }

    public void printInfo() {
        System.out.println("Активна: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }
}
