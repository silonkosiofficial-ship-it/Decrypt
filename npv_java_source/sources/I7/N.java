package I7;

/* JADX INFO: loaded from: classes2.dex */
final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.ref.WeakReference f5339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.ClassLoader f5341c;

    public N(java.lang.ClassLoader classLoader) {
        p247y7.AbstractC7350t.f(classLoader, "classLoader");
        this.f5339a = new java.lang.ref.WeakReference(classLoader);
        this.f5340b = java.lang.System.identityHashCode(classLoader);
        this.f5341c = classLoader;
    }

    public final void a(java.lang.ClassLoader classLoader) {
        this.f5341c = classLoader;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof I7.N) && this.f5339a.get() == ((I7.N) obj).f5339a.get();
    }

    public int hashCode() {
        return this.f5340b;
    }

    public java.lang.String toString() {
        java.lang.String string;
        java.lang.ClassLoader classLoader = (java.lang.ClassLoader) this.f5339a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
