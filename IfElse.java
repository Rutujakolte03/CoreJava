class IfElse {
    public static void main(String[] args) {
        int testscore = 76;
        char grade;
        if(testscore >= 90) {
            grade = 'A';
        }
        else if (testscore >= 70) {
            grade = 'B';
        }
        else if (testscore >= 60) {
            grade = 'C';
        }
        else if (testscore >= 50) {
            grade = 'D';
        }
        else if (testscore >= 35) {
            grade = 'E';
        }
        else {
        grade = 'F';
    }
    System.out.println("Grade :" + grade);
}
}