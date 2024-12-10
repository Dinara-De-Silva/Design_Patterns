package Creational_Builder;

public class Burger {
    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonese;
    private boolean onion;
    private boolean lettuce;

    private Burger(BurgerBuilder burgerBuilder){
        System.out.println("here is your burger");
    }

    public String getSize() {
        return size;
    }

    public boolean isEgg() {
        return egg;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public boolean isMayonese() {
        return mayonese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public static class BurgerBuilder {
        private String size;
        private boolean egg;
        private boolean extraCheese;
        private boolean mayonese;
        private boolean onion;
        private boolean lettuce;

        public BurgerBuilder size(String size){
            this.size=size;
            System.out.println(size+" size burger");
            return this;
        }
        public BurgerBuilder egg(boolean egg){
            this.egg=egg;
            if (egg){
                System.out.println("an egg is added");
            }
            return this;
        }
        public BurgerBuilder extraCheese(boolean extraCheese){
            this.extraCheese=extraCheese;
            if (extraCheese){
                System.out.println("extra cheese is added");
            }
            return this;
        }
        public BurgerBuilder mayonese(boolean mayonese){
            this.mayonese=mayonese;
            if(mayonese){
                System.out.println("mayonese is added");
            }
            return this;
        }
        public BurgerBuilder onion(boolean onion){
            this.onion=onion;
            if (onion){
                System.out.println("onion is added");
            }
            return this;
        }
        public BurgerBuilder lettuce(boolean lettuce){
            this.lettuce=lettuce;
            if (lettuce){
                System.out.println("lettuce is added");
            }
            return this;
        }
        public Burger build(){
            System.out.println("burger is being preparing");
            return new Burger(this);
        }
    }
}
