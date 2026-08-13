package M0;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M0.z f6541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M0.y f6542b;

    public A(M0.z zVar, M0.y yVar) {
        this.f6541a = zVar;
        this.f6542b = yVar;
    }

    public A(boolean z6) {
        this(null, new M0.y(z6));
    }

    public final M0.y a() {
        return this.f6542b;
    }

    public final M0.z b() {
        return this.f6541a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0.A)) {
            return false;
        }
        M0.A a6 = (M0.A) obj;
        return p247y7.AbstractC7350t.b(this.f6542b, a6.f6542b) && p247y7.AbstractC7350t.b(this.f6541a, a6.f6541a);
    }

    public int hashCode() {
        M0.z zVar = this.f6541a;
        int iHashCode = (zVar != null ? zVar.hashCode() : 0) * 31;
        M0.y yVar = this.f6542b;
        return iHashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f6541a + ", paragraphSyle=" + this.f6542b + ')';
    }
}
