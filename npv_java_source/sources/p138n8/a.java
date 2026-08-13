package p138n8;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p138n8.a.C0671a f51938e = new p138n8.a.C0671a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p138n8.f f51939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p138n8.c f51940g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p138n8.c f51941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p138n8.c f51942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p138n8.f f51943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p138n8.c f51944d;

    /* JADX INFO: renamed from: n8.a$a, reason: collision with other inner class name */
    public static final class C0671a {
        private C0671a() {
        }

        public /* synthetic */ C0671a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    static {
        p138n8.f fVar = p138n8.h.f51975l;
        f51939f = fVar;
        p138n8.c cVarK = p138n8.c.k(fVar);
        p247y7.AbstractC7350t.e(cVarK, "topLevel(...)");
        f51940g = cVarK;
    }

    public a(p138n8.c cVar, p138n8.c cVar2, p138n8.f fVar, p138n8.c cVar3) {
        p247y7.AbstractC7350t.f(cVar, "packageName");
        p247y7.AbstractC7350t.f(fVar, "callableName");
        this.f51941a = cVar;
        this.f51942b = cVar2;
        this.f51943c = fVar;
        this.f51944d = cVar3;
    }

    public /* synthetic */ a(p138n8.c cVar, p138n8.c cVar2, p138n8.f fVar, p138n8.c cVar3, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(cVar, cVar2, fVar, (i6 & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(p138n8.c cVar, p138n8.f fVar) {
        this(cVar, null, fVar, null, 8, null);
        p247y7.AbstractC7350t.f(cVar, "packageName");
        p247y7.AbstractC7350t.f(fVar, "callableName");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p138n8.a)) {
            return false;
        }
        p138n8.a aVar = (p138n8.a) obj;
        return p247y7.AbstractC7350t.b(this.f51941a, aVar.f51941a) && p247y7.AbstractC7350t.b(this.f51942b, aVar.f51942b) && p247y7.AbstractC7350t.b(this.f51943c, aVar.f51943c) && p247y7.AbstractC7350t.b(this.f51944d, aVar.f51944d);
    }

    public int hashCode() {
        int iHashCode = this.f51941a.hashCode() * 31;
        p138n8.c cVar = this.f51942b;
        int iHashCode2 = (((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f51943c.hashCode()) * 31;
        p138n8.c cVar2 = this.f51944d;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strB = this.f51941a.b();
        p247y7.AbstractC7350t.e(strB, "asString(...)");
        sb.append(S8.r.Q(strB, '.', '/', false, 4, null));
        sb.append("/");
        p138n8.c cVar = this.f51942b;
        if (cVar != null) {
            sb.append(cVar);
            sb.append(".");
        }
        sb.append(this.f51943c);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
