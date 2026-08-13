package A;

/* JADX INFO: renamed from: A.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0774h implements A.InterfaceC0773g, A.InterfaceC0771e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y0.e f115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ androidx.compose.foundation.layout.f f117c;

    private C0774h(Y0.e eVar, long j6) {
        this.f115a = eVar;
        this.f116b = j6;
        this.f117c = androidx.compose.foundation.layout.f.f19260a;
    }

    public /* synthetic */ C0774h(Y0.e eVar, long j6, p247y7.AbstractC7342k abstractC7342k) {
        this(eVar, j6);
    }

    @Override // A.InterfaceC0771e
    public androidx.compose.ui.d a(androidx.compose.ui.d dVar) {
        return this.f117c.a(dVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A.C0774h)) {
            return false;
        }
        A.C0774h c0774h = (A.C0774h) obj;
        return p247y7.AbstractC7350t.b(this.f115a, c0774h.f115a) && Y0.C1859b.f(this.f116b, c0774h.f116b);
    }

    public int hashCode() {
        return (this.f115a.hashCode() * 31) + Y0.C1859b.o(this.f116b);
    }

    public java.lang.String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f115a + ", constraints=" + ((java.lang.Object) Y0.C1859b.q(this.f116b)) + ')';
    }
}
