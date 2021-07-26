public class ShortestWordDistance {

        public int shortestDistanceBrute(String[] wordsDict, String word1, String word2) {

            // Brute Force

            int len = wordsDict.length;
            for(int i = 0; i < wordsDict.length; i++)
            {
                if(wordsDict[i].equals(word1))  // do not use == for comparison, as it is giving incorrect result
                {
                    for(int j = 0; j < wordsDict.length; j++)
                    {
                        if(wordsDict[j].equals(word2))
                            len = Math.min(len,Math.abs(i-j));  // selecting the shortest distance between the two indices
                    }
                }
            }
            return len;
        }

    public int shortestDistanceOnePass(String[] wordsDict, String word1, String word2) {

        // One pass method

        int len = wordsDict.length;
        int i1 = -1, i2 = -1;  // indices to store locations of the two words
        for(int i = 0; i < wordsDict.length; i++)
        {
            if(wordsDict[i].equals(word1))  // do not use == for comparison, as it is giving incorrect result
                i1 = i;
            else if(wordsDict[i].equals(word2))
                i2 = i;

            if(i1 != -1 && i2 != -1)
                len = Math.min(len,Math.abs(i1 - i2));
        }
        return len;
    }

}


/*
Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2, return the shortest distance between these two words in the list.
* */