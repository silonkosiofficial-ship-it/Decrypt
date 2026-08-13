package p239x9;

/* JADX INFO: renamed from: x9.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7314m extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.C7314m f57022c = new p239x9.C7314m();

    private C7314m() {
        super(p209u9.a.z(p247y7.C7338g.f57293a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(char[] cArr) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public char[] w() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.C7312l c7312l, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(c7312l, "builder");
        c7312l.e(dVar.i(a(), i6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public p239x9.C7312l p(char[] cArr) {
        p247y7.AbstractC7350t.f(cArr, "<this>");
        return new p239x9.C7312l(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(p229w9.f fVar, char[] cArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(cArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.C(a(), i10, cArr[i10]);
        }
    }
}
