package P4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends P4.c {

    private static final class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final java.util.concurrent.Future f8334C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final P4.a f8335D;

        a(java.util.concurrent.Future future, P4.a aVar) {
            this.f8334C = future;
            this.f8335D = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f8335D.a(P4.b.b(this.f8334C));
            } catch (java.lang.Error e6) {
                e = e6;
                this.f8335D.b(e);
            } catch (java.lang.RuntimeException e10) {
                e = e10;
                this.f8335D.b(e);
            } catch (java.util.concurrent.ExecutionException e11) {
                this.f8335D.b(e11.getCause());
            }
        }

        public java.lang.String toString() {
            return M4.d.a(this).c(this.f8335D).toString();
        }
    }

    public static void a(P4.d dVar, P4.a aVar, java.util.concurrent.Executor executor) {
        M4.h.i(aVar);
        dVar.e(new P4.b.a(dVar, aVar), executor);
    }

    public static java.lang.Object b(java.util.concurrent.Future future) {
        M4.h.p(future.isDone(), "Future was expected to be done: %s", future);
        return P4.e.a(future);
    }
}
