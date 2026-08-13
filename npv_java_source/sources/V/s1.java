package V;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 extends p051f0.z implements p051f0.q {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final V.u1 f15014D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private V.s1.a f15015E;

    private static final class a extends p051f0.A {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private java.lang.Object f15016c;

        public a(java.lang.Object obj) {
            this.f15016c = obj;
        }

        @Override // p051f0.A
        public void c(p051f0.A a6) {
            p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f15016c = ((V.s1.a) a6).f15016c;
        }

        @Override // p051f0.A
        public p051f0.A d() {
            return new V.s1.a(this.f15016c);
        }

        public final java.lang.Object i() {
            return this.f15016c;
        }

        public final void j(java.lang.Object obj) {
            this.f15016c = obj;
        }
    }

    public s1(java.lang.Object obj, V.u1 u1Var) {
        this.f15014D = u1Var;
        V.s1.a aVar = new V.s1.a(obj);
        if (p051f0.k.f44821e.e()) {
            V.s1.a aVar2 = new V.s1.a(obj);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f15015E = aVar;
    }

    @Override // p051f0.y
    public void C(p051f0.A a6) {
        p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f15015E = (V.s1.a) a6;
    }

    @Override // p051f0.q
    public V.u1 c() {
        return this.f15014D;
    }

    @Override // p051f0.y
    public p051f0.A e() {
        return this.f15015E;
    }

    @Override // V.InterfaceC1753w0, V.G1
    public java.lang.Object getValue() {
        return ((V.s1.a) p051f0.p.X(this.f15015E, this)).i();
    }

    @Override // p051f0.z, p051f0.y
    public p051f0.A s(p051f0.A a6, p051f0.A a10, p051f0.A a11) {
        p247y7.AbstractC7350t.d(a6, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        V.s1.a aVar = (V.s1.a) a6;
        p247y7.AbstractC7350t.d(a10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        V.s1.a aVar2 = (V.s1.a) a10;
        p247y7.AbstractC7350t.d(a11, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        V.s1.a aVar3 = (V.s1.a) a11;
        if (c().a(aVar2.i(), aVar3.i())) {
            return a10;
        }
        java.lang.Object objB = c().b(aVar.i(), aVar2.i(), aVar3.i());
        if (objB == null) {
            return null;
        }
        p051f0.A aD = aVar3.d();
        p247y7.AbstractC7350t.d(aD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
        ((V.s1.a) aD).j(objB);
        return aD;
    }

    @Override // V.InterfaceC1753w0
    public void setValue(java.lang.Object obj) {
        p051f0.k kVarC;
        V.s1.a aVar = (V.s1.a) p051f0.p.F(this.f15015E);
        if (c().a(aVar.i(), obj)) {
            return;
        }
        V.s1.a aVar2 = this.f15015E;
        p051f0.p.J();
        synchronized (p051f0.p.I()) {
            kVarC = p051f0.k.f44821e.c();
            ((V.s1.a) p051f0.p.S(aVar2, this, kVarC, aVar)).j(obj);
            p087i7.M m6 = p087i7.M.f46721a;
        }
        p051f0.p.Q(kVarC, this);
    }

    public java.lang.String toString() {
        return "MutableState(value=" + ((V.s1.a) p051f0.p.F(this.f15015E)).i() + ")@" + hashCode();
    }
}
