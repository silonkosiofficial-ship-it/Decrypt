package V;

/* JADX INFO: loaded from: classes.dex */
public abstract class r1 extends p051f0.z implements V.InterfaceC1749u0, p051f0.q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private V.r1.a f15012D;

    private static final class a extends p051f0.A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f15013c;

        public a(long j6) {
            this.f15013c = j6;
        }

        @Override // p051f0.A
        public void c(p051f0.A a6) {
            p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f15013c = ((V.r1.a) a6).f15013c;
        }

        @Override // p051f0.A
        public p051f0.A d() {
            return new V.r1.a(this.f15013c);
        }

        public final long i() {
            return this.f15013c;
        }

        public final void j(long j6) {
            this.f15013c = j6;
        }
    }

    public r1(long j6) {
        V.r1.a aVar = new V.r1.a(j6);
        if (p051f0.k.f44821e.e()) {
            V.r1.a aVar2 = new V.r1.a(j6);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f15012D = aVar;
    }

    @Override // p051f0.y
    public void C(p051f0.A a6) {
        p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f15012D = (V.r1.a) a6;
    }

    @Override // V.InterfaceC1749u0, V.InterfaceC1717h0
    public long a() {
        return ((V.r1.a) p051f0.p.X(this.f15012D, this)).i();
    }

    @Override // p051f0.q
    public V.u1 c() {
        return V.v1.p();
    }

    @Override // p051f0.y
    public p051f0.A e() {
        return this.f15012D;
    }

    @Override // V.InterfaceC1749u0, V.G1
    public /* synthetic */ java.lang.Long getValue() {
        return V.AbstractC1747t0.a(this);
    }

    @Override // V.G1
    public /* bridge */ /* synthetic */ java.lang.Object getValue() {
        return getValue();
    }

    @Override // V.InterfaceC1749u0
    public void j(long j6) {
        p051f0.k kVarC;
        V.r1.a aVar = (V.r1.a) p051f0.p.F(this.f15012D);
        if (aVar.i() != j6) {
            V.r1.a aVar2 = this.f15012D;
            p051f0.p.J();
            synchronized (p051f0.p.I()) {
                kVarC = p051f0.k.f44821e.c();
                ((V.r1.a) p051f0.p.S(aVar2, this, kVarC, aVar)).j(j6);
                p087i7.M m6 = p087i7.M.f46721a;
            }
            p051f0.p.Q(kVarC, this);
        }
    }

    @Override // V.InterfaceC1749u0
    public /* synthetic */ void k(long j6) {
        V.AbstractC1747t0.c(this, j6);
    }

    @Override // p051f0.z, p051f0.y
    public p051f0.A s(p051f0.A a6, p051f0.A a10, p051f0.A a11) {
        p247y7.AbstractC7350t.d(a10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        p247y7.AbstractC7350t.d(a11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((V.r1.a) a10).i() == ((V.r1.a) a11).i()) {
            return a10;
        }
        return null;
    }

    @Override // V.InterfaceC1753w0
    public /* bridge */ /* synthetic */ void setValue(java.lang.Object obj) {
        k(((java.lang.Number) obj).longValue());
    }

    public java.lang.String toString() {
        return "MutableLongState(value=" + ((V.r1.a) p051f0.p.F(this.f15012D)).i() + ")@" + hashCode();
    }
}
