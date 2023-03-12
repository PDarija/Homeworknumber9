package org.example;
// 1 exercise
public class Insurance {
    //    int clientAge;
    public int insurance(int clientAge) {
        int result;

        if (clientAge >= 30 & clientAge <= 65) {
            result = 100;
        } else if (18 <= clientAge & clientAge <= 29) {
            result = 120;
        } else if (66 <= clientAge & clientAge <= 79) {
            result = 130;
        } else {
            return 0;
        }
        return result;
    }
}
