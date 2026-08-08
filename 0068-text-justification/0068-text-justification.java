class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i;
            int lineLength = 0;
            while (j < words.length) {
                if (lineLength + words[j].length() + (j - i) > maxWidth) {
                    break;
                }
                lineLength += words[j].length();
                j++;
            }
            int wordCount = j - i;
            StringBuilder line = new StringBuilder();
            if (j == words.length || wordCount == 1) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        line.append(" ");
                    }
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int totalSpaces = maxWidth - lineLength;
                int gaps = wordCount - 1;
                int spacesEach = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        int spaces = spacesEach;
                        if (extraSpaces > 0) {
                            spaces++;
                            extraSpaces--;
                        }
                        for (int x = 0; x < spaces; x++) {
                            line.append(" ");
                        }
                    }
                }
            }
            result.add(line.toString());
            i = j;
        }
        return result;
    }
}