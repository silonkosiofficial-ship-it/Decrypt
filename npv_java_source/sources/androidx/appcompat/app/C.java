package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static androidx.appcompat.app.C f17472d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f17473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.location.LocationManager f17474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.appcompat.app.C.a f17475c = new androidx.appcompat.app.C.a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f17476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f17477b;

        a() {
        }
    }

    C(android.content.Context context, android.location.LocationManager locationManager) {
        this.f17473a = context;
        this.f17474b = locationManager;
    }

    static androidx.appcompat.app.C a(android.content.Context context) {
        if (f17472d == null) {
            android.content.Context applicationContext = context.getApplicationContext();
            f17472d = new androidx.appcompat.app.C(applicationContext, (android.location.LocationManager) applicationContext.getSystemService("location"));
        }
        return f17472d;
    }

    private android.location.Location b() {
        android.location.Location locationC = androidx.core.content.d.b(this.f17473a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        android.location.Location locationC2 = androidx.core.content.d.b(this.f17473a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private android.location.Location c(java.lang.String str) {
        try {
            if (this.f17474b.isProviderEnabled(str)) {
                return this.f17474b.getLastKnownLocation(str);
            }
            return null;
        } catch (java.lang.Exception e6) {
            return null;
        }
    }

    private boolean e() {
        return this.f17475c.f17477b > java.lang.System.currentTimeMillis();
    }

    private void f(android.location.Location location) {
        long j6;
        androidx.appcompat.app.C.a aVar = this.f17475c;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        androidx.appcompat.app.B b6 = androidx.appcompat.app.B.b();
        b6.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        b6.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z6 = b6.f17471c == 1;
        long j10 = b6.f17470b;
        long j11 = b6.f17469a;
        b6.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j12 = b6.f17470b;
        if (j10 == -1 || j11 == -1) {
            j6 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j11) {
                j12 = jCurrentTimeMillis > j10 ? j11 : j10;
            }
            j6 = j12 + 60000;
        }
        aVar.f17476a = z6;
        aVar.f17477b = j6;
    }

    boolean d() {
        androidx.appcompat.app.C.a aVar = this.f17475c;
        if (e()) {
            return aVar.f17476a;
        }
        android.location.Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f17476a;
        }
        int i6 = java.util.Calendar.getInstance().get(11);
        return i6 < 6 || i6 >= 22;
    }
}
