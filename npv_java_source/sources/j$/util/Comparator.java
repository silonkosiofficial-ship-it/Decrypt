package j$.util;

/* JADX INFO: loaded from: classes4.dex */
public interface Comparator<T> {

    /* JADX INFO: renamed from: j$.util.Comparator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, java.util.Comparator comparator2) {
            j$.util.Objects.requireNonNull(comparator2);
            return new j$.util.C6710c(comparator, comparator2, 0);
        }

        public static java.util.Comparator $default$thenComparing(java.util.Comparator comparator, java.util.function.Function function) {
            j$.util.Objects.requireNonNull(function);
            return j$.util.Q.s(comparator, new j$.util.C6709b(2, function));
        }

        public static java.util.Comparator $default$thenComparingDouble(java.util.Comparator comparator, java.util.function.ToDoubleFunction toDoubleFunction) {
            j$.util.Objects.requireNonNull(toDoubleFunction);
            return j$.util.Q.s(comparator, new j$.util.C6709b(1, toDoubleFunction));
        }

        public static java.util.Comparator $default$thenComparingInt(java.util.Comparator comparator, java.util.function.ToIntFunction toIntFunction) {
            j$.util.Objects.requireNonNull(toIntFunction);
            return j$.util.Q.s(comparator, new j$.util.C6709b(0, toIntFunction));
        }

        public static java.util.Comparator $default$thenComparingLong(java.util.Comparator comparator, java.util.function.ToLongFunction toLongFunction) {
            j$.util.Objects.requireNonNull(toLongFunction);
            return j$.util.Q.s(comparator, new j$.util.C6709b(3, toLongFunction));
        }

        public static java.util.Comparator a() {
            return j$.util.EnumC6712d.INSTANCE;
        }

        public static <T, U> java.util.Comparator<T> comparing(java.util.function.Function<? super T, ? extends U> function, java.util.Comparator<? super U> comparator) {
            j$.util.Objects.requireNonNull(function);
            j$.util.Objects.requireNonNull(comparator);
            return new j$.util.C6710c(comparator, function, 1);
        }
    }

    java.util.Comparator<T> reversed();

    java.util.Comparator<T> thenComparing(java.util.Comparator<? super T> comparator);

    <U extends java.lang.Comparable<? super U>> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U> function);

    <U> java.util.Comparator<T> thenComparing(java.util.function.Function<? super T, ? extends U> function, java.util.Comparator<? super U> comparator);

    java.util.Comparator<T> thenComparingDouble(java.util.function.ToDoubleFunction<? super T> toDoubleFunction);

    java.util.Comparator<T> thenComparingInt(java.util.function.ToIntFunction<? super T> toIntFunction);

    java.util.Comparator<T> thenComparingLong(java.util.function.ToLongFunction<? super T> toLongFunction);
}
