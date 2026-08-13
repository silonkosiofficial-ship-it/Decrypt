package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements java.io.Serializable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.Object f46749C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f46750D;

    public u(java.lang.Object obj, java.lang.Object obj2) {
        this.f46749C = obj;
        this.f46750D = obj2;
    }

    public final java.lang.Object a() {
        return this.f46749C;
    }

    public final java.lang.Object b() {
        return this.f46750D;
    }

    public final java.lang.Object c() {
        return this.f46749C;
    }

    public final java.lang.Object d() {
        return this.f46750D;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p087i7.u)) {
            return false;
        }
        p087i7.u uVar = (p087i7.u) obj;
        return p247y7.AbstractC7350t.b(this.f46749C, uVar.f46749C) && p247y7.AbstractC7350t.b(this.f46750D, uVar.f46750D);
    }

    public int hashCode() {
        java.lang.Object obj = this.f46749C;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f46750D;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return '(' + this.f46749C + ", " + this.f46750D + ')';
    }
}
