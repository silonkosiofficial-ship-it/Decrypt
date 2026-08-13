package F8;

/* JADX INFO: renamed from: F8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0956q extends F8.M {
    @Override // F8.E
    public java.util.List U0() {
        return f1().U0();
    }

    @Override // F8.E
    public F8.a0 V0() {
        return f1().V0();
    }

    @Override // F8.E
    public F8.e0 W0() {
        return f1().W0();
    }

    @Override // F8.E
    public boolean X0() {
        return f1().X0();
    }

    protected abstract F8.M f1();

    @Override // F8.t0
    public F8.M g1(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        F8.E eA = gVar.a(f1());
        p247y7.AbstractC7350t.d(eA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return h1((F8.M) eA);
    }

    public abstract F8.AbstractC0956q h1(F8.M m6);

    @Override // F8.E
    public p248y8.h u() {
        return f1().u();
    }
}
