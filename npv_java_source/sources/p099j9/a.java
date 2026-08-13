package p099j9;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements java.lang.Comparable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f49334C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f49335D;

    public a(int i6, int i10) {
        this.f49334C = i6;
        this.f49335D = i10;
        if (i10 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Digits must be non-negative, but was " + i10).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(p099j9.a aVar) {
        p247y7.AbstractC7350t.f(aVar, "other");
        int iMax = java.lang.Math.max(this.f49335D, aVar.f49335D);
        return p247y7.AbstractC7350t.g(g(iMax), aVar.g(iMax));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof p099j9.a) && compareTo((p099j9.a) obj) == 0;
    }

    public final int g(int i6) {
        int i10 = this.f49335D;
        if (i6 == i10) {
            return this.f49334C;
        }
        if (i6 <= i10) {
            return this.f49334C / p099j9.e.b()[this.f49335D - i6];
        }
        return p099j9.e.b()[i6 - this.f49335D] * this.f49334C;
    }

    public int hashCode() {
        throw new java.lang.UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = p099j9.e.b()[this.f49335D];
        sb.append(this.f49334C / i6);
        sb.append('.');
        sb.append(S8.r.J0(java.lang.String.valueOf(i6 + (this.f49334C % i6)), "1"));
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
