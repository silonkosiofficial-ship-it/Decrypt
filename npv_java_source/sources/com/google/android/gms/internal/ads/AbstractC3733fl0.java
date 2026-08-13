package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3733fl0 {
    public static com.google.android.gms.internal.ads.Yk0 a(java.util.concurrent.ExecutorService executorService) {
        if (executorService instanceof com.google.android.gms.internal.ads.Yk0) {
            return (com.google.android.gms.internal.ads.Yk0) executorService;
        }
        return executorService instanceof java.util.concurrent.ScheduledExecutorService ? new com.google.android.gms.internal.ads.C3623el0((java.util.concurrent.ScheduledExecutorService) executorService) : new com.google.android.gms.internal.ads.C3295bl0(executorService);
    }

    public static com.google.android.gms.internal.ads.Zk0 b(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return new com.google.android.gms.internal.ads.C3623el0(scheduledExecutorService);
    }

    public static java.util.concurrent.Executor c() {
        return com.google.android.gms.internal.ads.EnumC2172Ak0.INSTANCE;
    }

    static java.util.concurrent.Executor d(java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.AbstractC3183ak0 abstractC3183ak0) {
        executor.getClass();
        return executor == com.google.android.gms.internal.ads.EnumC2172Ak0.INSTANCE ? executor : new com.google.android.gms.internal.ads.ExecutorC3185al0(executor, abstractC3183ak0);
    }
}
