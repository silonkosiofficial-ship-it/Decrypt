package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2652Nk0 extends com.google.android.gms.internal.ads.AbstractC2726Pk0 {
    public static com.google.android.gms.internal.ads.C2579Lk0 a(java.lang.Iterable iterable) {
        return new com.google.android.gms.internal.ads.C2579Lk0(false, com.google.android.gms.internal.ads.AbstractC3398ci0.E(iterable), null);
    }

    public static com.google.android.gms.internal.ads.C2579Lk0 b(java.lang.Iterable iterable) {
        return new com.google.android.gms.internal.ads.C2579Lk0(true, com.google.android.gms.internal.ads.AbstractC3398ci0.E(iterable), null);
    }

    public static com.google.android.gms.internal.ads.C2579Lk0 c(P4.d... dVarArr) {
        return new com.google.android.gms.internal.ads.C2579Lk0(true, com.google.android.gms.internal.ads.AbstractC3398ci0.N(dVarArr), null);
    }

    public static P4.d d(java.lang.Iterable iterable) {
        return new com.google.android.gms.internal.ads.C5378uk0(com.google.android.gms.internal.ads.AbstractC3398ci0.E(iterable), true);
    }

    public static P4.d e(P4.d dVar, java.lang.Class cls, com.google.android.gms.internal.ads.InterfaceC4821pg0 interfaceC4821pg0, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.C2650Nj0 c2650Nj0 = new com.google.android.gms.internal.ads.C2650Nj0(dVar, cls, interfaceC4821pg0);
        dVar.e(c2650Nj0, com.google.android.gms.internal.ads.AbstractC3733fl0.d(executor, c2650Nj0));
        return c2650Nj0;
    }

    public static P4.d f(P4.d dVar, java.lang.Class cls, com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.C2613Mj0 c2613Mj0 = new com.google.android.gms.internal.ads.C2613Mj0(dVar, cls, interfaceC5268tk0);
        dVar.e(c2613Mj0, com.google.android.gms.internal.ads.AbstractC3733fl0.d(executor, c2613Mj0));
        return c2613Mj0;
    }

    public static P4.d g(java.lang.Throwable th) {
        th.getClass();
        return new com.google.android.gms.internal.ads.C2763Qk0(th);
    }

    public static P4.d h(java.lang.Object obj) {
        return obj == null ? com.google.android.gms.internal.ads.C2800Rk0.f31347D : new com.google.android.gms.internal.ads.C2800Rk0(obj);
    }

    public static P4.d i() {
        return com.google.android.gms.internal.ads.C2800Rk0.f31347D;
    }

    public static P4.d j(java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.RunnableFutureC4831pl0 runnableFutureC4831pl0 = new com.google.android.gms.internal.ads.RunnableFutureC4831pl0(callable);
        executor.execute(runnableFutureC4831pl0);
        return runnableFutureC4831pl0;
    }

    public static P4.d k(com.google.android.gms.internal.ads.InterfaceC5158sk0 interfaceC5158sk0, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.RunnableFutureC4831pl0 runnableFutureC4831pl0 = new com.google.android.gms.internal.ads.RunnableFutureC4831pl0(interfaceC5158sk0);
        executor.execute(runnableFutureC4831pl0);
        return runnableFutureC4831pl0;
    }

    public static P4.d l(P4.d... dVarArr) {
        return new com.google.android.gms.internal.ads.C5378uk0(com.google.android.gms.internal.ads.AbstractC3398ci0.N(dVarArr), false);
    }

    public static P4.d m(P4.d dVar, com.google.android.gms.internal.ads.InterfaceC4821pg0 interfaceC4821pg0, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.ads.C4060ik0 c4060ik0 = new com.google.android.gms.internal.ads.C4060ik0(dVar, interfaceC4821pg0);
        dVar.e(c4060ik0, com.google.android.gms.internal.ads.AbstractC3733fl0.d(executor, c4060ik0));
        return c4060ik0;
    }

    public static P4.d n(P4.d dVar, com.google.android.gms.internal.ads.InterfaceC5268tk0 interfaceC5268tk0, java.util.concurrent.Executor executor) {
        int i6 = com.google.android.gms.internal.ads.AbstractRunnableC4169jk0.f36725L;
        executor.getClass();
        com.google.android.gms.internal.ads.C3951hk0 c3951hk0 = new com.google.android.gms.internal.ads.C3951hk0(dVar, interfaceC5268tk0);
        dVar.e(c3951hk0, com.google.android.gms.internal.ads.AbstractC3733fl0.d(executor, c3951hk0));
        return c3951hk0;
    }

    public static P4.d o(P4.d dVar, long j6, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return dVar.isDone() ? dVar : com.google.android.gms.internal.ads.C4501ml0.F(dVar, j6, timeUnit, scheduledExecutorService);
    }

    public static java.lang.Object p(java.util.concurrent.Future future) {
        if (future.isDone()) {
            return com.google.android.gms.internal.ads.AbstractC5050rl0.a(future);
        }
        throw new java.lang.IllegalStateException(com.google.android.gms.internal.ads.AbstractC2829Sg0.b("Future was expected to be done: %s", future));
    }

    public static java.lang.Object q(java.util.concurrent.Future future) {
        try {
            return com.google.android.gms.internal.ads.AbstractC5050rl0.a(future);
        } catch (java.util.concurrent.ExecutionException e6) {
            if (e6.getCause() instanceof java.lang.Error) {
                throw new com.google.android.gms.internal.ads.C2209Bk0((java.lang.Error) e6.getCause());
            }
            throw new com.google.android.gms.internal.ads.C4941ql0(e6.getCause());
        }
    }

    public static void r(P4.d dVar, com.google.android.gms.internal.ads.InterfaceC2505Jk0 interfaceC2505Jk0, java.util.concurrent.Executor executor) {
        interfaceC2505Jk0.getClass();
        dVar.e(new com.google.android.gms.internal.ads.RunnableC2542Kk0(dVar, interfaceC2505Jk0), executor);
    }
}
