package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5608wp0 implements com.google.android.gms.internal.ads.Fl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f39687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final java.lang.Class f39688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.google.android.gms.internal.ads.EnumC3529dt0 f39689c;

    C5608wp0(java.lang.String str, java.lang.Class cls, com.google.android.gms.internal.ads.EnumC3529dt0 enumC3529dt0, com.google.android.gms.internal.ads.InterfaceC5292tw0 interfaceC5292tw0) {
        this.f39687a = str;
        this.f39688b = cls;
        this.f39689c = enumC3529dt0;
    }

    public static com.google.android.gms.internal.ads.Fl0 d(java.lang.String str, java.lang.Class cls, com.google.android.gms.internal.ads.EnumC3529dt0 enumC3529dt0, com.google.android.gms.internal.ads.InterfaceC5292tw0 interfaceC5292tw0) {
        return new com.google.android.gms.internal.ads.C5608wp0(str, cls, enumC3529dt0, interfaceC5292tw0);
    }

    @Override // com.google.android.gms.internal.ads.Fl0
    public final com.google.android.gms.internal.ads.C3749ft0 a(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        com.google.android.gms.internal.ads.C3969ht0 c3969ht0B0 = com.google.android.gms.internal.ads.C4187jt0.b0();
        c3969ht0B0.A(this.f39687a);
        c3969ht0B0.B(abstractC3753fv0);
        c3969ht0B0.z(com.google.android.gms.internal.ads.Kt0.RAW);
        com.google.android.gms.internal.ads.C5720xq0 c5720xq0 = (com.google.android.gms.internal.ads.C5720xq0) com.google.android.gms.internal.ads.Zp0.c().d(com.google.android.gms.internal.ads.Pp0.b().a(com.google.android.gms.internal.ads.Zp0.c().b(com.google.android.gms.internal.ads.C5830yq0.a((com.google.android.gms.internal.ads.C4187jt0) c3969ht0B0.u())), null), com.google.android.gms.internal.ads.C5720xq0.class, com.google.android.gms.internal.ads.Dl0.a());
        com.google.android.gms.internal.ads.C3420ct0 c3420ct0B0 = com.google.android.gms.internal.ads.C3749ft0.b0();
        c3420ct0B0.A(c5720xq0.g());
        c3420ct0B0.B(c5720xq0.d());
        c3420ct0B0.z(c5720xq0.b());
        return (com.google.android.gms.internal.ads.C3749ft0) c3420ct0B0.u();
    }

    @Override // com.google.android.gms.internal.ads.Fl0
    public final java.lang.Class b() {
        return this.f39688b;
    }

    @Override // com.google.android.gms.internal.ads.Fl0
    public final java.lang.Object c(com.google.android.gms.internal.ads.AbstractC3753fv0 abstractC3753fv0) {
        return com.google.android.gms.internal.ads.Wp0.a().c(com.google.android.gms.internal.ads.Zp0.c().a(com.google.android.gms.internal.ads.C5720xq0.a(this.f39687a, abstractC3753fv0, this.f39689c, com.google.android.gms.internal.ads.Kt0.RAW, null), com.google.android.gms.internal.ads.Dl0.a()), this.f39688b);
    }
}
