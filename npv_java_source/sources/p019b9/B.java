package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B {
    public static java.lang.Object a(java.lang.Object obj) {
        return obj;
    }

    public static final p019b9.A b(java.lang.Object obj) {
        if (obj == p019b9.AbstractC2114a.f24349a) {
            throw new java.lang.IllegalStateException("Does not contain segment".toString());
        }
        p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (p019b9.A) obj;
    }

    public static final boolean c(java.lang.Object obj) {
        return obj == p019b9.AbstractC2114a.f24349a;
    }
}
