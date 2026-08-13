package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.H0 f56943c = new p239x9.H0();

    private H0() {
        super(p209u9.a.t(p087i7.E.f46705D));
    }

    protected int A(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "$this$collectionSize");
        return p087i7.F.M(iArr);
    }

    protected int[] B() {
        return p087i7.F.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.G0 g6, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(g6, "builder");
        g6.e(p087i7.E.g(dVar.E(a(), i6).m()));
    }

    protected p239x9.G0 D(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "$this$toBuilder");
        return new p239x9.G0(iArr, null);
    }

    protected void E(p229w9.f fVar, int[] iArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(iArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.u(a(), i10).A(p087i7.F.D(iArr, i10));
        }
    }

    @Override // p239x9.AbstractC7290a
    public /* bridge */ /* synthetic */ int j(java.lang.Object obj) {
        return A(((p087i7.F) obj).S());
    }

    @Override // p239x9.AbstractC7290a
    public /* bridge */ /* synthetic */ java.lang.Object p(java.lang.Object obj) {
        return D(((p087i7.F) obj).S());
    }

    @Override // p239x9.AbstractC7321p0
    public /* bridge */ /* synthetic */ java.lang.Object w() {
        return p087i7.F.d(B());
    }

    @Override // p239x9.AbstractC7321p0
    public /* bridge */ /* synthetic */ void z(p229w9.f fVar, java.lang.Object obj, int i6) {
        E(fVar, ((p087i7.F) obj).S(), i6);
    }
}
