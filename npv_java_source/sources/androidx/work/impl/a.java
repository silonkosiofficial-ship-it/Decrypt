package androidx.work.impl;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static p183s2.a f23859a = new androidx.work.impl.a.C0454a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p183s2.a f23860b = new androidx.work.impl.a.b(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p183s2.a f23861c = new androidx.work.impl.a.c(4, 5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p183s2.a f23862d = new androidx.work.impl.a.d(6, 7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static p183s2.a f23863e = new androidx.work.impl.a.e(7, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p183s2.a f23864f = new androidx.work.impl.a.f(8, 9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static p183s2.a f23865g = new androidx.work.impl.a.g(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    class C0454a extends p183s2.a {
        C0454a(int i6, int i10) {
            super(i6, i10);
        }

        @Override // p183s2.a
        public void b(p253z2.d dVar) {
            dVar.B("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.B("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            dVar.B("DROP TABLE IF EXISTS alarmInfo");
            dVar.B("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    class b extends p183s2.a {
        b(int i6, int i10) {
            super(i6, i10);
        }

        @Override // p183s2.a
        public void b(p253z2.d dVar) {
            dVar.B("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    class c extends p183s2.a {
        c(int i6, int i10) {
            super(i6, i10);
        }

        @Override // p183s2.a
        public void b(p253z2.d dVar) {
            dVar.B("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            dVar.B("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    class d extends p183s2.a {
        d(int i6, int i10) {
            super(i6, i10);
        }

        @Override // p183s2.a
        public void b(p253z2.d dVar) {
            dVar.B("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    class e extends p183s2.a {
        e(int i6, int i10) {
            super(i6, i10);
        }

        @Override // p183s2.a
        public void b(p253z2.d dVar) {
            dVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    class f extends p183s2.a {
        f(int i6, int i10) {
            super(i6, i10);
        }

        @Override // p183s2.a
        public void b(p253z2.d dVar) {
            dVar.B("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    class g extends p183s2.a {
        g(int i6, int i10) {
            super(i6, i10);
        }

        @Override // p183s2.a
        public void b(p253z2.d dVar) {
            dVar.B("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends p183s2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final android.content.Context f23866c;

        public h(android.content.Context context, int i6, int i10) {
            super(i6, i10);
            this.f23866c = context;
        }

        @Override // p183s2.a
        public void b(p253z2.d dVar) {
            if (this.f54117b >= 10) {
                dVar.j0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new java.lang.Object[]{"reschedule_needed", 1});
            } else {
                this.f23866c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class i extends p183s2.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final android.content.Context f23867c;

        public i(android.content.Context context) {
            super(9, 10);
            this.f23867c = context;
        }

        @Override // p183s2.a
        public void b(p253z2.d dVar) {
            dVar.B("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            R2.h.b(this.f23867c, dVar);
            R2.f.a(this.f23867c, dVar);
        }
    }
}
