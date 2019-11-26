import ru.den.source.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static  List<User> arrayUser = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        System.out.println("Введите Имя пользователя и пароль, каждый ввод сопровождается нажатием клавиши Enter");
        System.out.println("Пароль должен содержать хотябы одну цифру и специальный символ: &,$,!,@,?,#,%,{,}");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        User newUser1  = new User(reader.readLine(),reader.readLine());
        addUserArray(newUser1);
        System.out.println(arrayUser.get(0));

    }
    public static void addUserArray(User us){
        arrayUser.add(us);
            }
}
