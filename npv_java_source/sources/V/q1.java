package V;

/* JADX INFO: loaded from: classes.dex */
public abstract class q1 extends p051f0.z implements V.InterfaceC1745s0, p051f0.q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private V.q1.a f15010D;

    private static final class a extends p051f0.A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f15011c;

        public a(int i6) {
            this.f15011c = i6;
        }

        @Override // p051f0.A
        public void c(p051f0.A a6) {
            p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f15011c = ((V.q1.a) a6).f15011c;
        }

        @Override // p051f0.A
        public p051f0.A d() {
            return new V.q1.a(this.f15011c);
        }

        public final int i() {
            return this.f15011c;
        }

        public final void j(int i6) {
            this.f15011c = i6;
        }
    }

    public q1(int i6) {
        V.q1.a aVar = new V.q1.a(i6);
        if (p051f0.k.f44821e.e()) {
            V.q1.a aVar2 = new V.q1.a(i6);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f15010D = aVar;
    }

    @Override // p051f0.y
    public void C(p051f0.A a6) {
        p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f15010D = (V.q1.a) a6;
    }

    @Override // p051f0.q
    public V.u1 c() {
        return V.v1.p();
    }

    @Override // V.InterfaceC1745s0, V.Y
    public int d() {
        return ((V.q1.a) p051f0.p.X(this.f15010D, this)).i();
    }

    @Override // p051f0.y
    public p051f0.A e() {
        return this.f15010D;
    }

    @Override // V.InterfaceC1745s0, V.G1
    public /* synthetic */ java.lang.Integer getValue() {
        return V.AbstractC1743r0.a(this);
    }

    @Override // V.G1
    public /* bridge */ /* synthetic */ java.lang.Object getValue() {
        return getValue();
    }

    @Override // V.InterfaceC1745s0
    public void i(int i6) {
        p051f0.k kVarC;
        V.q1.a aVar = (V.q1.a) p051f0.p.F(this.f15010D);
        if (aVar.i() != i6) {
            V.q1.a aVar2 = this.f15010D;
            p051f0.p.J();
            synchronized (p051f0.p.I()) {
                kVarC = p051f0.k.f44821e.c();
                ((V.q1.a) p051f0.p.S(aVar2, this, kVarC, aVar)).j(i6);
                p087i7.M m6 = p087i7.M.f46721a;
            }
            p051f0.p.Q(kVarC, this);
        }
    }

    @Override // V.InterfaceC1745s0
    public /* synthetic */ void l(int i6) {
        V.AbstractC1743r0.c(this, i6);
    }

    @Override // p051f0.z, p051f0.y
    public p051f0.A s(p051f0.A a6, p051f0.A a10, p051f0.A a11) {
        p247y7.AbstractC7350t.d(a10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        p247y7.AbstractC7350t.d(a11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((V.q1.a) a10).i() == ((V.q1.a) a11).i()) {
            return a10;
        }
        return null;
    }

    @Override // V.InterfaceC1753w0
    public /* bridge */ /* synthetic */ void setValue(java.lang.Object obj) {
        l(((java.lang.Number) obj).intValue());
    }

    public java.lang.String toString() {
        return "MutableIntState(value=" + ((V.q1.a) p051f0.p.F(this.f15010D)).i() + ")@" + hashCode();
    }
}
