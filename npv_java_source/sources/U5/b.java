package U5;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements U5.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final U5.b.a f14479b = new U5.b.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Bundle f14480a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public b(android.content.Context context) {
        p247y7.AbstractC7350t.f(context, "context");
        android.os.Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f14480a = bundle == null ? android.os.Bundle.EMPTY : bundle;
    }

    @Override // U5.h
    public java.lang.Boolean a() {
        if (this.f14480a.containsKey("firebase_sessions_enabled")) {
            return java.lang.Boolean.valueOf(this.f14480a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // U5.h
    public java.lang.Object b(p127m7.e eVar) {
        return U5.h.a.a(this, eVar);
    }

    @Override // U5.h
    public T8.a c() {
        if (this.f14480a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return T8.a.o(T8.c.s(this.f14480a.getInt("firebase_sessions_sessions_restart_timeout"), T8.d.SECONDS));
        }
        return null;
    }

    @Override // U5.h
    public java.lang.Double d() {
        if (this.f14480a.containsKey("firebase_sessions_sampling_rate")) {
            return java.lang.Double.valueOf(this.f14480a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }
}
