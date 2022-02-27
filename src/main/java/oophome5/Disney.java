package oophome5;

public class Disney implements DisneyAction {
    private String name;
    private int age;
    private Breed breed;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid Data");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid data");
        }
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null)) {
            this.breed = breed;
        } else {
            System.out.println("Invalid Data");
        }
        }
        public void printData(){
            System.out.printf("This mouse name is: %s.%nThis mouse age is: %d.%nThis mouse breed is: %s.%n", name, age, breed);
        }

    @Override
    public void sing() {
        System.out.println(name + " is singing...");
    }

    @Override
    public void dance() {
        System.out.println(name + " is dancing...");

    }
}
