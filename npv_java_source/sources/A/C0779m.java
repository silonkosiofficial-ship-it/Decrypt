package A;

/* JADX INFO: renamed from: A.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0779m implements E0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p237x7.l f128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private A.S f129c;

    public C0779m(p237x7.l lVar) {
        this.f128b = lVar;
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar) {
        return p071h0.f.a(this, dVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ java.lang.Object c(java.lang.Object obj, p237x7.p pVar) {
        return p071h0.g.b(this, obj, pVar);
    }

    @Override // androidx.compose.ui.d
    public /* synthetic */ boolean d(p237x7.l lVar) {
        return p071h0.g.a(this, lVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A.C0779m) && ((A.C0779m) obj).f128b == this.f128b;
    }

    @Override // E0.d
    public void h(E0.l lVar) {
        A.S s6 = (A.S) lVar.D0(A.V.a());
        if (p247y7.AbstractC7350t.b(s6, this.f129c)) {
            return;
        }
        this.f129c = s6;
        this.f128b.l(s6);
    }

    public int hashCode() {
        return this.f128b.hashCode();
    }
}
