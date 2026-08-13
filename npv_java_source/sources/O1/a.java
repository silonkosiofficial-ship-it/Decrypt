package O1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f7955a;

    public a(boolean z6) {
        this.f7955a = new java.util.concurrent.atomic.AtomicBoolean(z6);
    }

    public final boolean a() {
        return this.f7955a.get();
    }

    public final void b(boolean z6) {
        this.f7955a.set(z6);
    }
}
