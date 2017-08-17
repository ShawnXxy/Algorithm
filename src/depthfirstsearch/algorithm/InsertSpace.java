package depthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.List;

public class InsertSpace {
    
    public List<String> insert(String input) {
        List<String> result = new ArrayList<>();
        if (input == null || input.length() == 0) {
            return result;
        }
        StringBuilder newString = new StringBuilder();
        char[] arrayInput = input.toCharArray();
        helper(arrayInput, result, newString, 0);
        return result;
    }
    private void helper(char[] arrayInput, List<String> result, StringBuilder newString, int index) {
        if (index == arrayInput.length- 1) {
            newString.append(arrayInput[index]);
            result.add(newString.toString());
            newString.deleteCharAt(newString.length() - 1);
            return;
        }
        newString.append(arrayInput[index]);
        // if insert space after current element
        helper(arrayInput, result, newString.append(" "), index + 1);
        newString.deleteCharAt(newString.length() - 1);
        // if not insert space
        helper(arrayInput, result, newString, index + 1);
        newString.deleteCharAt(newString.length() - 1);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InsertSpace solution = new InsertSpace();
        // Test case 1:
        String input = "";
        List<String> result = solution.insert(input);
        System.out.println(result);
        // Test case 2:
        input = "ABC";
        result = solution.insert(input);
        System.out.println(result);
    }

}
