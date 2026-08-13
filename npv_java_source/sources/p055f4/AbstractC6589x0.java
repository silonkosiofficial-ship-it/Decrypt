package p055f4;

/* JADX INFO: renamed from: f4.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6589x0 {
    public static boolean a(boolean z6) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return android.os.Build.DEVICE.startsWith("generic");
        }
        java.lang.String str = android.os.Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || android.os.Build.HARDWARE.contains("ranchu");
    }
}
