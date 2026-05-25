
package dormmanagementsystem.entities;


public class Room {
    private int roomNumber;
    private int capacity;
    private int occupied;
    private String status;

    public Room() {}

    public Room(int roomNumber, int capacity, int occupied, String status) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.occupied = occupied;
        this.status = status;
    }

    // Getters
    public int getRoomNumber() { return roomNumber; }
    public int getCapacity() { return capacity; }
    public int getOccupied() { return occupied; }
    public String getStatus() { return status; }

    // Setters
    public void setRoomNumber(int roomNumber) { this.roomNumber = roomNumber; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setOccupied(int occupied) { this.occupied = occupied; }
    public void setStatus(String status) { this.status = status; }

    // Overriding toString() makes it easy to display room numbers in GUI Dropdowns (JComboBox)
    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + status + ")";
    }
}
