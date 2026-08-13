package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4969qz0 implements com.google.android.gms.internal.ads.InterfaceC4309kz0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f38408c = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.InterfaceC4309kz0 f38409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile java.lang.Object f38410b = f38408c;

    private C4969qz0(com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0) {
        this.f38409a = interfaceC4309kz0;
    }

    public static com.google.android.gms.internal.ads.InterfaceC4309kz0 a(com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0) {
        return ((interfaceC4309kz0 instanceof com.google.android.gms.internal.ads.C4969qz0) || (interfaceC4309kz0 instanceof com.google.android.gms.internal.ads.Zy0)) ? interfaceC4309kz0 : new com.google.android.gms.internal.ads.C4969qz0(interfaceC4309kz0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final java.lang.Object b() {
        java.lang.Object obj = this.f38410b;
        if (obj != f38408c) {
            return obj;
        }
        com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0 = this.f38409a;
        if (interfaceC4309kz0 == null) {
            return this.f38410b;
        }
        java.lang.Object objB = interfaceC4309kz0.b();
        this.f38410b = objB;
        this.f38409a = null;
        return objB;
    }
}
