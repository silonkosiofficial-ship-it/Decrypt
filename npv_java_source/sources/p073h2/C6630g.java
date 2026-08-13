package p073h2;

/* JADX INFO: renamed from: h2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6630g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p073h2.r f46139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p073h2.r f46140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p073h2.r f46141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p073h2.C6641s f46142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p073h2.C6641s f46143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f46144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f46145g;

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    public C6630g(p073h2.r rVar, p073h2.r rVar2, p073h2.r rVar3, p073h2.C6641s c6641s, p073h2.C6641s c6641s2) {
        boolean z6;
        boolean z10;
        p247y7.AbstractC7350t.f(rVar, "refresh");
        p247y7.AbstractC7350t.f(rVar2, "prepend");
        p247y7.AbstractC7350t.f(rVar3, "append");
        p247y7.AbstractC7350t.f(c6641s, "source");
        this.f46139a = rVar;
        this.f46140b = rVar2;
        this.f46141c = rVar3;
        this.f46142d = c6641s;
        this.f46143e = c6641s2;
        if (c6641s.h()) {
            if (c6641s2 != null ? c6641s2.h() : true) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        this.f46144f = z6;
        if (!c6641s.g()) {
            z10 = c6641s2 != null ? c6641s2.g() : false;
        }
        this.f46145g = z10;
    }

    public /* synthetic */ C6630g(p073h2.r rVar, p073h2.r rVar2, p073h2.r rVar3, p073h2.C6641s c6641s, p073h2.C6641s c6641s2, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(rVar, rVar2, rVar3, c6641s, (i6 & 16) != 0 ? null : c6641s2);
    }

    public final p073h2.r a() {
        return this.f46141c;
    }

    public final p073h2.C6641s b() {
        return this.f46143e;
    }

    public final p073h2.r c() {
        return this.f46140b;
    }

    public final p073h2.r d() {
        return this.f46139a;
    }

    public final p073h2.C6641s e() {
        return this.f46142d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p073h2.C6630g.class != obj.getClass()) {
            return false;
        }
        p073h2.C6630g c6630g = (p073h2.C6630g) obj;
        return p247y7.AbstractC7350t.b(this.f46139a, c6630g.f46139a) && p247y7.AbstractC7350t.b(this.f46140b, c6630g.f46140b) && p247y7.AbstractC7350t.b(this.f46141c, c6630g.f46141c) && p247y7.AbstractC7350t.b(this.f46142d, c6630g.f46142d) && p247y7.AbstractC7350t.b(this.f46143e, c6630g.f46143e);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f46139a.hashCode() * 31) + this.f46140b.hashCode()) * 31) + this.f46141c.hashCode()) * 31) + this.f46142d.hashCode()) * 31;
        p073h2.C6641s c6641s = this.f46143e;
        return iHashCode + (c6641s != null ? c6641s.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CombinedLoadStates(refresh=" + this.f46139a + ", prepend=" + this.f46140b + ", append=" + this.f46141c + ", source=" + this.f46142d + ", mediator=" + this.f46143e + ')';
    }
}
