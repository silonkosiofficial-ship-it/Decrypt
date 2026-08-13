package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public final class Optional<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final j$.util.Optional f48021b = new j$.util.Optional();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f48022a;

    private Optional() {
        this.f48022a = null;
    }

    private Optional(java.lang.Object obj) {
        this.f48022a = j$.util.Objects.requireNonNull(obj);
    }

    public static <T> j$.util.Optional<T> empty() {
        return f48021b;
    }

    public static <T> j$.util.Optional<T> of(T t6) {
        return new j$.util.Optional<>(t6);
    }

    public static <T> j$.util.Optional<T> ofNullable(T t6) {
        return t6 == null ? empty() : of(t6);
    }

    public final java.lang.Object a() {
        java.lang.Object obj = this.f48022a;
        if (obj != null) {
            return obj;
        }
        throw new java.util.NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.f48022a != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.util.Optional) {
            return j$.util.Objects.equals(this.f48022a, ((j$.util.Optional) obj).f48022a);
        }
        return false;
    }

    public j$.util.Optional<T> filter(java.util.function.Predicate<? super T> predicate) {
        j$.util.Objects.requireNonNull(predicate);
        if (b() && !predicate.test((java.lang.Object) this.f48022a)) {
            return empty();
        }
        return this;
    }

    public final int hashCode() {
        return j$.util.Objects.hashCode(this.f48022a);
    }

    public void ifPresent(java.util.function.Consumer<? super T> consumer) {
        A.I i6 = (java.lang.Object) this.f48022a;
        if (i6 != null) {
            consumer.accept(i6);
        }
    }

    public <U> j$.util.Optional<U> map(java.util.function.Function<? super T, ? extends U> function) {
        j$.util.Objects.requireNonNull(function);
        return !b() ? empty() : ofNullable(function.apply((java.lang.Object) this.f48022a));
    }

    public T orElse(T t6) {
        T t10 = (T) this.f48022a;
        return t10 != null ? t10 : t6;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.f48022a;
        return obj != null ? java.lang.String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
