package K0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f5938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.InterfaceC6663i f5939b;

    public a(java.lang.String str, p087i7.InterfaceC6663i interfaceC6663i) {
        this.f5938a = str;
        this.f5939b = interfaceC6663i;
    }

    public final p087i7.InterfaceC6663i a() {
        return this.f5939b;
    }

    public final java.lang.String b() {
        return this.f5938a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0.a)) {
            return false;
        }
        K0.a aVar = (K0.a) obj;
        return p247y7.AbstractC7350t.b(this.f5938a, aVar.f5938a) && p247y7.AbstractC7350t.b(this.f5939b, aVar.f5939b);
    }

    public int hashCode() {
        java.lang.String str = this.f5938a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        p087i7.InterfaceC6663i interfaceC6663i = this.f5939b;
        return iHashCode + (interfaceC6663i != null ? interfaceC6663i.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AccessibilityAction(label=" + this.f5938a + ", action=" + this.f5939b + ')';
    }
}
