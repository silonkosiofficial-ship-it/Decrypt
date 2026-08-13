package Y2;

/* JADX INFO: loaded from: classes.dex */
final class s implements W2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y2.p f16333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f16334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W2.b f16335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W2.g f16336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Y2.t f16337e;

    s(Y2.p pVar, java.lang.String str, W2.b bVar, W2.g gVar, Y2.t tVar) {
        this.f16333a = pVar;
        this.f16334b = str;
        this.f16335c = bVar;
        this.f16336d = gVar;
        this.f16337e = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(java.lang.Exception exc) {
    }

    @Override // W2.h
    public void a(W2.c cVar) {
        b(cVar, new W2.j() { // from class: Y2.r
            @Override // W2.j
            public final void a(java.lang.Exception exc) {
                Y2.s.e(exc);
            }
        });
    }

    @Override // W2.h
    public void b(W2.c cVar, W2.j jVar) {
        this.f16337e.a(Y2.o.a().e(this.f16333a).c(cVar).f(this.f16334b).d(this.f16336d).b(this.f16335c).a(), jVar);
    }

    Y2.p d() {
        return this.f16333a;
    }
}
