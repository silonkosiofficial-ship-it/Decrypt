package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5185sy implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f38826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f38827b;

    public C5185sy(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f38826a = interfaceC5078rz0;
        this.f38827b = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        java.util.Set setEmptySet = ((org.json.JSONObject) this.f38827b.b()) == null ? java.util.Collections.emptySet() : java.util.Collections.singleton(new com.google.android.gms.internal.ads.EG((com.google.android.gms.internal.ads.C4306ky) this.f38826a.b(), com.google.android.gms.internal.ads.O80.c()));
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(setEmptySet);
        return setEmptySet;
    }
}
