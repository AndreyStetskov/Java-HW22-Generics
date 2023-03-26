public class DataBaseWriter<G> {
    private String database;
    private G value;


    public DataBaseWriter(String database, G value) {
        this.database = database;
        this.value = value;
    }

    public void save() {
        System.out.printf("Data is written to the %s database, data type is %s \n",
            getDatabase(),
            value.getClass().toString().replaceFirst("class java.lang.|class java.math.", ""));
    }

    public String getDatabase() {
        return database;
    }
}
