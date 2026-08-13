package N3;

/* JADX INFO: renamed from: N3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ServiceConnectionC1388a implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f7643a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.BlockingQueue f7644b = new java.util.concurrent.LinkedBlockingQueue();

    public android.os.IBinder a(long j6, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        Q3.AbstractC1477p.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f7643a) {
            throw new java.lang.IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f7643a = true;
        android.os.IBinder iBinder = (android.os.IBinder) this.f7644b.poll(j6, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new java.util.concurrent.TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f7644b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
    }
}
