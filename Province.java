package Lab2;

import java.util.Arrays;

public class Province {
    public static final String DEFAULT_NAME = "British Columbia";
    public static final String DEFAULT_CAPITAL = "Victoria";
    public static final long DEFAULT_POPULATION = 4_648_055;

    private String name;
    private String capital;
    private long population;

    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && isValidName(name)
                && isValidCapitalCity(capital)){
            setName(name);
            setCapital(capital);
            setPopulation(population);
        } else {
            this.name = DEFAULT_NAME;
            this.capital = DEFAULT_CAPITAL;
            this.population = DEFAULT_POPULATION;
        }
    }

    public Province(){
        this("British Columbia", "Victoria", 4648055);
    }

    private boolean isValidName(String name){
        String[] province = {"Ontario", "Quebec", "British Columbia", "Alberta", "Manitoba", "Saskatchewan", "Nova Scotia", "New Brunswick", "Newfoundland and Labrador", "Prince Edward Island"};
        if(Arrays.asList(province).contains(name)){
                return true;
            }
                return false;
    }
    private boolean isValidCapitalCity(String capital){
        String[] capitalCity = {"Toronto", "Quebec City", "Victoria", "Edmonton", "Winnipeg", "Regina", "Halifax", "Fredericton", "St. John's", "Charlottetown"};
            if(Arrays.asList(capitalCity).contains(capital)){
                return true;
            }
                return false;
    }
    private boolean isValidPopulation(long population){
        if (population >= 30_000 && population <= 15_000_000){
            return true;
        }
            return false;
    }

    public String getDetails(){
        return  String.format("The capital of %s (population. %d) is %s.", getName(), getPopulation(), getCapital());
    }


    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCapital(){
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation(){
        return population;
    }
    public void setPopulation(long population) {
        this.population = population;
    }




}
