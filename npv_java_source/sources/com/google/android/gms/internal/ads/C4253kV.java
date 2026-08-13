package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4253kV implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f36976b;

    public C4253kV(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f36975a = interfaceC5078rz0;
        this.f36976b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.C4143jV b() {
        return new com.google.android.gms.internal.ads.C4143jV((android.content.Context) this.f36975a.b(), (com.google.android.gms.internal.ads.QH) this.f36976b.b());
    }
}
