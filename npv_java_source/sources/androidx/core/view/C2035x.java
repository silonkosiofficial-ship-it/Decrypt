package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2035x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Runnable f21774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f21775b = new java.util.concurrent.CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f21776c = new java.util.HashMap();

    public C2035x(java.lang.Runnable runnable) {
        this.f21774a = runnable;
    }

    public void a(androidx.core.view.InterfaceC2039z interfaceC2039z) {
        this.f21775b.add(interfaceC2039z);
        this.f21774a.run();
    }

    public void b(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        java.util.Iterator it = this.f21775b.iterator();
        while (it.hasNext()) {
            ((androidx.core.view.InterfaceC2039z) it.next()).c(menu, menuInflater);
        }
    }

    public void c(android.view.Menu menu) {
        java.util.Iterator it = this.f21775b.iterator();
        while (it.hasNext()) {
            ((androidx.core.view.InterfaceC2039z) it.next()).b(menu);
        }
    }

    public boolean d(android.view.MenuItem menuItem) {
        java.util.Iterator it = this.f21775b.iterator();
        while (it.hasNext()) {
            if (((androidx.core.view.InterfaceC2039z) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(android.view.Menu menu) {
        java.util.Iterator it = this.f21775b.iterator();
        while (it.hasNext()) {
            ((androidx.core.view.InterfaceC2039z) it.next()).d(menu);
        }
    }

    public void f(androidx.core.view.InterfaceC2039z interfaceC2039z) {
        this.f21775b.remove(interfaceC2039z);
        androidx.appcompat.app.D.a(this.f21776c.remove(interfaceC2039z));
        this.f21774a.run();
    }
}
