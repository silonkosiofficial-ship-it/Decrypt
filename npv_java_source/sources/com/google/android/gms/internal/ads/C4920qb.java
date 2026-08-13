package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4920qb extends com.google.android.gms.internal.ads.AbstractCallableC5249tb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final android.view.View f38287h;

    public C4920qb(com.google.android.gms.internal.ads.C2262Da c2262Da, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.C5316u8 c5316u8, int i6, int i10, android.view.View view) {
        super(c2262Da, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", c5316u8, i6, 57);
        this.f38287h = view;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC5249tb
    protected final void a() {
        if (this.f38287h != null) {
            java.lang.Boolean bool = (java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25745y3);
            java.lang.Boolean bool2 = (java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Qa);
            com.google.android.gms.internal.ads.C2410Ha c2410Ha = new com.google.android.gms.internal.ads.C2410Ha((java.lang.String) this.f38978e.invoke(null, this.f38287h, this.f38974a.b().getResources().getDisplayMetrics(), bool, bool2));
            com.google.android.gms.internal.ads.O8 o8B0 = com.google.android.gms.internal.ads.P8.b0();
            o8B0.A(c2410Ha.f28067b.longValue());
            o8B0.C(c2410Ha.f28068c.longValue());
            o8B0.E(c2410Ha.f28069d.longValue());
            if (bool2.booleanValue()) {
                o8B0.B(c2410Ha.f28071f.longValue());
            }
            if (bool.booleanValue()) {
                o8B0.z(c2410Ha.f28070e.longValue());
            }
            this.f38977d.a0((com.google.android.gms.internal.ads.P8) o8B0.u());
        }
    }
}
