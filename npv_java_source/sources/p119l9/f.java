package p119l9;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements p119l9.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p237x7.l f50170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50172c;

    public f(p237x7.l lVar, int i6, int i10) {
        p247y7.AbstractC7350t.f(lVar, "number");
        this.f50170a = lVar;
        this.f50171b = i6;
        this.f50172c = i10;
    }

    @Override // p119l9.e
    public void a(java.lang.Object obj, java.lang.Appendable appendable, boolean z6) throws java.io.IOException {
        p247y7.AbstractC7350t.f(appendable, "builder");
        int iIntValue = ((java.lang.Number) this.f50170a.l(obj)).intValue();
        int i6 = p099j9.e.b()[this.f50171b];
        int i10 = iIntValue - this.f50172c;
        if (i10 >= 0 && i10 < i6) {
            java.lang.String strValueOf = java.lang.String.valueOf(iIntValue % p099j9.e.b()[this.f50171b]);
            S8.r.a(appendable, S8.r.N("0", java.lang.Math.max(0, this.f50171b - strValueOf.length())), strValueOf);
        } else {
            if (iIntValue >= 0) {
                appendable.append("+");
            }
            appendable.append(java.lang.String.valueOf(iIntValue));
        }
    }
}
