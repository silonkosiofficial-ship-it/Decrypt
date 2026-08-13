package p060g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f45433a = new java.util.concurrent.CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile android.content.Context f45434b;

    public final void a(p060g.b bVar) {
        p247y7.AbstractC7350t.f(bVar, "listener");
        android.content.Context context = this.f45434b;
        if (context != null) {
            bVar.a(context);
        }
        this.f45433a.add(bVar);
    }

    public final void b() {
        this.f45434b = null;
    }

    public final void c(android.content.Context context) {
        p247y7.AbstractC7350t.f(context, "context");
        this.f45434b = context;
        java.util.Iterator it = this.f45433a.iterator();
        while (it.hasNext()) {
            ((p060g.b) it.next()).a(context);
        }
    }
}
