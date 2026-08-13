package p214v3;

/* JADX INFO: renamed from: v3.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7257m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f55903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private android.content.Context f55904e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f55902c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f55901b = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.BroadcastReceiver f55900a = new p214v3.C7255l0(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(android.content.Context context, android.content.Intent intent) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry entry : this.f55901b.entrySet()) {
                if (((android.content.IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((android.content.BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((android.content.BroadcastReceiver) arrayList.get(i6)).onReceive(context, intent);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(android.content.Context context) {
        try {
            if (this.f55902c) {
                return;
            }
            android.content.Context applicationContext = context.getApplicationContext();
            this.f55904e = applicationContext;
            if (applicationContext == null) {
                this.f55904e = context;
            }
            com.google.android.gms.internal.ads.AbstractC2161Af.a(this.f55904e);
            this.f55903d = ((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25430U3)).booleanValue();
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sa)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
                this.f55904e.registerReceiver(this.f55900a, intentFilter);
            } else {
                this.f55904e.registerReceiver(this.f55900a, intentFilter, 4);
            }
            this.f55902c = true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        if (this.f55903d) {
            this.f55901b.put(broadcastReceiver, intentFilter);
            return;
        }
        com.google.android.gms.internal.ads.AbstractC2161Af.a(context);
        if (!((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Sa)).booleanValue() || android.os.Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void d(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver) {
        if (this.f55903d) {
            this.f55901b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
