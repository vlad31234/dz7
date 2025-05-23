class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: ruuhr");
    }
    @Override
    public String naturalHabitat() {
        return "Forests, grasslands, and swamps in Africa and Asia.";
    }
}
