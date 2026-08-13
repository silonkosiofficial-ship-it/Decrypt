package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.Function$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Function$CC {
    public static java.util.function.Function $default$andThen(java.util.function.Function function, java.util.function.Function function2) {
        j$.util.Objects.requireNonNull(function2);
        return new j$.util.function.d(function, function2, 0);
    }

    public static java.util.function.Function $default$compose(java.util.function.Function function, java.util.function.Function function2) {
        j$.util.Objects.requireNonNull(function2);
        return new j$.util.function.d(function, function2, 1);
    }
}
