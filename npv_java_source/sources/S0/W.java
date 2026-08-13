package S0;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {
    public static final M0.C1332d a(S0.V v6) {
        return v6.f().p(v6.h());
    }

    public static final M0.C1332d b(S0.V v6, int i6) {
        return v6.f().subSequence(M0.N.k(v6.h()), java.lang.Math.min(M0.N.k(v6.h()) + i6, v6.i().length()));
    }

    public static final M0.C1332d c(S0.V v6, int i6) {
        return v6.f().subSequence(java.lang.Math.max(0, M0.N.l(v6.h()) - i6), M0.N.l(v6.h()));
    }
}
