package annotation_configuration.primary_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bike implements Vehicle {
    @Override
    public void start(){System.out.println("Bike starts . . .");}
}
