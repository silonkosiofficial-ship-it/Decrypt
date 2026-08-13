package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class A0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.reflect.Method f40432b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.reflect.Method f40433c = d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.app.job.JobScheduler f40434a;

    private A0(android.app.job.JobScheduler jobScheduler) {
        this.f40434a = jobScheduler;
    }

    private static int a() {
        java.lang.reflect.Method method = f40433c;
        if (method != null) {
            try {
                java.lang.Integer num = (java.lang.Integer) method.invoke(android.os.UserHandle.class, null);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
                if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                }
            }
        }
        return 0;
    }

    private final int b(android.app.job.JobInfo jobInfo, java.lang.String str, int i6, java.lang.String str2) {
        java.lang.reflect.Method method = f40432b;
        if (method != null) {
            try {
                java.lang.Integer num = (java.lang.Integer) method.invoke(this.f40434a, jobInfo, str, java.lang.Integer.valueOf(i6), str2);
                if (num != null) {
                    return num.intValue();
                }
                return 0;
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e6) {
            }
        }
        return this.f40434a.schedule(jobInfo);
    }

    public static int c(android.content.Context context, android.app.job.JobInfo jobInfo, java.lang.String str, java.lang.String str2) {
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) M4.h.i((android.app.job.JobScheduler) context.getSystemService("jobscheduler"));
        return (f40432b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new com.google.android.gms.internal.measurement.A0(jobScheduler).b(jobInfo, str, a(), str2);
    }

    private static java.lang.reflect.Method d() {
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            try {
                return android.os.UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (java.lang.NoSuchMethodException unused) {
                if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                }
            }
        }
        return null;
    }

    private static java.lang.reflect.Method e() {
        if (android.os.Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return android.app.job.JobScheduler.class.getDeclaredMethod("scheduleAsPackage", android.app.job.JobInfo.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.NoSuchMethodException unused) {
            return android.util.Log.isLoggable("JobSchedulerCompat", 6) ? null : null;
        }
    }
}
