package suelen.animalExample;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Target(ElementType.FIELD) //Define que apenas propriedades podem utilizar essa annotation
@Retention(RetentionPolicy.RUNTIME)
@Autowired
@Qualifier("cat")
public @interface Cat {

}
