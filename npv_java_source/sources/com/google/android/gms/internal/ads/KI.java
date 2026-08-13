package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class KI implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28884d;

    public KI(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f28881a = interfaceC5078rz0;
        this.f28882b = interfaceC5078rz1;
        this.f28883c = interfaceC5078rz2;
        this.f28884d = interfaceC5078rz3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        com.google.android.gms.internal.ads.C2486Jb c2486Jb = (com.google.android.gms.internal.ads.C2486Jb) this.f28881a.b();
        java.util.concurrent.Executor executor = (java.util.concurrent.Executor) this.f28882b.b();
        android.content.Context context = (android.content.Context) this.f28883c.b();
        return new com.google.android.gms.internal.ads.C5405uy(executor, new com.google.android.gms.internal.ads.C3868gy(context, c2486Jb), (V3.f) this.f28884d.b());
    }
}
