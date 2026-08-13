package j$.util.stream;

/* JADX INFO: loaded from: classes4.dex */
public interface Collector<T, A, R> {

    /* JADX INFO: renamed from: j$.util.stream.Collector$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static <T, A, R> j$.util.stream.Collector<T, A, R> of(java.util.function.Supplier<A> supplier, java.util.function.BiConsumer<A, T> biConsumer, java.util.function.BinaryOperator<A> binaryOperator, java.util.function.Function<A, R> function, j$.util.stream.Collector.Characteristics... characteristicsArr) {
            j$.util.Objects.requireNonNull(supplier);
            j$.util.Objects.requireNonNull(biConsumer);
            j$.util.Objects.requireNonNull(binaryOperator);
            j$.util.Objects.requireNonNull(function);
            j$.util.Objects.requireNonNull(characteristicsArr);
            java.util.Set setUnmodifiableSet = j$.util.stream.AbstractC6782l.f48502a;
            if (characteristicsArr.length > 0) {
                java.util.EnumSet enumSetNoneOf = java.util.EnumSet.noneOf(j$.util.stream.Collector.Characteristics.class);
                java.util.Collections.addAll(enumSetNoneOf, characteristicsArr);
                setUnmodifiableSet = java.util.Collections.unmodifiableSet(enumSetNoneOf);
            }
            return new j$.util.stream.C6777k(supplier, biConsumer, binaryOperator, function, setUnmodifiableSet);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Characteristics {
        public static final j$.util.stream.Collector.Characteristics CONCURRENT;
        public static final j$.util.stream.Collector.Characteristics IDENTITY_FINISH;
        public static final j$.util.stream.Collector.Characteristics UNORDERED;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final /* synthetic */ j$.util.stream.Collector.Characteristics[] f48215a;

        static {
            j$.util.stream.Collector.Characteristics characteristics = new j$.util.stream.Collector.Characteristics("CONCURRENT", 0);
            CONCURRENT = characteristics;
            j$.util.stream.Collector.Characteristics characteristics2 = new j$.util.stream.Collector.Characteristics("UNORDERED", 1);
            UNORDERED = characteristics2;
            j$.util.stream.Collector.Characteristics characteristics3 = new j$.util.stream.Collector.Characteristics("IDENTITY_FINISH", 2);
            IDENTITY_FINISH = characteristics3;
            f48215a = new j$.util.stream.Collector.Characteristics[]{characteristics, characteristics2, characteristics3};
        }

        public static j$.util.stream.Collector.Characteristics valueOf(java.lang.String str) {
            return (j$.util.stream.Collector.Characteristics) java.lang.Enum.valueOf(j$.util.stream.Collector.Characteristics.class, str);
        }

        public static j$.util.stream.Collector.Characteristics[] values() {
            return (j$.util.stream.Collector.Characteristics[]) f48215a.clone();
        }
    }

    java.util.function.BiConsumer accumulator();

    java.util.Set characteristics();

    java.util.function.BinaryOperator combiner();

    java.util.function.Function finisher();

    java.util.function.Supplier supplier();
}
