package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class A0 {
    public static int a(int i6, int i10, java.lang.String str) {
        java.lang.String strA;
        if (i6 >= 0 && i6 < i10) {
            return i6;
        }
        if (i6 < 0) {
            strA = p055f4.B0.a("%s (%s) must not be negative", "index", java.lang.Integer.valueOf(i6));
        } else {
            if (i10 < 0) {
                throw new java.lang.IllegalArgumentException("negative size: " + i10);
            }
            strA = p055f4.B0.a("%s (%s) must be less than size (%s)", "index", java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10));
        }
        throw new java.lang.IndexOutOfBoundsException(strA);
    }

    public static int b(int i6, int i10, java.lang.String str) {
        if (i6 < 0 || i6 > i10) {
            throw new java.lang.IndexOutOfBoundsException(d(i6, i10, "index"));
        }
        return i6;
    }

    public static void c(int i6, int i10, int i11) {
        java.lang.String strD;
        if (i6 < 0 || i10 < i6 || i10 > i11) {
            if (i6 < 0 || i6 > i11) {
                strD = d(i6, i11, "start index");
            } else {
                strD = (i10 < 0 || i10 > i11) ? d(i10, i11, "end index") : p055f4.B0.a("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i6));
            }
            throw new java.lang.IndexOutOfBoundsException(strD);
        }
    }

    private static java.lang.String d(int i6, int i10, java.lang.String str) {
        if (i6 < 0) {
            return p055f4.B0.a("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i6));
        }
        if (i10 >= 0) {
            return p055f4.B0.a("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i6), java.lang.Integer.valueOf(i10));
        }
        throw new java.lang.IllegalArgumentException("negative size: " + i10);
    }
}
