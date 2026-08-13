package com.android.billingclient.api;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class x {
    static {
        int i6 = com.android.billingclient.api.y.f24640a;
    }

    public static java.lang.String a(java.lang.Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            java.lang.String str = exc.getClass().getSimpleName() + ":" + com.google.android.gms.internal.play_billing.AbstractC6300u.b(exc.getMessage());
            int i6 = com.google.android.gms.internal.play_billing.AbstractC6195c1.f41524a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static com.google.android.gms.internal.play_billing.N3 b(int i6, int i10, com.android.billingclient.api.C2135d c2135d) {
        try {
            com.google.android.gms.internal.play_billing.L3 l3E = com.google.android.gms.internal.play_billing.N3.E();
            com.google.android.gms.internal.play_billing.T3 t3F = com.google.android.gms.internal.play_billing.X3.F();
            t3F.t(c2135d.b());
            t3F.r(c2135d.a());
            t3F.u(i6);
            l3E.q(t3F);
            l3E.r(i10);
            return (com.google.android.gms.internal.play_billing.N3) l3E.l();
        } catch (java.lang.Exception e6) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to create logging payload", e6);
            return null;
        }
    }

    public static com.google.android.gms.internal.play_billing.N3 c(int i6, int i10, com.android.billingclient.api.C2135d c2135d, java.lang.String str) {
        try {
            com.google.android.gms.internal.play_billing.T3 t3F = com.google.android.gms.internal.play_billing.X3.F();
            t3F.t(c2135d.b());
            t3F.r(c2135d.a());
            t3F.u(i6);
            if (str != null) {
                t3F.q(str);
            }
            com.google.android.gms.internal.play_billing.L3 l3E = com.google.android.gms.internal.play_billing.N3.E();
            l3E.q(t3F);
            l3E.r(i10);
            return (com.google.android.gms.internal.play_billing.N3) l3E.l();
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static com.google.android.gms.internal.play_billing.S3 d(int i6) {
        try {
            com.google.android.gms.internal.play_billing.Q3 q3D = com.google.android.gms.internal.play_billing.S3.D();
            q3D.r(i6);
            return (com.google.android.gms.internal.play_billing.S3) q3D.l();
        } catch (java.lang.Exception e6) {
            com.google.android.gms.internal.play_billing.AbstractC6195c1.k("BillingLogger", "Unable to create logging payload", e6);
            return null;
        }
    }
}
