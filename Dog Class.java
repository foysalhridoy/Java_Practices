class Dog{
    String name;
    String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void bark(){
        System.out.println("Woof! My name is: "+this.name);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", "Bulldog");
        myDog.bark();
    }
}
