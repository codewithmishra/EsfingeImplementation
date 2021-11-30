package examples.metadata.fieldmetadata;

import net.sf.esfinge.metadata.annotation.validator.MaxValue;
import net.sf.esfinge.metadata.annotation.validator.MinValue;
import net.sf.esfinge.metadata.annotation.validator.ValidFieldType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@ValidFieldType(int.class)
public @interface InterValue {
    @MinValue(0)
    @MaxValue(100)
    int value();
}
