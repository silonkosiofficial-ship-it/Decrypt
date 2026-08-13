package p184s3;

/* JADX INFO: renamed from: s3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC7144x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p184s3.InterfaceC7110l0 f54344a;

    static {
        p184s3.InterfaceC7110l0 c7104j0 = null;
        try {
            java.lang.Object objNewInstance = p184s3.C7141w.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof android.os.IBinder) {
                android.os.IBinder iBinder = (android.os.IBinder) objNewInstance;
                if (iBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    c7104j0 = iInterfaceQueryLocalInterface instanceof p184s3.InterfaceC7110l0 ? (p184s3.InterfaceC7110l0) iInterfaceQueryLocalInterface : new p184s3.C7104j0(iBinder);
                }
            } else {
                p224w3.p.g("ClientApi class is not an instance of IBinder.");
            }
        } catch (java.lang.Exception unused) {
            p224w3.p.g("Failed to instantiate ClientApi class.");
        }
        f54344a = c7104j0;
    }

    AbstractC7144x() {
    }

    private final java.lang.Object e() {
        p184s3.InterfaceC7110l0 interfaceC7110l0 = f54344a;
        if (interfaceC7110l0 == null) {
            p224w3.p.g("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(interfaceC7110l0);
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Cannot invoke local loader using ClientApi class.", e6);
            return null;
        }
    }

    private final java.lang.Object f() {
        try {
            return c();
        } catch (android.os.RemoteException e6) {
            p224w3.p.h("Cannot invoke remote loader.", e6);
            return null;
        }
    }

    protected abstract java.lang.Object a();

    protected abstract java.lang.Object b(p184s3.InterfaceC7110l0 interfaceC7110l0);

    protected abstract java.lang.Object c();

    public final java.lang.Object d(android.content.Context context, boolean z6) {
        boolean z10;
        java.lang.Object objE;
        if (!z6) {
            p184s3.C7147y.b();
            if (!p224w3.g.u(context, 12451000)) {
                p224w3.p.b("Google Play Services is not available.");
                z6 = true;
            }
        }
        boolean z11 = false;
        boolean z12 = !(com.google.android.gms.dynamite.DynamiteModule.a(context, "com.google.android.gms.ads.dynamite") <= com.google.android.gms.dynamite.DynamiteModule.c(context, "com.google.android.gms.ads.dynamite"));
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5699xg.f39896a.e()).booleanValue()) {
            z10 = false;
        } else if (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC5699xg.f39897b.e()).booleanValue()) {
            z10 = true;
            z11 = true;
        } else {
            z11 = z6 | z12;
            z10 = false;
        }
        if (z11) {
            objE = e();
            if (objE == null && !z10) {
                objE = f();
            }
        } else {
            java.lang.Object objF = f();
            if (objF == null) {
                if (p184s3.C7147y.e().nextInt(((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2570Lg.f29545a.e()).intValue()) == 0) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    p184s3.C7147y.b().p(context, p184s3.C7147y.c().f56217C, "gmob-apps", bundle, true);
                }
            }
            objE = objF == null ? e() : objF;
        }
        return objE == null ? a() : objE;
    }
}
