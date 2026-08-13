package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5633x10 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39766b;

    public C5633x10(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f39765a = interfaceC5078rz0;
        this.f39766b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.C5413v10 b() {
        return new com.google.android.gms.internal.ads.C5413v10(((com.google.android.gms.internal.ads.C3204av) this.f39765a).a(), (android.content.Intent) this.f39766b.b());
    }
}
