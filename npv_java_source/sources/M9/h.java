package M9;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Set f7268a = new java.util.LinkedHashSet();

    public final synchronized void a(H9.D d6) {
        p247y7.AbstractC7350t.f(d6, "route");
        this.f7268a.remove(d6);
    }

    public final synchronized void b(H9.D d6) {
        p247y7.AbstractC7350t.f(d6, "failedRoute");
        this.f7268a.add(d6);
    }

    public final synchronized boolean c(H9.D d6) {
        p247y7.AbstractC7350t.f(d6, "route");
        return this.f7268a.contains(d6);
    }
}
