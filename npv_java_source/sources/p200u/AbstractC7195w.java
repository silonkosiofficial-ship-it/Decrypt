package p200u;

/* JADX INFO: renamed from: u.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7195w {
    public static /* synthetic */ int a(double d6) {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(d6);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
