package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ak0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3183ak0 extends com.google.android.gms.internal.ads.AbstractC5160sl0 implements P4.d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final boolean f34132F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static final com.google.android.gms.internal.ads.Wk0 f34133G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.AbstractC2724Pj0 f34134H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final java.lang.Object f34135I;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private volatile java.lang.Object f34136C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.C2835Sj0 f34137D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.C3087Zj0 f34138E;

    static {
        boolean z6;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        com.google.android.gms.internal.ads.AbstractC2724Pj0 c2943Vj0;
        try {
            z6 = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z6 = false;
        }
        f34132F = z6;
        f34133G = new com.google.android.gms.internal.ads.Wk0(com.google.android.gms.internal.ads.AbstractC3183ak0.class);
        com.google.android.gms.internal.ads.AbstractC3731fk0 abstractC3731fk0 = null;
        try {
            c2943Vj0 = new com.google.android.gms.internal.ads.C3051Yj0(abstractC3731fk0);
            th2 = null;
            th = null;
        } catch (java.lang.Error | java.lang.Exception e6) {
            try {
                th = null;
                th2 = e6;
                c2943Vj0 = new com.google.android.gms.internal.ads.C2871Tj0(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.C3087Zj0.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.C3087Zj0.class, com.google.android.gms.internal.ads.C3087Zj0.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.AbstractC3183ak0.class, com.google.android.gms.internal.ads.C3087Zj0.class, "E"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.AbstractC3183ak0.class, com.google.android.gms.internal.ads.C2835Sj0.class, "D"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.ads.AbstractC3183ak0.class, java.lang.Object.class, "C"));
            } catch (java.lang.Error | java.lang.Exception e10) {
                th = e10;
                th2 = e6;
                c2943Vj0 = new com.google.android.gms.internal.ads.C2943Vj0(abstractC3731fk0);
            }
        }
        f34134H = c2943Vj0;
        if (th != null) {
            com.google.android.gms.internal.ads.Wk0 wk0 = f34133G;
            java.util.logging.Logger loggerA = wk0.a();
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            wk0.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f34135I = new java.lang.Object();
    }

    protected AbstractC3183ak0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void A(com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0, boolean z6) {
        com.google.android.gms.internal.ads.C2835Sj0 c2835Sj0 = null;
        while (true) {
            for (com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0B = f34134H.b(abstractC3183ak0, com.google.android.gms.internal.ads.C3087Zj0.f33651c); c3087Zj0B != null; c3087Zj0B = c3087Zj0B.f33653b) {
                java.lang.Thread thread = c3087Zj0B.f33652a;
                if (thread != null) {
                    c3087Zj0B.f33652a = null;
                    java.util.concurrent.locks.LockSupport.unpark(thread);
                }
            }
            if (z6) {
                abstractC3183ak0.t();
            }
            abstractC3183ak0.d();
            com.google.android.gms.internal.ads.C2835Sj0 c2835Sj1 = c2835Sj0;
            com.google.android.gms.internal.ads.C2835Sj0 c2835Sj0A = f34134H.a(abstractC3183ak0, com.google.android.gms.internal.ads.C2835Sj0.f31738d);
            com.google.android.gms.internal.ads.C2835Sj0 c2835Sj2 = c2835Sj1;
            while (c2835Sj0A != null) {
                com.google.android.gms.internal.ads.C2835Sj0 c2835Sj3 = c2835Sj0A.f31741c;
                c2835Sj0A.f31741c = c2835Sj2;
                c2835Sj2 = c2835Sj0A;
                c2835Sj0A = c2835Sj3;
            }
            while (c2835Sj2 != null) {
                c2835Sj0 = c2835Sj2.f31741c;
                java.lang.Runnable runnable = c2835Sj2.f31739a;
                j$.util.Objects.requireNonNull(runnable);
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0) {
                    com.google.android.gms.internal.ads.RunnableC2907Uj0 runnableC2907Uj0 = (com.google.android.gms.internal.ads.RunnableC2907Uj0) runnable2;
                    abstractC3183ak0 = runnableC2907Uj0.f32261C;
                    if (abstractC3183ak0.f34136C == runnableC2907Uj0) {
                        if (f34134H.f(abstractC3183ak0, runnableC2907Uj0, i(runnableC2907Uj0.f32262D))) {
                            z6 = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    java.util.concurrent.Executor executor = c2835Sj2.f31740b;
                    j$.util.Objects.requireNonNull(executor);
                    B(runnable2, executor);
                }
                c2835Sj2 = c2835Sj0;
            }
            return;
        }
    }

    private static void B(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e6) {
            f34133G.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e6);
        }
    }

    private final void C(com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0) {
        c3087Zj0.f33652a = null;
        while (true) {
            com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1 = this.f34138E;
            if (c3087Zj1 != com.google.android.gms.internal.ads.C3087Zj0.f33651c) {
                com.google.android.gms.internal.ads.C3087Zj0 c3087Zj2 = null;
                while (c3087Zj1 != null) {
                    com.google.android.gms.internal.ads.C3087Zj0 c3087Zj3 = c3087Zj1.f33653b;
                    if (c3087Zj1.f33652a != null) {
                        c3087Zj2 = c3087Zj1;
                    } else if (c3087Zj2 != null) {
                        c3087Zj2.f33653b = c3087Zj3;
                        if (c3087Zj2.f33652a == null) {
                        }
                    } else if (!f34134H.g(this, c3087Zj1, c3087Zj3)) {
                    }
                    c3087Zj1 = c3087Zj3;
                }
                return;
            }
            return;
        }
    }

    private static final java.lang.Object b(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.ads.C2761Qj0) {
            java.lang.Throwable th = ((com.google.android.gms.internal.ads.C2761Qj0) obj).f31036b;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof com.google.android.gms.internal.ads.C2798Rj0) {
            throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.ads.C2798Rj0) obj).f31344a);
        }
        if (obj == f34135I) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object i(P4.d dVar) {
        java.lang.Throwable thA;
        if (dVar instanceof com.google.android.gms.internal.ads.InterfaceC2979Wj0) {
            java.lang.Object c2761Qj0 = ((com.google.android.gms.internal.ads.AbstractC3183ak0) dVar).f34136C;
            if (c2761Qj0 instanceof com.google.android.gms.internal.ads.C2761Qj0) {
                com.google.android.gms.internal.ads.C2761Qj0 c2761Qj1 = (com.google.android.gms.internal.ads.C2761Qj0) c2761Qj0;
                if (c2761Qj1.f31035a) {
                    java.lang.Throwable th = c2761Qj1.f31036b;
                    c2761Qj0 = th != null ? new com.google.android.gms.internal.ads.C2761Qj0(false, th) : com.google.android.gms.internal.ads.C2761Qj0.f31034d;
                }
            }
            j$.util.Objects.requireNonNull(c2761Qj0);
            return c2761Qj0;
        }
        if ((dVar instanceof com.google.android.gms.internal.ads.AbstractC5160sl0) && (thA = ((com.google.android.gms.internal.ads.AbstractC5160sl0) dVar).a()) != null) {
            return new com.google.android.gms.internal.ads.C2798Rj0(thA);
        }
        boolean zIsCancelled = dVar.isCancelled();
        if ((!f34132F) && zIsCancelled) {
            com.google.android.gms.internal.ads.C2761Qj0 c2761Qj2 = com.google.android.gms.internal.ads.C2761Qj0.f31034d;
            j$.util.Objects.requireNonNull(c2761Qj2);
            return c2761Qj2;
        }
        try {
            java.lang.Object objJ = j(dVar);
            if (!zIsCancelled) {
                return objJ == null ? f34135I : objJ;
            }
            return new com.google.android.gms.internal.ads.C2761Qj0(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + java.lang.String.valueOf(dVar)));
        } catch (java.lang.Error e6) {
            e = e6;
            return new com.google.android.gms.internal.ads.C2798Rj0(e);
        } catch (java.util.concurrent.CancellationException e10) {
            return !zIsCancelled ? new com.google.android.gms.internal.ads.C2798Rj0(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(dVar)), e10)) : new com.google.android.gms.internal.ads.C2761Qj0(false, e10);
        } catch (java.util.concurrent.ExecutionException e11) {
            return zIsCancelled ? new com.google.android.gms.internal.ads.C2761Qj0(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(java.lang.String.valueOf(dVar)), e11)) : new com.google.android.gms.internal.ads.C2798Rj0(e11.getCause());
        } catch (java.lang.Exception e12) {
            e = e12;
            return new com.google.android.gms.internal.ads.C2798Rj0(e);
        }
    }

    private static java.lang.Object j(java.util.concurrent.Future future) {
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

    private final void x(java.lang.StringBuilder sb) {
        java.lang.String hexString;
        java.lang.String str = "]";
        try {
            java.lang.Object objJ = j(this);
            sb.append("SUCCESS, result=[");
            if (objJ == null) {
                hexString = "null";
            } else if (objJ == this) {
                hexString = "this future";
            } else {
                sb.append(objJ.getClass().getName());
                sb.append("@");
                hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(objJ));
            }
            sb.append(hexString);
            sb.append("]");
        } catch (java.util.concurrent.CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (java.util.concurrent.ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append(str);
        } catch (java.lang.Exception e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            str = " thrown from get()]";
            sb.append(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private final void y(java.lang.StringBuilder sb) {
        java.lang.String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        java.lang.Object obj = this.f34136C;
        if (!(obj instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0)) {
            try {
                strConcat = com.google.android.gms.internal.ads.AbstractC2829Sg0.a(c());
            } catch (java.lang.Exception | java.lang.StackOverflowError e6) {
                strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(e6.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                x(sb);
            }
        }
        sb.append(", setFuture=[");
        z(sb, ((com.google.android.gms.internal.ads.RunnableC2907Uj0) obj).f32262D);
        sb.append("]");
        if (isDone()) {
            sb.delete(length, sb.length());
            x(sb);
        }
    }

    private final void z(java.lang.StringBuilder sb, java.lang.Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (java.lang.Exception e6) {
            e = e6;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (java.lang.StackOverflowError e10) {
            e = e10;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5160sl0
    protected final java.lang.Throwable a() {
        if (!(this instanceof com.google.android.gms.internal.ads.InterfaceC2979Wj0)) {
            return null;
        }
        java.lang.Object obj = this.f34136C;
        if (obj instanceof com.google.android.gms.internal.ads.C2798Rj0) {
            return ((com.google.android.gms.internal.ads.C2798Rj0) obj).f31344a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String c() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean cancel(boolean z6) {
        com.google.android.gms.internal.ads.C2761Qj0 c2761Qj0;
        java.lang.Object obj = this.f34136C;
        if (!(obj instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0) && !(obj == null)) {
            return false;
        }
        if (f34132F) {
            c2761Qj0 = new com.google.android.gms.internal.ads.C2761Qj0(z6, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            c2761Qj0 = z6 ? com.google.android.gms.internal.ads.C2761Qj0.f31033c : com.google.android.gms.internal.ads.C2761Qj0.f31034d;
            j$.util.Objects.requireNonNull(c2761Qj0);
        }
        com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0 = this;
        boolean z10 = false;
        while (true) {
            if (f34134H.f(abstractC3183ak0, obj, c2761Qj0)) {
                A(abstractC3183ak0, z6);
                if (obj instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0) {
                    P4.d dVar = ((com.google.android.gms.internal.ads.RunnableC2907Uj0) obj).f32262D;
                    if (dVar instanceof com.google.android.gms.internal.ads.InterfaceC2979Wj0) {
                        abstractC3183ak0 = (com.google.android.gms.internal.ads.AbstractC3183ak0) dVar;
                        obj = abstractC3183ak0.f34136C;
                        if ((obj == null) | (obj instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0)) {
                            z10 = true;
                        }
                    } else {
                        dVar.cancel(z6);
                    }
                }
                return true;
            }
            obj = abstractC3183ak0.f34136C;
            if (!(obj instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0)) {
                return z10;
            }
        }
    }

    protected void d() {
    }

    public void e(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.C2835Sj0 c2835Sj0;
        com.google.android.gms.internal.ads.AbstractC2164Ag0.c(runnable, "Runnable was null.");
        com.google.android.gms.internal.ads.AbstractC2164Ag0.c(executor, "Executor was null.");
        if (!isDone() && (c2835Sj0 = this.f34137D) != com.google.android.gms.internal.ads.C2835Sj0.f31738d) {
            com.google.android.gms.internal.ads.C2835Sj0 c2835Sj1 = new com.google.android.gms.internal.ads.C2835Sj0(runnable, executor);
            do {
                c2835Sj1.f31741c = c2835Sj0;
                if (f34134H.e(this, c2835Sj0, c2835Sj1)) {
                    return;
                } else {
                    c2835Sj0 = this.f34137D;
                }
            } while (c2835Sj0 != com.google.android.gms.internal.ads.C2835Sj0.f31738d);
        }
        B(runnable, executor);
    }

    protected boolean f(java.lang.Object obj) {
        if (obj == null) {
            obj = f34135I;
        }
        if (!f34134H.f(this, null, obj)) {
            return false;
        }
        A(this, false);
        return true;
    }

    public java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.f34136C;
        if ((obj2 != null) && (!(obj2 instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0))) {
            return b(obj2);
        }
        com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0 = this.f34138E;
        if (c3087Zj0 != com.google.android.gms.internal.ads.C3087Zj0.f33651c) {
            com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1 = new com.google.android.gms.internal.ads.C3087Zj0();
            do {
                com.google.android.gms.internal.ads.AbstractC2724Pj0 abstractC2724Pj0 = f34134H;
                abstractC2724Pj0.c(c3087Zj1, c3087Zj0);
                if (abstractC2724Pj0.g(this, c3087Zj0, c3087Zj1)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            C(c3087Zj1);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.f34136C;
                    } while (!((obj != null) & (!(obj instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0))));
                    return b(obj);
                }
                c3087Zj0 = this.f34138E;
            } while (c3087Zj0 != com.google.android.gms.internal.ads.C3087Zj0.f33651c);
        }
        java.lang.Object obj3 = this.f34136C;
        j$.util.Objects.requireNonNull(obj3);
        return b(obj3);
    }

    public java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j6);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.f34136C;
        boolean z6 = true;
        if ((obj != null) && (!(obj instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0))) {
            return b(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            com.google.android.gms.internal.ads.C3087Zj0 c3087Zj0 = this.f34138E;
            if (c3087Zj0 != com.google.android.gms.internal.ads.C3087Zj0.f33651c) {
                com.google.android.gms.internal.ads.C3087Zj0 c3087Zj1 = new com.google.android.gms.internal.ads.C3087Zj0();
                while (true) {
                    com.google.android.gms.internal.ads.AbstractC2724Pj0 abstractC2724Pj0 = f34134H;
                    abstractC2724Pj0.c(c3087Zj1, c3087Zj0);
                    if (abstractC2724Pj0.g(this, c3087Zj0, c3087Zj1)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                            if (java.lang.Thread.interrupted()) {
                                C(c3087Zj1);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.f34136C;
                            if ((obj2 != null) && (!(obj2 instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0))) {
                                return b(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        C(c3087Zj1);
                        break;
                    }
                    c3087Zj0 = this.f34138E;
                    if (c3087Zj0 == com.google.android.gms.internal.ads.C3087Zj0.f33651c) {
                    }
                }
            }
            java.lang.Object obj3 = this.f34136C;
            j$.util.Objects.requireNonNull(obj3);
            return b(obj3);
        }
        while (nanos > 0) {
            java.lang.Object obj4 = this.f34136C;
            if ((obj4 != null) && (!(obj4 instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0))) {
                return b(obj4);
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
        java.lang.String strConcat = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            java.lang.String strConcat2 = strConcat.concat(" (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z6 = false;
            }
            if (jConvert > 0) {
                java.lang.String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z6) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z6) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new java.util.concurrent.TimeoutException(strConcat + " for " + string);
    }

    protected boolean h(java.lang.Throwable th) {
        th.getClass();
        if (!f34134H.f(this, null, new com.google.android.gms.internal.ads.C2798Rj0(th))) {
            return false;
        }
        A(this, false);
        return true;
    }

    public boolean isCancelled() {
        return this.f34136C instanceof com.google.android.gms.internal.ads.C2761Qj0;
    }

    public boolean isDone() {
        java.lang.Object obj = this.f34136C;
        return (obj != null) & (!(obj instanceof com.google.android.gms.internal.ads.RunnableC2907Uj0));
    }

    protected void t() {
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            x(sb);
        } else {
            y(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    final void u(java.util.concurrent.Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(w());
        }
    }

    protected final boolean v(P4.d dVar) {
        com.google.android.gms.internal.ads.C2798Rj0 c2798Rj0;
        dVar.getClass();
        java.lang.Object obj = this.f34136C;
        if (obj == null) {
            if (dVar.isDone()) {
                if (!f34134H.f(this, null, i(dVar))) {
                    return false;
                }
                A(this, false);
                return true;
            }
            com.google.android.gms.internal.ads.RunnableC2907Uj0 runnableC2907Uj0 = new com.google.android.gms.internal.ads.RunnableC2907Uj0(this, dVar);
            if (f34134H.f(this, null, runnableC2907Uj0)) {
                try {
                    dVar.e(runnableC2907Uj0, com.google.android.gms.internal.ads.EnumC2172Ak0.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        c2798Rj0 = new com.google.android.gms.internal.ads.C2798Rj0(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        c2798Rj0 = com.google.android.gms.internal.ads.C2798Rj0.f31343b;
                    }
                    f34134H.f(this, runnableC2907Uj0, c2798Rj0);
                }
                return true;
            }
            obj = this.f34136C;
        }
        if (obj instanceof com.google.android.gms.internal.ads.C2761Qj0) {
            dVar.cancel(((com.google.android.gms.internal.ads.C2761Qj0) obj).f31035a);
        }
        return false;
    }

    protected final boolean w() {
        java.lang.Object obj = this.f34136C;
        return (obj instanceof com.google.android.gms.internal.ads.C2761Qj0) && ((com.google.android.gms.internal.ads.C2761Qj0) obj).f31035a;
    }
}
