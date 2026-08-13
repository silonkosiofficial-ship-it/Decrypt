package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f50182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50183b;

    public k(p237x7.l lVar, int i6) {
        p247y7.AbstractC7350t.f(lVar, "number");
        this.f50182a = lVar;
        this.f50183b = i6;
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(("The minimum number of digits (" + i6 + ") is negative").toString());
        }
        if (i6 <= 9) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("The minimum number of digits (" + i6 + ") exceeds the length of an Int").toString());
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(appendable, "builder");
        java.lang.String strValueOf = java.lang.String.valueOf(((java.lang.Number) this.f50182a.l(obj)).intValue());
        int length = this.f50183b - strValueOf.length();
        for (int i6 = 0; i6 < length; i6++) {
            appendable.append('0');
        }
        appendable.append(strValueOf);
    }
}
