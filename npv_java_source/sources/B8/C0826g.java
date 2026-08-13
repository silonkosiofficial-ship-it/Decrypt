package B8;

/* JADX INFO: renamed from: B8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0826g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p108k8.c f866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p088i8.c f867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p108k8.a f868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final O7.a0 f869d;

    public C0826g(p108k8.c cVar, p088i8.c cVar2, p108k8.a aVar, O7.a0 a0Var) {
        p247y7.AbstractC7350t.f(cVar, "nameResolver");
        p247y7.AbstractC7350t.f(cVar2, "classProto");
        p247y7.AbstractC7350t.f(aVar, "metadataVersion");
        p247y7.AbstractC7350t.f(a0Var, "sourceElement");
        this.f866a = cVar;
        this.f867b = cVar2;
        this.f868c = aVar;
        this.f869d = a0Var;
    }

    public final p108k8.c a() {
        return this.f866a;
    }

    public final p088i8.c b() {
        return this.f867b;
    }

    public final p108k8.a c() {
        return this.f868c;
    }

    public final O7.a0 d() {
        return this.f869d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B8.C0826g)) {
            return false;
        }
        B8.C0826g c0826g = (B8.C0826g) obj;
        return p247y7.AbstractC7350t.b(this.f866a, c0826g.f866a) && p247y7.AbstractC7350t.b(this.f867b, c0826g.f867b) && p247y7.AbstractC7350t.b(this.f868c, c0826g.f868c) && p247y7.AbstractC7350t.b(this.f869d, c0826g.f869d);
    }

    public int hashCode() {
        return (((((this.f866a.hashCode() * 31) + this.f867b.hashCode()) * 31) + this.f868c.hashCode()) * 31) + this.f869d.hashCode();
    }

    public java.lang.String toString() {
        return "ClassData(nameResolver=" + this.f866a + ", classProto=" + this.f867b + ", metadataVersion=" + this.f868c + ", sourceElement=" + this.f869d + ')';
    }
}
