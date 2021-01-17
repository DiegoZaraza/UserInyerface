package org.userinyerface.utilities;

import java.util.Random;

public class StringUtils {

    public static String textGeneration(int textLength) {
        String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChars = "abcdefghijklmnopqrstuvwxyz";
        String cyrillicChars = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String numbers = "0123456789";
        String specialSymb = "!@#$%^&*()";
        Random rnd = new Random();
        int randomCapitalChars = (int) (Math.random() * capitalChars.length());
        int randomNumber = (int) (Math.random() * numbers.length());
        int randomCyrillicChar = (int) (Math.random() * cyrillicChars.length());
        int randomSpecialSymb = (int) (Math.random() * specialSymb.length());
        String generatedCapitalChar = capitalChars.substring(randomCapitalChars, randomCapitalChars + 1);
        String generatedCyrillicChar = cyrillicChars.substring(randomCyrillicChar, randomCyrillicChar + 1);
        String generatedSpecialSymb = specialSymb.substring(randomSpecialSymb, randomSpecialSymb + 1);
        StringBuilder generatedSmallChars = new StringBuilder(textLength);
        for (int i = 0; i < textLength; i++) {
            generatedSmallChars.append(smallChars.charAt(rnd.nextInt(smallChars.length())));
        }
        return String.format("%s%s%s%s%d", generatedCapitalChar, generatedCyrillicChar, generatedSpecialSymb, generatedSmallChars, randomNumber);
    }
}