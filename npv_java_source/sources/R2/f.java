package R2;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.WorkDatabase f9425a;

    public f(androidx.work.impl.WorkDatabase workDatabase) {
        this.f9425a = workDatabase;
    }

    public static void a(android.content.Context context, p253z2.d dVar) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i6 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i10 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            dVar.u();
            try {
                dVar.j0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"next_job_scheduler_id", java.lang.Integer.valueOf(i6)});
                dVar.j0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"next_alarm_manager_id", java.lang.Integer.valueOf(i10)});
                sharedPreferences.edit().clear().apply();
                dVar.i0();
            } finally {
                dVar.B0();
            }
        }
    }

    private int c(java.lang.String str) {
        this.f9425a.g();
        try {
            java.lang.Long lA = this.f9425a.U().a(str);
            int i6 = 0;
            int iIntValue = lA != null ? lA.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i6 = iIntValue + 1;
            }
            e(str, i6);
            this.f9425a.N();
            return iIntValue;
        } finally {
            this.f9425a.n();
        }
    }

    private void e(java.lang.String str, int i6) {
        this.f9425a.U().b(new Q2.d(str, i6));
    }

    public int b() {
        int iC;
        synchronized (R2.f.class) {
            iC = c("next_alarm_manager_id");
        }
        return iC;
    }

    public int d(int i6, int i10) {
        synchronized (R2.f.class) {
            int iC = c("next_job_scheduler_id");
            if (iC < i6 || iC > i10) {
                e("next_job_scheduler_id", i6 + 1);
            } else {
                i6 = iC;
            }
        }
        return i6;
    }
}
