package p224w3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f56224a = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new p224w3.b("ClientDefault"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f56225b = java.util.concurrent.Executors.newSingleThreadExecutor(new p224w3.b("ClientSingle"));
}
