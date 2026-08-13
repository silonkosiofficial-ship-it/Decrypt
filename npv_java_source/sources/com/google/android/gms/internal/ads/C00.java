package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class C00 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26114d;

    public C00(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f26111a = interfaceC5078rz0;
        this.f26112b = interfaceC5078rz1;
        this.f26113c = interfaceC5078rz2;
        this.f26114d = interfaceC5078rz3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        com.google.android.gms.internal.ads.AZ azB = ((com.google.android.gms.internal.ads.CZ) this.f26111a).b();
        com.google.android.gms.internal.ads.VZ vz = (com.google.android.gms.internal.ads.VZ) this.f26112b.b();
        java.util.List list = (java.util.List) this.f26113c.b();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.f26114d.b();
        if (list.contains("54")) {
            return new com.google.android.gms.internal.ads.T10(vz, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.jc)).intValue(), scheduledExecutorService);
        }
        return new com.google.android.gms.internal.ads.T10(azB, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.jc)).intValue(), scheduledExecutorService);
    }
}
