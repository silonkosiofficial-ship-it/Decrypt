package Y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final long a(int i6, int i10, int i11, int i12, int i13, int i14) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i6, i10 - 1, i11, i12, i13, i14);
        return gregorianCalendar.getTime().getTime();
    }
}
