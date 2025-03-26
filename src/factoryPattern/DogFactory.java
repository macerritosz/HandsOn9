package factoryPattern;

public class DogFactory implements AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Dog();
    }
}
