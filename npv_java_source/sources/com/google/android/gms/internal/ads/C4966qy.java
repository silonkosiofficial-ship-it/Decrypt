package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4966qy implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f38404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f38405b;

    public C4966qy(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f38404a = interfaceC5078rz0;
        this.f38405b = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        java.util.Set setEmptySet = ((org.json.JSONObject) this.f38405b.b()) == null ? java.util.Collections.emptySet() : java.util.Collections.singleton(new com.google.android.gms.internal.ads.EG((com.google.android.gms.internal.ads.C4306ky) this.f38404a.b(), com.google.android.gms.internal.ads.O80.c()));
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(setEmptySet);
        return setEmptySet;
    }
}
