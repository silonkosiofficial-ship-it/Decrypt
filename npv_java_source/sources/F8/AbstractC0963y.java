package F8;

/* JADX INFO: renamed from: F8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0963y extends F8.t0 implements J8.g {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final F8.M f2987D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final F8.M f2988E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0963y(F8.M m6, F8.M m10) {
        super(null);
        p247y7.AbstractC7350t.f(m6, "lowerBound");
        p247y7.AbstractC7350t.f(m10, "upperBound");
        this.f2987D = m6;
        this.f2988E = m10;
    }

    @Override // F8.E
    public java.util.List U0() {
        return d1().U0();
    }

    @Override // F8.E
    public F8.a0 V0() {
        return d1().V0();
    }

    @Override // F8.E
    public F8.e0 W0() {
        return d1().W0();
    }

    @Override // F8.E
    public boolean X0() {
        return d1().X0();
    }

    public abstract F8.M d1();

    public final F8.M e1() {
        return this.f2987D;
    }

    public final F8.M f1() {
        return this.f2988E;
    }

    public abstract java.lang.String g1(p168q8.c cVar, p168q8.f fVar);

    public java.lang.String toString() {
        return p168q8.c.f53162j.w(this);
    }

    @Override // F8.E
    public p248y8.h u() {
        return d1().u();
    }
}
