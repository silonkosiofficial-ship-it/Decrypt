package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L70 {
    public static void a(android.content.Context context, boolean z6) {
        java.lang.String str;
        if (z6) {
            str = "This request is sent from a test device.";
        } else {
            p184s3.C7147y.b();
            str = "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + p224w3.g.A(context) + "\")) to get test ads on this device.";
        }
        p224w3.p.f(str);
    }

    public static void b(int i6, java.lang.Throwable th, java.lang.String str) {
        p224w3.p.f("Ad failed to load : " + i6);
        p214v3.AbstractC7265q0.l(str, th);
        if (i6 == 3) {
            return;
        }
        p174r3.v.s().w(th, str);
    }
}
