package p115l4;

/* JADX INFO: loaded from: classes3.dex */
final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f50012a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private java.util.Queue f50013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f50014c;

    L() {
    }

    public final void a(p115l4.K k6) {
        synchronized (this.f50012a) {
            try {
                if (this.f50013b == null) {
                    this.f50013b = new java.util.ArrayDeque();
                }
                this.f50013b.add(k6);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void b(p115l4.AbstractC6931l abstractC6931l) {
        p115l4.K k6;
        synchronized (this.f50012a) {
            if (this.f50013b != null && !this.f50014c) {
                this.f50014c = true;
                while (true) {
                    synchronized (this.f50012a) {
                        try {
                            k6 = (p115l4.K) this.f50013b.poll();
                            if (k6 == null) {
                                this.f50014c = false;
                                return;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                    k6.c(abstractC6931l);
                }
            }
        }
    }
}
