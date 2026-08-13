package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3565eB implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f34916a;

    public C3565eB(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f34916a = interfaceC5078rz0;
    }

    public static com.google.android.gms.internal.ads.EG a(com.google.android.gms.internal.ads.C3029Xx c3029Xx, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.EG(c3029Xx, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return a((com.google.android.gms.internal.ads.C3029Xx) this.f34916a.b(), com.google.android.gms.internal.ads.O80.c());
    }
}
