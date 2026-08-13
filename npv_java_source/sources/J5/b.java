package J5;

/* JADX INFO: loaded from: classes3.dex */
public class b implements J5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static J5.b f5727a;

    private b() {
    }

    public static J5.b b() {
        if (f5727a == null) {
            f5727a = new J5.b();
        }
        return f5727a;
    }

    @Override // J5.a
    public long a() {
        return java.lang.System.currentTimeMillis();
    }
}
