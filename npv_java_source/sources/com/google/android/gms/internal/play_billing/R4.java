package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public class R4 implements com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final boolean f41452F = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final java.util.logging.Logger f41453G = java.util.logging.Logger.getLogger(com.google.android.gms.internal.play_billing.R4.class.getName());

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final com.google.android.gms.internal.play_billing.D1 f41454H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final java.lang.Object f41455I;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    volatile java.lang.Object f41456C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    volatile com.google.android.gms.internal.play_billing.C6316w3 f41457D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    volatile com.google.android.gms.internal.play_billing.P4 f41458E;

    static {
        com.google.android.gms.internal.play_billing.D1 o6;
        try {
            o6 = new com.google.android.gms.internal.play_billing.C6276p4(java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.P4.class, java.lang.Thread.class, "a"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.P4.class, com.google.android.gms.internal.play_billing.P4.class, "b"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.R4.class, com.google.android.gms.internal.play_billing.P4.class, "E"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.R4.class, com.google.android.gms.internal.play_billing.C6316w3.class, "D"), java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.R4.class, java.lang.Object.class, "C"));
            th = null;
        } catch (java.lang.Throwable th) {
            th = th;
            o6 = new com.google.android.gms.internal.play_billing.O4();
        }
        java.lang.Throwable th2 = th;
        f41454H = o6;
        if (th2 != null) {
            f41453G.logp(java.util.logging.Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        f41455I = new java.lang.Object();
    }

    protected R4() {
    }

    static void b(com.google.android.gms.internal.play_billing.R4 r6) {
        com.google.android.gms.internal.play_billing.P4 p6;
        com.google.android.gms.internal.play_billing.C6316w3 c6316w3;
        com.google.android.gms.internal.play_billing.C6316w3 c6316w4;
        com.google.android.gms.internal.play_billing.C6316w3 c6316w5;
        do {
            p6 = r6.f41458E;
        } while (!f41454H.e(r6, p6, com.google.android.gms.internal.play_billing.P4.f41438c));
        while (true) {
            c6316w3 = null;
            if (p6 == null) {
                break;
            }
            java.lang.Thread thread = p6.f41439a;
            if (thread != null) {
                p6.f41439a = null;
                java.util.concurrent.locks.LockSupport.unpark(thread);
            }
            p6 = p6.f41440b;
        }
        do {
            c6316w4 = r6.f41457D;
        } while (!f41454H.c(r6, c6316w4, com.google.android.gms.internal.play_billing.C6316w3.f41671d));
        while (true) {
            c6316w5 = c6316w3;
            c6316w3 = c6316w4;
            if (c6316w3 == null) {
                break;
            }
            c6316w4 = c6316w3.f41674c;
            c6316w3.f41674c = c6316w5;
        }
        while (c6316w5 != null) {
            java.lang.Runnable runnable = c6316w5.f41672a;
            com.google.android.gms.internal.play_billing.C6316w3 c6316w6 = c6316w5.f41674c;
            f(runnable, c6316w5.f41673b);
            c6316w5 = c6316w6;
        }
    }

    private final void d(java.lang.StringBuilder sb) {
        java.lang.Object obj;
        java.lang.String str = "]";
        boolean z6 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if (z6) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (java.util.concurrent.CancellationException unused2) {
                str = "CANCELLED";
                sb.append(str);
                return;
            } catch (java.lang.RuntimeException e6) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e6.getClass());
                str = " thrown from get()]";
                sb.append(str);
                return;
            } catch (java.util.concurrent.ExecutionException e10) {
                sb.append("FAILURE, cause=[");
                sb.append(e10.getCause());
                sb.append(str);
                return;
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : java.lang.String.valueOf(obj));
        sb.append("]");
    }

    private static void f(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        try {
            executor.execute(runnable);
        } catch (java.lang.RuntimeException e6) {
            f41453G.logp(java.util.logging.Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", "RuntimeException while executing runnable " + java.lang.String.valueOf(runnable) + " with executor " + java.lang.String.valueOf(executor), (java.lang.Throwable) e6);
        }
    }

    private final void h(com.google.android.gms.internal.play_billing.P4 p6) {
        p6.f41439a = null;
        while (true) {
            com.google.android.gms.internal.play_billing.P4 p10 = this.f41458E;
            if (p10 != com.google.android.gms.internal.play_billing.P4.f41438c) {
                com.google.android.gms.internal.play_billing.P4 p11 = null;
                while (p10 != null) {
                    com.google.android.gms.internal.play_billing.P4 p12 = p10.f41440b;
                    if (p10.f41439a != null) {
                        p11 = p10;
                    } else if (p11 != null) {
                        p11.f41440b = p12;
                        if (p11.f41439a == null) {
                        }
                    } else if (!f41454H.e(this, p10, p12)) {
                    }
                    p10 = p12;
                }
                return;
            }
            return;
        }
    }

    private static final java.lang.Object i(java.lang.Object obj) throws java.util.concurrent.ExecutionException {
        if (obj instanceof com.google.android.gms.internal.play_billing.C6202d2) {
            java.lang.Throwable th = ((com.google.android.gms.internal.play_billing.C6202d2) obj).f41543a;
            java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.W2) {
            throw new java.util.concurrent.ExecutionException(((com.google.android.gms.internal.play_billing.W2) obj).f41494a);
        }
        if (obj == f41455I) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected java.lang.String a() {
        if (!(this instanceof java.util.concurrent.ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((java.util.concurrent.ScheduledFuture) this).getDelay(java.util.concurrent.TimeUnit.MILLISECONDS) + " ms]";
    }

    protected boolean c(java.lang.Object obj) {
        if (obj == null) {
            obj = f41455I;
        }
        if (!f41454H.d(this, null, obj)) {
            return false;
        }
        b(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        com.google.android.gms.internal.play_billing.C6202d2 c6202d2;
        java.lang.Object obj = this.f41456C;
        if (obj == null) {
            if (f41452F) {
                c6202d2 = new com.google.android.gms.internal.play_billing.C6202d2(z6, new java.util.concurrent.CancellationException("Future.cancel() was called."));
            } else {
                c6202d2 = z6 ? com.google.android.gms.internal.play_billing.C6202d2.f41541b : com.google.android.gms.internal.play_billing.C6202d2.f41542c;
            }
            if (f41454H.d(this, obj, c6202d2)) {
                b(this);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1
    public final void g(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        executor.getClass();
        com.google.android.gms.internal.play_billing.C6316w3 c6316w3 = this.f41457D;
        if (c6316w3 != com.google.android.gms.internal.play_billing.C6316w3.f41671d) {
            com.google.android.gms.internal.play_billing.C6316w3 c6316w4 = new com.google.android.gms.internal.play_billing.C6316w3(runnable, executor);
            do {
                c6316w4.f41674c = c6316w3;
                if (f41454H.c(this, c6316w3, c6316w4)) {
                    return;
                } else {
                    c6316w3 = this.f41457D;
                }
            } while (c6316w3 != com.google.android.gms.internal.play_billing.C6316w3.f41671d);
        }
        f(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.f41456C;
        if (obj2 != null) {
            return i(obj2);
        }
        com.google.android.gms.internal.play_billing.P4 p6 = this.f41458E;
        if (p6 != com.google.android.gms.internal.play_billing.P4.f41438c) {
            com.google.android.gms.internal.play_billing.P4 p10 = new com.google.android.gms.internal.play_billing.P4();
            do {
                com.google.android.gms.internal.play_billing.D1 d6 = f41454H;
                d6.a(p10, p6);
                if (d6.e(this, p6, p10)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            h(p10);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.f41456C;
                    } while (!(obj != null));
                    return i(obj);
                }
                p6 = this.f41458E;
            } while (p6 != com.google.android.gms.internal.play_billing.P4.f41438c);
        }
        return i(this.f41456C);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j6, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j6);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.f41456C;
        boolean z6 = true;
        if (obj != null) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            com.google.android.gms.internal.play_billing.P4 p6 = this.f41458E;
            if (p6 != com.google.android.gms.internal.play_billing.P4.f41438c) {
                com.google.android.gms.internal.play_billing.P4 p10 = new com.google.android.gms.internal.play_billing.P4();
                while (true) {
                    com.google.android.gms.internal.play_billing.D1 d6 = f41454H;
                    d6.a(p10, p6);
                    if (d6.e(this, p6, p10)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, nanos);
                            if (java.lang.Thread.interrupted()) {
                                h(p10);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.f41456C;
                            if (obj2 != null) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        h(p10);
                        break;
                    }
                    p6 = this.f41458E;
                    if (p6 == com.google.android.gms.internal.play_billing.P4.f41438c) {
                    }
                }
            }
            return i(this.f41456C);
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.f41456C;
            if (obj3 != null) {
                return i(obj3);
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

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f41456C instanceof com.google.android.gms.internal.play_billing.C6202d2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f41456C != null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!(this.f41456C instanceof com.google.android.gms.internal.play_billing.C6202d2)) {
            if (isDone()) {
                d(sb);
            } else {
                try {
                    strConcat = a();
                } catch (java.lang.RuntimeException e6) {
                    strConcat = "Exception thrown from implementation: ".concat(java.lang.String.valueOf(e6.getClass()));
                }
                if (strConcat != null && !strConcat.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(strConcat);
                    sb.append("]");
                } else if (isDone()) {
                    d(sb);
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
