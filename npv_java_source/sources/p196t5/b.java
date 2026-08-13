package p196t5;

/* JADX INFO: loaded from: classes3.dex */
public class b implements p196t5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54623a;

    public b(int i6) {
        this.f54623a = i6;
    }

    @Override // p196t5.d
    public java.lang.StackTraceElement[] a(java.lang.StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i6 = this.f54623a;
        if (length <= i6) {
            return stackTraceElementArr;
        }
        int i10 = i6 / 2;
        int i11 = i6 - i10;
        java.lang.StackTraceElement[] stackTraceElementArr2 = new java.lang.StackTraceElement[i6];
        java.lang.System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i11);
        java.lang.System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i10, stackTraceElementArr2, i11, i10);
        return stackTraceElementArr2;
    }
}
