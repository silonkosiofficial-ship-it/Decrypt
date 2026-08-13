package p258z9;

/* JADX INFO: loaded from: classes2.dex */
final class V extends p258z9.Q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private java.lang.String f57698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f57699i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(p249y9.AbstractC7358b abstractC7358b, p237x7.l lVar) {
        super(abstractC7358b, lVar);
        p247y7.AbstractC7350t.f(abstractC7358b, "json");
        p247y7.AbstractC7350t.f(lVar, "nodeConsumer");
        this.f57699i = true;
    }

    @Override // p258z9.Q, p258z9.AbstractC7392e
    public p249y9.i q0() {
        return new p249y9.D(w0());
    }

    @Override // p258z9.Q, p258z9.AbstractC7392e
    public void v0(java.lang.String str, p249y9.i iVar) {
        boolean z6;
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(iVar, "element");
        if (!this.f57699i) {
            java.util.Map mapW0 = w0();
            java.lang.String str2 = this.f57698h;
            if (str2 == null) {
                p247y7.AbstractC7350t.p("tag");
                str2 = null;
            }
            mapW0.put(str2, iVar);
            z6 = true;
        } else {
            if (!(iVar instanceof p249y9.F)) {
                if (iVar instanceof p249y9.D) {
                    throw p258z9.G.d(p249y9.E.f57381a.a());
                }
                if (!(iVar instanceof p249y9.C7359c)) {
                    throw new p087i7.s();
                }
                throw p258z9.G.d(p249y9.C7360d.f57398a.a());
            }
            this.f57698h = ((p249y9.F) iVar).d();
            z6 = false;
        }
        this.f57699i = z6;
    }
}
