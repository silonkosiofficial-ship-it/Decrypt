package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5857z30 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f40198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f40199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f40200c;

    public C5857z30(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz4) {
        this.f40198a = interfaceC5078rz0;
        this.f40199b = interfaceC5078rz2;
        this.f40200c = interfaceC5078rz3;
    }

    public static com.google.android.gms.internal.ads.C5637x30 a(java.lang.String str, com.google.android.gms.internal.ads.C2746Qc c2746Qc, com.google.android.gms.internal.ads.C2914Uq c2914Uq, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.Yk0 yk0) {
        return new com.google.android.gms.internal.ads.C5637x30(str, c2746Qc, c2914Uq, scheduledExecutorService, yk0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.C5637x30(((com.google.android.gms.internal.ads.U30) this.f40198a).a(), com.google.android.gms.internal.ads.C2554Kw.a(), (com.google.android.gms.internal.ads.C2914Uq) this.f40199b.b(), (java.util.concurrent.ScheduledExecutorService) this.f40200c.b(), com.google.android.gms.internal.ads.O80.c());
    }
}
