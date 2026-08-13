package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.BiFunction$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class BiFunction$CC {
    public static java.util.function.BiFunction $default$andThen(java.util.function.BiFunction biFunction, java.util.function.Function function) {
        j$.util.Objects.requireNonNull(function);
        return new j$.util.concurrent.t(biFunction, function);
    }
}
