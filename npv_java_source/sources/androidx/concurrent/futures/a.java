package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements P4.d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final boolean f20701F = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final java.util.logging.Logger f20702G = java.util.logging.Logger.getLogger(androidx.concurrent.futures.a.class.getName());

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final androidx.concurrent.futures.a.b f20703H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final java.lang.Object f20704I;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    volatile java.lang.Object f20705C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    volatile androidx.concurrent.futures.a.e f20706D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    volatile androidx.concurrent.futures.a.h f20707E;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(androidx.concurrent.futures.a aVar, androidx.concurrent.futures.a.e eVar, androidx.concurrent.futures.a.e eVar2);

        abstract boolean b(androidx.concurrent.futures.a aVar, java.lang.Object obj, java.lang.Object obj2);

        abstract boolean c(androidx.concurrent.futures.a aVar, androidx.concurrent.futures.a.h hVar, androidx.concurrent.futures.a.h hVar2);

        abstract void d(androidx.concurrent.futures.a.h hVar, androidx.concurrent.futures.a.h hVar2);

        abstract void e(androidx.concurrent.futures.a.h hVar, java.lang.Thread thread);
    }

    private static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final androidx.concurrent.futures.a.c f20708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final androidx.concurrent.futures.a.c f20709d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f20710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.Throwable f20711b;

        static {
            if (androidx.concurrent.futures.a.f20701F) {
                f20709d = null;
                f20708c = null;
            } else {
                f20709d = new androidx.concurrent.futures.a.c(false, null);
                f20708c = new androidx.concurrent.futures.a.c(true, null);
            }
        }

        c(boolean z6, java.lang.Throwable th) {
            this.f20710a = z6;
            this.f20711b = th;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final androidx.concurrent.futures.a.d f20712b = new androidx.concurrent.futures.a.d(new androidx.concurrent.futures.a.d.C0396a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.Throwable f20713a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        class C0396a extends java.lang.Throwable {
            C0396a(java.lang.String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized java.lang.Throwable fillInStackTrace() {
                return this;
            }
        }

        d(java.lang.Throwable th) {
            this.f20713a = (java.lang.Throwable) androidx.concurrent.futures.a.o(th);
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final androidx.concurrent.futures.a.e f20714d = new androidx.concurrent.futures.a.e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.lang.Runnable f20715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.concurrent.Executor f20716b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.concurrent.futures.a.e f20717c;

        e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.f20715a = runnable;
            this.f20716b = executor;
        }
    }

    private static final class f extends androidx.concurrent.futures.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f20722e;

        f(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f20718a = atomicReferenceFieldUpdater;
            this.f20719b = atomicReferenceFieldUpdater2;
            this.f20720c = atomicReferenceFieldUpdater3;
            this.f20721d = atomicReferenceFieldUpdater4;
            this.f20722e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(androidx.concurrent.futures.a aVar, androidx.concurrent.futures.a.e eVar, androidx.concurrent.futures.a.e eVar2) {
            return androidx.concurrent.futures.b.a(this.f20721d, aVar, eVar, eVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(androidx.concurrent.futures.a aVar, java.lang.Object obj, java.lang.Object obj2) {
            return androidx.concurrent.futures.b.a(this.f20722e, aVar, obj, obj2);
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(androidx.concurrent.futures.a aVar, androidx.concurrent.futures.a.h hVar, androidx.concurrent.futures.a.h hVar2) {
            return androidx.concurrent.futures.b.a(this.f20720c, aVar, hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void d(androidx.concurrent.futures.a.h hVar, androidx.concurrent.futures.a.h hVar2) {
            this.f20719b.lazySet(hVar, hVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        void e(androidx.concurrent.futures.a.h hVar, java.lang.Thread thread) {
            this.f20718a.lazySet(hVar, thread);
        }
    }

    private static final class g extends androidx.concurrent.futures.a.b {
        g() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        boolean a(androidx.concurrent.futures.a aVar, androidx.concurrent.futures.a.e eVar, androidx.concurrent.futures.a.e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f20706D != eVar) {
                        return false;
                    }
                    aVar.f20706D = eVar2;
                    return true;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean b(androidx.concurrent.futures.a aVar, java.lang.Object obj, java.lang.Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f20705C != obj) {
                        return false;
                    }
                    aVar.f20705C = obj2;
                    return true;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        boolean c(androidx.concurrent.futures.a aVar, androidx.concurrent.futures.a.h hVar, androidx.concurrent.futures.a.h hVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f20707E != hVar) {
                        return false;
                    }
                    aVar.f20707E = hVar2;
                    return true;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        void d(androidx.concurrent.futures.a.h hVar, androidx.concurrent.futures.a.h hVar2) {
            hVar.f20725b = hVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        void e(androidx.concurrent.futures.a.h hVar, java.lang.Thread thread) {
            hVar.f20724a = thread;
        }
    }

    private static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final androidx.concurrent.futures.a.h f20723c = new androidx.concurrent.futures.a.h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile java.lang.Thread f20724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        volatile androidx.concurrent.futures.a.h f20725b;

        h() {
            androidx.concurrent.futures.a.f20703H.e(this, java.lang.Thread.currentThread());
        }

        h(boolean z6) {
        }

        void a(androidx.concurrent.futures.a.h hVar) {
            androidx.concurrent.futures.a.f20703H.d(this, hVar);
        }

        void b() {
            java.lang.Thread thread = this.f20724a;
            if (thread != null) {
                this.f20724a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
        }
    }

    static {
        androidx.concurrent.futures.a.b gVar;
        try {
            gVar = new androidx.concurrent.futures.a.f(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.a.h.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.a.h.class, androidx.concurrent.futures.a.h.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.a.class, androidx.concurrent.futures.a.h.class, "E"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.a.class, androidx.concurrent.futures.a.e.class, "D"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(androidx.concurrent.futures.a.class, java.lang.Object.class, "C"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            gVar = new androidx.concurrent.futures.a.g();
        }
        f20703H = gVar;
        if (th != null) {
            f20702G.log(java.util.logging.Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f20704I = new java.lang.Object();
    }

    protected a() {
    }

    private java.lang.String B(java.lang.Object obj) {
        return obj == this ? "this future" : java.lang.String.valueOf(obj);
    }

    private void i(java.lang.StringBuilder sb) {
        java.lang.String str = "]";
        try {
            java.lang.Object objU = u(this);
            sb.append("SUCCESS, result=[");
            sb.append(B(objU));
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

    private static java.util.concurrent.CancellationException n(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static java.lang.Object o(java.lang.Object obj) {
        obj.getClass();
        return obj;
    }

    private androidx.concurrent.futures.a.e q(androidx.concurrent.futures.a.e eVar) {
        androidx.concurrent.futures.a.e eVar2;
        do {
            eVar2 = this.f20706D;
        } while (!f20703H.a(this, eVar2, androidx.concurrent.futures.a.e.f20714d));
        androidx.concurrent.futures.a.e eVar3 = eVar;
        androidx.concurrent.futures.a.e eVar4 = eVar2;
        while (eVar4 != null) {
            androidx.concurrent.futures.a.e eVar5 = eVar4.f20717c;
            eVar4.f20717c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void r(androidx.concurrent.futures.a aVar) {
        aVar.x();
        aVar.m();
        androidx.concurrent.futures.a.e eVarQ = aVar.q(null);
        while (eVarQ != null) {
            androidx.concurrent.futures.a.e eVar = eVarQ.f20717c;
            s(eVarQ.f20715a, eVarQ.f20716b);
            eVarQ = eVar;
        }
    }

    private static void s(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e6) {
            f20702G.log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e6);
        }
    }

    private java.lang.Object t(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof androidx.concurrent.futures.a.c) {
            throw n("Task was cancelled.", ((androidx.concurrent.futures.a.c) obj).f20711b);
        }
        if (obj instanceof androidx.concurrent.futures.a.d) {
            throw new java.util.concurrent.ExecutionException(((androidx.concurrent.futures.a.d) obj).f20713a);
        }
        if (obj == f20704I) {
            return null;
        }
        return obj;
    }

    static java.lang.Object u(java.util.concurrent.Future future) {
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

    private void x() {
        androidx.concurrent.futures.a.h hVar;
        do {
            hVar = this.f20707E;
        } while (!f20703H.c(this, hVar, androidx.concurrent.futures.a.h.f20723c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f20725b;
        }
    }

    private void y(androidx.concurrent.futures.a.h hVar) {
        hVar.f20724a = null;
        while (true) {
            androidx.concurrent.futures.a.h hVar2 = this.f20707E;
            if (hVar2 == androidx.concurrent.futures.a.h.f20723c) {
                return;
            }
            androidx.concurrent.futures.a.h hVar3 = null;
            while (hVar2 != null) {
                androidx.concurrent.futures.a.h hVar4 = hVar2.f20725b;
                if (hVar2.f20724a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f20725b = hVar4;
                    if (hVar3.f20724a == null) {
                    }
                } else if (!f20703H.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    protected boolean A(java.lang.Throwable th) {
        if (!f20703H.b(this, null, new androidx.concurrent.futures.a.d((java.lang.Throwable) o(th)))) {
            return false;
        }
        r(this);
        return true;
    }

    protected final boolean C() {
        java.lang.Object obj = this.f20705C;
        return (obj instanceof androidx.concurrent.futures.a.c) && ((androidx.concurrent.futures.a.c) obj).f20710a;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        androidx.concurrent.futures.a.c cVar;
        java.lang.Object obj = this.f20705C;
        if (obj == null) {
            if (f20701F) {
                cVar = new androidx.concurrent.futures.a.c(z6, new java.util.concurrent.CancellationException("Future.cancel() was called."));
            } else {
                cVar = z6 ? androidx.concurrent.futures.a.c.f20708c : androidx.concurrent.futures.a.c.f20709d;
            }
            if (f20703H.b(this, obj, cVar)) {
                if (z6) {
                    v();
                }
                r(this);
                return true;
            }
        }
        return false;
    }

    @Override // P4.d
    public final void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        o(runnable);
        o(executor);
        androidx.concurrent.futures.a.e eVar = this.f20706D;
        if (eVar != androidx.concurrent.futures.a.e.f20714d) {
            androidx.concurrent.futures.a.e eVar2 = new androidx.concurrent.futures.a.e(runnable, executor);
            do {
                eVar2.f20717c = eVar;
                if (f20703H.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f20706D;
                }
            } while (eVar != androidx.concurrent.futures.a.e.f20714d);
        }
        s(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.f20705C;
        if (obj2 != null) {
            return t(obj2);
        }
        androidx.concurrent.futures.a.h hVar = this.f20707E;
        if (hVar != androidx.concurrent.futures.a.h.f20723c) {
            androidx.concurrent.futures.a.h hVar2 = new androidx.concurrent.futures.a.h();
            do {
                hVar2.a(hVar);
                if (f20703H.c(this, hVar, hVar2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            y(hVar2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.f20705C;
                    } while (!(obj != null));
                    return t(obj);
                }
                hVar = this.f20707E;
            } while (hVar != androidx.concurrent.futures.a.h.f20723c);
        }
        return t(this.f20705C);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j6);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.f20705C;
        if (obj != null) {
            return t(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            androidx.concurrent.futures.a.h hVar = this.f20707E;
            if (hVar != androidx.concurrent.futures.a.h.f20723c) {
                androidx.concurrent.futures.a.h hVar2 = new androidx.concurrent.futures.a.h();
                while (true) {
                    hVar2.a(hVar);
                    if (f20703H.c(this, hVar, hVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                y(hVar2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.f20705C;
                            if (obj2 != null) {
                                return t(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        y(hVar2);
                        break;
                    }
                    hVar = this.f20707E;
                    if (hVar == androidx.concurrent.futures.a.h.f20723c) {
                    }
                }
            }
            return t(this.f20705C);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.f20705C;
            if (obj3 != null) {
                return t(obj3);
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
        return this.f20705C instanceof androidx.concurrent.futures.a.c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f20705C != null;
    }

    protected void m() {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    public java.lang.String toString() {
        java.lang.String strW;
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                i(sb);
            } else {
                try {
                    strW = w();
                } catch (java.lang.RuntimeException e6) {
                    strW = "Exception thrown from implementation: " + e6.getClass();
                }
                if (strW != null && !strW.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(strW);
                    sb.append("]");
                } else if (isDone()) {
                    i(sb);
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

    protected void v() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String w() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean z(java.lang.Object obj) {
        if (obj == null) {
            obj = f20704I;
        }
        if (!f20703H.b(this, null, obj)) {
            return false;
        }
        r(this);
        return true;
    }
}
