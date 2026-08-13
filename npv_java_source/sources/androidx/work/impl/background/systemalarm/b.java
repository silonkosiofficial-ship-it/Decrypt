package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
public class b implements J2.b {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.lang.String f23879F = I2.j.f("CommandHandler");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f23880C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final java.util.Map f23881D = new java.util.HashMap();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.Object f23882E = new java.lang.Object();

    b(android.content.Context context) {
        this.f23880C = context;
    }

    static android.content.Intent a(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static android.content.Intent b(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static android.content.Intent d(android.content.Context context, java.lang.String str, boolean z6) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z6);
        return intent;
    }

    static android.content.Intent e(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static android.content.Intent f(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.background.systemalarm.SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void g(android.content.Intent intent, int i6, androidx.work.impl.background.systemalarm.e eVar) {
        I2.j.c().a(f23879F, java.lang.String.format("Handling constraints changed %s", intent), new java.lang.Throwable[0]);
        new androidx.work.impl.background.systemalarm.c(this.f23880C, i6, eVar).a();
    }

    private void h(android.content.Intent intent, int i6, androidx.work.impl.background.systemalarm.e eVar) {
        android.os.Bundle extras = intent.getExtras();
        synchronized (this.f23882E) {
            try {
                java.lang.String string = extras.getString("KEY_WORKSPEC_ID");
                I2.j jVarC = I2.j.c();
                java.lang.String str = f23879F;
                jVarC.a(str, java.lang.String.format("Handing delay met for %s", string), new java.lang.Throwable[0]);
                if (this.f23881D.containsKey(string)) {
                    I2.j.c().a(str, java.lang.String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new java.lang.Throwable[0]);
                } else {
                    androidx.work.impl.background.systemalarm.d dVar = new androidx.work.impl.background.systemalarm.d(this.f23880C, i6, string, eVar);
                    this.f23881D.put(string, dVar);
                    dVar.e();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void i(android.content.Intent intent, int i6) {
        android.os.Bundle extras = intent.getExtras();
        java.lang.String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z6 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        I2.j.c().a(f23879F, java.lang.String.format("Handling onExecutionCompleted %s, %s", intent, java.lang.Integer.valueOf(i6)), new java.lang.Throwable[0]);
        c(string, z6);
    }

    private void j(android.content.Intent intent, int i6, androidx.work.impl.background.systemalarm.e eVar) {
        I2.j.c().a(f23879F, java.lang.String.format("Handling reschedule %s, %s", intent, java.lang.Integer.valueOf(i6)), new java.lang.Throwable[0]);
        eVar.g().s();
    }

    private void k(android.content.Intent intent, int i6, androidx.work.impl.background.systemalarm.e eVar) {
        java.lang.String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        I2.j jVarC = I2.j.c();
        java.lang.String str = f23879F;
        jVarC.a(str, java.lang.String.format("Handling schedule work for %s", string), new java.lang.Throwable[0]);
        androidx.work.impl.WorkDatabase workDatabaseO = eVar.g().o();
        workDatabaseO.g();
        try {
            Q2.p pVarN = workDatabaseO.Y().n(string);
            if (pVarN == null) {
                I2.j.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new java.lang.Throwable[0]);
                return;
            }
            if (pVarN.f8804b.e()) {
                I2.j.c().h(str, "Skipping scheduling " + string + "because it is finished.", new java.lang.Throwable[0]);
                return;
            }
            long jA = pVarN.a();
            if (pVarN.b()) {
                I2.j.c().a(str, java.lang.String.format("Opportunistically setting an alarm for %s at %s", string, java.lang.Long.valueOf(jA)), new java.lang.Throwable[0]);
                androidx.work.impl.background.systemalarm.a.c(this.f23880C, eVar.g(), string, jA);
                eVar.k(new androidx.work.impl.background.systemalarm.e.b(eVar, a(this.f23880C), i6));
            } else {
                I2.j.c().a(str, java.lang.String.format("Setting up Alarms for %s at %s", string, java.lang.Long.valueOf(jA)), new java.lang.Throwable[0]);
                androidx.work.impl.background.systemalarm.a.c(this.f23880C, eVar.g(), string, jA);
            }
            workDatabaseO.N();
        } finally {
            workDatabaseO.n();
        }
    }

    private void l(android.content.Intent intent, androidx.work.impl.background.systemalarm.e eVar) {
        java.lang.String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        I2.j.c().a(f23879F, java.lang.String.format("Handing stopWork work for %s", string), new java.lang.Throwable[0]);
        eVar.g().x(string);
        androidx.work.impl.background.systemalarm.a.a(this.f23880C, eVar.g(), string);
        eVar.c(string, false);
    }

    private static boolean m(android.os.Bundle bundle, java.lang.String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (java.lang.String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // J2.b
    public void c(java.lang.String str, boolean z6) {
        synchronized (this.f23882E) {
            try {
                J2.b bVar = (J2.b) this.f23881D.remove(str);
                if (bVar != null) {
                    bVar.c(str, z6);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    boolean n() {
        boolean z6;
        synchronized (this.f23882E) {
            z6 = !this.f23881D.isEmpty();
        }
        return z6;
    }

    void o(android.content.Intent intent, int i6, androidx.work.impl.background.systemalarm.e eVar) {
        java.lang.String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i6, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i6, eVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            I2.j.c().b(f23879F, java.lang.String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new java.lang.Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i6, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i6, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i6);
        } else {
            I2.j.c().h(f23879F, java.lang.String.format("Ignoring intent %s", intent), new java.lang.Throwable[0]);
        }
    }
}
