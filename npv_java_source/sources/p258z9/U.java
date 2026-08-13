package p258z9;

/* JADX INFO: loaded from: classes2.dex */
final class U extends p258z9.P {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p249y9.D f57694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.util.List f57695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f57696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f57697o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(p249y9.AbstractC7358b abstractC7358b, p249y9.D d6) {
        super(abstractC7358b, d6, null, null, 12, null);
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(d6, "value");
        this.f57694l = d6;
        java.util.List listT0 = p097j7.AbstractC6879v.T0(y0().keySet());
        this.f57695m = listT0;
        this.f57696n = listT0.size() * 2;
        this.f57697o = -1;
    }

    @Override // p258z9.P, p258z9.AbstractC7390c
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public p249y9.D y0() {
        return this.f57694l;
    }

    @Override // p258z9.P, p258z9.AbstractC7390c, p229w9.d
    public void b(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
    }

    @Override // p258z9.P, p239x9.U
    protected java.lang.String d0(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return (java.lang.String) this.f57695m.get(i6 / 2);
    }

    @Override // p258z9.P, p258z9.AbstractC7390c
    protected p249y9.i j0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        return this.f57697o % 2 == 0 ? p249y9.j.c(str) : (p249y9.i) p097j7.S.i(y0(), str);
    }

    @Override // p258z9.P, p229w9.d
    public int r(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        int i6 = this.f57697o;
        if (i6 >= this.f57696n - 1) {
            return -1;
        }
        int i10 = i6 + 1;
        this.f57697o = i10;
        return i10;
    }
}
