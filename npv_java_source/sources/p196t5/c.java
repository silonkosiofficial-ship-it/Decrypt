package p196t5;

/* JADX INFO: loaded from: classes3.dex */
public class c implements p196t5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54624a;

    public c(int i6) {
        this.f54624a = i6;
    }

    private static boolean b(java.lang.StackTraceElement[] stackTraceElementArr, int i6, int i10) {
        int i11 = i10 - i6;
        if (i10 + i11 > stackTraceElementArr.length) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!stackTraceElementArr[i6 + i12].equals(stackTraceElementArr[i10 + i12])) {
                return false;
            }
        }
        return true;
    }

    private static java.lang.StackTraceElement[] c(java.lang.StackTraceElement[] stackTraceElementArr, int i6) {
        int i10;
        java.util.HashMap map = new java.util.HashMap();
        java.lang.StackTraceElement[] stackTraceElementArr2 = new java.lang.StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            java.lang.Integer num = (java.lang.Integer) map.get(stackTraceElement);
            if (num == null || !b(stackTraceElementArr, num.intValue(), i11)) {
                stackTraceElementArr2[i12] = stackTraceElementArr[i11];
                i12++;
                i13 = 1;
                i10 = i11;
            } else {
                int iIntValue = i11 - num.intValue();
                if (i13 < i6) {
                    java.lang.System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, iIntValue);
                    i12 += iIntValue;
                    i13++;
                }
                i10 = (iIntValue - 1) + i11;
            }
            map.put(stackTraceElement, java.lang.Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        java.lang.StackTraceElement[] stackTraceElementArr3 = new java.lang.StackTraceElement[i12];
        java.lang.System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        return stackTraceElementArr3;
    }

    @Override // p196t5.d
    public java.lang.StackTraceElement[] a(java.lang.StackTraceElement[] stackTraceElementArr) {
        java.lang.StackTraceElement[] stackTraceElementArrC = c(stackTraceElementArr, this.f54624a);
        return stackTraceElementArrC.length < stackTraceElementArr.length ? stackTraceElementArrC : stackTraceElementArr;
    }
}
