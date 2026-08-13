package R2;

/* JADX INFO: loaded from: classes.dex */
public class l implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private J2.j f9435C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private java.lang.String f9436D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private androidx.work.WorkerParameters.a f9437E;

    public l(J2.j jVar, java.lang.String str, androidx.work.WorkerParameters.a aVar) {
        this.f9435C = jVar;
        this.f9436D = str;
        this.f9437E = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9435C.m().k(this.f9436D, this.f9437E);
    }
}
