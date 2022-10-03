package app.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service("Dog")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
