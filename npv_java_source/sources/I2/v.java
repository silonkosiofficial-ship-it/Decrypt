package I2;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f5002a = I2.j.f("WorkerFactory");

    class a extends I2.v {
        a() {
        }

        @Override // I2.v
        public androidx.work.ListenableWorker a(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
            return null;
        }
    }

    public static I2.v c() {
        return new I2.v.a();
    }

    public abstract androidx.work.ListenableWorker a(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters);

    public final androidx.work.ListenableWorker b(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
        java.lang.Class clsAsSubclass;
        androidx.work.ListenableWorker listenableWorkerA = a(context, str, workerParameters);
        if (listenableWorkerA == null) {
            try {
                clsAsSubclass = java.lang.Class.forName(str).asSubclass(androidx.work.ListenableWorker.class);
            } catch (java.lang.Throwable th) {
                I2.j.c().b(f5002a, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerA = (androidx.work.ListenableWorker) clsAsSubclass.getDeclaredConstructor(android.content.Context.class, androidx.work.WorkerParameters.class).newInstance(context, workerParameters);
                } catch (java.lang.Throwable th2) {
                    I2.j.c().b(f5002a, "Could not instantiate " + str, th2);
                }
            }
        }
        if (listenableWorkerA == null || !listenableWorkerA.isUsed()) {
            return listenableWorkerA;
        }
        throw new java.lang.IllegalStateException(java.lang.String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
