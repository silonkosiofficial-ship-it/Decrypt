package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3486dV implements com.google.android.gms.internal.ads.ZH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.R60 f34734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2874Tm f34735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p104k3.EnumC6886c f34736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.google.android.gms.internal.ads.XC f34737d = null;

    C3486dV(com.google.android.gms.internal.ads.R60 r60, com.google.android.gms.internal.ads.InterfaceC2874Tm interfaceC2874Tm, p104k3.EnumC6886c enumC6886c) {
        this.f34734a = r60;
        this.f34735b = interfaceC2874Tm;
        this.f34736c = enumC6886c;
    }

    @Override // com.google.android.gms.internal.ads.ZH
    public final void a(boolean z6, android.content.Context context, com.google.android.gms.internal.ads.SC sc) throws com.google.android.gms.internal.ads.YH {
        boolean zC0;
        try {
            p104k3.EnumC6886c enumC6886c = p104k3.EnumC6886c.BANNER;
            int iOrdinal = this.f34736c.ordinal();
            if (iOrdinal == 1) {
                zC0 = this.f34735b.C0(X3.b.c2(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zC0 = this.f34735b.g0(X3.b.c2(context));
                    }
                    throw new com.google.android.gms.internal.ads.YH("Adapter failed to show.");
                }
                zC0 = this.f34735b.g4(X3.b.c2(context));
            }
            if (zC0) {
                com.google.android.gms.internal.ads.XC xc = this.f34737d;
                if (xc == null) {
                    return;
                }
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25252E1)).booleanValue() || this.f34734a.f31158Y != 2) {
                    return;
                }
                xc.a();
                return;
            }
            throw new com.google.android.gms.internal.ads.YH("Adapter failed to show.");
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.ads.YH(th);
        }
    }

    public final void b(com.google.android.gms.internal.ads.XC xc) {
        this.f34737d = xc;
    }
}
