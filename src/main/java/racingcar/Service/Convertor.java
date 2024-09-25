package racingcar.Service;

public class Convertor {
    public static int string_to_int_COUNT(String string_count){
        is_count_positiveInteger(string_count);
        int count=Integer.parseInt(string_count);
        return count;
    }

    public static boolean is_count_positiveInteger(String count){
        if(Integer.parseInt(count)<=0) throw new IllegalArgumentException();
        return true;
    }

}
