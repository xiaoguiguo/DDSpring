package org.springframework.context;

import java.io.Closeable;

/**
 * SPI 接口将由大多数（如果不是全部）应用程序上下文实现。
 * 除了 {@link org.springframework.context.ApplicationContext} 接口中的应用程序上下文客户端方法之外，
 * 还提供配置应用程序上下文的工具。
 */
public interface ConfigurableApplicationContext extends ApplicationContext, Lifecycle, Closeable {

    /**
     * 任何数量的这些字符都被视为单个字符串值中多个上下文配置路径之间的分隔符。
     */
    String CONFIG_LOCATION_DELIMITERS = ",; \t\n";

}
