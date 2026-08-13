package V;

/* JADX INFO: loaded from: classes.dex */
public final class I1 implements V.M1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f14687a;

    public I1(java.lang.Object obj) {
        this.f14687a = obj;
    }

    @Override // V.M1
    public java.lang.Object a(V.H0 h6) {
        return this.f14687a;
    }

    public final java.lang.Object b() {
        return this.f14687a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V.I1) && p247y7.AbstractC7350t.b(this.f14687a, ((V.I1) obj).f14687a);
    }

    public int hashCode() {
        java.lang.Object obj = this.f14687a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String toString() {
        return "StaticValueHolder(value=" + this.f14687a + ')';
    }
}
