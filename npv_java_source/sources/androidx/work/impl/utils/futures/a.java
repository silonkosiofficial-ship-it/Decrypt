package androidx.work.impl.utils.futures;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements P4.d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final boolean f23953F = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final java.util.logging.Logger f23954G = java.util.logging.Logger.getLogger(androidx.work.impl.utils.futures.a.class.getName());

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final androidx.work.impl.utils.futures.a.b f23955H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final java.lang.Object f23956I;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    volatile java.lang.Object f23957C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    volatile androidx.work.impl.utils.futures.a.e f23958D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    volatile androidx.work.impl.utils.futures.a.i f23959E;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(androidx.work.impl.utils.futures.a aVar, androidx.work.impl.utils.futures.a.e eVar, androidx.work.impl.utils.futures.a.e eVar2);

        abstract boolean b(androidx.work.impl.utils.futures.a aVar, java.lang.Object obj, java.lang.Object obj2);

        abstract boolean c(androidx.work.impl.utils.futures.a aVar, androidx.work.impl.utils.futures.a.i iVar, androidx.work.impl.utils.futures.a.i iVar2);

        abstract void d(androidx.work.impl.utils.futures.a.i iVar, androidx.work.impl.utils.futures.a.i iVar2);

        abstract void e(androidx.work.impl.utils.futures.a.i iVar, java.lang.Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final androidx.work.impl.utils.futures.a.c f23960c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final androidx.work.impl.utils.futures.a.c f23961d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f23962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.Throwable f23963b;

        static {
            if (androidx.work.impl.utils.futures.a.f23953F) {
                f23961d = null;
                f23960c = null;
            } else {
                f23961d = new androidx.work.impl.utils.futures.a.c(false, null);
                f23960c = new androidx.work.impl.utils.futures.a.c(true, null);
            }
        }

        c(boolean z6, java.lang.Throwable th) {
            this.f23962a = z6;
            this.f23963b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final androidx.work.impl.utils.futures.a.d f23964b = new androidx.work.impl.utils.futures.a.d(new androidx.work.impl.utils.futures.a.d.C0457a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.Throwable f23965a;

        /* JADX INFO: renamed from: androidx.work.impl.utils.futures.a$d$a, reason: collision with other inner class name */
        class C0457a extends java.lang.Throwable {
            C0457a(java.lang.String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized java.lang.Throwable fillInStackTrace() {
                return this;
            }
        }

        d(java.lang.Throwable th) {
            this.f23965a = (java.lang.Throwable) androidx.work.impl.utils.futures.a.d(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final androidx.work.impl.utils.futures.a.e f23966d = new androidx.work.impl.utils.futures.a.e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.Runnable f23967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.concurrent.Executor f23968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.work.impl.utils.futures.a.e f23969c;

        e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.f23967a = runnable;
            this.f23968b = executor;
        }
    }

    private static final class f extends androidx.work.impl.utils.futures.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f23970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f23971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f23972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f23973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f23974e;

        f(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f23970a = atomicReferenceFieldUpdater;
            this.f23971b = atomicReferenceFieldUpdater2;
            this.f23972c = atomicReferenceFieldUpdater3;
            this.f23973d = atomicReferenceFieldUpdater4;
            this.f23974e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(androidx.work.impl.utils.futures.a aVar, androidx.work.impl.utils.futures.a.e eVar, androidx.work.impl.utils.futures.a.e eVar2) {
            return androidx.concurrent.futures.b.a(this.f23973d, aVar, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(androidx.work.impl.utils.futures.a aVar, java.lang.Object obj, java.lang.Object obj2) {
            return androidx.concurrent.futures.b.a(this.f23974e, aVar, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(androidx.work.impl.utils.futures.a aVar, androidx.work.impl.utils.futures.a.i iVar, androidx.work.impl.utils.futures.a.i iVar2) {
            return androidx.concurrent.futures.b.a(this.f23972c, aVar, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(androidx.work.impl.utils.futures.a.i iVar, androidx.work.impl.utils.futures.a.i iVar2) {
            this.f23971b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(androidx.work.impl.utils.futures.a.i iVar, java.lang.Thread thread) {
            this.f23970a.lazySet(iVar, thread);
        }
    }

    private static final class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final androidx.work.impl.utils.futures.a f23975C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final P4.d f23976D;

        g(androidx.work.impl.utils.futures.a aVar, P4.d dVar) {
            this.f23975C = aVar;
            this.f23976D = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f23975C.f23957C != this) {
                return;
            }
            if (androidx.work.impl.utils.futures.a.f23955H.b(this.f23975C, this, androidx.work.impl.utils.futures.a.k(this.f23976D))) {
                androidx.work.impl.utils.futures.a.h(this.f23975C);
            }
        }
    }

    private static final class h extends androidx.work.impl.utils.futures.a.b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean a(androidx.work.impl.utils.futures.a aVar, androidx.work.impl.utils.futures.a.e eVar, androidx.work.impl.utils.futures.a.e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f23958D != eVar) {
                        return false;
                    }
                    aVar.f23958D = eVar2;
                    return true;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean b(androidx.work.impl.utils.futures.a aVar, java.lang.Object obj, java.lang.Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f23957C != obj) {
                        return false;
                    }
                    aVar.f23957C = obj2;
                    return true;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        boolean c(androidx.work.impl.utils.futures.a aVar, androidx.work.impl.utils.futures.a.i iVar, androidx.work.impl.utils.futures.a.i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f23959E != iVar) {
                        return false;
                    }
                    aVar.f23959E = iVar2;
                    return true;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void d(androidx.work.impl.utils.futures.a.i iVar, androidx.work.impl.utils.futures.a.i iVar2) {
            iVar.f23979b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.a.b
        void e(androidx.work.impl.utils.futures.a.i iVar, java.lang.Thread thread) {
            iVar.f23978a = thread;
        }
    }

    private static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final androidx.work.impl.utils.futures.a.i f23977c = new androidx.work.impl.utils.futures.a.i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile java.lang.Thread f23978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile androidx.work.impl.utils.futures.a.i f23979b;

        i() {
            androidx.work.impl.utils.futures.a.f23955H.e(this, java.lang.Thread.currentThread());
        }

        i(boolean z6) {
        }

        void a(androidx.work.impl.utils.futures.a.i iVar) {
            androidx.work.impl.utils.futures.a.f23955H.d(this, iVar);
        }

        void b() {
            java.lang.Thread thread = this.f23978a;
            if (thread != null) {
                this.f23978a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
    }

    static {
        androidx.work.impl.utils.futures.a.b hVar;
        try {
            hVar = new androidx.work.impl.utils.futures.a.f(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.a.i.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.a.i.class, androidx.work.impl.utils.futures.a.i.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.a.class, androidx.work.impl.utils.futures.a.i.class, "E"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.a.class, androidx.work.impl.utils.futures.a.e.class, "D"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.work.impl.utils.futures.a.class, java.lang.Object.class, "C"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            hVar = new androidx.work.impl.utils.futures.a.h();
        }
        f23955H = hVar;
        if (th != null) {
            f23954G.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f23956I = new java.lang.Object();
    }

    protected a() {
    }

    private void a(java.lang.StringBuilder sb) {
        java.lang.String str = "]";
        try {
            java.lang.Object objL = l(this);
            sb.append("SUCCESS, result=[");
            sb.append(t(objL));
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (java.lang.RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (java.util.concurrent.ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append(str);
        }
    }

    private static java.util.concurrent.CancellationException c(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static java.lang.Object d(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    private androidx.work.impl.utils.futures.a.e f(androidx.work.impl.utils.futures.a.e eVar) {
        androidx.work.impl.utils.futures.a.e eVar2;
        do {
            eVar2 = this.f23958D;
        } while (!f23955H.a(this, eVar2, androidx.work.impl.utils.futures.a.e.f23966d));
        androidx.work.impl.utils.futures.a.e eVar3 = eVar;
        androidx.work.impl.utils.futures.a.e eVar4 = eVar2;
        while (eVar4 != null) {
            androidx.work.impl.utils.futures.a.e eVar5 = eVar4.f23969c;
            eVar4.f23969c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void h(androidx.work.impl.utils.futures.a aVar) {
        androidx.work.impl.utils.futures.a.e eVar = null;
        while (true) {
            aVar.o();
            aVar.b();
            androidx.work.impl.utils.futures.a.e eVarF = aVar.f(eVar);
            while (eVarF != null) {
                eVar = eVarF.f23969c;
                java.lang.Runnable runnable = eVarF.f23967a;
                if (runnable instanceof androidx.work.impl.utils.futures.a.g) {
                    androidx.work.impl.utils.futures.a.g gVar = (androidx.work.impl.utils.futures.a.g) runnable;
                    aVar = gVar.f23975C;
                    if (aVar.f23957C == gVar) {
                        if (f23955H.b(aVar, gVar, k(gVar.f23976D))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    i(runnable, eVarF.f23968b);
                }
                eVarF = eVar;
            }
            return;
        }
    }

    private static void i(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e6) {
            f23954G.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e6);
        }
    }

    private java.lang.Object j(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof androidx.work.impl.utils.futures.a.c) {
            throw c("Task was cancelled.", ((androidx.work.impl.utils.futures.a.c) obj).f23963b);
        }
        if (obj instanceof androidx.work.impl.utils.futures.a.d) {
            throw new java.util.concurrent.ExecutionException(((androidx.work.impl.utils.futures.a.d) obj).f23965a);
        }
        if (obj == f23956I) {
            return null;
        }
        return obj;
    }

    static java.lang.Object k(P4.d dVar) {
        if (dVar instanceof androidx.work.impl.utils.futures.a) {
            java.lang.Object obj = ((androidx.work.impl.utils.futures.a) dVar).f23957C;
            if (!(obj instanceof androidx.work.impl.utils.futures.a.c)) {
                return obj;
            }
            androidx.work.impl.utils.futures.a.c cVar = (androidx.work.impl.utils.futures.a.c) obj;
            if (cVar.f23962a) {
                return cVar.f23963b != null ? new androidx.work.impl.utils.futures.a.c(false, cVar.f23963b) : androidx.work.impl.utils.futures.a.c.f23961d;
            }
            return obj;
        }
        boolean zIsCancelled = dVar.isCancelled();
        if ((!f23953F) && zIsCancelled) {
            return androidx.work.impl.utils.futures.a.c.f23961d;
        }
        try {
            java.lang.Object objL = l(dVar);
            return objL == null ? f23956I : objL;
        } catch (java.util.concurrent.CancellationException e6) {
            if (zIsCancelled) {
                return new androidx.work.impl.utils.futures.a.c(false, e6);
            }
            return new androidx.work.impl.utils.futures.a.d(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e6));
        } catch (java.util.concurrent.ExecutionException e10) {
            return new androidx.work.impl.utils.futures.a.d(e10.getCause());
        } catch (java.lang.Throwable th) {
            return new androidx.work.impl.utils.futures.a.d(th);
        }
    }

    private static java.lang.Object l(java.util.concurrent.Future future) {
        java.lang.Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z6 = true;
            } catch (java.lang.Throwable th) {
                if (z6) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
        return obj;
    }

    private void o() {
        androidx.work.impl.utils.futures.a.i iVar;
        do {
            iVar = this.f23959E;
        } while (!f23955H.c(this, iVar, androidx.work.impl.utils.futures.a.i.f23977c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f23979b;
        }
    }

    private void p(androidx.work.impl.utils.futures.a.i iVar) {
        iVar.f23978a = null;
        while (true) {
            androidx.work.impl.utils.futures.a.i iVar2 = this.f23959E;
            if (iVar2 == androidx.work.impl.utils.futures.a.i.f23977c) {
                return;
            }
            androidx.work.impl.utils.futures.a.i iVar3 = null;
            while (iVar2 != null) {
                androidx.work.impl.utils.futures.a.i iVar4 = iVar2.f23979b;
                if (iVar2.f23978a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f23979b = iVar4;
                    if (iVar3.f23978a == null) {
                    }
                } else if (!f23955H.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private java.lang.String t(java.lang.Object obj) {
        return obj == this ? "this future" : java.lang.String.valueOf(obj);
    }

    protected void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        androidx.work.impl.utils.futures.a.c cVar;
        java.lang.Object obj = this.f23957C;
        if (!(obj == null) && !(obj instanceof androidx.work.impl.utils.futures.a.g)) {
            return false;
        }
        if (f23953F) {
            cVar = new androidx.work.impl.utils.futures.a.c(z6, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            cVar = z6 ? androidx.work.impl.utils.futures.a.c.f23960c : androidx.work.impl.utils.futures.a.c.f23961d;
        }
        androidx.work.impl.utils.futures.a aVar = this;
        boolean z10 = false;
        while (true) {
            if (f23955H.b(aVar, obj, cVar)) {
                if (z6) {
                    aVar.m();
                }
                h(aVar);
                if (!(obj instanceof androidx.work.impl.utils.futures.a.g)) {
                    return true;
                }
                P4.d dVar = ((androidx.work.impl.utils.futures.a.g) obj).f23976D;
                if (!(dVar instanceof androidx.work.impl.utils.futures.a)) {
                    dVar.cancel(z6);
                    return true;
                }
                aVar = (androidx.work.impl.utils.futures.a) dVar;
                obj = aVar.f23957C;
                if (!(obj == null) && !(obj instanceof androidx.work.impl.utils.futures.a.g)) {
                    return true;
                }
                z10 = true;
            } else {
                obj = aVar.f23957C;
                if (!(obj instanceof androidx.work.impl.utils.futures.a.g)) {
                    return z10;
                }
            }
        }
    }

    @Override // P4.d
    public final void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        d(runnable);
        d(executor);
        androidx.work.impl.utils.futures.a.e eVar = this.f23958D;
        if (eVar != androidx.work.impl.utils.futures.a.e.f23966d) {
            androidx.work.impl.utils.futures.a.e eVar2 = new androidx.work.impl.utils.futures.a.e(runnable, executor);
            do {
                eVar2.f23969c = eVar;
                if (f23955H.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f23958D;
                }
            } while (eVar != androidx.work.impl.utils.futures.a.e.f23966d);
        }
        i(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.f23957C;
        if ((obj2 != null) && (!(obj2 instanceof androidx.work.impl.utils.futures.a.g))) {
            return j(obj2);
        }
        androidx.work.impl.utils.futures.a.i iVar = this.f23959E;
        if (iVar != androidx.work.impl.utils.futures.a.i.f23977c) {
            androidx.work.impl.utils.futures.a.i iVar2 = new androidx.work.impl.utils.futures.a.i();
            do {
                iVar2.a(iVar);
                if (f23955H.c(this, iVar, iVar2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            p(iVar2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.f23957C;
                    } while (!((obj != null) & (!(obj instanceof androidx.work.impl.utils.futures.a.g))));
                    return j(obj);
                }
                iVar = this.f23959E;
            } while (iVar != androidx.work.impl.utils.futures.a.i.f23977c);
        }
        return j(this.f23957C);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j6);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.f23957C;
        if ((obj != null) && (!(obj instanceof androidx.work.impl.utils.futures.a.g))) {
            return j(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            androidx.work.impl.utils.futures.a.i iVar = this.f23959E;
            if (iVar != androidx.work.impl.utils.futures.a.i.f23977c) {
                androidx.work.impl.utils.futures.a.i iVar2 = new androidx.work.impl.utils.futures.a.i();
                while (true) {
                    iVar2.a(iVar);
                    if (f23955H.c(this, iVar, iVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                p(iVar2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.f23957C;
                            if ((obj2 != null) && (!(obj2 instanceof androidx.work.impl.utils.futures.a.g))) {
                                return j(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        p(iVar2);
                        break;
                    }
                    iVar = this.f23959E;
                    if (iVar == androidx.work.impl.utils.futures.a.i.f23977c) {
                    }
                }
            }
            return j(this.f23957C);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.f23957C;
            if ((obj3 != null) && (!(obj3 instanceof androidx.work.impl.utils.futures.a.g))) {
                return j(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = jNanoTime - java.lang.System.nanoTime();
        }
        java.lang.String string = toString();
        java.lang.String string2 = timeUnit.toString();
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = string2.toLowerCase(locale);
        java.lang.String str = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            java.lang.String str2 = str + " (plus ";
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z6 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                java.lang.String str3 = str2 + jConvert + " " + lowerCase;
                if (z6) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z6) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(str + " but future completed as timeout expired");
        }
        throw new java.util.concurrent.TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f23957C instanceof androidx.work.impl.utils.futures.a.c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        java.lang.Object obj = this.f23957C;
        return (!(obj instanceof androidx.work.impl.utils.futures.a.g)) & (obj != null);
    }

    protected void m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String n() {
        java.lang.Object obj = this.f23957C;
        if (obj instanceof androidx.work.impl.utils.futures.a.g) {
            return "setFuture=[" + t(((androidx.work.impl.utils.futures.a.g) obj).f23976D) + "]";
        }
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean q(java.lang.Object obj) {
        if (obj == null) {
            obj = f23956I;
        }
        if (!f23955H.b(this, null, obj)) {
            return false;
        }
        h(this);
        return true;
    }

    protected boolean r(java.lang.Throwable th) {
        if (!f23955H.b(this, null, new androidx.work.impl.utils.futures.a.d((java.lang.Throwable) d(th)))) {
            return false;
        }
        h(this);
        return true;
    }

    protected boolean s(P4.d dVar) {
        androidx.work.impl.utils.futures.a.d dVar2;
        d(dVar);
        java.lang.Object obj = this.f23957C;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!f23955H.b(this, null, k(dVar))) {
                    return false;
                }
                h(this);
                return true;
            }
            androidx.work.impl.utils.futures.a.g gVar = new androidx.work.impl.utils.futures.a.g(this, dVar);
            if (f23955H.b(this, null, gVar)) {
                try {
                    dVar.e(gVar, androidx.work.impl.utils.futures.b.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        dVar2 = new androidx.work.impl.utils.futures.a.d(th);
                    } catch (java.lang.Throwable unused) {
                        dVar2 = androidx.work.impl.utils.futures.a.d.f23964b;
                    }
                    f23955H.b(this, gVar, dVar2);
                }
                return true;
            }
            obj = this.f23957C;
        }
        if (obj instanceof androidx.work.impl.utils.futures.a.c) {
            dVar.cancel(((androidx.work.impl.utils.futures.a.c) obj).f23962a);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    public java.lang.String toString() {
        java.lang.String strN;
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    strN = n();
                } catch (java.lang.RuntimeException e6) {
                    strN = "Exception thrown from implementation: " + e6.getClass();
                }
                if (strN != null && !strN.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(strN);
                    sb.append("]");
                } else if (isDone()) {
                    a(sb);
                } else {
                    str = "PENDING";
                }
            }
            sb.append("]");
            return sb.toString();
        }
        str = "CANCELLED";
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
