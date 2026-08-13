package p106k5;

/* JADX INFO: renamed from: k5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6894e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Float f49609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f49610b;

    private C6894e(java.lang.Float f6, boolean z6) {
        this.f49610b = z6;
        this.f49609a = f6;
    }

    public static p106k5.C6894e a(android.content.Context context) {
        boolean zE = false;
        java.lang.Float fD = null;
        try {
            android.content.Intent intentRegisterReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zE = e(intentRegisterReceiver);
                fD = d(intentRegisterReceiver);
            }
        } catch (java.lang.IllegalStateException e6) {
            p076h5.g.f().e("An error occurred getting battery state.", e6);
        }
        return new p106k5.C6894e(fD, zE);
    }

    private static java.lang.Float d(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return java.lang.Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public java.lang.Float b() {
        return this.f49609a;
    }

    public int c() {
        java.lang.Float f6;
        if (!this.f49610b || (f6 = this.f49609a) == null) {
            return 1;
        }
        return ((double) f6.floatValue()) < 0.99d ? 2 : 3;
    }
}
