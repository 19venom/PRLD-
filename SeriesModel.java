public class SeriesModel {

    public String SeriesId;
    public String SeriesName;
    public String SeriesAge;
    public String SeriesNumberOfEpisodes;

    // Constructor
    public SeriesModel(String SeriesId, String SeriesName,
                       String SeriesAge, String SeriesNumberOfEpisodes) {

        this.SeriesId = SeriesId;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.SeriesNumberOfEpisodes = SeriesNumberOfEpisodes;
    }
}