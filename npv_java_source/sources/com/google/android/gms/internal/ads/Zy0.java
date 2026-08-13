package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Zy0 implements com.google.android.gms.internal.ads.InterfaceC4309kz0, com.google.android.gms.internal.ads.Uy0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f33950c = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.google.android.gms.internal.ads.InterfaceC4309kz0 f33951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile java.lang.Object f33952b = f33950c;

    private Zy0(com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0) {
        this.f33951a = interfaceC4309kz0;
    }

    public static com.google.android.gms.internal.ads.Uy0 a(com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0) {
        return interfaceC4309kz0 instanceof com.google.android.gms.internal.ads.Uy0 ? (com.google.android.gms.internal.ads.Uy0) interfaceC4309kz0 : new com.google.android.gms.internal.ads.Zy0(interfaceC4309kz0);
    }

    public static com.google.android.gms.internal.ads.InterfaceC4309kz0 c(com.google.android.gms.internal.ads.InterfaceC4309kz0 interfaceC4309kz0) {
        return interfaceC4309kz0 instanceof com.google.android.gms.internal.ads.Zy0 ? interfaceC4309kz0 : new com.google.android.gms.internal.ads.Zy0(interfaceC4309kz0);
    }

    private final synchronized java.lang.Object d() {
        try {
            java.lang.Object obj = this.f33952b;
            java.lang.Object obj2 = f33950c;
            if (obj != obj2) {
                return obj;
            }
            java.lang.Object objB = this.f33951a.b();
            java.lang.Object obj3 = this.f33952b;
            if (obj3 != obj2 && obj3 != objB) {
                throw new java.lang.IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objB + ". This is likely due to a circular dependency.");
            }
            this.f33952b = objB;
            this.f33951a = null;
            return objB;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final java.lang.Object b() {
        java.lang.Object obj = this.f33952b;
        return obj == f33950c ? d() : obj;
    }
}
