package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.util.Set f4291c = new java.util.HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f4292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f4293b;

    public static class a extends H2.s {
        a(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    public static class b extends H2.s {
        b(java.lang.String str, java.lang.String str2) {
            super(str, str2);
        }
    }

    s(java.lang.String str, java.lang.String str2) {
        this.f4292a = str;
        this.f4293b = str2;
        f4291c.add(this);
    }
}
