package Lab2;

import javax.naming.Name;

public class Canada {
    Province province1 = new Province("Ontario",  "Toronto", 13_448_494);
    Province province2 = new Province("Quebec", "Quebec City", 8_164_361);
    Province province3 = new Province("British Columbia", "Victoria", 4_648_055);
    Province province4 = new Province("Alberta", "Edmonton", 4_067_175);
    Province province5 = new Province("Manitoba", "Winnipeg", 1_278_365);
    Province province6 = new Province("Saskatchewan", "Regina", 1_098_352);
    Province province7 = new Province("Nova Scotia", "Halifax", 923_598);
    Province province8 = new Province("New Brunswick", "Fredericton", 747_101);
    Province province9 = new Province("Newfoundland and Labrador", "St. John's", 519_716);
    Province province10 = new Province("Prince Edward Island", "Charlottetown", 142_907);

    long[] population = {13_448_494, 8_164_361, 4_648_055, 4_067_175, 1_278_365,	1_098_352, 923_598, 747_101, 519_716, 142_907};

    private Province[] provinces;

    public Canada(){
        this.provinces = new Province[]{province1, province2, province3, province4, province5, province6, province7, province8, province9, province10,};
    }


    public void displayAllProvinces(){
        for(int i = 0; i < provinces.length; i++){
            Province p = (provinces[i]);
            System.out.println(p.getDetails());
        }
    }
    public int getNumOfProvincesBetween(int min, int max){
        int minNum = min * 1_000_000;
        int maxNum = max * 1_000_000;
        int num = 0;
        for (int i = 0; i < population.length; i ++){
            if(population[i] >= minNum && population[i] <= maxNum){
                num ++;
            }
        }
        return num;
    }


}