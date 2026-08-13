package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6267o1 extends com.google.android.gms.internal.play_billing.AbstractC6279q1 {
    public static com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 a(java.lang.Object obj) {
        return new com.google.android.gms.internal.play_billing.C6284r1(obj);
    }

    public static com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 b(com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1, long j6, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        return interfaceFutureC6320x1.isDone() ? interfaceFutureC6320x1 : com.google.android.gms.internal.play_billing.J1.C(interfaceFutureC6320x1, 28500L, timeUnit, scheduledExecutorService);
    }

    public static void c(com.google.android.gms.internal.play_billing.InterfaceFutureC6320x1 interfaceFutureC6320x1, com.google.android.gms.internal.play_billing.InterfaceC6255m1 interfaceC6255m1, java.util.concurrent.Executor executor) {
        interfaceFutureC6320x1.g(new com.google.android.gms.internal.play_billing.RunnableC6261n1(interfaceFutureC6320x1, interfaceC6255m1), executor);
    }
}
