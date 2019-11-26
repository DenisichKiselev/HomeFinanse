package ru.den.source;

public class User {
    String UserName="";
    String UserPassword = "";
    String Email = "name@example.com";
    boolean CorrectPassword = false;
    int linePasswordMin = 6;
    int linePasswordMax = 10;

 User(String name, String passwords){
    this.UserName = name;
    this.UserPassword = passwords;
}
//роверка пароля на соответствие определенным условиям
    // если они верны то переменная CorrectPassword будет истина если нет ложь
    // задача вывести пользователю  то что он ввел неправильный пароль, проверяем его и на длинну мин 6 символов максимум 10
private boolean PasswordCorrectnessCheck(String userPassword){
     char[] ch = userPassword.toCharArray();
     return true;
}

private  boolean CharacterCheck(char [] ch){
     Character[] charSimvols = new Character[] {'&','!','@', '?','#','%','{','}'};
     return true;
}

}
