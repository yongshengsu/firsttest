/**
 * 
 */
package com.syncsoft.test.ano;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author suyongsheng
 * @date   2019年5月19日 上午11:57:39
 */
@Target(ElementType.TYPE)
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Ano {
	String name() default "sys";
	int  age() default 1;
//	String[] foods();
}
