package p239x9;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.w0 f57057c = new p239x9.w0();

    private w0() {
        super(p209u9.a.E(p247y7.T.f57257a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(short[] sArr) {
        p247y7.AbstractC7350t.f(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public short[] w() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.v0 v0Var, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(v0Var, "builder");
        v0Var.e(dVar.h(a(), i6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public p239x9.v0 p(short[] sArr) {
        p247y7.AbstractC7350t.f(sArr, "<this>");
        return new p239x9.v0(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(p229w9.f fVar, short[] sArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(sArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.c(a(), i10, sArr[i10]);
        }
    }
}
