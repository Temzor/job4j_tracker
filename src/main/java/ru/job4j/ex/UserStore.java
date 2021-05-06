package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (int index = 0; index < users.length; index++) {
            if (login.equals(users[index].getUsername())) {
                result = users[index];
                break;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("Пользователь не прошел валидацию");
        } else if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Имя пользователя меньше 3-х символов");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Dmitrii Kapustin", true),
                new User("Io", true),
                new User("George Nicolson", false)
        };
        try {
            User user = findUser(users, "George Nicolson");
            if (validate(user)) {
                System.out.println("This user has an access");
            }

        } catch (UserInvalidException ie) {
            ie.printStackTrace();
        } catch (UserNotFoundException nf) {
            nf.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}