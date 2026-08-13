package com.google.android.gms.ads.internal.offline.buffering;

/* JADX INFO: loaded from: classes.dex */
public class OfflineNotificationPoster extends androidx.work.Worker {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2323En f24706I;

    public OfflineNotificationPoster(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f24706I = p184s3.C7147y.a().j(context, new com.google.android.gms.internal.ads.BinderC2801Rl());
    }

    @Override // androidx.work.Worker
    public final androidx.work.ListenableWorker.a doWork() {
        try {
            this.f24706I.g5(X3.b.c2(getApplicationContext()), new p194t3.a(getInputData().i("uri"), getInputData().i("gws_query_id"), getInputData().i("image_url")));
            return androidx.work.ListenableWorker.a.c();
        } catch (android.os.RemoteException unused) {
            return androidx.work.ListenableWorker.a.a();
        }
    }
}
