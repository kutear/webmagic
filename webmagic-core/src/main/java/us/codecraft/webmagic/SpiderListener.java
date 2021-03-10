package us.codecraft.webmagic;

/**
 * Listener of Spider on page processing. Used for monitor and such on.
 *
 * @author code4crafer@gmail.com
 * @since 0.5.0
 */
public interface SpiderListener {

    void onStart(Spider spider);

    void onSuccess(Spider spider, Request request);

    void onError(Spider spider, Request request, Throwable throwable);

    void onFinish(Spider spider);
}
