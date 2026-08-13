package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC3304bq implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f34380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.content.SharedPreferences f34381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f34382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private java.lang.String f34383d = "-1";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34384e = -1;

    SharedPreferencesOnSharedPreferenceChangeListenerC3304bq(android.content.Context context, p214v3.InterfaceC7268s0 interfaceC7268s0) {
        this.f34381b = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        this.f34382c = interfaceC7268s0;
        this.f34380a = context;
    }

    private final void b() {
        this.f34382c.H(true);
        p214v3.AbstractC7240e.c(this.f34380a);
    }

    private final void c(java.lang.String str, int i6) {
        android.content.Context context;
        boolean z6 = true;
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25306J0)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i6 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z6 = false;
        }
        this.f34382c.H(z6);
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.b6)).booleanValue() && z6 && (context = this.f34380a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    final void a() {
        android.content.SharedPreferences sharedPreferences;
        java.lang.String str;
        this.f34381b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.f34381b, "gad_has_consent_for_cookies");
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25328L0)).booleanValue()) {
            sharedPreferences = this.f34381b;
            str = "IABTCF_TCString";
        } else {
            sharedPreferences = this.f34381b;
            str = "IABTCF_PurposeConsents";
        }
        onSharedPreferenceChanged(sharedPreferences, str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        byte b6;
        try {
            if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25328L0)).booleanValue()) {
                if (j$.util.Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i6 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i6 != this.f34382c.b()) {
                        b();
                    }
                    this.f34382c.r(i6);
                    return;
                }
                if (j$.util.Objects.equals(str, "IABTCF_TCString")) {
                    java.lang.String string = sharedPreferences.getString(str, "-1");
                    if (!j$.util.Objects.equals(string, this.f34382c.m())) {
                        b();
                    }
                    this.f34382c.q(string);
                    return;
                }
                return;
            }
            java.lang.String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                    b6 = 1;
                } else {
                    b6 = -1;
                }
            } else if (strValueOf.equals("IABTCF_PurposeConsents")) {
                b6 = 0;
            } else {
                b6 = -1;
            }
            if (b6 == 0) {
                if (string2.equals("-1") || this.f34383d.equals(string2)) {
                    return;
                }
                this.f34383d = string2;
                c(string2, i10);
                return;
            }
            if (b6 != 1) {
                return;
            }
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25306J0)).booleanValue() || i10 == -1 || this.f34384e == i10) {
                return;
            }
            this.f34384e = i10;
            c(string2, i10);
        } catch (java.lang.Throwable th) {
            p174r3.v.s().x(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            p214v3.AbstractC7265q0.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
