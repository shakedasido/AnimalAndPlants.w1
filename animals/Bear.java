package animals;
import diet.Omnivore;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import utilities.MessageUtility;

public class Bear extends RoarAnimals {

    private String furColor;

    public Bear(String name)
    {
        super(name, new Point(100, 5)); //here we actually create a point so we need to do new, create a new default value
        this.SetDiet(new Omnivore());
        this.SetWeight(308.2);
        furColor = "GREY";
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());
    }

    public Bear(String name, Point point)
    {
        super(name, point); //here we actually create a point so we need to do new, create a new default value
        this.SetDiet(new Omnivore());
        this.SetWeight(308.2);
        furColor = "GREY";
        MessageUtility.logConstractor(this.getClass().getSimpleName(), GetName());

    }

    public EFoodType getFoodType() {
        MessageUtility.logGetter(GetName(), "getFoodType", EFoodType.MEAT );
        return EFoodType.MEAT;
    }

    public void Roar()
    {
        MessageUtility.logSound(this.GetName(), "Stands on its hind legs, roars and scratches its belly");
    }

    public Bear(String name, Point point, String furColor)
    {
        super(name, point);
        this.SetDiet(new Omnivore());
        this.SetWeight(308.2);
        setFurColor(furColor);
    }
    public String getFurColor() {
        return furColor;
    }
    @SuppressWarnings("unlikely-arg-type")
    public boolean setFurColor(String furColor) {
        for(FurColor color : FurColor.values()){
            if(color.equals(furColor.toUpperCase())){
                this.furColor = furColor;
                MessageUtility.logSetter(this.GetName(), "setFurColor", furColor, true);
                return true;
            }
        }
        this.furColor = "GREY";
        MessageUtility.logSetter(this.GetName(), "setFurColor", furColor, false);
        return false;
    }


}
