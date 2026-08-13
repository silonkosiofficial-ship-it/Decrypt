package p083i2;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p083i2.b f46656a = new p083i2.b();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i2.b.a f46657a = new i2.b.a();

        private a() {
        }

        public final int a() {
            return android.os.ext.SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private b() {
    }

    public final int a() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return i2.b.a.f46657a.a();
        }
        return 0;
    }
}
