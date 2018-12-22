/*
 * Generic Box
 */
package generics;

/**
 *
 * @author gheor
 */
public class GenericBox<T> {
    
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

}
