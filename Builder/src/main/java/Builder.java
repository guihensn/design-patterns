public interface Builder {
    public void setSize(String pizzaSize);

    public void setPepperoniMeat(boolean smoked);

    public void setChickenMeat(boolean freeRangeChicken);

    public void setTomato(boolean cherryTomato);

    public void setSauce(String type);

    public Pizza getPizza();
}
