package com.windforce.common.resource.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 资源数据对象声明注释
 * 
 * @author frank
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Resource {

	/** 资源位置 */
	String value() default "";

	/** 是否在缓存 */
	String cache() default "";

}
