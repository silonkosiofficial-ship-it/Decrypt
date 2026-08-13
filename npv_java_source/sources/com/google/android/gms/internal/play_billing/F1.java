package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F1 {
    public static com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC6326y1 a(java.util.concurrent.ExecutorService executorService) {
        if (executorService instanceof com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC6326y1) {
            return (com.google.android.gms.internal.play_billing.InterfaceExecutorServiceC6326y1) executorService;
        }
        return executorService instanceof java.util.concurrent.ScheduledExecutorService ? new com.google.android.gms.internal.play_billing.E1((java.util.concurrent.ScheduledExecutorService) executorService) : new com.google.android.gms.internal.play_billing.A1(executorService);
    }

    public static com.google.android.gms.internal.play_billing.InterfaceScheduledExecutorServiceC6331z1 b(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof com.google.android.gms.internal.play_billing.InterfaceScheduledExecutorServiceC6331z1 ? (com.google.android.gms.internal.play_billing.InterfaceScheduledExecutorServiceC6331z1) scheduledExecutorService : new com.google.android.gms.internal.play_billing.E1(scheduledExecutorService);
    }
}
