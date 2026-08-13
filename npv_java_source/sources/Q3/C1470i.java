package Q3;

/* JADX INFO: renamed from: Q3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1470i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f8975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f8976b;

    public C1470i(java.lang.String str) {
        this(str, null);
    }

    public C1470i(java.lang.String str, java.lang.String str2) {
        Q3.AbstractC1477p.m(str, "log tag cannot be null");
        Q3.AbstractC1477p.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f8975a = str;
        this.f8976b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
