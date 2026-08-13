package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.DoubleUnaryOperator$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DoubleUnaryOperator$CC {
    public static java.util.function.DoubleUnaryOperator $default$andThen(java.util.function.DoubleUnaryOperator doubleUnaryOperator, java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
        j$.util.Objects.requireNonNull(doubleUnaryOperator2);
        return new j$.util.function.c(doubleUnaryOperator, doubleUnaryOperator2, 1);
    }

    public static java.util.function.DoubleUnaryOperator $default$compose(java.util.function.DoubleUnaryOperator doubleUnaryOperator, java.util.function.DoubleUnaryOperator doubleUnaryOperator2) {
        j$.util.Objects.requireNonNull(doubleUnaryOperator2);
        return new j$.util.function.c(doubleUnaryOperator, doubleUnaryOperator2, 0);
    }
}
