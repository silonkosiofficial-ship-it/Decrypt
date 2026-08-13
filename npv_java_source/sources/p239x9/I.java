package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.I f56944c = new p239x9.I();

    private I() {
        super(p209u9.a.C(p247y7.C7349s.f57306a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int[] w() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.H h6, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(h6, "builder");
        h6.e(dVar.t(a(), i6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public p239x9.H p(int[] iArr) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        return new p239x9.H(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(p229w9.f fVar, int[] iArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(iArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.m(a(), i10, iArr[i10]);
        }
    }
}
