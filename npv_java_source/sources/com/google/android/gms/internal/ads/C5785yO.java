package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.yO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5785yO implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5345uO f40050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f40051b;

    public C5785yO(com.google.android.gms.internal.ads.C5345uO c5345uO, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f40050a = c5345uO;
        this.f40051b = interfaceC5078rz0;
    }

    public static java.util.Set a(com.google.android.gms.internal.ads.C5345uO c5345uO, com.google.android.gms.internal.ads.EO eo, java.util.concurrent.Executor executor) {
        java.util.Set setD = com.google.android.gms.internal.ads.C5345uO.d(eo, executor);
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(setD);
        return setD;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return a(this.f40050a, (com.google.android.gms.internal.ads.EO) this.f40051b.b(), com.google.android.gms.internal.ads.O80.c());
    }
}
