package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f8754a;

    public b(boolean z6) {
        this.f8754a = new java.util.concurrent.atomic.AtomicBoolean(z6);
    }

    public final boolean a() {
        return this.f8754a.get();
    }

    public final void b(boolean z6) {
        this.f8754a.set(z6);
    }
}
