package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f23878a = I2.j.f("Alarms");

    public static void a(android.content.Context context, J2.j jVar, java.lang.String str) {
        Q2.h hVarV = jVar.o().V();
        Q2.g gVarB = hVarV.b(str);
        if (gVarB != null) {
            b(context, str, gVarB.f8781b);
            I2.j.c().a(f23878a, java.lang.String.format("Removing SystemIdInfo for workSpecId (%s)", str), new java.lang.Throwable[0]);
            hVarV.d(str);
        }
    }

    private static void b(android.content.Context context, java.lang.String str, int i6) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        android.app.PendingIntent service = android.app.PendingIntent.getService(context, i6, androidx.work.impl.background.systemalarm.b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        I2.j.c().a(f23878a, java.lang.String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, java.lang.Integer.valueOf(i6)), new java.lang.Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(android.content.Context context, J2.j jVar, java.lang.String str, long j6) {
        int iB;
        androidx.work.impl.WorkDatabase workDatabaseO = jVar.o();
        Q2.h hVarV = workDatabaseO.V();
        Q2.g gVarB = hVarV.b(str);
        if (gVarB != null) {
            b(context, str, gVarB.f8781b);
            iB = gVarB.f8781b;
        } else {
            iB = new R2.f(workDatabaseO).b();
            hVarV.c(new Q2.g(str, iB));
        }
        d(context, str, iB, j6);
    }

    private static void d(android.content.Context context, java.lang.String str, int i6, long j6) {
        android.app.AlarmManager alarmManager = (android.app.AlarmManager) context.getSystemService("alarm");
        android.app.PendingIntent service = android.app.PendingIntent.getService(context, i6, androidx.work.impl.background.systemalarm.b.b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j6, service);
        }
    }
}
