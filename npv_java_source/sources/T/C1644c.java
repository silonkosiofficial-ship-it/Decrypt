package T;

/* JADX INFO: renamed from: T.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1644c implements T.u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h0.c.b f12804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0.c.b f12805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12806c;

    public C1644c(h0.c.b bVar, h0.c.b bVar2, int i6) {
        this.f12804a = bVar;
        this.f12805b = bVar2;
        this.f12806c = i6;
    }

    @Override // T.u.a
    public int a(Y0.r rVar, long j6, int i6, Y0.v vVar) {
        int iA = this.f12805b.a(0, rVar.k(), vVar);
        return rVar.g() + iA + (-this.f12804a.a(0, i6, vVar)) + (vVar == Y0.v.Ltr ? this.f12806c : -this.f12806c);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T.C1644c)) {
            return false;
        }
        T.C1644c c1644c = (T.C1644c) obj;
        return p247y7.AbstractC7350t.b(this.f12804a, c1644c.f12804a) && p247y7.AbstractC7350t.b(this.f12805b, c1644c.f12805b) && this.f12806c == c1644c.f12806c;
    }

    public int hashCode() {
        return (((this.f12804a.hashCode() * 31) + this.f12805b.hashCode()) * 31) + this.f12806c;
    }

    public java.lang.String toString() {
        return "Horizontal(menuAlignment=" + this.f12804a + ", anchorAlignment=" + this.f12805b + ", offset=" + this.f12806c + ')';
    }
}
