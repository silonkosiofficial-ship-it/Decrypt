package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class V80 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f32414a;

    public V80(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f32414a = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        java.util.concurrent.ThreadFactory threadFactory = (java.util.concurrent.ThreadFactory) this.f32414a.b();
        com.google.android.gms.internal.ads.AbstractC2308Ee0.a();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, threadFactory));
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
        return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }
}
