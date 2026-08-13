package A;

/* JADX INFO: renamed from: A.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0767a implements A.S {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f77c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final V.InterfaceC1753w0 f78d = V.A1.d(androidx.core.graphics.f.f21549e, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final V.InterfaceC1753w0 f79e = V.A1.d(java.lang.Boolean.TRUE, null, 2, null);

    public C0767a(int i6, java.lang.String str) {
        this.f76b = i6;
        this.f77c = str;
    }

    private final void g(boolean z6) {
        this.f79e.setValue(java.lang.Boolean.valueOf(z6));
    }

    @Override // A.S
    public int a(Y0.e eVar, Y0.v vVar) {
        return e().f21552c;
    }

    @Override // A.S
    public int b(Y0.e eVar) {
        return e().f21553d;
    }

    @Override // A.S
    public int c(Y0.e eVar) {
        return e().f21551b;
    }

    @Override // A.S
    public int d(Y0.e eVar, Y0.v vVar) {
        return e().f21550a;
    }

    public final androidx.core.graphics.f e() {
        return (androidx.core.graphics.f) this.f78d.getValue();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A.C0767a) && this.f76b == ((A.C0767a) obj).f76b;
    }

    public final void f(androidx.core.graphics.f fVar) {
        this.f78d.setValue(fVar);
    }

    public final void h(androidx.core.view.C2038y0 c2038y0, int i6) {
        if (i6 == 0 || (i6 & this.f76b) != 0) {
            f(c2038y0.f(this.f76b));
            g(c2038y0.p(this.f76b));
        }
    }

    public int hashCode() {
        return this.f76b;
    }

    public java.lang.String toString() {
        return this.f77c + '(' + e().f21550a + ", " + e().f21551b + ", " + e().f21552c + ", " + e().f21553d + ')';
    }
}
