package pr8;

import java.util.LinkedList;

public class InternetOrder implements Order {

    @Override
    public boolean add(Item item) {
        items.add(item);
        return true;
    }

    @Override
    public boolean remove(String dishName) {
        for(Item i : items){
            if (i.getNaming()==dishName) items.remove(i);
            return true;
        }
        return false;
    }

    @Override
    public int removeAll(String dishName) {
        int c=0;
        for(Item i : items){
            if (i.getNaming()==dishName) items.remove(i);
            c++;
        }
        return c;
    }

    @Override
    public int costTotal() {
        int c = 0;
        for(Item i : items){
            //System.out.println(i.getCost()+" "+i.getNaming()+" "+i.getDescription());
            c+= i.getCost();
        }
        return c;
    }

    @Override
    public LinkedList<Item> getDishes() {
        return items;
    }

    @Override
    public String dishesNames() {
        String names = null;
        for(Item i : items){
            names+= i.getNaming();
        }
        return names;
    }

    @Override
    public int numberOfDishesByName(String dishName) {
        int c=0;
        for(Item i : items){
            if(i.getNaming()==dishName) c++;
        }
        return c;
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    @Override
    public String getSecondname() {
        return secondname;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getCityName() {
        return cityName;
    }

    @Override
    public String getStreetName() {
        return streetName;
    }

    @Override
    public int getBuildingNumber() {
        return buildingNumber;
    }

    @Override
    public char getBuildingLetter() {
        return buildingLetter;
    }

    @Override
    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
