package p258z9;

/* JADX INFO: loaded from: classes2.dex */
final class K extends p258z9.AbstractC7390c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p249y9.i f57678h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(p249y9.AbstractC7358b abstractC7358b, p249y9.i iVar, java.lang.String str) {
        super(abstractC7358b, iVar, str, null);
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(iVar, "value");
        this.f57678h = iVar;
        a0("primitive");
    }

    public /* synthetic */ K(p249y9.AbstractC7358b abstractC7358b, p249y9.i iVar, java.lang.String str, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(abstractC7358b, iVar, (i6 & 4) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p258z9.AbstractC7390c
    public p249y9.i j0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "tag");
        if (str == "primitive") {
            return y0();
        }
        throw new java.lang.IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
    }

    @Override // p229w9.d
    public int r(p219v9.f fVar) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return 0;
    }

    @Override // p258z9.AbstractC7390c
    public p249y9.i y0() {
        return this.f57678h;
    }
}
