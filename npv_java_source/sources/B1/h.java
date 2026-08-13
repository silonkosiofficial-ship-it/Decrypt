package B1;

/* JADX INFO: loaded from: classes.dex */
public class h extends B1.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.Object f514c;

    public h(int i6) {
        super(i6);
        this.f514c = new java.lang.Object();
    }

    @Override // B1.g, B1.f
    public boolean a(java.lang.Object obj) {
        boolean zA;
        p247y7.AbstractC7350t.f(obj, "instance");
        synchronized (this.f514c) {
            zA = super.a(obj);
        }
        return zA;
    }

    @Override // B1.g, B1.f
    public java.lang.Object b() {
        java.lang.Object objB;
        synchronized (this.f514c) {
            objB = super.b();
        }
        return objB;
    }
}
