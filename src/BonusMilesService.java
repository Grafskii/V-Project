public class BonusMilesService {

    public int calculate(int price) {
        int pricePerMile = 20; // цена за одну милю

        return price / pricePerMile;
    }
}
