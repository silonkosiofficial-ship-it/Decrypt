package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.B f56926c = new p239x9.B();

    private B() {
        super(p209u9.a.B(p247y7.C7344m.f57303a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(float[] fArr) {
        p247y7.AbstractC7350t.f(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public float[] w() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.A a6, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(a6, "builder");
        a6.e(dVar.g(a(), i6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public p239x9.A p(float[] fArr) {
        p247y7.AbstractC7350t.f(fArr, "<this>");
        return new p239x9.A(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(p229w9.f fVar, float[] fArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(fArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.e(a(), i10, fArr[i10]);
        }
    }
}
