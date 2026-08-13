package T;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f12827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f12828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f12829c;

    public k(java.lang.String str, char c6) {
        this.f12827a = str;
        this.f12828b = c6;
        this.f12829c = S8.r.R(str, java.lang.String.valueOf(c6), "", false, 4, null);
    }

    public final char a() {
        return this.f12828b;
    }

    public final java.lang.String b() {
        return this.f12827a;
    }

    public final java.lang.String c() {
        return this.f12829c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T.k)) {
            return false;
        }
        T.k kVar = (T.k) obj;
        return p247y7.AbstractC7350t.b(this.f12827a, kVar.f12827a) && this.f12828b == kVar.f12828b;
    }

    public int hashCode() {
        return (this.f12827a.hashCode() * 31) + this.f12828b;
    }

    public java.lang.String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f12827a + ", delimiter=" + this.f12828b + ')';
    }
}
