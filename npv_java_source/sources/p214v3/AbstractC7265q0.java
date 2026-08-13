package p214v3;

/* JADX INFO: renamed from: v3.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7265q0 extends p224w3.p {
    public static void k(java.lang.String str) {
        if (!m() || str == null || str.length() <= 4000) {
            return;
        }
        boolean z6 = true;
        for (java.lang.String str2 : p224w3.p.f56258a.d(str)) {
            if (z6) {
            }
            z6 = false;
        }
    }

    public static void l(java.lang.String str, java.lang.Throwable th) {
        if (m()) {
        }
    }

    public static boolean m() {
        return p224w3.p.j(2) && ((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2311Eg.f27098a.e()).booleanValue();
    }
}
