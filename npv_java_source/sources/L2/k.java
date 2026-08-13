package L2;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f6183b = I2.j.f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.ComponentName f6184a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6185a;

        static {
            int[] iArr = new int[I2.k.values().length];
            f6185a = iArr;
            try {
                iArr[I2.k.NOT_REQUIRED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f6185a[I2.k.CONNECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f6185a[I2.k.UNMETERED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                f6185a[I2.k.NOT_ROAMING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                f6185a[I2.k.METERED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    k(android.content.Context context) {
        this.f6184a = new android.content.ComponentName(context.getApplicationContext(), (java.lang.Class<?>) androidx.work.impl.background.systemjob.SystemJobService.class);
    }

    private static android.app.job.JobInfo.TriggerContentUri b(I2.c.a aVar) {
        boolean zB = aVar.b();
        L2.j.a();
        return L2.i.a(aVar.a(), zB ? 1 : 0);
    }

    static int c(I2.k kVar) {
        int i6 = L2.k.a.f6185a[kVar.ordinal()];
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 3) {
            return 2;
        }
        if (i6 != 4) {
            if (i6 == 5 && android.os.Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (android.os.Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        I2.j.c().a(f6183b, java.lang.String.format("API version too low. Cannot convert network type value %s", kVar), new java.lang.Throwable[0]);
        return 1;
    }

    static void d(android.app.job.JobInfo.Builder builder, I2.k kVar) {
        if (android.os.Build.VERSION.SDK_INT < 30 || kVar != I2.k.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(kVar));
        } else {
            builder.setRequiredNetwork(new android.net.NetworkRequest.Builder().addCapability(25).build());
        }
    }

    android.app.job.JobInfo a(Q2.p pVar, int i6) {
        I2.b bVar = pVar.f8812j;
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f8803a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        android.app.job.JobInfo.Builder extras = new android.app.job.JobInfo.Builder(i6, this.f6184a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.b());
        if (!bVar.h()) {
            extras.setBackoffCriteria(pVar.f8815m, pVar.f8814l == I2.a.LINEAR ? 0 : 1);
        }
        long jMax = java.lang.Math.max(pVar.a() - java.lang.System.currentTimeMillis(), 0L);
        int i10 = android.os.Build.VERSION.SDK_INT;
        if (i10 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.f8819q) {
            extras.setImportantWhileForeground(true);
        }
        if (i10 >= 24 && bVar.e()) {
            java.util.Iterator it = bVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((I2.c.a) it.next()));
            }
            extras.setTriggerContentUpdateDelay(bVar.c());
            extras.setTriggerContentMaxDelay(bVar.d());
        }
        extras.setPersisted(false);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f());
            extras.setRequiresStorageNotLow(bVar.i());
        }
        boolean z6 = pVar.f8813k > 0;
        if (androidx.core.os.a.b() && pVar.f8819q && !z6) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
