package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5872zB implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f40233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f40234b;

    public C5872zB(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f40233a = interfaceC5078rz0;
        this.f40234b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.EG((com.google.android.gms.internal.ads.TE) this.f40233a.b(), (java.util.concurrent.Executor) this.f40234b.b());
    }
}
