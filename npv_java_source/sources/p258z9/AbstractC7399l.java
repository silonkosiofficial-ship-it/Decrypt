package p258z9;

/* JADX INFO: renamed from: z9.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7399l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p097j7.C6871m f57770a = new p097j7.C6871m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f57771b;

    protected final void a(char[] cArr) {
        p247y7.AbstractC7350t.f(cArr, "array");
        synchronized (this) {
            try {
                if (this.f57771b + cArr.length < p258z9.AbstractC7397j.f57768a) {
                    this.f57771b += cArr.length;
                    this.f57770a.g(cArr);
                }
                p087i7.M m6 = p087i7.M.f46721a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    protected final char[] b(int i6) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f57770a.U();
            if (cArr != null) {
                this.f57771b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i6] : cArr;
    }
}
