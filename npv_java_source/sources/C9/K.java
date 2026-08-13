package C9;

/* JADX INFO: loaded from: classes2.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D9.c f1399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f1400b;

    public K(D9.c cVar, java.util.Map map) {
        p247y7.AbstractC7350t.f(cVar, "route");
        p247y7.AbstractC7350t.f(map, "pathMap");
        this.f1399a = cVar;
        this.f1400b = map;
    }

    public /* synthetic */ K(D9.c cVar, java.util.Map map, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(cVar, (i6 & 2) != 0 ? p097j7.S.h() : map);
    }

    public final java.util.Map a() {
        return this.f1400b;
    }

    public final D9.c b() {
        return this.f1399a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9.K)) {
            return false;
        }
        C9.K k6 = (C9.K) obj;
        return p247y7.AbstractC7350t.b(this.f1399a, k6.f1399a) && p247y7.AbstractC7350t.b(this.f1400b, k6.f1400b);
    }

    public int hashCode() {
        return (this.f1399a.hashCode() * 31) + this.f1400b.hashCode();
    }

    public java.lang.String toString() {
        return "RouteMatchResult(route=" + this.f1399a + ", pathMap=" + this.f1400b + ")";
    }
}
