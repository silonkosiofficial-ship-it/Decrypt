package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: androidx.core.content.pm.a$a, reason: collision with other inner class name */
    private static class C0404a {
        static android.content.pm.Signature[] a(android.content.pm.SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        static long b(android.content.pm.PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        static android.content.pm.Signature[] c(android.content.pm.SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        static boolean d(android.content.pm.SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        static boolean e(android.content.pm.PackageManager packageManager, java.lang.String str, byte[] bArr, int i6) {
            return packageManager.hasSigningCertificate(str, bArr, i6);
        }
    }

    public static long a(android.content.pm.PackageInfo packageInfo) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? androidx.core.content.pm.a.C0404a.b(packageInfo) : packageInfo.versionCode;
    }
}
