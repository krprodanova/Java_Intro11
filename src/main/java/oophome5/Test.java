package oophome5;

public class Test {
    public static void main(String[] args) {
        Mickey animation = new Mickey();
        Address micheyAddress = new Address();
        micheyAddress.setCountry("USA");
        micheyAddress.setCity("Disneyland");


        animation.printData();

        animation.setAge(94);
        animation.setBreed(new Breed("Male Mouse"));
        animation.setName("Mickey Mouse");
        animation.setAddress(micheyAddress);
        animation.printData();

        Minnie minnie = new Minnie();
        Address minnieAddress = new Address();
        micheyAddress.setCountry("USA");
        micheyAddress.setCity("Neiborhood Lane");
        minnie.setAge(80);
        minnie.setBreed(new Breed("Female Mouse"));
        minnie.setName("Minnie Mouse");
        minnie.printData();

        animation.sing();
        minnie.dance();
    }
}
