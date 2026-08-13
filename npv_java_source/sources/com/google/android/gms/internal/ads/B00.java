package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class B00 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f25832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f25833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f25834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f25835d;

    public B00(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f25832a = interfaceC5078rz0;
        this.f25833b = interfaceC5078rz1;
        this.f25834c = interfaceC5078rz2;
        this.f25835d = interfaceC5078rz3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        com.google.android.gms.internal.ads.C4587nZ c4587nZB = ((com.google.android.gms.internal.ads.C4807pZ) this.f25832a).b();
        com.google.android.gms.internal.ads.VZ vz = (com.google.android.gms.internal.ads.VZ) this.f25833b.b();
        java.util.List list = (java.util.List) this.f25834c.b();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) this.f25835d.b();
        if (list.contains("10")) {
            return new com.google.android.gms.internal.ads.T10(vz, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ac)).intValue(), scheduledExecutorService);
        }
        return new com.google.android.gms.internal.ads.T10(c4587nZB, ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.ac)).intValue(), scheduledExecutorService);
    }
}
