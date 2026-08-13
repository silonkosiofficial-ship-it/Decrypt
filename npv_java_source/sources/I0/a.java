package I0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.HashMap f4934a = new java.util.HashMap();

    public final void a() {
        this.f4934a.clear();
    }

    public final void b(int i6) {
        java.util.Iterator it = this.f4934a.entrySet().iterator();
        while (it.hasNext()) {
            androidx.appcompat.app.D.a(((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get());
            it.remove();
        }
    }
}
