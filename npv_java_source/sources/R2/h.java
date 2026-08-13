package R2;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.WorkDatabase f9427a;

    public h(androidx.work.impl.WorkDatabase workDatabase) {
        this.f9427a = workDatabase;
    }

    public static void b(android.content.Context context, p253z2.d dVar) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j6 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            dVar.u();
            try {
                dVar.j0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"last_cancel_all_time_ms", java.lang.Long.valueOf(j6)});
                dVar.j0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"reschedule_needed", java.lang.Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                dVar.i0();
            } finally {
                dVar.B0();
            }
        }
    }

    public boolean a() {
        java.lang.Long lA = this.f9427a.U().a("reschedule_needed");
        return lA != null && lA.longValue() == 1;
    }

    public void c(boolean z6) {
        this.f9427a.U().b(new Q2.d("reschedule_needed", z6));
    }
}
