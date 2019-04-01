package model;

public class Patterns {
    private final char ASTERIX = '*';

    public void patternB() {
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ASTERIX);
            }
            System.out.println("");
        }
    }

    public void patternC() {
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j ++) {
                System.out.print(ASTERIX);
            }
            System.out.println("");
        }
    }

    public void patternD() {
        int space = 4;
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int k = space - 1; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i*2 - 1; l++) {
                System.out.print(ASTERIX);
            }
            for (int k = space - 1; k >= 0; k--) {
                System.out.print(" ");
            }
            space--;
            System.out.println("");
        }
    }

    public void patternE() {
        int space = 5;
        System.out.println("");
        for (int i = 1; i <= 12; i++) {
            if (i <= 6) {
                for (int k = space - 1; k >= 0; k--) {
                    System.out.print(" ");
                }
                for (int l = 1; l <= i*2 - 1; l++) {
                    System.out.print(ASTERIX);
                }
                for (int k = space - 1; k >= 0; k--) {
                    System.out.print(" ");
                }
                space--;
                System.out.println("");
            } else if (i > 6 && i <= 9) {
                for (int n = 0; n < 4; n++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 3; j++) {
                    System.out.print(ASTERIX);
                }
                for (int p = 0; p < 4; p++) {
                    System.out.print(" ");
                }
                System.out.println("");
            } else {
                for (int q = 0; q < 2; q++) {
                    System.out.print(" ");
                }
                for (int m = 0; m < 7; m++) {
                    System.out.print(ASTERIX);
                }
                for (int r = 0; r < 2; r++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
