import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Series series = new Series();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println(" TV SERIES MANAGEMENT SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Capture a new TV series");
            System.out.println("2. Search for a TV series");
            System.out.println("3. Update a TV series");
            System.out.println("4. Delete a TV series");
            System.out.println("5. View series report");
            System.out.println("6. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");

            try {

                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        series.CaptureSeries();
                        break;

                    case 2:
                        series.SearchSeries();
                        break;

                    case 3:
                        series.UpdateSeries();
                        break;

                    case 4:
                        series.DeleteSeries();
                        break;

                    case 5:
                        series.SeriesReport();
                        break;

                    case 6:
                        series.ExitSeriesApplication();
                        break;

                    default:
                        System.out.println(
                            "Invalid option. Please choose 1 - 6."
                        );
                }

            } catch (NumberFormatException e) {

                choice = 0;

                System.out.println(
                    "Invalid input. Please enter a number."
                );
            }

        } while (choice != 6);

        scanner.close();
    }
}