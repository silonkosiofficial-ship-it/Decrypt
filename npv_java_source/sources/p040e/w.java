package p040e;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f44438b = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p237x7.a f44439c;

    public w(boolean z6) {
        this.f44437a = z6;
    }

    public final void a(p040e.InterfaceC6526c interfaceC6526c) {
        p247y7.AbstractC7350t.f(interfaceC6526c, "cancellable");
        this.f44438b.add(interfaceC6526c);
    }

    public final p237x7.a b() {
        return this.f44439c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(p040e.C6525b c6525b) {
        p247y7.AbstractC7350t.f(c6525b, "backEvent");
    }

    public void f(p040e.C6525b c6525b) {
        p247y7.AbstractC7350t.f(c6525b, "backEvent");
    }

    public final boolean g() {
        return this.f44437a;
    }

    public final void h() {
        java.util.Iterator it = this.f44438b.iterator();
        while (it.hasNext()) {
            ((p040e.InterfaceC6526c) it.next()).cancel();
        }
    }

    public final void i(p040e.InterfaceC6526c interfaceC6526c) {
        p247y7.AbstractC7350t.f(interfaceC6526c, "cancellable");
        this.f44438b.remove(interfaceC6526c);
    }

    public final void j(boolean z6) {
        this.f44437a = z6;
        p237x7.a aVar = this.f44439c;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void k(p237x7.a aVar) {
        this.f44439c = aVar;
    }
}
