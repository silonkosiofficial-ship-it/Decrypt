package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2740Py implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f30845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f30846b;

    public C2740Py(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f30845a = interfaceC5078rz0;
        this.f30846b = interfaceC5078rz1;
    }

    public static com.google.android.gms.internal.ads.ZD c(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, V3.f fVar) {
        return new com.google.android.gms.internal.ads.ZD(scheduledExecutorService, fVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.ZD b() {
        return c((java.util.concurrent.ScheduledExecutorService) this.f30845a.b(), (V3.f) this.f30846b.b());
    }
}
