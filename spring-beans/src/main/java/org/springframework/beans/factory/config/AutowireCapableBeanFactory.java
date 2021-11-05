package org.springframework.beans.factory.config;

import org.springframework.beans.factory.BeanFactory;

/**
 * {@link org.springframework.beans.factory.BeanFactory} 接口的扩展将由能够自动装配的 bean 工厂实现，
 * 前提是他们希望为现有 bean 实例公开此功能。
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 表示没有外部定义的自动装配的常量。 请注意，仍将应用 BeanFactoryAware 等和注解驱动的注入。
     */
    int AUTOWIRE_NO = 0;

    /**
     * 按名称指示自动装配 bean 属性的常量（适用于所有 bean property setters）
     */
    int AUTOWIRE_BY_NAME = 1;

    /**
     * 按类型指示自动装配 bean 属性的常量（适用于所有 bean property setters）
     */
    int AUTOWIRE_BY_TYPE = 2;

    /**
     * 指示自动装配可以满足的最贪婪构造函数的常量（涉及解析适当的构造函数）。
     * // TODO
     */
    int AUTOWIRE_CONSTRUCTOR = 3;
}
