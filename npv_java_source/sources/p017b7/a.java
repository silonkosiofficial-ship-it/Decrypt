package p017b7;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F7.c f24180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F7.o f24181b;

    public a(F7.c cVar, F7.o oVar) {
        p247y7.AbstractC7350t.f(cVar, "type");
        this.f24180a = cVar;
        this.f24181b = oVar;
    }

    public final F7.c a() {
        return this.f24180a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p017b7.a)) {
            return false;
        }
        F7.o oVar = this.f24181b;
        if (oVar == null) {
            p017b7.a aVar = (p017b7.a) obj;
            if (aVar.f24181b == null) {
                return p247y7.AbstractC7350t.b(this.f24180a, aVar.f24180a);
            }
        }
        return p247y7.AbstractC7350t.b(oVar, ((p017b7.a) obj).f24181b);
    }

    public int hashCode() {
        F7.o oVar = this.f24181b;
        return oVar != null ? oVar.hashCode() : this.f24180a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TypeInfo(");
        java.lang.Object obj = this.f24181b;
        if (obj == null) {
            obj = this.f24180a;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
