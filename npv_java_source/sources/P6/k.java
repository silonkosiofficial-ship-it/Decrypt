package P6;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f8341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Object f8342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T6.InterfaceC1668p f8343c;

    public k(java.lang.String str, java.lang.Object obj, T6.InterfaceC1668p interfaceC1668p) {
        p247y7.AbstractC7350t.f(str, "key");
        p247y7.AbstractC7350t.f(obj, "value");
        p247y7.AbstractC7350t.f(interfaceC1668p, "headers");
        this.f8341a = str;
        this.f8342b = obj;
        this.f8343c = interfaceC1668p;
    }

    public final java.lang.String a() {
        return this.f8341a;
    }

    public final java.lang.Object b() {
        return this.f8342b;
    }

    public final T6.InterfaceC1668p c() {
        return this.f8343c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P6.k)) {
            return false;
        }
        P6.k kVar = (P6.k) obj;
        return p247y7.AbstractC7350t.b(this.f8341a, kVar.f8341a) && p247y7.AbstractC7350t.b(this.f8342b, kVar.f8342b) && p247y7.AbstractC7350t.b(this.f8343c, kVar.f8343c);
    }

    public int hashCode() {
        return (((this.f8341a.hashCode() * 31) + this.f8342b.hashCode()) * 31) + this.f8343c.hashCode();
    }

    public java.lang.String toString() {
        return "FormPart(key=" + this.f8341a + ", value=" + this.f8342b + ", headers=" + this.f8343c + ')';
    }
}
