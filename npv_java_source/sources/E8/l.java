package E8;

/* JADX INFO: loaded from: classes2.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f2300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.Thread f2301b = java.lang.Thread.currentThread();

    l(java.lang.Object obj) {
        this.f2300a = obj;
    }

    public java.lang.Object a() {
        if (b()) {
            return this.f2300a;
        }
        throw new java.lang.IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f2301b == java.lang.Thread.currentThread();
    }
}
