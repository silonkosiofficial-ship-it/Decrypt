package p242y1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f57168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f57169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f57170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f57171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f57172e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f57173f;

    public f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list) {
        this.f57168a = (java.lang.String) B1.i.g(str);
        this.f57169b = (java.lang.String) B1.i.g(str2);
        this.f57170c = (java.lang.String) B1.i.g(str3);
        this.f57171d = (java.util.List) B1.i.g(list);
        this.f57173f = a(str, str2, str3);
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public java.util.List b() {
        return this.f57171d;
    }

    public int c() {
        return this.f57172e;
    }

    java.lang.String d() {
        return this.f57173f;
    }

    public java.lang.String e() {
        return this.f57168a;
    }

    public java.lang.String f() {
        return this.f57169b;
    }

    public java.lang.String g() {
        return this.f57170c;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f57168a + ", mProviderPackage: " + this.f57169b + ", mQuery: " + this.f57170c + ", mCertificates:");
        for (int i6 = 0; i6 < this.f57171d.size(); i6++) {
            sb.append(" [");
            java.util.List list = (java.util.List) this.f57171d.get(i6);
            for (int i10 = 0; i10 < list.size(); i10++) {
                sb.append(" \"");
                sb.append(android.util.Base64.encodeToString((byte[]) list.get(i10), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f57172e);
        return sb.toString();
    }
}
