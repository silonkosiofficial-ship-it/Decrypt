package V;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 extends p051f0.z implements V.InterfaceC1742q0, p051f0.q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private V.p1.a f15001D;

    private static final class a extends p051f0.A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f15002c;

        public a(float f6) {
            this.f15002c = f6;
        }

        @Override // p051f0.A
        public void c(p051f0.A a6) {
            p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f15002c = ((V.p1.a) a6).f15002c;
        }

        @Override // p051f0.A
        public p051f0.A d() {
            return new V.p1.a(this.f15002c);
        }

        public final float i() {
            return this.f15002c;
        }

        public final void j(float f6) {
            this.f15002c = f6;
        }
    }

    public p1(float f6) {
        V.p1.a aVar = new V.p1.a(f6);
        if (p051f0.k.f44821e.e()) {
            V.p1.a aVar2 = new V.p1.a(f6);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f15001D = aVar;
    }

    @Override // p051f0.y
    public void C(p051f0.A a6) {
        p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f15001D = (V.p1.a) a6;
    }

    @Override // V.InterfaceC1742q0, V.S
    public float b() {
        return ((V.p1.a) p051f0.p.X(this.f15001D, this)).i();
    }

    @Override // p051f0.q
    public V.u1 c() {
        return V.v1.p();
    }

    @Override // p051f0.y
    public p051f0.A e() {
        return this.f15001D;
    }

    @Override // V.InterfaceC1742q0, V.G1
    public /* synthetic */ java.lang.Float getValue() {
        return V.AbstractC1740p0.a(this);
    }

    @Override // V.G1
    public /* bridge */ /* synthetic */ java.lang.Object getValue() {
        return getValue();
    }

    @Override // V.InterfaceC1742q0
    public void h(float f6) {
        p051f0.k kVarC;
        V.p1.a aVar = (V.p1.a) p051f0.p.F(this.f15001D);
        if (aVar.i() == f6) {
            return;
        }
        V.p1.a aVar2 = this.f15001D;
        p051f0.p.J();
        synchronized (p051f0.p.I()) {
            kVarC = p051f0.k.f44821e.c();
            ((V.p1.a) p051f0.p.S(aVar2, this, kVarC, aVar)).j(f6);
            p087i7.M m6 = p087i7.M.f46721a;
        }
        p051f0.p.Q(kVarC, this);
    }

    @Override // V.InterfaceC1742q0
    public /* synthetic */ void m(float f6) {
        V.AbstractC1740p0.c(this, f6);
    }

    @Override // p051f0.z, p051f0.y
    public p051f0.A s(p051f0.A a6, p051f0.A a10, p051f0.A a11) {
        p247y7.AbstractC7350t.d(a10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        p247y7.AbstractC7350t.d(a11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((V.p1.a) a10).i() == ((V.p1.a) a11).i()) {
            return a10;
        }
        return null;
    }

    @Override // V.InterfaceC1753w0
    public /* bridge */ /* synthetic */ void setValue(java.lang.Object obj) {
        m(((java.lang.Number) obj).floatValue());
    }

    public java.lang.String toString() {
        return "MutableFloatState(value=" + ((V.p1.a) p051f0.p.F(this.f15001D)).i() + ")@" + hashCode();
    }
}
