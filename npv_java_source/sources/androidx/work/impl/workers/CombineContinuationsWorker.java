package androidx.work.impl.workers;

/* JADX INFO: loaded from: classes.dex */
public class CombineContinuationsWorker extends androidx.work.Worker {
    public CombineContinuationsWorker(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public androidx.work.ListenableWorker.a doWork() {
        return androidx.work.ListenableWorker.a.d(getInputData());
    }
}
