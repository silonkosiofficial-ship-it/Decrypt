package F0;

/* JADX INFO: renamed from: F0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0908a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f2548b = new int[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private X.b[] f2549c = new X.b[16];

    public final boolean a() {
        int i6 = this.f2547a;
        return i6 > 0 && this.f2548b[i6 - 1] >= 0;
    }

    public final java.lang.Object b() {
        int i6 = this.f2547a;
        if (i6 <= 0) {
            throw new java.lang.IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()".toString());
        }
        int i10 = i6 - 1;
        int i11 = this.f2548b[i10];
        X.b bVar = this.f2549c[i10];
        p247y7.AbstractC7350t.c(bVar);
        if (i11 > 0) {
            int[] iArr = this.f2548b;
            iArr[i10] = iArr[i10] - 1;
        } else if (i11 == 0) {
            this.f2549c[i10] = null;
            this.f2547a--;
        }
        return bVar.s()[i11];
    }

    public final void c(X.b bVar) {
        if (bVar.w()) {
            return;
        }
        int i6 = this.f2547a;
        int[] iArr = this.f2548b;
        if (i6 >= iArr.length) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, iArr.length * 2);
            p247y7.AbstractC7350t.e(iArrCopyOf, "copyOf(this, newSize)");
            this.f2548b = iArrCopyOf;
            X.b[] bVarArr = this.f2549c;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(bVarArr, bVarArr.length * 2);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
            this.f2549c = (X.b[]) objArrCopyOf;
        }
        this.f2548b[i6] = bVar.t() - 1;
        this.f2549c[i6] = bVar;
        this.f2547a++;
    }
}
