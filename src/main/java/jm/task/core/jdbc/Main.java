package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Один", "Первый", (byte)11);
        userService.saveUser("Два", "Второй", (byte)22);
        userService.saveUser("Три", "Третий", (byte)33);
        userService.saveUser("Четыре", "Четвертый", (byte)44);

        userService.removeUserById(1);

        for (User user : userService.getAllUsers()) {
            System.out.println(user.toString());
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }

}

