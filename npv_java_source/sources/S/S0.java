package S;

/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G.a f10231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G.a f10232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G.a f10233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final G.a f10234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G.a f10235e;

    public S0(G.a aVar, G.a aVar2, G.a aVar3, G.a aVar4, G.a aVar5) {
        this.f10231a = aVar;
        this.f10232b = aVar2;
        this.f10233c = aVar3;
        this.f10234d = aVar4;
        this.f10235e = aVar5;
    }

    public /* synthetic */ S0(G.a aVar, G.a aVar2, G.a aVar3, G.a aVar4, G.a aVar5, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? S.R0.f10221a.b() : aVar, (i6 & 2) != 0 ? S.R0.f10221a.e() : aVar2, (i6 & 4) != 0 ? S.R0.f10221a.d() : aVar3, (i6 & 8) != 0 ? S.R0.f10221a.c() : aVar4, (i6 & 16) != 0 ? S.R0.f10221a.a() : aVar5);
    }

    public final G.a a() {
        return this.f10235e;
    }

    public final G.a b() {
        return this.f10231a;
    }

    public final G.a c() {
        return this.f10234d;
    }

    public final G.a d() {
        return this.f10233c;
    }

    public final G.a e() {
        return this.f10232b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S.S0)) {
            return false;
        }
        S.S0 s6 = (S.S0) obj;
        return p247y7.AbstractC7350t.b(this.f10231a, s6.f10231a) && p247y7.AbstractC7350t.b(this.f10232b, s6.f10232b) && p247y7.AbstractC7350t.b(this.f10233c, s6.f10233c) && p247y7.AbstractC7350t.b(this.f10234d, s6.f10234d) && p247y7.AbstractC7350t.b(this.f10235e, s6.f10235e);
    }

    public int hashCode() {
        return (((((((this.f10231a.hashCode() * 31) + this.f10232b.hashCode()) * 31) + this.f10233c.hashCode()) * 31) + this.f10234d.hashCode()) * 31) + this.f10235e.hashCode();
    }

    public java.lang.String toString() {
        return "Shapes(extraSmall=" + this.f10231a + ", small=" + this.f10232b + ", medium=" + this.f10233c + ", large=" + this.f10234d + ", extraLarge=" + this.f10235e + ')';
    }
}
