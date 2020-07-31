package suelen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Target(ElementType.TYPE) //Define que ela só pode ser utilizada por uma classe
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Profile("prod")
public @interface Prod {

}
