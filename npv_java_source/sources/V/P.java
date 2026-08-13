package V;

/* JADX INFO: loaded from: classes.dex */
public final class P implements V.M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1753w0 f14697a;

    public P(V.InterfaceC1753w0 interfaceC1753w0) {
        this.f14697a = interfaceC1753w0;
    }

    @Override // V.M1
    public java.lang.Object a(V.H0 h6) {
        return this.f14697a.getValue();
    }

    public final V.InterfaceC1753w0 b() {
        return this.f14697a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V.P) && p247y7.AbstractC7350t.b(this.f14697a, ((V.P) obj).f14697a);
    }

    public int hashCode() {
        return this.f14697a.hashCode();
    }

    public java.lang.String toString() {
        return "DynamicValueHolder(state=" + this.f14697a + ')';
    }
}
