package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class E0 extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.E0 f56934c = new p239x9.E0();

    private E0() {
        super(p209u9.a.s(p087i7.C.f46700D));
    }

    protected int A(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "$this$collectionSize");
        return p087i7.D.N(bArr);
    }

    protected byte[] B() {
        return p087i7.D.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.D0 d6, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(d6, "builder");
        d6.e(p087i7.C.g(dVar.E(a(), i6).y()));
    }

    protected p239x9.D0 D(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "$this$toBuilder");
        return new p239x9.D0(bArr, null);
    }

    protected void E(p229w9.f fVar, byte[] bArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(bArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.u(a(), i10).j(p087i7.D.E(bArr, i10));
        }
    }

    @Override // p239x9.AbstractC7290a
    public /* bridge */ /* synthetic */ int j(java.lang.Object obj) {
        return A(((p087i7.D) obj).T());
    }

    @Override // p239x9.AbstractC7290a
    public /* bridge */ /* synthetic */ java.lang.Object p(java.lang.Object obj) {
        return D(((p087i7.D) obj).T());
    }

    @Override // p239x9.AbstractC7321p0
    public /* bridge */ /* synthetic */ java.lang.Object w() {
        return p087i7.D.d(B());
    }

    @Override // p239x9.AbstractC7321p0
    public /* bridge */ /* synthetic */ void z(p229w9.f fVar, java.lang.Object obj, int i6) {
        E(fVar, ((p087i7.D) obj).T(), i6);
    }
}
