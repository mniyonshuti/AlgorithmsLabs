package Lab7;

import java.util.Stack;

public class ReverseWord {
    public static void main(String[] args) {
        ReverseWord reverseWord = new ReverseWord();
        System.out.println(reverseWord.reverseStrings("we test coders"));

    }
    String reverseStrings(String s){
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0; i < words.length; i++){
            stringBuilder.append(reverseWord(words[i]) + " ");
        }
        return stringBuilder.toString().trim();
    }
    String reverseWord(String s){
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> characterStack = new Stack<>();
        for(int i = 0; i < chars.length; i++){
            characterStack.push(chars[i]);
        }
        for(int i = 0; i < chars.length; i++){
            stringBuilder.append(characterStack.pop());
        }
        return stringBuilder.toString();
    }

}
