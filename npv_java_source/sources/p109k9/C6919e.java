package p109k9;

/* JADX INFO: renamed from: k9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6919e implements p109k9.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p109k9.l f49842a;

    public C6919e(p109k9.l lVar) {
        p247y7.AbstractC7350t.f(lVar, "directive");
        this.f49842a = lVar;
    }

    @Override // p109k9.o
    public p119l9.e a() {
        return this.f49842a.a();
    }

    @Override // p109k9.o
    public p129m9.q b() {
        return this.f49842a.b();
    }

    public final p109k9.l c() {
        return this.f49842a;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p109k9.C6919e) && p247y7.AbstractC7350t.b(this.f49842a, ((p109k9.C6919e) obj).f49842a);
    }

    public int hashCode() {
        return this.f49842a.hashCode();
    }

    public java.lang.String toString() {
        return "BasicFormatStructure(" + this.f49842a + ')';
    }
}
