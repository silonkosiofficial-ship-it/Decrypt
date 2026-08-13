package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4677oI implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f37762a;

    public C4677oI(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f37762a = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        java.util.Set setSingleton = ((com.google.android.gms.internal.ads.C4347lI) this.f37762a).a().e() != null ? java.util.Collections.singleton("banner") : java.util.Collections.emptySet();
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(setSingleton);
        return setSingleton;
    }
}
