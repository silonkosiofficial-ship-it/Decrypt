package p239x9;

/* JADX INFO: renamed from: x9.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7300f extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.C7300f f56996c = new p239x9.C7300f();

    private C7300f() {
        super(p209u9.a.x(p247y7.C7335d.f57283a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(boolean[] zArr) {
        p247y7.AbstractC7350t.f(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean[] w() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.C7298e c7298e, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(c7298e, "builder");
        c7298e.e(dVar.d(a(), i6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public p239x9.C7298e p(boolean[] zArr) {
        p247y7.AbstractC7350t.f(zArr, "<this>");
        return new p239x9.C7298e(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(p229w9.f fVar, boolean[] zArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(zArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.f(a(), i10, zArr[i10]);
        }
    }
}
