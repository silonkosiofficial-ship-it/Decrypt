package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class E2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.measurement.internal.S2 f41776a;

    E2(com.google.android.gms.measurement.internal.H5 h6) {
        this.f41776a = h6.t0();
    }

    final android.os.Bundle a(java.lang.String str, com.google.android.gms.internal.measurement.InterfaceC5987d0 interfaceC5987d0) {
        this.f41776a.l().n();
        if (interfaceC5987d0 == null) {
            this.f41776a.j().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package_name", str);
        try {
            android.os.Bundle bundleE0 = interfaceC5987d0.e0(bundle);
            if (bundleE0 != null) {
                return bundleE0;
            }
            this.f41776a.j().G().a("Install Referrer Service returned a null response");
            return null;
        } catch (java.lang.Exception e6) {
            this.f41776a.j().G().b("Exception occurred while retrieving the Install Referrer", e6.getMessage());
            return null;
        }
    }

    final boolean b() {
        try {
            W3.d dVarA = W3.e.a(this.f41776a.a());
            if (dVarA != null) {
                return dVarA.f("com.android.vending", 128).versionCode >= 80837300;
            }
            this.f41776a.j().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (java.lang.Exception e6) {
            this.f41776a.j().K().b("Failed to retrieve Play Store version for Install Referrer", e6);
            return false;
        }
    }
}
