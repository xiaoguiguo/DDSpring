package org.springframework.context;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.lang.Nullable;

/**
 * 为应用程序提供配置的中央接口。 这在应用程序运行时是只读的，但如果实现支持它可能会重新加载。
 */
public interface ApplicationContext {

    /**
     * Return the unique id of this application context.
     * 返回此应用程序上下文的唯一 ID。
     */
    @Nullable
    String getId();

    /**
     * Return a name for the deployed application that this context belongs to.
     * 返回此上下文所属的已部署应用程序的名称。
     */
    String getApplicationName();

    /**
     * Return a friendly name for this context.
     * 返回此上下文的友好名称。
     */
    String getDisplayName();

    /**
     * Return the timestamp when this context was first loaded.
     * 返回首次加载此上下文时的时间戳。
     */
    long getStartupDate();

    /**
     * Return the parent context, or {@code null} if there is no parent
     * and this is the root of the context hierarchy.
     * 返回父上下文，如果没有父上下文并且这是上下文层次结构的根，则返回 {@code null}。
     */
    @Nullable
    ApplicationContext getParent();

    /**
     * 为此上下文公开 AutowireCapableBeanFactory 功能。 这通常不被应用程序代码使用，
     * 除非用于初始化位于应用程序上下文之外的 bean 实例，将 Spring bean 生命周期（全部或部分）应用于它们。
     * 或者，由 {@link ConfigurableApplicationContext} 接口公开的内部 BeanFactory 也提供对 {@link AutowireCapableBeanFactory} 接口的访问。
     * 本方法主要用作 ApplicationContext 接口上的一个方便的、特定的工具。
     * 注意：从 4.2 开始，此方法将在应用程序上下文关闭后始终抛出 IllegalStateException。
     * 在当前的 Spring Framework 版本中，只有可刷新的应用程序上下文才会这样做；
     * 从 4.2 开始，所有应用程序上下文实现都需要遵守。
     */
    AutowireCapableBeanFactory getAutowireCapableBeanFactory() throws IllegalStateException;

}
