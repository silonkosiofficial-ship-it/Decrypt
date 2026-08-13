package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3980hz implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C3030Xy f36182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36183b;

    public C3980hz(com.google.android.gms.internal.ads.C3030Xy c3030Xy, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f36182a = c3030Xy;
        this.f36183b = interfaceC5078rz0;
    }

    public static java.util.Set a(com.google.android.gms.internal.ads.C3030Xy c3030Xy, com.google.android.gms.internal.ads.C2923Uz c2923Uz) {
        java.util.Set setSingleton = java.util.Collections.singleton(new com.google.android.gms.internal.ads.EG(c2923Uz, com.google.android.gms.internal.ads.AbstractC3524dr.f34801g));
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return a(this.f36182a, (com.google.android.gms.internal.ads.C2923Uz) this.f36183b.b());
    }
}
