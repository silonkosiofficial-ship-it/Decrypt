package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2483Iz implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28562b;

    public C2483Iz(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f28561a = interfaceC5078rz0;
        this.f28562b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.C2446Hz b() {
        return new com.google.android.gms.internal.ads.C2446Hz(((com.google.android.gms.internal.ads.C4748oz) this.f28561a).a(), (java.util.concurrent.Executor) this.f28562b.b());
    }
}
