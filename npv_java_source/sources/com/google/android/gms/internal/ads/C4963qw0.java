package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4963qw0 implements com.google.android.gms.internal.ads.Ew0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC4523mw0 f38398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Lw0 f38399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38400c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC5840yv0 f38401d;

    private C4963qw0(com.google.android.gms.internal.ads.Lw0 lw0, com.google.android.gms.internal.ads.AbstractC5840yv0 abstractC5840yv0, com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0) {
        this.f38399b = lw0;
        this.f38401d = abstractC5840yv0;
        this.f38398a = interfaceC4523mw0;
    }

    static com.google.android.gms.internal.ads.C4963qw0 k(com.google.android.gms.internal.ads.Lw0 lw0, com.google.android.gms.internal.ads.AbstractC5840yv0 abstractC5840yv0, com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0) {
        return new com.google.android.gms.internal.ads.C4963qw0(lw0, abstractC5840yv0, interfaceC4523mw0);
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final void a(java.lang.Object obj) {
        this.f38399b.i(obj);
        this.f38401d.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final int b(java.lang.Object obj) {
        int iB = ((com.google.android.gms.internal.ads.Jv0) obj).zzt.b();
        if (!this.f38400c) {
            return iB;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final int c(java.lang.Object obj) {
        int iHashCode = ((com.google.android.gms.internal.ads.Jv0) obj).zzt.hashCode();
        if (!this.f38400c) {
            return iHashCode;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final java.lang.Object d() {
        com.google.android.gms.internal.ads.InterfaceC4523mw0 interfaceC4523mw0 = this.f38398a;
        return interfaceC4523mw0 instanceof com.google.android.gms.internal.ads.Jv0 ? ((com.google.android.gms.internal.ads.Jv0) interfaceC4523mw0).K() : interfaceC4523mw0.b().s();
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final void e(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.ads.Gw0.A(this.f38399b, obj, obj2);
        if (this.f38400c) {
            com.google.android.gms.internal.ads.Gw0.z(this.f38401d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final boolean f(java.lang.Object obj, java.lang.Object obj2) {
        if (!((com.google.android.gms.internal.ads.Jv0) obj).zzt.equals(((com.google.android.gms.internal.ads.Jv0) obj2).zzt)) {
            return false;
        }
        if (!this.f38400c) {
            return true;
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final void g(java.lang.Object obj, com.google.android.gms.internal.ads.Yw0 yw0) {
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final void h(java.lang.Object obj, byte[] bArr, int i6, int i10, com.google.android.gms.internal.ads.Su0 su0) {
        com.google.android.gms.internal.ads.Jv0 jv0 = (com.google.android.gms.internal.ads.Jv0) obj;
        if (jv0.zzt == com.google.android.gms.internal.ads.Mw0.c()) {
            jv0.zzt = com.google.android.gms.internal.ads.Mw0.f();
        }
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final boolean i(java.lang.Object obj) {
        androidx.appcompat.app.D.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.Ew0
    public final void j(java.lang.Object obj, com.google.android.gms.internal.ads.InterfaceC5842yw0 interfaceC5842yw0, com.google.android.gms.internal.ads.C5730xv0 c5730xv0) {
        this.f38399b.a(obj);
        androidx.appcompat.app.D.a(obj);
        throw null;
    }
}
