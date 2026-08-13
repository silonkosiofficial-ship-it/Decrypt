package R0;

/* JADX INFO: renamed from: R0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1488b implements R0.y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f9292b;

    public C1488b(int i6) {
        this.f9292b = i6;
    }

    @Override // R0.y
    public /* synthetic */ R0.AbstractC1494h a(R0.AbstractC1494h abstractC1494h) {
        return R0.x.a(this, abstractC1494h);
    }

    @Override // R0.y
    public /* synthetic */ int b(int i6) {
        return R0.x.b(this, i6);
    }

    @Override // R0.y
    public R0.q c(R0.q qVar) {
        int i6 = this.f9292b;
        return (i6 == 0 || i6 == Integer.MAX_VALUE) ? qVar : new R0.q(E7.j.k(qVar.q() + this.f9292b, 1, 1000));
    }

    @Override // R0.y
    public /* synthetic */ int d(int i6) {
        return R0.x.c(this, i6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof R0.C1488b) && this.f9292b == ((R0.C1488b) obj).f9292b;
    }

    public int hashCode() {
        return this.f9292b;
    }

    public java.lang.String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f9292b + ')';
    }
}
