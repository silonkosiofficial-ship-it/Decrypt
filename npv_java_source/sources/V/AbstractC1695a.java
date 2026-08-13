package V;

/* JADX INFO: renamed from: V.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1695a implements V.InterfaceC1713g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f14822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.List f14823b = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.Object f14824c;

    public AbstractC1695a(java.lang.Object obj) {
        this.f14822a = obj;
        this.f14824c = obj;
    }

    @Override // V.InterfaceC1713g
    public java.lang.Object b() {
        return this.f14824c;
    }

    @Override // V.InterfaceC1713g
    public final void clear() {
        this.f14823b.clear();
        l(this.f14822a);
        k();
    }

    @Override // V.InterfaceC1713g
    public void d(java.lang.Object obj) {
        this.f14823b.add(b());
        l(obj);
    }

    @Override // V.InterfaceC1713g
    public /* synthetic */ void e() {
        V.AbstractC1710f.a(this);
    }

    @Override // V.InterfaceC1713g
    public void g() {
        if (!(!this.f14823b.isEmpty())) {
            V.I0.b("empty stack");
        }
        java.util.List list = this.f14823b;
        l(list.remove(list.size() - 1));
    }

    @Override // V.InterfaceC1713g
    public /* synthetic */ void i() {
        V.AbstractC1710f.b(this);
    }

    public final java.lang.Object j() {
        return this.f14822a;
    }

    protected abstract void k();

    protected void l(java.lang.Object obj) {
        this.f14824c = obj;
    }
}
