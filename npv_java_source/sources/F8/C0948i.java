package F8;

/* JADX INFO: renamed from: F8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0948i extends F8.Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P7.g f2938a;

    public C0948i(P7.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "annotations");
        this.f2938a = gVar;
    }

    @Override // F8.Y
    public F7.c b() {
        return p247y7.P.b(F8.C0948i.class);
    }

    @Override // F8.Y
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public F8.C0948i a(F8.C0948i c0948i) {
        return c0948i == null ? this : new F8.C0948i(P7.i.a(this.f2938a, c0948i.f2938a));
    }

    public final P7.g e() {
        return this.f2938a;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof F8.C0948i) {
            return p247y7.AbstractC7350t.b(((F8.C0948i) obj).f2938a, this.f2938a);
        }
        return false;
    }

    @Override // F8.Y
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public F8.C0948i c(F8.C0948i c0948i) {
        if (p247y7.AbstractC7350t.b(c0948i, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f2938a.hashCode();
    }
}
