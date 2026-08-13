package H8;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements F8.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H8.j f4437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String[] f4438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f4439c;

    public i(H8.j jVar, java.lang.String... strArr) {
        p247y7.AbstractC7350t.f(jVar, "kind");
        p247y7.AbstractC7350t.f(strArr, "formatParams");
        this.f4437a = jVar;
        this.f4438b = strArr;
        java.lang.String strG = H8.b.ERROR_TYPE.g();
        java.lang.String strG2 = jVar.g();
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, strArr.length);
        java.lang.String str = java.lang.String.format(strG2, java.util.Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        p247y7.AbstractC7350t.e(str, "format(...)");
        java.lang.String str2 = java.lang.String.format(strG, java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        p247y7.AbstractC7350t.e(str2, "format(...)");
        this.f4439c = str2;
    }

    public final H8.j b() {
        return this.f4437a;
    }

    public final java.lang.String c(int i6) {
        return this.f4438b[i6];
    }

    @Override // F8.e0
    public L7.g t() {
        return L7.e.f6245h.a();
    }

    public java.lang.String toString() {
        return this.f4439c;
    }

    @Override // F8.e0
    public java.util.Collection u() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // F8.e0
    public F8.e0 v(G8.g gVar) {
        p247y7.AbstractC7350t.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // F8.e0
    public O7.InterfaceC1427h w() {
        return H8.k.f4528a.h();
    }

    @Override // F8.e0
    public java.util.List x() {
        return p097j7.AbstractC6879v.m();
    }

    @Override // F8.e0
    public boolean y() {
        return false;
    }
}
