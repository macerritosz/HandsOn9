package factoryPattern;

public class CatFactory implements AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }
}
