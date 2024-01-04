import java.util.ArrayList;
import java.util.List;

public class ReturnInt {
    //Задание 3
    public void divisibleThree(String numbers){

        String[] mas = numbers.split(" ");
        List<Integer> list = new ArrayList<>();

       try{ for(int i = 0; i < mas.length; i++){
            if(Integer.parseInt(mas[i])%3==0){
                list.add(Integer.parseInt(mas[i]));
            }
        }
       }catch (Exception e){
           System.out.println("Введены не числа");
       }

        for(Object li : list.toArray()){
            System.out.print(li+" ");
        }
    }
}
