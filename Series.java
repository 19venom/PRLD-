import java.util.ArrayList;
import java.util.Scanner;

public class Series {

    private ArrayList<SeriesModel> seriesList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 1.2 Capture a new series
    public void CaptureSeries() {

        System.out.println("\n===== CAPTURE A NEW TV SERIES =====");

        System.out.print("Enter the series ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter the series name: ");
        String name = scanner.nextLine();

        String age;

        // Keep asking until a valid age is entered
        while (true) {
            System.out.print("Enter the age restriction (2 - 18): ");
            age = scanner.nextLine();

            try {
                int ageNumber = Integer.parseInt(age);

                if (ageNumber >= 2 && ageNumber <= 18) {
                    break;
                } else {
                    System.out.println(
                        "You have entered an incorrect age restriction!"
                    );
                }

            } catch (NumberFormatException e) {
                System.out.println(
                    "You have entered an incorrect age restriction!"
                );
                System.out.println("Only numbers between 2 and 18 are allowed.");
            }
        }

        System.out.print("Enter the number of episodes: ");
        String episodes = scanner.nextLine();

        SeriesModel newSeries =
                new SeriesModel(id, name, age, episodes);

        seriesList.add(newSeries);

        System.out.println("\nSeries processed successfully!");
    }


    // 1.5 Search for a series
    public void SearchSeries() {

        System.out.println("\n===== SEARCH FOR A TV SERIES =====");

        System.out.print("Enter the series ID to search: ");
        String id = scanner.nextLine();

        SeriesModel foundSeries = findSeries(id);

        if (foundSeries != null) {

            System.out.println("\nSeries found!");
            System.out.println("-----------------------------");
            System.out.println("Series ID: " + foundSeries.SeriesId);
            System.out.println("Series Name: " + foundSeries.SeriesName);
            System.out.println("Age Restriction: " + foundSeries.SeriesAge);
            System.out.println("Number of Episodes: "
                    + foundSeries.SeriesNumberOfEpisodes);

        } else {

            System.out.println("\nSeries with Series ID "
                    + id + " was not found!");
        }
    }


    // 1.6 Update a series
    public void UpdateSeries() {

        System.out.println("\n===== UPDATE A TV SERIES =====");

        System.out.print("Enter the series ID to update: ");
        String id = scanner.nextLine();

        SeriesModel series = findSeries(id);

        if (series != null) {

            System.out.print("Enter the new series name: ");
            series.SeriesName = scanner.nextLine();

            // Validate new age restriction
            while (true) {

                System.out.print("Enter the new age restriction (2 - 18): ");
                String newAge = scanner.nextLine();

                try {

                    int ageNumber = Integer.parseInt(newAge);

                    if (ageNumber >= 2 && ageNumber <= 18) {
                        series.SeriesAge = newAge;
                        break;
                    } else {
                        System.out.println(
                            "Invalid age restriction!"
                        );
                    }

                } catch (NumberFormatException e) {

                    System.out.println(
                        "Invalid age restriction! Numbers only."
                    );
                }
            }

            System.out.print("Enter the new number of episodes: ");
            series.SeriesNumberOfEpisodes = scanner.nextLine();

            System.out.println("\nSeries updated successfully!");

        } else {

            System.out.println("\nSeries with Series ID "
                    + id + " was not found!");
        }
    }


    // 1.7 Delete a series
    public void DeleteSeries() {

        System.out.println("\n===== DELETE A TV SERIES =====");

        System.out.print("Enter the series ID to delete: ");
        String id = scanner.nextLine();

        SeriesModel series = findSeries(id);

        if (series != null) {

            System.out.print(
                "Are you sure you want to delete series "
                + id + "? (Y/N): "
            );

            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("Y")) {

                seriesList.remove(series);

                System.out.println(
                    "\nSeries deleted successfully!"
                );

            } else {

                System.out.println(
                    "\nSeries was not deleted."
                );
            }

        } else {

            System.out.println(
                "\nSeries with Series ID "
                + id + " was not found!"
            );
        }
    }


    // 1.8 Display series report
    public void SeriesReport() {

        System.out.println("\n==============================");
        System.out.println("        SERIES REPORT");
        System.out.println("==============================");

        if (seriesList.isEmpty()) {

            System.out.println("No series data available.");

        } else {

            for (SeriesModel series : seriesList) {

                System.out.println("\nSeries ID: "
                        + series.SeriesId);

                System.out.println("Series Name: "
                        + series.SeriesName);

                System.out.println("Age Restriction: "
                        + series.SeriesAge);

                System.out.println("Number of Episodes: "
                        + series.SeriesNumberOfEpisodes);

                System.out.println("------------------------------");
            }
        }
    }


    // Find a series by ID
    private SeriesModel findSeries(String id) {

        for (SeriesModel series : seriesList) {

            if (series.SeriesId.equalsIgnoreCase(id)) {
                return series;
            }
        }

        return null;
    }


    // 1.10 Exit application
    public void ExitSeriesApplication() {

        System.out.println("\nThank you for using the TV Series Management Application.");
        System.out.println("Goodbye!");
    }
}