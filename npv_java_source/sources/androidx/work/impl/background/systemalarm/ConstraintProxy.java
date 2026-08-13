package androidx.work.impl.background.systemalarm;

/* JADX INFO: loaded from: classes.dex */
abstract class ConstraintProxy extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f23868a = I2.j.f("ConstraintProxy");

    public static class BatteryChargingProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context context, android.content.Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context context, android.content.Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context context, android.content.Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends androidx.work.impl.background.systemalarm.ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(android.content.Context context, android.content.Intent intent) {
            super.onReceive(context, intent);
        }
    }

    ConstraintProxy() {
    }

    static void a(android.content.Context context, java.util.List list) {
        java.util.Iterator it = list.iterator();
        boolean zF = false;
        boolean zG = false;
        boolean zI = false;
        boolean z6 = false;
        while (it.hasNext()) {
            I2.b bVar = ((Q2.p) it.next()).f8812j;
            zF |= bVar.f();
            zG |= bVar.g();
            zI |= bVar.i();
            z6 |= bVar.b() != I2.k.NOT_REQUIRED;
            if (zF && zG && zI && z6) {
                break;
            }
        }
        context.sendBroadcast(androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.a(context, zF, zG, zI, z6));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        I2.j.c().a(f23868a, java.lang.String.format("onReceive : %s", intent), new java.lang.Throwable[0]);
        context.startService(androidx.work.impl.background.systemalarm.b.a(context));
    }
}
