package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f50166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f50169d;

    public d(p237x7.l lVar, int i6, int i10, java.util.List list) {
        p247y7.AbstractC7350t.f(lVar, "number");
        p247y7.AbstractC7350t.f(list, "zerosToAdd");
        this.f50166a = lVar;
        this.f50167b = i6;
        this.f50168c = i10;
        this.f50169d = list;
        if (1 > i6 || i6 >= 10) {
            throw new java.lang.IllegalArgumentException(("The minimum number of digits (" + i6 + ") is not in range 1..9").toString());
        }
        if (i6 > i10 || i10 >= 10) {
            throw new java.lang.IllegalArgumentException(("The maximum number of digits (" + i10 + ") is not in range " + i6 + "..9").toString());
        }
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(appendable, "builder");
        int iG = ((p099j9.a) this.f50166a.l(obj)).g(this.f50168c);
        int i6 = 0;
        while (this.f50168c > this.f50167b + i6) {
            int i10 = i6 + 1;
            if (iG % p099j9.e.b()[i10] != 0) {
                break;
            } else {
                i6 = i10;
            }
        }
        int iIntValue = ((java.lang.Number) this.f50169d.get((this.f50168c - i6) - 1)).intValue();
        if (i6 >= iIntValue) {
            i6 -= iIntValue;
        }
        java.lang.String strSubstring = java.lang.String.valueOf((iG / p099j9.e.b()[i6]) + p099j9.e.b()[this.f50168c - i6]).substring(1);
        p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
        appendable.append(strSubstring);
    }
}
