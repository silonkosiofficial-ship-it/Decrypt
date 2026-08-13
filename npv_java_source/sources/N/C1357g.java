package N;

/* JADX INFO: renamed from: N.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1357g implements androidx.compose.ui.window.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p071h0.c f7424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N.InterfaceC1359i f7425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7426c = p131n0.g.f51312b.c();

    public C1357g(p071h0.c cVar, N.InterfaceC1359i interfaceC1359i) {
        this.f7424a = cVar;
        this.f7425b = interfaceC1359i;
    }

    @Override // androidx.compose.ui.window.r
    public long a(Y0.r rVar, long j6, Y0.v vVar, long j10) {
        long jA = this.f7425b.a();
        if (!p131n0.h.c(jA)) {
            jA = this.f7426c;
        }
        this.f7426c = jA;
        return Y0.p.l(Y0.p.l(rVar.j(), Y0.q.d(jA)), this.f7424a.a(j10, Y0.t.f16230b.a(), vVar));
    }
}
