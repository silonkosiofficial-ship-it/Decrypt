package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        java.lang.Object f20726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.concurrent.futures.c.d f20727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f20728c = androidx.concurrent.futures.d.D();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f20729d;

        a() {
        }

        private void d() {
            this.f20726a = null;
            this.f20727b = null;
            this.f20728c = null;
        }

        void a() {
            this.f20726a = null;
            this.f20727b = null;
            this.f20728c.z(null);
        }

        public boolean b(java.lang.Object obj) {
            this.f20729d = true;
            androidx.concurrent.futures.c.d dVar = this.f20727b;
            boolean z6 = dVar != null && dVar.b(obj);
            if (z6) {
                d();
            }
            return z6;
        }

        public boolean c() {
            this.f20729d = true;
            androidx.concurrent.futures.c.d dVar = this.f20727b;
            boolean z6 = dVar != null && dVar.a(true);
            if (z6) {
                d();
            }
            return z6;
        }

        public boolean e(java.lang.Throwable th) {
            this.f20729d = true;
            androidx.concurrent.futures.c.d dVar = this.f20727b;
            boolean z6 = dVar != null && dVar.c(th);
            if (z6) {
                d();
            }
            return z6;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            androidx.concurrent.futures.c.d dVar2 = this.f20727b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new androidx.concurrent.futures.c.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f20726a));
            }
            if (this.f20729d || (dVar = this.f20728c) == null) {
                return;
            }
            dVar.z(null);
        }
    }

    static final class b extends java.lang.Throwable {
        b(java.lang.String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0397c {
        java.lang.Object a(androidx.concurrent.futures.c.a aVar);
    }

    private static final class d implements P4.d {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final java.lang.ref.WeakReference f20730C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final androidx.concurrent.futures.a f20731D = new androidx.concurrent.futures.c.d.a();

        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected java.lang.String w() {
                androidx.concurrent.futures.c.a aVar = (androidx.concurrent.futures.c.a) androidx.concurrent.futures.c.d.this.f20730C.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f20726a + "]";
            }
        }

        d(androidx.concurrent.futures.c.a aVar) {
            this.f20730C = new java.lang.ref.WeakReference(aVar);
        }

        boolean a(boolean z6) {
            return this.f20731D.cancel(z6);
        }

        boolean b(java.lang.Object obj) {
            return this.f20731D.z(obj);
        }

        boolean c(java.lang.Throwable th) {
            return this.f20731D.A(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z6) {
            androidx.concurrent.futures.c.a aVar = (androidx.concurrent.futures.c.a) this.f20730C.get();
            boolean zCancel = this.f20731D.cancel(z6);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        @Override // P4.d
        public void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.f20731D.e(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public java.lang.Object get() {
            return this.f20731D.get();
        }

        @Override // java.util.concurrent.Future
        public java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) {
            return this.f20731D.get(j6, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f20731D.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f20731D.isDone();
        }

        public java.lang.String toString() {
            return this.f20731D.toString();
        }
    }

    public static P4.d a(androidx.concurrent.futures.c.InterfaceC0397c interfaceC0397c) {
        androidx.concurrent.futures.c.a aVar = new androidx.concurrent.futures.c.a();
        androidx.concurrent.futures.c.d dVar = new androidx.concurrent.futures.c.d(aVar);
        aVar.f20727b = dVar;
        aVar.f20726a = interfaceC0397c.getClass();
        try {
            java.lang.Object objA = interfaceC0397c.a(aVar);
            if (objA != null) {
                aVar.f20726a = objA;
            }
        } catch (java.lang.Exception e6) {
            dVar.c(e6);
        }
        return dVar;
    }
}
