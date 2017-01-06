package oguz.tutorials.generics;

/**
 * Created by oguz on 5.1.2017.
 * Generics
 * Write and use parametrized types in Collections
 * Throws compiler error
 *
 * Naming Conventions:
 * E for an element
 * K for a map key
 * V for a map value
 * N for a number
 * T for a generic data type
 * S, U, V, and so forth for multiple generic types
 *
 */
public class GenericClass<T> {

    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
