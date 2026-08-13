package K4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p115l4.C6932m f6131C;

    y() {
        this.f6131C = null;
    }

    public y(p115l4.C6932m c6932m) {
        this.f6131C = c6932m;
    }

    public void a(java.lang.Exception exc) {
        p115l4.C6932m c6932m = this.f6131C;
        if (c6932m != null) {
            c6932m.d(exc);
        }
    }

    protected abstract void b();

    final p115l4.C6932m c() {
        return this.f6131C;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (java.lang.Exception e6) {
            a(e6);
        }
    }
}
