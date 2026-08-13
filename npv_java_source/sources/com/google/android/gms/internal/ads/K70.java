package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class K70 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static com.google.android.gms.internal.ads.K70 f28851d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f28852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p184s3.InterfaceC7130s0 f28853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f28854c = new java.util.concurrent.atomic.AtomicReference();

    K70(android.content.Context context, p184s3.InterfaceC7130s0 interfaceC7130s0) {
        this.f28852a = context;
        this.f28853b = interfaceC7130s0;
    }

    static p184s3.InterfaceC7130s0 a(android.content.Context context) {
        try {
            return p184s3.AbstractBinderC7127r0.asInterface((android.os.IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(android.content.Context.class).newInstance(context));
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e6) {
            p224w3.p.e("Failed to retrieve lite SDK info.", e6);
            return null;
        }
    }

    public static com.google.android.gms.internal.ads.K70 d(android.content.Context context) {
        synchronized (com.google.android.gms.internal.ads.K70.class) {
            try {
                com.google.android.gms.internal.ads.K70 k70 = f28851d;
                if (k70 != null) {
                    return k70;
                }
                android.content.Context applicationContext = context.getApplicationContext();
                long jLongValue = ((java.lang.Long) com.google.android.gms.internal.ads.AbstractC2274Dg.f26760b.e()).longValue();
                p184s3.InterfaceC7130s0 interfaceC7130s0A = null;
                if (jLongValue > 0 && jLongValue <= 244410203) {
                    interfaceC7130s0A = a(applicationContext);
                }
                com.google.android.gms.internal.ads.K70 k71 = new com.google.android.gms.internal.ads.K70(applicationContext, interfaceC7130s0A);
                f28851d = k71;
                return k71;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private final p184s3.C7134t1 g() {
        p184s3.InterfaceC7130s0 interfaceC7130s0 = this.f28853b;
        if (interfaceC7130s0 != null) {
            try {
                return interfaceC7130s0.getLiteSdkVersion();
            } catch (android.os.RemoteException unused) {
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.InterfaceC2945Vl b() {
        return (com.google.android.gms.internal.ads.InterfaceC2945Vl) this.f28854c.get();
    }

    public final p224w3.a c(int i6, boolean z6, int i10) {
        p184s3.C7134t1 c7134t1G;
        p174r3.v.t();
        boolean zF = p214v3.E0.f(this.f28852a);
        p224w3.a aVar = new p224w3.a(244410000, i10, true, zF);
        return (((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2274Dg.f26761c.e()).booleanValue() && (c7134t1G = g()) != null) ? new p224w3.a(244410000, c7134t1G.e(), true, zF) : aVar;
    }

    public final java.lang.String e() {
        p184s3.C7134t1 c7134t1G = g();
        if (c7134t1G != null) {
            return c7134t1G.f();
        }
        return null;
    }

    public final void f(com.google.android.gms.internal.ads.InterfaceC2945Vl interfaceC2945Vl) {
        com.google.android.gms.internal.ads.InterfaceC2945Vl adapterCreator;
        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.AbstractC2274Dg.f26759a.e()).booleanValue()) {
            com.google.android.gms.internal.ads.J70.a(this.f28854c, null, interfaceC2945Vl);
            return;
        }
        p184s3.InterfaceC7130s0 interfaceC7130s0 = this.f28853b;
        if (interfaceC7130s0 == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = interfaceC7130s0.getAdapterCreator();
            } catch (android.os.RemoteException unused) {
                adapterCreator = null;
            }
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f28854c;
        if (adapterCreator != null) {
            interfaceC2945Vl = adapterCreator;
        }
        com.google.android.gms.internal.ads.J70.a(atomicReference, null, interfaceC2945Vl);
    }
}
