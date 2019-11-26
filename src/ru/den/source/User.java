package ru.den.source;

public class User {
    String UserName="";
    String UserPassword = "";
    String Email = "name@example.com";
    boolean CorrectPassword = false;
    int linePasswordMin = 6;
    int linePasswordMax = 10;

 public User(String name, String passwords){
    this.UserName = name;
    CorrectPassword = PasswordCorrectnessCheck(passwords);
    if (CorrectPassword){
        this.UserPassword = passwords;
        System.out.println("Пароль принят");
        System.out.println("ользователь создан");
    } else System.out.println("Вы ввели некоректный пароль");
}
//роверка пароля на соответствие определенным условиям
    // если они верны то переменная CorrectPassword будет истина если нет ложь
    // задача вывести пользователю  то что он ввел неправильный пароль, проверяем его и на длинну мин 6 символов максимум 10
private boolean PasswordCorrectnessCheck(String userPassword){
     char[] ch = userPassword.toCharArray();

     return true;
}

private  boolean CharacterCheck(char [] ch){
     char [] charSimvols = {'&','!','@', '?','#','%','{','}'};
     char [] charNums = {'0','1','2', '3','4','5','6','7', '8','9'};
     boolean a, b = false;
     a=false;
    for (int i = 0; i < ch.length; i++) {
        for (int j = 0; j <charSimvols.length ; j++) {
            if(ch[i]==charSimvols[j]){
                b = true;
                break;
            }
        }
        for (int j = 0; j <charNums.length ; j++) {
            if (ch[i]==charNums[j]){
                a = true;
                break;
            }
        }
    }
    if (a!=false & b!=false){
        return true;
    } else return false;

}

}
