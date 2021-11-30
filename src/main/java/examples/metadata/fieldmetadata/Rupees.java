package examples.metadata.fieldmetadata;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Prefix("Rupees")
@Sufix("Kg")
@Retention(RetentionPolicy.RUNTIME)
public @interface Rupees {
}
