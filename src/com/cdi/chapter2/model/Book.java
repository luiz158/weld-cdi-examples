package com.cdi.chapter2.model;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

@Qualifier
@Target({TYPE, FIELD})
@Retention(RUNTIME)
public @interface Book {

	Category value();

	@Nonbinding String description() default "";
}
