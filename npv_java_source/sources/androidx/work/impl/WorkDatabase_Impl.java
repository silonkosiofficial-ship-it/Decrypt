package androidx.work.impl;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends androidx.work.impl.WorkDatabase {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile Q2.q f23851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile Q2.b f23852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile Q2.t f23853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile Q2.h f23854t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private volatile Q2.k f23855u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private volatile Q2.n f23856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private volatile Q2.e f23857w;

    class a extends o2.t.b {
        a(int i6) {
            super(i6);
        }

        @Override // o2.t.b
        public void a(p253z2.d dVar) {
            dVar.B("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.B("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            dVar.B("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            dVar.B("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            dVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            dVar.B("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            dVar.B("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.B("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            dVar.B("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.B("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.B("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            dVar.B("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            dVar.B("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            dVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            dVar.B("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // o2.t.b
        public void b(p253z2.d dVar) {
            dVar.B("DROP TABLE IF EXISTS `Dependency`");
            dVar.B("DROP TABLE IF EXISTS `WorkSpec`");
            dVar.B("DROP TABLE IF EXISTS `WorkTag`");
            dVar.B("DROP TABLE IF EXISTS `SystemIdInfo`");
            dVar.B("DROP TABLE IF EXISTS `WorkName`");
            dVar.B("DROP TABLE IF EXISTS `WorkProgress`");
            dVar.B("DROP TABLE IF EXISTS `Preference`");
            if (((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52453j != null) {
                int size = ((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52453j.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((o2.n.b) ((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52453j.get(i6)).d(dVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o2.t.b
        public void c(p253z2.d dVar) {
            if (((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52453j != null) {
                int size = ((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52453j.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((o2.n.b) ((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52453j.get(i6)).b(dVar);
                }
            }
        }

        @Override // o2.t.b
        public void d(p253z2.d dVar) {
            ((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52444a = dVar;
            dVar.B("PRAGMA foreign_keys = ON");
            androidx.work.impl.WorkDatabase_Impl.this.I(dVar);
            if (((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52453j != null) {
                int size = ((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52453j.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((o2.n.b) ((p143o2.n) androidx.work.impl.WorkDatabase_Impl.this).f52453j.get(i6)).f(dVar);
                }
            }
        }

        @Override // o2.t.b
        public void e(p253z2.d dVar) {
        }

        @Override // o2.t.b
        public void f(p253z2.d dVar) {
            p223w2.b.b(dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o2.t.b
        public o2.t.c g(p253z2.d dVar) {
            java.util.HashMap map = new java.util.HashMap(2);
            map.put("work_spec_id", new w2.o.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new w2.o.a("prerequisite_id", "TEXT", true, 2, null, 1));
            java.util.HashSet hashSet = new java.util.HashSet(2);
            hashSet.add(new w2.o.c("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
            hashSet.add(new w2.o.c("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("prerequisite_id"), java.util.Arrays.asList("id")));
            java.util.HashSet hashSet2 = new java.util.HashSet(2);
            hashSet2.add(new w2.o.d("index_Dependency_work_spec_id", false, java.util.Arrays.asList("work_spec_id")));
            hashSet2.add(new w2.o.d("index_Dependency_prerequisite_id", false, java.util.Arrays.asList("prerequisite_id")));
            p223w2.o oVar = new p223w2.o("Dependency", map, hashSet, hashSet2);
            p223w2.o oVarA = p223w2.o.a(dVar, "Dependency");
            if (!oVar.equals(oVarA)) {
                return new o2.t.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + oVar + "\n Found:\n" + oVarA);
            }
            java.util.HashMap map2 = new java.util.HashMap(25);
            map2.put("id", new w2.o.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new w2.o.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new w2.o.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new w2.o.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new w2.o.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new w2.o.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new w2.o.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new w2.o.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new w2.o.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new w2.o.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new w2.o.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new w2.o.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new w2.o.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new w2.o.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new w2.o.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new w2.o.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new w2.o.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new w2.o.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new w2.o.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new w2.o.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new w2.o.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new w2.o.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new w2.o.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new w2.o.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new w2.o.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            java.util.HashSet hashSet3 = new java.util.HashSet(0);
            java.util.HashSet hashSet4 = new java.util.HashSet(2);
            hashSet4.add(new w2.o.d("index_WorkSpec_schedule_requested_at", false, java.util.Arrays.asList("schedule_requested_at")));
            hashSet4.add(new w2.o.d("index_WorkSpec_period_start_time", false, java.util.Arrays.asList("period_start_time")));
            p223w2.o oVar2 = new p223w2.o("WorkSpec", map2, hashSet3, hashSet4);
            p223w2.o oVarA2 = p223w2.o.a(dVar, "WorkSpec");
            if (!oVar2.equals(oVarA2)) {
                return new o2.t.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + oVar2 + "\n Found:\n" + oVarA2);
            }
            java.util.HashMap map3 = new java.util.HashMap(2);
            map3.put("tag", new w2.o.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new w2.o.a("work_spec_id", "TEXT", true, 2, null, 1));
            java.util.HashSet hashSet5 = new java.util.HashSet(1);
            hashSet5.add(new w2.o.c("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
            java.util.HashSet hashSet6 = new java.util.HashSet(1);
            hashSet6.add(new w2.o.d("index_WorkTag_work_spec_id", false, java.util.Arrays.asList("work_spec_id")));
            p223w2.o oVar3 = new p223w2.o("WorkTag", map3, hashSet5, hashSet6);
            p223w2.o oVarA3 = p223w2.o.a(dVar, "WorkTag");
            if (!oVar3.equals(oVarA3)) {
                return new o2.t.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + oVar3 + "\n Found:\n" + oVarA3);
            }
            java.util.HashMap map4 = new java.util.HashMap(2);
            map4.put("work_spec_id", new w2.o.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new w2.o.a("system_id", "INTEGER", true, 0, null, 1));
            java.util.HashSet hashSet7 = new java.util.HashSet(1);
            hashSet7.add(new w2.o.c("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
            p223w2.o oVar4 = new p223w2.o("SystemIdInfo", map4, hashSet7, new java.util.HashSet(0));
            p223w2.o oVarA4 = p223w2.o.a(dVar, "SystemIdInfo");
            if (!oVar4.equals(oVarA4)) {
                return new o2.t.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + oVar4 + "\n Found:\n" + oVarA4);
            }
            java.util.HashMap map5 = new java.util.HashMap(2);
            map5.put("name", new w2.o.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new w2.o.a("work_spec_id", "TEXT", true, 2, null, 1));
            java.util.HashSet hashSet8 = new java.util.HashSet(1);
            hashSet8.add(new w2.o.c("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
            java.util.HashSet hashSet9 = new java.util.HashSet(1);
            hashSet9.add(new w2.o.d("index_WorkName_work_spec_id", false, java.util.Arrays.asList("work_spec_id")));
            p223w2.o oVar5 = new p223w2.o("WorkName", map5, hashSet8, hashSet9);
            p223w2.o oVarA5 = p223w2.o.a(dVar, "WorkName");
            if (!oVar5.equals(oVarA5)) {
                return new o2.t.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + oVar5 + "\n Found:\n" + oVarA5);
            }
            java.util.HashMap map6 = new java.util.HashMap(2);
            map6.put("work_spec_id", new w2.o.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new w2.o.a("progress", "BLOB", true, 0, null, 1));
            java.util.HashSet hashSet10 = new java.util.HashSet(1);
            hashSet10.add(new w2.o.c("WorkSpec", "CASCADE", "CASCADE", java.util.Arrays.asList("work_spec_id"), java.util.Arrays.asList("id")));
            p223w2.o oVar6 = new p223w2.o("WorkProgress", map6, hashSet10, new java.util.HashSet(0));
            p223w2.o oVarA6 = p223w2.o.a(dVar, "WorkProgress");
            if (!oVar6.equals(oVarA6)) {
                return new o2.t.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + oVar6 + "\n Found:\n" + oVarA6);
            }
            java.util.HashMap map7 = new java.util.HashMap(2);
            map7.put("key", new w2.o.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new w2.o.a("long_value", "INTEGER", false, 0, null, 1));
            p223w2.o oVar7 = new p223w2.o("Preference", map7, new java.util.HashSet(0), new java.util.HashSet(0));
            p223w2.o oVarA7 = p223w2.o.a(dVar, "Preference");
            if (oVar7.equals(oVarA7)) {
                return new o2.t.c(true, null);
            }
            return new o2.t.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + oVar7 + "\n Found:\n" + oVarA7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public Q2.b Q() {
        Q2.b bVar;
        if (this.f23852r != null) {
            return this.f23852r;
        }
        synchronized (this) {
            try {
                if (this.f23852r == null) {
                    this.f23852r = new Q2.c(this);
                }
                bVar = this.f23852r;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public Q2.e U() {
        Q2.e eVar;
        if (this.f23857w != null) {
            return this.f23857w;
        }
        synchronized (this) {
            try {
                if (this.f23857w == null) {
                    this.f23857w = new Q2.f(this);
                }
                eVar = this.f23857w;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public Q2.h V() {
        Q2.h hVar;
        if (this.f23854t != null) {
            return this.f23854t;
        }
        synchronized (this) {
            try {
                if (this.f23854t == null) {
                    this.f23854t = new Q2.i(this);
                }
                hVar = this.f23854t;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public Q2.k W() {
        Q2.k kVar;
        if (this.f23855u != null) {
            return this.f23855u;
        }
        synchronized (this) {
            try {
                if (this.f23855u == null) {
                    this.f23855u = new Q2.l(this);
                }
                kVar = this.f23855u;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public Q2.n X() {
        Q2.n nVar;
        if (this.f23856v != null) {
            return this.f23856v;
        }
        synchronized (this) {
            try {
                if (this.f23856v == null) {
                    this.f23856v = new Q2.o(this);
                }
                nVar = this.f23856v;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public Q2.q Y() {
        Q2.q qVar;
        if (this.f23851q != null) {
            return this.f23851q;
        }
        synchronized (this) {
            try {
                if (this.f23851q == null) {
                    this.f23851q = new Q2.r(this);
                }
                qVar = this.f23851q;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public Q2.t Z() {
        Q2.t tVar;
        if (this.f23853s != null) {
            return this.f23853s;
        }
        synchronized (this) {
            try {
                if (this.f23853s == null) {
                    this.f23853s = new Q2.u(this);
                }
                tVar = this.f23853s;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    @Override // p143o2.n
    protected androidx.room.c k() {
        return new androidx.room.c(this, new java.util.HashMap(0), new java.util.HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p143o2.n
    protected p253z2.e m(p143o2.C7023c c7023c) {
        return c7023c.f52399c.a(z2.e.b.a(c7023c.f52397a).c(c7023c.f52398b).b(new p143o2.t(c7023c, new androidx.work.impl.WorkDatabase_Impl.a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }
}
