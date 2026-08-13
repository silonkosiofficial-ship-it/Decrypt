package H;

/* JADX INFO: loaded from: classes.dex */
final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Y0.v f3771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Y0.e f3772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private R0.AbstractC1494h.b f3773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private M0.P f3774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private java.lang.Object f3775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f3776f = a();

    public S(Y0.v vVar, Y0.e eVar, R0.AbstractC1494h.b bVar, M0.P p6, java.lang.Object obj) {
        this.f3771a = vVar;
        this.f3772b = eVar;
        this.f3773c = bVar;
        this.f3774d = p6;
        this.f3775e = obj;
    }

    private final long a() {
        return H.I.b(this.f3774d, this.f3772b, this.f3773c, null, 0, 24, null);
    }

    public final long b() {
        return this.f3776f;
    }

    public final void c(Y0.v vVar, Y0.e eVar, R0.AbstractC1494h.b bVar, M0.P p6, java.lang.Object obj) {
        if (vVar == this.f3771a && p247y7.AbstractC7350t.b(eVar, this.f3772b) && p247y7.AbstractC7350t.b(bVar, this.f3773c) && p247y7.AbstractC7350t.b(p6, this.f3774d) && p247y7.AbstractC7350t.b(obj, this.f3775e)) {
            return;
        }
        this.f3771a = vVar;
        this.f3772b = eVar;
        this.f3773c = bVar;
        this.f3774d = p6;
        this.f3775e = obj;
        this.f3776f = a();
    }
}
