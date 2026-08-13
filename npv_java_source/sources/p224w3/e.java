package p224w3;

/* JADX INFO: loaded from: classes.dex */
final class e extends java.lang.Thread {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f56227C;

    e(p224w3.g gVar, java.lang.String str) {
        this.f56227C = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new p224w3.v(null).o(this.f56227C);
    }
}
