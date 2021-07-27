public class VerifyingAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {

        int orderArr[] = new int[26];  // to store order number of alphabets in the alien format

        for(int i = 0; i < order.length(); i++) {
            orderArr[order.charAt(i) - 'a'] = i;   // eg. if charAt(i) = b then : b-a = 66-65 = 1; so order[1] will be 0.
        }

        for(int i = 0; i < words.length - 1; i++) {
            for(int j = 0; j < words[i].length(); j++){

                if(j>=words[i+1].length())  // this is checking if word order is apple, app. then : apple(first word length) > app(second word length) so false
                    return false;

                if(words[i].charAt(j) != words[i+1].charAt(j)){      // if any letter is mismatching between adjacent words
                    int currWordChar = words[i].charAt(j) - 'a';
                    int nextWordChar = words[i+1].charAt(j) - 'a';

                    if(orderArr[currWordChar] > orderArr[nextWordChar])
                        return false;   // i.e. order of the letter in first word is greater than the letter in the second word
                    else break;   // if the first mismatched letter is sorted, we break and need not check as it is sorted lexico..


                }
            }
        }
        return true;
    }

}

/*
In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.

Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 */