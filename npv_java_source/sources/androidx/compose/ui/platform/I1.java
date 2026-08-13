package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final class I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X.b f19868a = new X.b(new java.lang.ref.Reference[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.ref.ReferenceQueue f19869b = new java.lang.ref.ReferenceQueue();

    private final void a() {
        java.lang.ref.Reference referencePoll;
        do {
            referencePoll = this.f19869b.poll();
            if (referencePoll != null) {
                this.f19868a.A(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final java.lang.Object b() {
        a();
        while (this.f19868a.x()) {
            X.b bVar = this.f19868a;
            java.lang.Object obj = ((java.lang.ref.Reference) bVar.D(bVar.t() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public final void c(java.lang.Object obj) {
        a();
        this.f19868a.d(new java.lang.ref.WeakReference(obj, this.f19869b));
    }
}
