package aa;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aa.i f17310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aa.l f17311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aa.C f17312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aa.EnumC1889c f17313d;

    public n(aa.i iVar, aa.l lVar, aa.C c6, aa.EnumC1889c enumC1889c) {
        p247y7.AbstractC7350t.f(iVar, "language");
        p247y7.AbstractC7350t.f(lVar, "region");
        p247y7.AbstractC7350t.f(c6, "theme");
        p247y7.AbstractC7350t.f(enumC1889c, "density");
        this.f17310a = iVar;
        this.f17311b = lVar;
        this.f17312c = c6;
        this.f17313d = enumC1889c;
    }

    public final aa.EnumC1889c a() {
        return this.f17313d;
    }

    public final aa.i b() {
        return this.f17310a;
    }

    public final aa.l c() {
        return this.f17311b;
    }

    public final aa.C d() {
        return this.f17312c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aa.n.class != obj.getClass()) {
            return false;
        }
        aa.n nVar = (aa.n) obj;
        return p247y7.AbstractC7350t.b(this.f17310a, nVar.f17310a) && p247y7.AbstractC7350t.b(this.f17311b, nVar.f17311b) && this.f17312c == nVar.f17312c && this.f17313d == nVar.f17313d;
    }

    public int hashCode() {
        return (((((this.f17310a.hashCode() * 31) + this.f17311b.hashCode()) * 31) + this.f17312c.hashCode()) * 31) + this.f17313d.hashCode();
    }
}
