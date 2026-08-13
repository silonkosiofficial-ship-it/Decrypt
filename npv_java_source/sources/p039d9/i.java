package p039d9;

/* JADX INFO: loaded from: classes2.dex */
final class i extends p039d9.h {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.lang.Runnable f44339E;

    public i(java.lang.Runnable runnable, long j6, boolean z6) {
        super(j6, z6);
        this.f44339E = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f44339E.run();
    }

    public java.lang.String toString() {
        return "Task[" + W8.S.a(this.f44339E) + '@' + W8.S.b(this.f44339E) + ", " + this.f44337C + ", " + p039d9.j.c(this.f44338D) + ']';
    }
}
