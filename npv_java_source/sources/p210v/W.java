package p210v;

/* JADX INFO: loaded from: classes.dex */
public interface W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v.W.a f55641a = v.W.a.f55642a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ v.W.a f55642a = new v.W.a();

        private a() {
        }

        public final p210v.W a() {
            if (p210v.K.d(0, 1, null)) {
                return android.os.Build.VERSION.SDK_INT == 28 ? p210v.X.f55643b : p210v.Y.f55646b;
            }
            throw new java.lang.UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    boolean a();

    p210v.V b(android.view.View view, boolean z6, long j6, float f6, float f10, boolean z10, Y0.e eVar, float f11);
}
