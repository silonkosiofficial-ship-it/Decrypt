package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E implements P7.a, J8.i {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f2827C;

    private E() {
    }

    public /* synthetic */ E(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    private final int T0() {
        return F8.G.a(this) ? super.hashCode() : (((W0().hashCode() * 31) + U0().hashCode()) * 31) + (X0() ? 1 : 0);
    }

    public abstract java.util.List U0();

    public abstract F8.a0 V0();

    public abstract F8.e0 W0();

    public abstract boolean X0();

    public abstract F8.E Y0(G8.g gVar);

    public abstract F8.t0 Z0();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F8.E)) {
            return false;
        }
        F8.E e6 = (F8.E) obj;
        return X0() == e6.X0() && G8.p.f3162a.a(Z0(), e6.Z0());
    }

    public final int hashCode() {
        int i6 = this.f2827C;
        if (i6 != 0) {
            return i6;
        }
        int iT0 = T0();
        this.f2827C = iT0;
        return iT0;
    }

    @Override // P7.a
    public P7.g k() {
        return F8.AbstractC0949j.a(V0());
    }

    public abstract p248y8.h u();
}
