package p005a4;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements H3.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static H3.b f17046e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f17047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.ScheduledExecutorService f17049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.ExecutorService f17050d;

    l(android.content.Context context) {
        this.f17048b = false;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        this.f17049c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f17050d = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.f17047a = context;
        if (this.f17048b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new p005a4.j(this, null), 0L, 86400L, java.util.concurrent.TimeUnit.SECONDS);
        this.f17048b = true;
    }

    static synchronized H3.b d(android.content.Context context) {
        try {
            Q3.AbstractC1477p.m(context, "Context must not be null");
            if (f17046e == null) {
                f17046e = new p005a4.l(context.getApplicationContext());
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return f17046e;
    }

    protected static final void f(android.content.Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            java.lang.String strValueOf = java.lang.String.valueOf(context.getPackageName());
            if (strValueOf.length() != 0) {
                "Failed to clear app set ID generated for App ".concat(strValueOf);
            } else {
                new java.lang.String("Failed to clear app set ID generated for App ");
            }
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        java.lang.String strValueOf2 = java.lang.String.valueOf(context.getPackageName());
        if (strValueOf2.length() != 0) {
            "Failed to clear app set ID last used time for App ".concat(strValueOf2);
        } else {
            new java.lang.String("Failed to clear app set ID last used time for App ");
        }
    }

    private static final android.content.SharedPreferences g(android.content.Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void h(android.content.Context context) throws p005a4.k {
        android.content.SharedPreferences sharedPreferencesG = g(context);
        if (sharedPreferencesG.edit().putLong("app_set_id_last_used_time", V3.i.d().a()).commit()) {
            return;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(context.getPackageName());
        if (strValueOf.length() != 0) {
            "Failed to store app set ID last used time for App ".concat(strValueOf);
        } else {
            new java.lang.String("Failed to store app set ID last used time for App ");
        }
        throw new p005a4.k("Failed to store the app set ID last used time.");
    }

    @Override // H3.b
    public final p115l4.AbstractC6931l a() {
        final p115l4.C6932m c6932m = new p115l4.C6932m();
        this.f17050d.execute(new java.lang.Runnable() { // from class: a4.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f17043C.e(c6932m);
            }
        });
        return c6932m.a();
    }

    protected final long b() {
        long j6 = g(this.f17047a).getLong("app_set_id_last_used_time", -1L);
        if (j6 != -1) {
            return j6 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void e(p115l4.C6932m c6932m) {
        java.lang.String string = g(this.f17047a).getString("app_set_id", null);
        long jB = b();
        if (string == null || V3.i.d().a() > jB) {
            string = java.util.UUID.randomUUID().toString();
            try {
                android.content.Context context = this.f17047a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    java.lang.String strValueOf = java.lang.String.valueOf(context.getPackageName());
                    if (strValueOf.length() != 0) {
                        "Failed to store app set ID generated for App ".concat(strValueOf);
                    } else {
                        new java.lang.String("Failed to store app set ID generated for App ");
                    }
                    throw new p005a4.k("Failed to store the app set ID.");
                }
                h(context);
                android.content.Context context2 = this.f17047a;
                android.content.SharedPreferences sharedPreferencesG = g(context2);
                if (!sharedPreferencesG.edit().putLong("app_set_id_creation_time", V3.i.d().a()).commit()) {
                    java.lang.String strValueOf2 = java.lang.String.valueOf(context2.getPackageName());
                    if (strValueOf2.length() != 0) {
                        "Failed to store app set ID creation time for App ".concat(strValueOf2);
                    } else {
                        new java.lang.String("Failed to store app set ID creation time for App ");
                    }
                    throw new p005a4.k("Failed to store the app set ID creation time.");
                }
            } catch (p005a4.k e6) {
                c6932m.b(e6);
                return;
            }
        } else {
            try {
                h(this.f17047a);
            } catch (p005a4.k e10) {
                c6932m.b(e10);
                return;
            }
        }
        c6932m.c(new H3.c(string, 1));
    }
}
