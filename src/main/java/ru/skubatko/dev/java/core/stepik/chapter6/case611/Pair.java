package ru.skubatko.dev.java.core.stepik.chapter6.case611;

class Pair<K, V> {

    private K first;
    private V second;

    private Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }

    public static <K, V> Pair<K, V> of(K first, V second) {
        return new Pair<>(first, second);
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (first != null && !first.equals(pair.first)) {
            return false;
        }

        if (first == null && pair.first != null) {
            return false;
        }

        if (second != null && !second.equals(pair.second)) {
            return false;
        }

        if (second == null && pair.second != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }

}
