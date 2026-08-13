package p116l5;

/* JADX INFO: loaded from: classes3.dex */
public class e implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f50057C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.lang.Object f50058D = new java.lang.Object();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private p115l4.AbstractC6931l f50059E = p115l4.AbstractC6934o.e(null);

    e(java.util.concurrent.ExecutorService executorService) {
        this.f50057C = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p115l4.AbstractC6931l e(java.lang.Runnable runnable, p115l4.AbstractC6931l abstractC6931l) {
        runnable.run();
        return p115l4.AbstractC6934o.e(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p115l4.AbstractC6931l f(java.util.concurrent.Callable callable, p115l4.AbstractC6931l abstractC6931l) {
        return (p115l4.AbstractC6931l) callable.call();
    }

    public java.util.concurrent.ExecutorService d() {
        return this.f50057C;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f50057C.execute(runnable);
    }

    public p115l4.AbstractC6931l g(final java.lang.Runnable runnable) {
        p115l4.AbstractC6931l abstractC6931lI;
        synchronized (this.f50058D) {
            abstractC6931lI = this.f50059E.i(this.f50057C, new p115l4.InterfaceC6922c() { // from class: l5.d
                @Override // p115l4.InterfaceC6922c
                public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                    return p116l5.e.e(runnable, abstractC6931l);
                }
            });
            this.f50059E = abstractC6931lI;
        }
        return abstractC6931lI;
    }

    public p115l4.AbstractC6931l h(final java.util.concurrent.Callable callable) {
        p115l4.AbstractC6931l abstractC6931lI;
        synchronized (this.f50058D) {
            abstractC6931lI = this.f50059E.i(this.f50057C, new p115l4.InterfaceC6922c() { // from class: l5.c
                @Override // p115l4.InterfaceC6922c
                public final java.lang.Object a(p115l4.AbstractC6931l abstractC6931l) {
                    return p116l5.e.f(callable, abstractC6931l);
                }
            });
            this.f50059E = abstractC6931lI;
        }
        return abstractC6931lI;
    }
}
