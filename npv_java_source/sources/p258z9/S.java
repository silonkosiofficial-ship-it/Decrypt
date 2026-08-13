package p258z9;

/* JADX INFO: loaded from: classes2.dex */
final class S extends p258z9.AbstractC7390c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p249y9.C7359c f57690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f57691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f57692j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(p249y9.AbstractC7358b abstractC7358b, p249y9.C7359c c7359c) {
        super(abstractC7358b, c7359c, null, 4, null);
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(c7359c, "value");
        this.f57690h = c7359c;
        this.f57691i = y0().size();
        this.f57692j = -1;
    }

    @Override // p258z9.AbstractC7390c
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public p249y9.C7359c y0() {
        return this.f57690h;
    }

    @Override // p239x9.U
    protected java.lang.String d0(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return java.lang.String.valueOf(i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p258z9.AbstractC7390c
    public p249y9.i j0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        return y0().get(java.lang.Integer.parseInt(str));
    }

    @Override // p229w9.d
    public int r(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        int i6 = this.f57692j;
        if (i6 >= this.f57691i - 1) {
            return -1;
        }
        int i10 = i6 + 1;
        this.f57692j = i10;
        return i10;
    }
}
