package dormmanagementsystem;

public interface IRecordManager {
    void loadRecords(String searchQuery);
    void addRecord();
    void updateRecord();
    void deleteRecord();
    void clearForm();
}
