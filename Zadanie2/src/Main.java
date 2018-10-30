public class Main {

    public static void findMinSub(String[] sub){
//        for (int i = 0; i < sub.length; i++){
//            System.out.println(sub[i]);
//        }
        int min = sub[0].length();
        int minIndex = 0;
        for (int i = 1; i < sub.length; i++){
            if (sub[i] != null && sub[i].length() < min){
                min = sub[i].length();
                minIndex = i;
            }
        }
        System.out.println("Подстрока минимальной длинный без букв: " + sub[minIndex]);
    }

    public static void find(String source){
        int start = 0;
        int end = 0;
        String[] temp = new String[100];
        int index = 0;
        for (int i = 0; i < source.length(); i++){
            if (Character.isLetter(source.charAt(i)) == true){
                continue;
            }
            start = i;
            for (int j = i; j < source.length() && Character.isLetter(source.charAt(j)) == false; j++){
                end = j;
            }
            temp[index] = source.substring(start, end + 1);
            i = end;
            index++;
        }
        if (temp[0] != null){
            findMinSub(temp);
        }
        else{
            System.out.println("Строка состоит только из букв");
        }
    }

    public static void main(String[] args) {
        String source = "hello 12hello123";
        find(source);

    }
}
