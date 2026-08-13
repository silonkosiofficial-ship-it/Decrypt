package p035d4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends androidx.core.content.a {
    public static android.content.Intent l(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, android.content.IntentFilter intentFilter) {
        if (p035d4.e.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != p035d4.e.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
