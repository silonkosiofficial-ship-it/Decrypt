package G2;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G2.d[] f3027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f3028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f3029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3030d;

    public c(java.lang.String str, G2.d[] dVarArr) {
        this.f3028b = str;
        this.f3029c = null;
        this.f3027a = dVarArr;
        this.f3030d = 0;
    }

    public c(byte[] bArr, G2.d[] dVarArr) {
        j$.util.Objects.requireNonNull(bArr);
        this.f3029c = bArr;
        this.f3028b = null;
        this.f3027a = dVarArr;
        this.f3030d = 1;
    }

    private void a(int i6) {
        if (i6 == this.f3030d) {
            return;
        }
        throw new java.lang.IllegalStateException("Wrong data accessor type detected. " + c(this.f3030d) + " expected, but got " + c(i6));
    }

    private java.lang.String c(int i6) {
        if (i6 != 0) {
            return i6 != 1 ? "Unknown" : "ArrayBuffer";
        }
        return "String";
    }

    public java.lang.String b() {
        a(0);
        return this.f3028b;
    }
}
