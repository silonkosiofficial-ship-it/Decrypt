package p258z9;

/* JADX INFO: loaded from: classes2.dex */
final class T extends p258z9.AbstractC7392e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.ArrayList f57693g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(p249y9.AbstractC7358b abstractC7358b, p237x7.l lVar) {
        super(abstractC7358b, lVar, null);
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(lVar, "nodeConsumer");
        this.f57693g = new java.util.ArrayList();
    }

    @Override // p258z9.AbstractC7392e, p239x9.V
    protected java.lang.String Z(p219v9.f fVar, int i6) {
        p247y7.AbstractC7350t.f(fVar, "descriptor");
        return java.lang.String.valueOf(i6);
    }

    @Override // p258z9.AbstractC7392e
    public p249y9.i q0() {
        return new p249y9.C7359c(this.f57693g);
    }

    @Override // p258z9.AbstractC7392e
    public void v0(java.lang.String str, p249y9.i iVar) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(iVar, "element");
        this.f57693g.add(java.lang.Integer.parseInt(str), iVar);
    }
}
