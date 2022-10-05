package app.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("dogBean")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
