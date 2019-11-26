package ru.den.source;

public class User {
    private  String UserName;
    private String UserPassword ;
    private String Email = "name@example.com";
    private boolean CorrectPassword ;
    private int linePasswordMin = 6;
    private int linePasswordMax = 10;

 public User(String name, String passwords){


     this.UserName = name;
    CorrectPassword = PasswordCorrectnessCheck(passwords);
    if (CorrectPassword ){
        this.UserPassword = passwords;
        System.out.println("Пароль принят");
        System.out.println("ользователь создан");
    } else {
        System.out.println("Вы ввели некоректный пароль");
        System.out.println("Пароль должен содержать хотябы одну цифру и специальный символ: &,$,!,@,?,#,%,{,}");
    }
}
/*
роверка пароля на соответствие определенным условиям
     если они верны то переменная CorrectPassword будет истина если нет ложь
     задача вывести пользователю  то что он ввел неправильный пароль, проверяем его и на длинну мин 6 символов максимум 10
*/
private boolean PasswordCorrectnessCheck(String userPassword){
     char[] ch = userPassword.toCharArray();

     return CharacterCheck(ch);
}

private  boolean CharacterCheck(char [] ch){
     char [] charSimvols = {'&','$','!','@', '?','#','%','{','}'};
     char [] charNums = {'0','1','2', '3','4','5','6','7', '8','9'};
     boolean a, b = false;
     a=false;
    for (char c : ch) {
        for (char charSimvol : charSimvols) {
            if (c == charSimvol) {
                b = true;
                break;
            }
        }
        for (char charNum : charNums) {
            if (c == charNum) {
                a = true;
                break;
            }
        }
    }
    return a != false & b != false & ch.length >= linePasswordMin & ch.length <= linePasswordMax;

}

}
