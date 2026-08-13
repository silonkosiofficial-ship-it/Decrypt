package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5896zP implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f40298a;

    public C5896zP(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f40298a = interfaceC5078rz0;
    }

    public static com.google.android.gms.internal.ads.EG a(com.google.android.gms.internal.ads.C5786yP c5786yP, java.util.concurrent.Executor executor) {
        return new com.google.android.gms.internal.ads.EG(c5786yP, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return a((com.google.android.gms.internal.ads.C5786yP) this.f40298a.b(), com.google.android.gms.internal.ads.O80.c());
    }
}
