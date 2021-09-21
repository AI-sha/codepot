public class UniqueEmailAddress {

    public int numUniqueEmails(String[] emails) {

        String[] emailCopy = new String[emails.length];

        for (int i = 0; i < emails.length; i++) {

            int domainStart = 0;
            for (int j = 0; j < emails[i].length(); j++) {

                if (emails[i].charAt(j) == '@') domainStart = j;
            }


            for (int j = 0; j < emails[i].length(); j++) {

                int p = 0;
                if (j < domainStart) {

                    if (emails[i].charAt(j) == '.') j++;
                    else if (emails[i].charAt(j) == '+') break;
                    else
                        emailCopy[p] = emailCopy[p] + emails[i].charAt(j);
                } else if (j > domainStart)
                    emailCopy[p] = emailCopy[p] + emails[i].charAt(j);
            }
        }


        int cnt = 0;
        for (int i = 0; i < emails.length - 1; i++) {
            for (int j = 0; j < emails.length; j++) {

                if (emailCopy[i].equals(emailCopy[j])) {
                    cnt = emailCopy.length - 1;
                }
            }

        }
        return cnt;
    }


    public static void main(String args[]) {
        UniqueEmailAddress obj = new UniqueEmailAddress();
        String[] arr = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        int k = obj.numUniqueEmails(arr);
        System.out.println(k);
    }
}