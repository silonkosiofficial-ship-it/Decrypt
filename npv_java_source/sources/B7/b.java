package B7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements B7.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.Object f810a;

    public b(java.lang.Object obj) {
        this.f810a = obj;
    }

    @Override // B7.d, B7.c
    public java.lang.Object a(java.lang.Object obj, F7.k kVar) {
        p247y7.AbstractC7350t.f(kVar, "property");
        return this.f810a;
    }

    @Override // B7.d
    public void b(java.lang.Object obj, F7.k kVar, java.lang.Object obj2) {
        p247y7.AbstractC7350t.f(kVar, "property");
        java.lang.Object obj3 = this.f810a;
        if (d(kVar, obj3, obj2)) {
            this.f810a = obj2;
            c(kVar, obj3, obj2);
        }
    }

    protected void c(F7.k kVar, java.lang.Object obj, java.lang.Object obj2) {
        p247y7.AbstractC7350t.f(kVar, "property");
    }

    protected boolean d(F7.k kVar, java.lang.Object obj, java.lang.Object obj2) {
        p247y7.AbstractC7350t.f(kVar, "property");
        return true;
    }

    public java.lang.String toString() {
        return "ObservableProperty(value=" + this.f810a + ')';
    }
}
