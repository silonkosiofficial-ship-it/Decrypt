package p247y7;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements p247y7.InterfaceC7339h {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Class f57247C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.String f57248D;

    public C(java.lang.Class cls, java.lang.String str) {
        p247y7.AbstractC7350t.f(cls, "jClass");
        p247y7.AbstractC7350t.f(str, "moduleName");
        this.f57247C = cls;
        this.f57248D = str;
    }

    @Override // p247y7.InterfaceC7339h
    public java.lang.Class e() {
        return this.f57247C;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p247y7.C) && p247y7.AbstractC7350t.b(e(), ((p247y7.C) obj).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    public java.lang.String toString() {
        return e() + " (Kotlin reflection is not available)";
    }
}
