public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder(); //Mutable
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            name.append(ch);
        }
        System.out.println(name);
        name.deleteCharAt(0);
        System.out.println(name);

    }
}
