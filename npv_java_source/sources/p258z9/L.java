package p258z9;

/* JADX INFO: loaded from: classes2.dex */
final class L extends p258z9.AbstractC7392e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p249y9.i f57679g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(p249y9.AbstractC7358b abstractC7358b, p237x7.l lVar) {
        super(abstractC7358b, lVar, null);
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(lVar, "nodeConsumer");
        X("primitive");
    }

    @Override // p258z9.AbstractC7392e
    public p249y9.i q0() {
        p249y9.i iVar = this.f57679g;
        if (iVar != null) {
            return iVar;
        }
        throw new java.lang.IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // p258z9.AbstractC7392e
    public void v0(java.lang.String str, p249y9.i iVar) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(iVar, "element");
        if (str != "primitive") {
            throw new java.lang.IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
        }
        if (this.f57679g != null) {
            throw new java.lang.IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        this.f57679g = iVar;
        r0().l(iVar);
    }
}
