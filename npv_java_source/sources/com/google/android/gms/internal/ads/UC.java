package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class UC implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f32163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f32164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f32165c;

    public UC(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f32163a = interfaceC5078rz0;
        this.f32164b = interfaceC5078rz1;
        this.f32165c = interfaceC5078rz3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.SC(((com.google.android.gms.internal.ads.TC) this.f32163a).b(), ((com.google.android.gms.internal.ads.C4859pz0) this.f32164b).b(), com.google.android.gms.internal.ads.O80.c(), (java.util.concurrent.ScheduledExecutorService) this.f32165c.b());
    }
}
