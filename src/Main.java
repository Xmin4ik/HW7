public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача №1");
String firstName = "Ivan";
String middleName = "Ivanov";
String lastName = "Ivanovich";
String fullName = middleName+" "+firstName+" "+lastName;
        System.out.println("ФИО сотрудника — "+fullName);

        System.out.println("Задача №2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName);

        System.out.println("Задача №3");
        String fullNameCase = "Иванов Семён СемЁнович";
        for (int i=0;i<fullNameCase.length();i++){
       if (fullNameCase.charAt(i)=='ё'){
            fullNameCase=fullNameCase.replace("ё", "е");}
          else if (fullNameCase.charAt(i)=='Ё'){
               fullNameCase=fullNameCase.replace("Ё", "е");
        }}
        System.out.println("ФИО сотрудника — "+fullNameCase);
        // По другому
        String fullNameCase1 = "Иванов Семён СемЁнович";
      boolean nameWrong =  fullNameCase1.contains("ё") || fullNameCase1.contains("Ё");
if (nameWrong==true){
    fullNameCase1=fullNameCase1.replace("ё", "е");
    fullNameCase1=fullNameCase1.replace("Ё", "е");
    System.out.println("ФИО сотрудника  — "+fullNameCase1);
}else System.out.println("ФИО сотрудника — "+fullNameCase1);

   /*     System.out.println("Задача №5");// не смог

String fullNameOther = "Ivanov Ivan Ivanovich";
char[] nameMass =fullNameOther.toCharArray();
for (c=0;c<nameMass.length;c++){
   if (nameMass[c]==' '&& a!=b){
       int a = c;
       int b = c;
          }


        String   firstNameOther=firstNameOther.substring(a,b);
        String   middleNameOther=firstNameOther.substring(0,a);
        String   lastNameOther=firstNameOther.substring(b,nameMass.length);


            fullNameOther.*/
        }


    }