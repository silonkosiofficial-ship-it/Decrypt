package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3327c10 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f34416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f34417b;

    C3327c10(android.content.Context context, com.google.android.gms.internal.ads.Yk0 yk0) {
        this.f34416a = context;
        this.f34417b = yk0;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f34417b.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.Z00
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f33451a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C3108a10 c() {
        android.os.Bundle bundle;
        p174r3.v.t();
        java.lang.String string = !((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25432U5)).booleanValue() ? "" : this.f34416a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        java.lang.String string2 = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25454W5)).booleanValue() ? this.f34416a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        p174r3.v.t();
        android.content.Context context = this.f34416a;
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25443V5)).booleanValue()) {
            android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new android.os.Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            java.lang.String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i6 = 0; i6 < 4; i6++) {
                java.lang.String str = strArr[i6];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new com.google.android.gms.internal.ads.C3108a10(string, string2, bundle, null);
    }
}
