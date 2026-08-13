package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class K0 extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.K0 f56951c = new p239x9.K0();

    private K0() {
        super(p209u9.a.u(p087i7.G.f46710D));
    }

    protected int A(long[] jArr) {
        p247y7.AbstractC7350t.f(jArr, "$this$collectionSize");
        return p087i7.H.M(jArr);
    }

    protected long[] B() {
        return p087i7.H.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.J0 j6, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(j6, "builder");
        j6.e(p087i7.G.g(dVar.E(a(), i6).q()));
    }

    protected p239x9.J0 D(long[] jArr) {
        p247y7.AbstractC7350t.f(jArr, "$this$toBuilder");
        return new p239x9.J0(jArr, null);
    }

    protected void E(p229w9.f fVar, long[] jArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(jArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.u(a(), i10).D(p087i7.H.D(jArr, i10));
        }
    }

    @Override // p239x9.AbstractC7290a
    public /* bridge */ /* synthetic */ int j(java.lang.Object obj) {
        return A(((p087i7.H) obj).S());
    }

    @Override // p239x9.AbstractC7290a
    public /* bridge */ /* synthetic */ java.lang.Object p(java.lang.Object obj) {
        return D(((p087i7.H) obj).S());
    }

    @Override // p239x9.AbstractC7321p0
    public /* bridge */ /* synthetic */ java.lang.Object w() {
        return p087i7.H.d(B());
    }

    @Override // p239x9.AbstractC7321p0
    public /* bridge */ /* synthetic */ void z(p229w9.f fVar, java.lang.Object obj, int i6) {
        E(fVar, ((p087i7.H) obj).S(), i6);
    }
}
