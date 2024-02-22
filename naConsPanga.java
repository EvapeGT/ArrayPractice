import java.util.Scanner;

public class naConsPanga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userChoice;
        System.out.println("Number of Students: ");
        int numOfStudent = Integer.valueOf(sc.nextLine());
        String[] StudentNumber = new String[numOfStudent];
        String[] studentName = new String[numOfStudent];
        int[] gradeOfStudent = new int[numOfStudent];
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Student Number: ");
            // Store student number as String
            StudentNumber[i] = sc.nextLine();
            System.out.println("Student Name: ");
            studentName[i] = sc.nextLine();
            System.out.println("Student Grade: ");
            gradeOfStudent[i] = Integer.valueOf(sc.nextLine());
        }
        while (true) {
            System.out.println("Sort By [S] Student Number [G] Grade [V] View [E] Exit : ");
            userChoice = sc.nextLine();
            if (userChoice.equalsIgnoreCase("S")) {
                sortStudentNumber(StudentNumber, gradeOfStudent, studentName);
            } else if (userChoice.equalsIgnoreCase("G")) {
                sortGrade(StudentNumber, gradeOfStudent, studentName);
            } else if (userChoice.equalsIgnoreCase("V")) {
                view(StudentNumber, gradeOfStudent, studentName);
            } else {
                System.out.println("Exitingg.....");
                return;
            }
        }
    }

    public static void sortStudentNumber(String arr[], int grade[], String name[]) {
        int n = arr.length;
        boolean swapped = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap StudentNumber
                    String tempNumber = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempNumber;

                    // Swap corresponding names
                    String tempName = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tempName;

                    // Swap corresponding grades
                    int tempGrade = grade[j];
                    grade[j] = grade[j + 1];
                    grade[j + 1] = tempGrade;
                }
            }
        }

        // Print the sorted arrays
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " " + name[i] + " " + grade[i]);
        }
    }

    public static void sortGrade(String arr[], int grade[], String name[]) {
        int n = grade.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (grade[i] < grade[i + 1]) {
                    // Swap StudentNumber
                    String tempNumber = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tempNumber;

                    // Swap corresponding names
                    String tempName = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = tempName;

                    // Swap corresponding grades
                    int tempGrade = grade[i];
                    grade[i] = grade[i + 1];
                    grade[i + 1] = tempGrade;

                    swapped = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " " + name[i] + " " + grade[i]);
        }
    }

    public static void view(String arr[], int grade[], String name[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " " + name[i] + " " + grade[i]);
        }
    }
}
