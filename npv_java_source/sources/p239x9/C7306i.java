package p239x9;

/* JADX INFO: renamed from: x9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7306i extends p239x9.AbstractC7321p0 implements p199t9.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p239x9.C7306i f57003c = new p239x9.C7306i();

    private C7306i() {
        super(p209u9.a.y(p247y7.C7336e.f57284a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public int j(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public byte[] w() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7318o, p239x9.AbstractC7290a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void m(p229w9.d dVar, int i6, p239x9.C7304h c7304h, boolean z6) {
        p247y7.AbstractC7350t.f(dVar, "decoder");
        p247y7.AbstractC7350t.f(c7304h, "builder");
        c7304h.e(dVar.D(a(), i6));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7290a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public p239x9.C7304h p(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        return new p239x9.C7304h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p239x9.AbstractC7321p0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(p229w9.f fVar, byte[] bArr, int i6) {
        p247y7.AbstractC7350t.f(fVar, "encoder");
        p247y7.AbstractC7350t.f(bArr, "content");
        for (int i10 = 0; i10 < i6; i10++) {
            fVar.s(a(), i10, bArr[i10]);
        }
    }
}
