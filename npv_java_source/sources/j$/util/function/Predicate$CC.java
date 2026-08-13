package j$.util.function;

/* JADX INFO: renamed from: j$.util.function.Predicate$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Predicate$CC {
    public static java.util.function.Predicate $default$and(java.util.function.Predicate predicate, java.util.function.Predicate predicate2) {
        j$.util.Objects.requireNonNull(predicate2);
        return new j$.util.function.g(predicate, predicate2, 0);
    }

    public static java.util.function.Predicate $default$negate(java.util.function.Predicate predicate) {
        return new j$.util.function.a(2, predicate);
    }

    public static java.util.function.Predicate $default$or(java.util.function.Predicate predicate, java.util.function.Predicate predicate2) {
        j$.util.Objects.requireNonNull(predicate2);
        return new j$.util.function.g(predicate, predicate2, 1);
    }
}
