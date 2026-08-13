package p136n5;

/* JADX INFO: loaded from: classes3.dex */
final class B extends p136n5.G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n5.G.a f51505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n5.G.c f51506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n5.G.b f51507c;

    B(n5.G.a aVar, n5.G.c cVar, n5.G.b bVar) {
        if (aVar == null) {
            throw new java.lang.NullPointerException("Null appData");
        }
        this.f51505a = aVar;
        if (cVar == null) {
            throw new java.lang.NullPointerException("Null osData");
        }
        this.f51506b = cVar;
        if (bVar == null) {
            throw new java.lang.NullPointerException("Null deviceData");
        }
        this.f51507c = bVar;
    }

    @Override // p136n5.G
    public n5.G.a a() {
        return this.f51505a;
    }

    @Override // p136n5.G
    public n5.G.b c() {
        return this.f51507c;
    }

    @Override // p136n5.G
    public n5.G.c d() {
        return this.f51506b;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p136n5.G)) {
            return false;
        }
        p136n5.G g6 = (p136n5.G) obj;
        return this.f51505a.equals(g6.a()) && this.f51506b.equals(g6.d()) && this.f51507c.equals(g6.c());
    }

    public int hashCode() {
        return ((((this.f51505a.hashCode() ^ 1000003) * 1000003) ^ this.f51506b.hashCode()) * 1000003) ^ this.f51507c.hashCode();
    }

    public java.lang.String toString() {
        return "StaticSessionData{appData=" + this.f51505a + ", osData=" + this.f51506b + ", deviceData=" + this.f51507c + "}";
    }
}
