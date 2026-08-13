package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5649x90 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39795b;

    public C5649x90(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f39794a = interfaceC5078rz1;
        this.f39795b = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.C5429v90(com.google.android.gms.internal.ads.O80.c(), (java.util.concurrent.ScheduledExecutorService) this.f39794a.b(), ((com.google.android.gms.internal.ads.C5759y90) this.f39795b).b());
    }
}
