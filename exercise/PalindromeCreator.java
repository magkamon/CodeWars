class PalindromeCreator {

    public static void main(String[] args) {
        System.out.println(StringChallenge("mmop"));
        System.out.println(StringChallenge("abjchba"));
        System.out.println(StringChallenge("abhiba"));
        System.out.println(StringChallenge("abccba"));
    }

    public static String StringChallenge(String str) {
        String output;
        if (isPalindrome(str)) {
            output = "polindrome";
        } else if (!oneCharacterRemoval(str).equals("not possible")) {
            output = oneCharacterRemoval(str);
        } else {
            output = twoCharactersRemoval(str);
        }
        return output;
    }

    private static boolean isPalindrome(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return str.equals(stringBuilder.reverse().toString());
    }

    private static String oneCharacterRemoval(String str) {
        for (int i = 0; i < str.length(); i++) {
            StringBuilder wordToCheck = new StringBuilder(str);
            char characterToCheck = wordToCheck.charAt(i);
            StringBuilder wordWithRemovedOneCharacter = wordToCheck.deleteCharAt(i);
            if (wordWithRemovedOneCharacter.length() > 3) {
                if (isPalindrome(wordWithRemovedOneCharacter.toString())) {
                    return String.valueOf(characterToCheck);
                }
            } else {
                break;
            }
        }
        return "not possible";
    }

    private static String twoCharactersRemoval(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                StringBuilder wordToCheck = new StringBuilder(str);
                StringBuilder removedLetters = new StringBuilder();
                char characterToCheck = wordToCheck.charAt(i);
                char secondCharacterToCheck = wordToCheck.charAt(j);
                wordToCheck.deleteCharAt(j);
                StringBuilder wordWithRemovedTwoCharacters = wordToCheck.deleteCharAt(i);
                if (wordWithRemovedTwoCharacters.length() > 3) {
                    if (isPalindrome(wordWithRemovedTwoCharacters.toString())) {
                        return String.valueOf(removedLetters.append(characterToCheck).append(secondCharacterToCheck));
                    }
                } else {
                    break;
                }
            }
        }
        return "not possible";
    }
}