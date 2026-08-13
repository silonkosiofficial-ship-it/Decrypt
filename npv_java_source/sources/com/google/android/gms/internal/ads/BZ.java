package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class BZ implements com.google.android.gms.internal.ads.K20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Integer f25979a;

    private BZ(java.lang.Integer num) {
        this.f25979a = num;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.BZ a(p224w3.a aVar) {
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25436U9)).booleanValue()) {
            return new com.google.android.gms.internal.ads.BZ(null);
        }
        p174r3.v.t();
        int extensionVersion = 0;
        try {
            int i6 = android.os.Build.VERSION.SDK_INT;
            if (i6 < 30 || android.os.ext.SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25469X9)).booleanValue()) {
                    if (aVar.f56219E >= ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25458W9)).intValue() && i6 >= 31 && android.os.ext.SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = android.os.ext.SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = android.os.ext.SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (java.lang.Exception e6) {
            p174r3.v.s().x(e6, "AdUtil.getAdServicesExtensionVersion");
        }
        return new com.google.android.gms.internal.ads.BZ(java.lang.Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* synthetic */ void b(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.K20
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        java.lang.Integer num = this.f25979a;
        com.google.android.gms.internal.ads.C3677fC c3677fC = (com.google.android.gms.internal.ads.C3677fC) obj;
        if (num != null) {
            c3677fC.f35301a.putInt("aos", num.intValue());
        }
    }
}
