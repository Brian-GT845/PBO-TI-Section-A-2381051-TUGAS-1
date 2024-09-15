package soal;

public class Soal3 {
    public static void main(String[] args) {
        System.out.println(countCamelCaseWords("satuDuaTiga"));
        System.out.println(countCamelCaseWords("saveChangesInTheEditor"));
    }
    public static int countCamelCaseWords(String camelCaseString){
        if (camelCaseString == null || camelCaseString.isEmpty()){
            return 0;
        }
        int count = 1;
        for (char c : camelCaseString.toCharArray()){
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        return count;
    }
}
