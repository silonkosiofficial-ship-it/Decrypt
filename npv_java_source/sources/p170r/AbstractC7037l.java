package p170r;

/* JADX INFO: renamed from: r.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7037l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f53390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53391b;

    private AbstractC7037l(int i6) {
        this.f53390a = i6 == 0 ? p170r.AbstractC7042q.a() : new int[i6];
    }

    public /* synthetic */ AbstractC7037l(int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(i6);
    }

    public static /* synthetic */ java.lang.String e(p170r.AbstractC7037l abstractC7037l, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, int i10, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i10 & 1) != 0) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence5 = (i10 & 2) != 0 ? "" : charSequence2;
        java.lang.CharSequence charSequence6 = (i10 & 4) == 0 ? charSequence3 : "";
        if ((i10 & 8) != 0) {
            i6 = -1;
        }
        int i11 = i6;
        if ((i10 & 16) != 0) {
            charSequence4 = "...";
        }
        return abstractC7037l.d(charSequence, charSequence5, charSequence6, i11, charSequence4);
    }

    public final int a(int i6) {
        if (i6 >= 0 && i6 < this.f53391b) {
            return this.f53390a[i6];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Index ");
        sb.append(i6);
        sb.append(" must be in 0..");
        sb.append(this.f53391b - 1);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public final int b() {
        return this.f53391b;
    }

    public final int c(int i6) {
        int[] iArr = this.f53390a;
        int i10 = this.f53391b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i6 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public final java.lang.String d(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4) {
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        int[] iArr = this.f53390a;
        int i10 = this.f53391b;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i11 == i6) {
                sb.append(charSequence4);
                java.lang.String string = sb.toString();
                p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb.append(charSequence);
            }
            sb.append(i12);
        }
        sb.append(charSequence3);
        java.lang.String string2 = sb.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p170r.AbstractC7037l) {
            p170r.AbstractC7037l abstractC7037l = (p170r.AbstractC7037l) obj;
            int i6 = abstractC7037l.f53391b;
            int i10 = this.f53391b;
            if (i6 == i10) {
                int[] iArr = this.f53390a;
                int[] iArr2 = abstractC7037l.f53390a;
                E7.i iVarQ = E7.j.q(0, i10);
                int iF = iVarQ.f();
                int iG = iVarQ.g();
                if (iF > iG) {
                    return true;
                }
                while (iArr[iF] == iArr2[iF]) {
                    if (iF == iG) {
                        return true;
                    }
                    iF++;
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f53390a;
        int i6 = this.f53391b;
        int i10 = 0;
        for (int i11 = 0; i11 < i6; i11++) {
            i10 += iArr[i11] * 31;
        }
        return i10;
    }

    public java.lang.String toString() {
        return e(this, null, "[", "]", 0, null, 25, null);
    }
}
