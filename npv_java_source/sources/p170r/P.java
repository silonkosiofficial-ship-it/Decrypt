package p170r;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object[] f53322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53323b;

    static final class a extends p247y7.AbstractC7352v implements p237x7.l {
        a() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.CharSequence l(java.lang.Object obj) {
            return obj == p170r.P.this ? "(this)" : java.lang.String.valueOf(obj);
        }
    }

    private P(int i6) {
        this.f53322a = i6 == 0 ? p170r.Q.f53325a : new java.lang.Object[i6];
    }

    public /* synthetic */ P(int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(i6);
    }

    public static /* synthetic */ java.lang.String f(p170r.P p6, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar, int i10, java.lang.Object obj) {
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
        java.lang.CharSequence charSequence7 = charSequence4;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return p6.e(charSequence, charSequence5, charSequence6, i11, charSequence7, lVar);
    }

    public final boolean a(java.lang.Object obj) {
        return b(obj) >= 0;
    }

    public final int b(java.lang.Object obj) {
        int i6 = 0;
        if (obj == null) {
            java.lang.Object[] objArr = this.f53322a;
            int i10 = this.f53323b;
            while (i6 < i10) {
                if (objArr[i6] == null) {
                    return i6;
                }
                i6++;
            }
            return -1;
        }
        java.lang.Object[] objArr2 = this.f53322a;
        int i11 = this.f53323b;
        while (i6 < i11) {
            if (obj.equals(objArr2[i6])) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public final boolean c() {
        return this.f53323b == 0;
    }

    public final boolean d() {
        return this.f53323b != 0;
    }

    public final java.lang.String e(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i6, java.lang.CharSequence charSequence4, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(charSequence, "separator");
        p247y7.AbstractC7350t.f(charSequence2, "prefix");
        p247y7.AbstractC7350t.f(charSequence3, "postfix");
        p247y7.AbstractC7350t.f(charSequence4, "truncated");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence2);
        java.lang.Object[] objArr = this.f53322a;
        int i10 = this.f53323b;
        for (int i11 = 0; i11 < i10; i11++) {
            java.lang.Object obj = objArr[i11];
            if (i11 == i6) {
                sb.append(charSequence4);
                java.lang.String string = sb.toString();
                p247y7.AbstractC7350t.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            }
            if (i11 != 0) {
                sb.append(charSequence);
            }
            if (lVar == null) {
                sb.append(obj);
            } else {
                sb.append((java.lang.CharSequence) lVar.l(obj));
            }
        }
        sb.append(charSequence3);
        java.lang.String string2 = sb.toString();
        p247y7.AbstractC7350t.e(string2, "StringBuilder().apply(builderAction).toString()");
        return string2;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p170r.P) {
            p170r.P p6 = (p170r.P) obj;
            int i6 = p6.f53323b;
            int i10 = this.f53323b;
            if (i6 == i10) {
                java.lang.Object[] objArr = this.f53322a;
                java.lang.Object[] objArr2 = p6.f53322a;
                E7.i iVarQ = E7.j.q(0, i10);
                int iF = iVarQ.f();
                int iG = iVarQ.g();
                if (iF > iG) {
                    return true;
                }
                while (p247y7.AbstractC7350t.b(objArr[iF], objArr2[iF])) {
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
        java.lang.Object[] objArr = this.f53322a;
        int i6 = this.f53323b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            java.lang.Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public java.lang.String toString() {
        return f(this, null, "[", "]", 0, null, new r.P.a(), 25, null);
    }
}
