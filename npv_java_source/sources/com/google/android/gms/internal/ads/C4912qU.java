package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4912qU implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f38279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f38280b;

    public C4912qU(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f38279a = interfaceC5078rz0;
        this.f38280b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.C4802pU b() {
        return new com.google.android.gms.internal.ads.C4802pU((android.content.Context) this.f38279a.b(), (com.google.android.gms.internal.ads.AbstractC2334Ey) this.f38280b.b());
    }
}
