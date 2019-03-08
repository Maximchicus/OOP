package pr8;

public interface Address {
    String cityName = null;
    String streetName = null;
    int buildingNumber = 0;
    char buildingLetter = 0;
    int apartmentNumber = 0;
    String getCityName();
    String getStreetName();
    int getBuildingNumber();
    char getBuildingLetter();
    int getApartmentNumber();
}
