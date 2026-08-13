package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6183a1 extends com.google.android.gms.internal.play_billing.M1 implements com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final boolean f41509F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    static final com.google.android.gms.internal.play_billing.C6314w1 f41510G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final com.google.android.gms.internal.play_billing.P0 f41511H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final java.lang.Object f41512I;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private volatile java.lang.Object f41513C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private volatile com.google.android.gms.internal.play_billing.S0 f41514D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private volatile com.google.android.gms.internal.play_billing.Z0 f41515E;

    static {
        boolean z6;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        com.google.android.gms.internal.play_billing.P0 v6;
        try {
            z6 = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z6 = false;
        }
        f41509F = z6;
        f41510G = new com.google.android.gms.internal.play_billing.C6314w1(com.google.android.gms.internal.play_billing.AbstractC6183a1.class);
        com.google.android.gms.internal.play_billing.AbstractC6207e1 abstractC6207e1 = null;
        try {
            v6 = new com.google.android.gms.internal.play_billing.Y0(abstractC6207e1);
            th2 = null;
            th = null;
        } catch (java.lang.Error | java.lang.Exception e6) {
            try {
                th = null;
                th2 = e6;
                v6 = new com.google.android.gms.internal.play_billing.T0(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.Z0.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.Z0.class, com.google.android.gms.internal.play_billing.Z0.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.AbstractC6183a1.class, com.google.android.gms.internal.play_billing.Z0.class, "E"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.AbstractC6183a1.class, com.google.android.gms.internal.play_billing.S0.class, "D"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.AbstractC6183a1.class, java.lang.Object.class, "C"));
            } catch (java.lang.Error | java.lang.Exception e10) {
                th = e10;
                th2 = e6;
                v6 = new com.google.android.gms.internal.play_billing.V0(abstractC6207e1);
            }
        }
        f41511H = v6;
        if (th != null) {
            com.google.android.gms.internal.play_billing.C6314w1 c6314w1 = f41510G;
            java.util.logging.Logger loggerA = c6314w1.a();
            java.util.logging.Level level = java.util.logging.Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            c6314w1.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f41512I = new java.lang.Object();
    }

    protected AbstractC6183a1() {
    }

    private static final java.lang.Object A(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.play_billing.Q0) {
            java.lang.Throwable th = ((com.google.android.gms.internal.play_billing.Q0) obj).f41447b;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.R0) {
            throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.play_billing.R0) obj).f41451a);
        }
        if (obj == f41512I) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.Object s(com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1) {
        java.lang.Throwable thA;
        if (interfaceFutureC6320x1 instanceof com.google.android.gms.internal.play_billing.W0) {
            java.lang.Object q6 = ((com.google.android.gms.internal.play_billing.AbstractC6183a1) interfaceFutureC6320x1).f41513C;
            if (q6 instanceof com.google.android.gms.internal.play_billing.Q0) {
                com.google.android.gms.internal.play_billing.Q0 q10 = (com.google.android.gms.internal.play_billing.Q0) q6;
                if (q10.f41446a) {
                    java.lang.Throwable th = q10.f41447b;
                    q6 = th != null ? new com.google.android.gms.internal.play_billing.Q0(false, th) : com.google.android.gms.internal.play_billing.Q0.f41445d;
                }
            }
            j$.util.Objects.requireNonNull(q6);
            return q6;
        }
        if ((interfaceFutureC6320x1 instanceof com.google.android.gms.internal.play_billing.M1) && (thA = ((com.google.android.gms.internal.play_billing.M1) interfaceFutureC6320x1).a()) != null) {
            return new com.google.android.gms.internal.play_billing.R0(thA);
        }
        boolean zIsCancelled = interfaceFutureC6320x1.isCancelled();
        if ((!f41509F) && zIsCancelled) {
            com.google.android.gms.internal.play_billing.Q0 q11 = com.google.android.gms.internal.play_billing.Q0.f41445d;
            j$.util.Objects.requireNonNull(q11);
            return q11;
        }
        try {
            java.lang.Object objT = t(interfaceFutureC6320x1);
            if (!zIsCancelled) {
                return objT == null ? f41512I : objT;
            }
            return new com.google.android.gms.internal.play_billing.Q0(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + java.lang.String.valueOf(interfaceFutureC6320x1)));
        } catch (java.lang.Error e6) {
            e = e6;
            return new com.google.android.gms.internal.play_billing.R0(e);
        } catch (java.util.concurrent.CancellationException e10) {
            return !zIsCancelled ? new com.google.android.gms.internal.play_billing.R0(new java.lang.IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(java.lang.String.valueOf(interfaceFutureC6320x1)), e10)) : new com.google.android.gms.internal.play_billing.Q0(false, e10);
        } catch (java.util.concurrent.ExecutionException e11) {
            return zIsCancelled ? new com.google.android.gms.internal.play_billing.Q0(false, new java.lang.IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(java.lang.String.valueOf(interfaceFutureC6320x1)), e11)) : new com.google.android.gms.internal.play_billing.R0(e11.getCause());
        } catch (java.lang.Exception e12) {
            e = e12;
            return new com.google.android.gms.internal.play_billing.R0(e);
        }
    }

    private static java.lang.Object t(java.util.concurrent.Future future) {
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

    private final void u(java.lang.StringBuilder sb) {
        java.lang.String hexString;
        java.lang.String str = "]";
        try {
            java.lang.Object objT = t(this);
            sb.append("SUCCESS, result=[");
            if (objT == null) {
                hexString = "null";
            } else if (objT == this) {
                hexString = "this future";
            } else {
                sb.append(objT.getClass().getName());
                sb.append("@");
                hexString = java.lang.Integer.toHexString(java.lang.System.identityHashCode(objT));
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

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    private final void v(java.lang.StringBuilder sb) {
        java.lang.String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        java.lang.Object obj = this.f41513C;
        if (!(obj instanceof com.google.android.gms.internal.play_billing.U0)) {
            try {
                strConcat = i();
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (java.lang.Exception | java.lang.StackOverflowError e6) {
                strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(e6.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                u(sb);
            }
        }
        sb.append(", setFuture=[");
        w(sb, ((com.google.android.gms.internal.play_billing.U0) obj).f41488D);
        sb.append("]");
        if (isDone()) {
            sb.delete(length, sb.length());
            u(sb);
        }
    }

    private final void w(java.lang.StringBuilder sb, java.lang.Object obj) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1, boolean z6) {
        com.google.android.gms.internal.play_billing.S0 s6 = null;
        while (true) {
            for (com.google.android.gms.internal.play_billing.Z0 z0B = f41511H.b(abstractC6183a1, com.google.android.gms.internal.play_billing.Z0.f41506c); z0B != null; z0B = z0B.f41508b) {
                java.lang.Thread thread = z0B.f41507a;
                if (thread != null) {
                    z0B.f41507a = null;
                    java.util.concurrent.locks.LockSupport.unpark(thread);
                }
            }
            abstractC6183a1.n();
            com.google.android.gms.internal.play_billing.S0 s10 = s6;
            com.google.android.gms.internal.play_billing.S0 s0A = f41511H.a(abstractC6183a1, com.google.android.gms.internal.play_billing.S0.f41460d);
            com.google.android.gms.internal.play_billing.S0 s11 = s10;
            while (s0A != null) {
                com.google.android.gms.internal.play_billing.S0 s12 = s0A.f41463c;
                s0A.f41463c = s11;
                s11 = s0A;
                s0A = s12;
            }
            while (s11 != null) {
                java.lang.Runnable runnable = s11.f41461a;
                com.google.android.gms.internal.play_billing.S0 s13 = s11.f41463c;
                j$.util.Objects.requireNonNull(runnable);
                java.lang.Runnable runnable2 = runnable;
                if (runnable2 instanceof com.google.android.gms.internal.play_billing.U0) {
                    com.google.android.gms.internal.play_billing.U0 u6 = (com.google.android.gms.internal.play_billing.U0) runnable2;
                    abstractC6183a1 = u6.f41487C;
                    if (abstractC6183a1.f41513C == u6) {
                        if (f41511H.f(abstractC6183a1, u6, s(u6.f41488D))) {
                            s6 = s13;
                        }
                    } else {
                        continue;
                    }
                } else {
                    java.util.concurrent.Executor executor = s11.f41462b;
                    j$.util.Objects.requireNonNull(executor);
                    y(runnable2, executor);
                }
                s11 = s13;
            }
            return;
        }
    }

    private static void y(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e6) {
            f41510G.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e6);
        }
    }

    private final void z(com.google.android.gms.internal.play_billing.Z0 z6) {
        z6.f41507a = null;
        while (true) {
            com.google.android.gms.internal.play_billing.Z0 z10 = this.f41515E;
            if (z10 != com.google.android.gms.internal.play_billing.Z0.f41506c) {
                com.google.android.gms.internal.play_billing.Z0 z11 = null;
                while (z10 != null) {
                    com.google.android.gms.internal.play_billing.Z0 z12 = z10.f41508b;
                    if (z10.f41507a != null) {
                        z11 = z10;
                    } else if (z11 != null) {
                        z11.f41508b = z12;
                        if (z11.f41507a == null) {
                        }
                    } else if (!f41511H.g(this, z10, z12)) {
                    }
                    z10 = z12;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.M1
    protected final java.lang.Throwable a() {
        if (!(this instanceof com.google.android.gms.internal.play_billing.W0)) {
            return null;
        }
        java.lang.Object obj = this.f41513C;
        if (obj instanceof com.google.android.gms.internal.play_billing.R0) {
            return ((com.google.android.gms.internal.play_billing.R0) obj).f41451a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        com.google.android.gms.internal.play_billing.Q0 q6;
        java.lang.Object obj = this.f41513C;
        if (!(obj instanceof com.google.android.gms.internal.play_billing.U0) && !(obj == null)) {
            return false;
        }
        if (f41509F) {
            q6 = new com.google.android.gms.internal.play_billing.Q0(z6, new java.util.concurrent.CancellationException("Future.cancel() was called."));
        } else {
            q6 = z6 ? com.google.android.gms.internal.play_billing.Q0.f41444c : com.google.android.gms.internal.play_billing.Q0.f41445d;
            j$.util.Objects.requireNonNull(q6);
        }
        com.google.android.gms.internal.play_billing.AbstractC6183a1 abstractC6183a1 = this;
        boolean z10 = false;
        while (true) {
            if (f41511H.f(abstractC6183a1, obj, q6)) {
                x(abstractC6183a1, z6);
                if (obj instanceof com.google.android.gms.internal.play_billing.U0) {
                    com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1 = ((com.google.android.gms.internal.play_billing.U0) obj).f41488D;
                    if (interfaceFutureC6320x1 instanceof com.google.android.gms.internal.play_billing.W0) {
                        abstractC6183a1 = (com.google.android.gms.internal.play_billing.AbstractC6183a1) interfaceFutureC6320x1;
                        obj = abstractC6183a1.f41513C;
                        if ((obj == null) | (obj instanceof com.google.android.gms.internal.play_billing.U0)) {
                            z10 = true;
                        }
                    } else {
                        interfaceFutureC6320x1.cancel(z6);
                    }
                }
                return true;
            }
            obj = abstractC6183a1.f41513C;
            if (!(obj instanceof com.google.android.gms.internal.play_billing.U0)) {
                return z10;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1
    public final void g(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.play_billing.S0 s6;
        com.google.android.gms.internal.play_billing.AbstractC6294t.c(executor, "Executor was null.");
        if (!isDone() && (s6 = this.f41514D) != com.google.android.gms.internal.play_billing.S0.f41460d) {
            com.google.android.gms.internal.play_billing.S0 s10 = new com.google.android.gms.internal.play_billing.S0(runnable, executor);
            do {
                s10.f41463c = s6;
                if (f41511H.e(this, s6, s10)) {
                    return;
                } else {
                    s6 = this.f41514D;
                }
            } while (s6 != com.google.android.gms.internal.play_billing.S0.f41460d);
        }
        y(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.f41513C;
        if ((obj2 != null) && (!(obj2 instanceof com.google.android.gms.internal.play_billing.U0))) {
            return A(obj2);
        }
        com.google.android.gms.internal.play_billing.Z0 z6 = this.f41515E;
        if (z6 != com.google.android.gms.internal.play_billing.Z0.f41506c) {
            com.google.android.gms.internal.play_billing.Z0 z10 = new com.google.android.gms.internal.play_billing.Z0();
            do {
                com.google.android.gms.internal.play_billing.P0 p6 = f41511H;
                p6.c(z10, z6);
                if (p6.g(this, z6, z10)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            z(z10);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.f41513C;
                    } while (!((obj != null) & (!(obj instanceof com.google.android.gms.internal.play_billing.U0))));
                    return A(obj);
                }
                z6 = this.f41515E;
            } while (z6 != com.google.android.gms.internal.play_billing.Z0.f41506c);
        }
        java.lang.Object obj3 = this.f41513C;
        j$.util.Objects.requireNonNull(obj3);
        return A(obj3);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j6);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.f41513C;
        boolean z6 = true;
        if ((obj != null) && (!(obj instanceof com.google.android.gms.internal.play_billing.U0))) {
            return A(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            com.google.android.gms.internal.play_billing.Z0 z10 = this.f41515E;
            if (z10 != com.google.android.gms.internal.play_billing.Z0.f41506c) {
                com.google.android.gms.internal.play_billing.Z0 z11 = new com.google.android.gms.internal.play_billing.Z0();
                while (true) {
                    com.google.android.gms.internal.play_billing.P0 p6 = f41511H;
                    p6.c(z11, z10);
                    if (p6.g(this, z10, z11)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                            if (java.lang.Thread.interrupted()) {
                                z(z11);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.f41513C;
                            if ((obj2 != null) && (!(obj2 instanceof com.google.android.gms.internal.play_billing.U0))) {
                                return A(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        z(z11);
                        break;
                    }
                    z10 = this.f41515E;
                    if (z10 == com.google.android.gms.internal.play_billing.Z0.f41506c) {
                    }
                }
            }
            java.lang.Object obj3 = this.f41513C;
            j$.util.Objects.requireNonNull(obj3);
            return A(obj3);
        }
        while (nanos > 0) {
            java.lang.Object obj4 = this.f41513C;
            if ((obj4 != null) && (!(obj4 instanceof com.google.android.gms.internal.play_billing.U0))) {
                return A(obj4);
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

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String i() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f41513C instanceof com.google.android.gms.internal.play_billing.Q0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        java.lang.Object obj = this.f41513C;
        return (obj != null) & (!(obj instanceof com.google.android.gms.internal.play_billing.U0));
    }

    protected void n() {
    }

    protected final boolean o(java.lang.Object obj) {
        if (obj == null) {
            obj = f41512I;
        }
        if (!f41511H.f(this, null, obj)) {
            return false;
        }
        x(this, false);
        return true;
    }

    protected final boolean p(java.lang.Throwable th) {
        if (!f41511H.f(this, null, new com.google.android.gms.internal.play_billing.R0(th))) {
            return false;
        }
        x(this, false);
        return true;
    }

    protected final boolean q(com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1) {
        com.google.android.gms.internal.play_billing.R0 r6;
        java.lang.Object obj = this.f41513C;
        if (obj == null) {
            if (interfaceFutureC6320x1.isDone()) {
                if (!f41511H.f(this, null, s(interfaceFutureC6320x1))) {
                    return false;
                }
                x(this, false);
                return true;
            }
            com.google.android.gms.internal.play_billing.U0 u6 = new com.google.android.gms.internal.play_billing.U0(this, interfaceFutureC6320x1);
            if (f41511H.f(this, null, u6)) {
                try {
                    interfaceFutureC6320x1.g(u6, com.google.android.gms.internal.play_billing.EnumC6219g1.INSTANCE);
                } catch (java.lang.Throwable th) {
                    try {
                        r6 = new com.google.android.gms.internal.play_billing.R0(th);
                    } catch (java.lang.Error | java.lang.Exception unused) {
                        r6 = com.google.android.gms.internal.play_billing.R0.f41450b;
                    }
                    f41511H.f(this, u6, r6);
                }
                return true;
            }
            obj = this.f41513C;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.Q0) {
            interfaceFutureC6320x1.cancel(((com.google.android.gms.internal.play_billing.Q0) obj).f41446a);
        }
        return false;
    }

    protected final boolean r() {
        java.lang.Object obj = this.f41513C;
        return (obj instanceof com.google.android.gms.internal.play_billing.Q0) && ((com.google.android.gms.internal.play_billing.Q0) obj).f41446a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f41513C instanceof com.google.android.gms.internal.play_billing.Q0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            u(sb);
        } else {
            v(sb);
        }
        sb.append("]");
        return sb.toString();
    }
}
