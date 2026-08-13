package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class H50 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27977c;

    public H50(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f27975a = interfaceC5078rz0;
        this.f27976b = interfaceC5078rz1;
        this.f27977c = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.F50 b() {
        android.content.Context context = (android.content.Context) this.f27975a.b();
        com.google.android.gms.internal.ads.X70 x70 = (com.google.android.gms.internal.ads.X70) this.f27976b.b();
        com.google.android.gms.internal.ads.C4878q80 c4878q80 = (com.google.android.gms.internal.ads.C4878q80) this.f27977c.b();
        com.google.android.gms.internal.ads.C2695Oq c2695OqI = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.g6)).booleanValue() ? p174r3.v.s().j().i() : p174r3.v.s().j().g();
        boolean z6 = false;
        if (c2695OqI != null && c2695OqI.h()) {
            z6 = true;
        }
        if (((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.w6)).intValue() > 0) {
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f6)).booleanValue() || z6) {
                com.google.android.gms.internal.ads.C4768p80 c4768p80A = c4878q80.a(com.google.android.gms.internal.ads.EnumC3780g80.AppOpen, context, x70, new com.google.android.gms.internal.ads.C3994i50(new com.google.android.gms.internal.ads.C3664f50()));
                com.google.android.gms.internal.ads.C5311u50 c5311u50 = new com.google.android.gms.internal.ads.C5311u50(new com.google.android.gms.internal.ads.C5201t50());
                com.google.android.gms.internal.ads.InterfaceC3232b80 interfaceC3232b80 = c4768p80A.f37918a;
                com.google.android.gms.internal.ads.Yk0 yk0 = com.google.android.gms.internal.ads.AbstractC3524dr.f34795a;
                return new com.google.android.gms.internal.ads.C4212k50(c5311u50, new com.google.android.gms.internal.ads.C4872q50(interfaceC3232b80, yk0), c4768p80A.f37919b, c4768p80A.f37918a.a().f36596J, yk0);
            }
        }
        return new com.google.android.gms.internal.ads.C5201t50();
    }
}
