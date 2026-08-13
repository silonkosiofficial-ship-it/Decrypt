package androidx.work.impl.utils;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements java.lang.Runnable {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final java.lang.String f23947F = I2.j.f("ForceStopRunnable");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final long f23948G = java.util.concurrent.TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final android.content.Context f23949C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final J2.j f23950D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f23951E = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final java.lang.String f23952a = I2.j.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            I2.j.c().g(f23952a, "Rescheduling alarm that keeps track of force-stops.", new java.lang.Throwable[0]);
            androidx.work.impl.utils.ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(android.content.Context context, J2.j jVar) {
        this.f23949C = context.getApplicationContext();
        this.f23950D = jVar;
    }

    static android.content.Intent c(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static android.app.PendingIntent d(android.content.Context context, int i6) {
        return android.app.PendingIntent.getBroadcast(context, -1, c(context), i6);
    }

    static void g(android.content.Context context) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        android.app.PendingIntent pendingIntentD = d(context, androidx.core.os.a.b() ? 167772160 : 134217728);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() + f23948G;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = L2.l.i(this.f23949C, this.f23950D);
        androidx.work.impl.WorkDatabase workDatabaseO = this.f23950D.o();
        Q2.q qVarY = workDatabaseO.Y();
        Q2.n nVarX = workDatabaseO.X();
        workDatabaseO.g();
        try {
            java.util.List<Q2.p> listJ = qVarY.j();
            boolean z6 = (listJ == null || listJ.isEmpty()) ? false : true;
            if (z6) {
                for (Q2.p pVar : listJ) {
                    qVarY.b(I2.s.ENQUEUED, pVar.f8803a);
                    qVarY.d(pVar.f8803a, -1L);
                }
            }
            nVarX.c();
            workDatabaseO.N();
            workDatabaseO.n();
            return z6 || zI;
        } catch (java.lang.Throwable th) {
            workDatabaseO.n();
            throw th;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            I2.j.c().a(f23947F, "Rescheduling Workers.", new java.lang.Throwable[0]);
            this.f23950D.s();
            this.f23950D.l().c(false);
        } else if (e()) {
            I2.j.c().a(f23947F, "Application was force-stopped, rescheduling.", new java.lang.Throwable[0]);
            this.f23950D.s();
        } else if (zA) {
            I2.j.c().a(f23947F, "Found unfinished work, scheduling it.", new java.lang.Throwable[0]);
            J2.f.b(this.f23950D.i(), this.f23950D.o(), this.f23950D.n());
        }
    }

    public boolean e() {
        try {
            android.app.PendingIntent pendingIntentD = d(this.f23949C, androidx.core.os.a.b() ? 570425344 : 536870912);
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                java.util.List historicalProcessExitReasons = ((android.app.ActivityManager) this.f23949C.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i6 = 0; i6 < historicalProcessExitReasons.size(); i6++) {
                        if (R2.d.a(historicalProcessExitReasons.get(i6)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f23949C);
                return true;
            }
            return false;
        } catch (java.lang.IllegalArgumentException e6) {
            e = e6;
            I2.j.c().h(f23947F, "Ignoring exception", e);
            return true;
        } catch (java.lang.SecurityException e10) {
            e = e10;
            I2.j.c().h(f23947F, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a aVarI = this.f23950D.i();
        if (android.text.TextUtils.isEmpty(aVarI.c())) {
            I2.j.c().a(f23947F, "The default process name was not specified.", new java.lang.Throwable[0]);
            return true;
        }
        boolean zB = R2.j.b(this.f23949C, aVarI);
        I2.j.c().a(f23947F, java.lang.String.format("Is default app process = %s", java.lang.Boolean.valueOf(zB)), new java.lang.Throwable[0]);
        return zB;
    }

    boolean h() {
        return this.f23950D.l().a();
    }

    public void i(long j6) {
        try {
            java.lang.Thread.sleep(j6);
        } catch (java.lang.InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i6;
        try {
            if (!f()) {
                this.f23950D.r();
                return;
            }
            while (true) {
                J2.h.e(this.f23949C);
                I2.j.c().a(f23947F, "Performing cleanup operations.", new java.lang.Throwable[0]);
                try {
                    b();
                    this.f23950D.r();
                    return;
                } catch (android.database.sqlite.SQLiteAccessPermException | android.database.sqlite.SQLiteCantOpenDatabaseException | android.database.sqlite.SQLiteConstraintException | android.database.sqlite.SQLiteDatabaseCorruptException | android.database.sqlite.SQLiteDatabaseLockedException | android.database.sqlite.SQLiteTableLockedException e6) {
                    i6 = this.f23951E + 1;
                    this.f23951E = i6;
                    if (i6 >= 3) {
                        I2.j.c().b(f23947F, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                        java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e6);
                        this.f23950D.i().d();
                        throw illegalStateException;
                    }
                    I2.j.c().a(f23947F, java.lang.String.format("Retrying after %s", java.lang.Long.valueOf(((long) i6) * 300)), e6);
                    i(((long) this.f23951E) * 300);
                }
                I2.j.c().a(f23947F, java.lang.String.format("Retrying after %s", java.lang.Long.valueOf(((long) i6) * 300)), e6);
                i(((long) this.f23951E) * 300);
            }
        } catch (java.lang.Throwable th) {
            this.f23950D.r();
            throw th;
        }
    }
}
