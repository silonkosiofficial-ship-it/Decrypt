package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Yy0 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC4309kz0 f33436a;

    public static void a(com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0, com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz1) {
        com.google.android.gms.internal.ads.Yy0 yy0 = (com.google.android.gms.internal.ads.Yy0) interfaceC4309kz0;
        if (yy0.f33436a != null) {
            throw new java.lang.IllegalStateException();
        }
        yy0.f33436a = interfaceC4309kz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final java.lang.Object b() {
        com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0 = this.f33436a;
        if (interfaceC4309kz0 != null) {
            return interfaceC4309kz0.b();
        }
        throw new java.lang.IllegalStateException();
    }
}
