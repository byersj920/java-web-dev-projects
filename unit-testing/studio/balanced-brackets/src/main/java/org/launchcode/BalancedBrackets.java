package org.launchcode;

import java.util.ArrayList;

public class BalancedBrackets {
    /*
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static <Arraylist> boolean hasBalancedBrackets(String str) {
        ArrayList<Character> bracketChecker = new ArrayList<>();

        for (char ch: str.toCharArray()){
            if (ch == '[' || ch == '{' || ch == '('){
                bracketChecker.add(ch);
            } else if(ch == ']'){
                if(bracketChecker.isEmpty()){
                    return false;
                }else if(bracketChecker.get(bracketChecker.size()-1) == '['){
                    bracketChecker.remove(bracketChecker.size()-1);
                }else{
                    return false;
                }
            } else if(ch == '}'){
                if(bracketChecker.isEmpty()){
                    return false;
                }else if(bracketChecker.get(bracketChecker.size()-1) == '{'){
                    bracketChecker.remove(bracketChecker.size()-1);
                }else{
                    return false;
                }
            } else if(ch == ')'){
                if(bracketChecker.isEmpty()){
                    return false;
                }else if(bracketChecker.get(bracketChecker.size()-1) == '('){
                    bracketChecker.remove(bracketChecker.size()-1);
                }else{
                    return false;
                }
            }
        }

        return bracketChecker.isEmpty();
    }
}