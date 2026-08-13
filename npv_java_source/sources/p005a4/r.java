package p005a4;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements H3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H3.b f17059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H3.b f17060b;

    public r(android.content.Context context) {
        this.f17059a = new p005a4.p(context, N3.C1395h.f());
        this.f17060b = p005a4.l.d(context);
    }

    public static /* synthetic */ p115l4.AbstractC6931l b(p005a4.r rVar, p115l4.AbstractC6931l abstractC6931l) {
        if (abstractC6931l.o() || abstractC6931l.m()) {
            return abstractC6931l;
        }
        java.lang.Exception excK = abstractC6931l.k();
        if (!(excK instanceof O3.b)) {
            return abstractC6931l;
        }
        int iB = ((O3.b) excK).b();
        if (iB == 43001 || iB == 43002 || iB == 43003 || iB == 17) {
            return rVar.f17060b.a();
        }
        if (iB == 43000) {
            return p115l4.AbstractC6934o.d(new java.lang.Exception("Failed to get app set ID due to an internal error. Please try again later."));
        }
        return iB != 15 ? abstractC6931l : p115l4.AbstractC6934o.d(new java.lang.Exception("The operation to get app set ID timed out. Please try again later."));
    }

    @Override // H3.b
    public final p115l4.AbstractC6931l a() {
        return this.f17059a.a().j(new p115l4.InterfaceC6922c() { // from class: a4.q
            @Override // p115l4.InterfaceC6922c
            public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                return p005a4.r.b(this.f17058a, abstractC6931l);
            }
        });
    }
}
