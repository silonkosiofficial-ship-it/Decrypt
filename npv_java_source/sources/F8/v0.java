package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v0 extends F8.E {
    public v0() {
        super(null);
    }

    @Override // F8.E
    public java.util.List U0() {
        return a1().U0();
    }

    @Override // F8.E
    public F8.a0 V0() {
        return a1().V0();
    }

    @Override // F8.E
    public F8.e0 W0() {
        return a1().W0();
    }

    @Override // F8.E
    public boolean X0() {
        return a1().X0();
    }

    @Override // F8.E
    public final F8.t0 Z0() {
        F8.E eA1 = a1();
        while (eA1 instanceof F8.v0) {
            eA1 = ((F8.v0) eA1).a1();
        }
        p247y7.AbstractC7350t.d(eA1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (F8.t0) eA1;
    }

    protected abstract F8.E a1();

    public abstract boolean b1();

    public java.lang.String toString() {
        return b1() ? a1().toString() : "<Not computed yet>";
    }

    @Override // F8.E
    public p248y8.h u() {
        return a1().u();
    }
}
