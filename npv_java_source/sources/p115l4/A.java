package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class A implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ p115l4.B f49988C;

    A(p115l4.B b6) {
        this.f49988C = b6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f49988C.f49990b) {
            try {
                p115l4.B b6 = this.f49988C;
                if (b6.f49991c != null) {
                    b6.f49991c.b();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
