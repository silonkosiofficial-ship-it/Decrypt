package C;

/* JADX INFO: renamed from: C.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0830d implements C.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.p f1064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1065b = Y0.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C.G f1067d;

    public C0830d(p237x7.p pVar) {
        this.f1064a = pVar;
    }

    @Override // C.H
    public C.G a(Y0.e eVar, long j6) {
        if (this.f1067d != null && Y0.C1859b.f(this.f1065b, j6) && this.f1066c == eVar.getDensity()) {
            C.G g6 = this.f1067d;
            p247y7.AbstractC7350t.c(g6);
            return g6;
        }
        this.f1065b = j6;
        this.f1066c = eVar.getDensity();
        C.G g10 = (C.G) this.f1064a.u(eVar, Y0.C1859b.a(j6));
        this.f1067d = g10;
        return g10;
    }
}
