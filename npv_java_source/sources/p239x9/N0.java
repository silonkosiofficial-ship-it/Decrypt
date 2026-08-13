package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class N0 extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.N0 f56959c = new p239x9.N0();

    private N0() {
        super(p209u9.a.v(p087i7.J.f46716D));
    }

    protected int A(short[] sArr) {
        p247y7.AbstractC7350t.f(sArr, "$this$collectionSize");
        return p087i7.K.M(sArr);
    }

    protected short[] B() {
        return p087i7.K.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.M0 m6, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(m6, "builder");
        m6.e(p087i7.J.g(dVar.E(a(), i6).A()));
    }

    protected p239x9.M0 D(short[] sArr) {
        p247y7.AbstractC7350t.f(sArr, "$this$toBuilder");
        return new p239x9.M0(sArr, null);
    }

    protected void E(p229w9.f fVar, short[] sArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(sArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.u(a(), i10).h(p087i7.K.D(sArr, i10));
        }
    }

    @Override // p239x9.AbstractC7290a
    public /* bridge */ /* synthetic */ int j(java.lang.Object obj) {
        return A(((p087i7.K) obj).S());
    }

    @Override // p239x9.AbstractC7290a
    public /* bridge */ /* synthetic */ java.lang.Object p(java.lang.Object obj) {
        return D(((p087i7.K) obj).S());
    }

    @Override // p239x9.AbstractC7321p0
    public /* bridge */ /* synthetic */ java.lang.Object w() {
        return p087i7.K.d(B());
    }

    @Override // p239x9.AbstractC7321p0
    public /* bridge */ /* synthetic */ void z(p229w9.f fVar, java.lang.Object obj, int i6) {
        E(fVar, ((p087i7.K) obj).S(), i6);
    }
}
