package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Z10 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f33452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f33453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f33454c;

    public Z10(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f33452a = interfaceC5078rz0;
        this.f33453b = interfaceC5078rz1;
        this.f33454c = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.X10 b() {
        return new com.google.android.gms.internal.ads.X10((android.content.pm.ApplicationInfo) this.f33452a.b(), (android.content.pm.PackageInfo) this.f33453b.b(), ((com.google.android.gms.internal.ads.C3204av) this.f33454c).a());
    }
}
