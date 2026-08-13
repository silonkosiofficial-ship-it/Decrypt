package V6;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f15134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f15135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f15136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Long f15137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f15138e;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l6, java.lang.String str4) {
        this.f15134a = str;
        this.f15135b = str2;
        this.f15136c = str3;
        this.f15137d = l6;
        this.f15138e = str4;
    }

    public /* synthetic */ a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l6, java.lang.String str4, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : l6, (i6 & 16) != 0 ? null : str4);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        V6.b.b(sb, "data", this.f15134a);
        V6.b.b(sb, "event", this.f15135b);
        V6.b.b(sb, "id", this.f15136c);
        V6.b.b(sb, "retry", this.f15137d);
        V6.b.b(sb, "", this.f15138e);
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
