package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
final class g extends java.util.concurrent.atomic.AtomicBoolean implements android.os.OutcomeReceiver {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final p127m7.e f21591C;

    public g(p127m7.e eVar) {
        super(false);
        this.f21591C = eVar;
    }

    public void onError(java.lang.Throwable th) {
        if (compareAndSet(false, true)) {
            p127m7.e eVar = this.f21591C;
            i7.w.a aVar = p087i7.w.f46751D;
            eVar.t(p087i7.w.b(p087i7.x.a(th)));
        }
    }

    public void onResult(java.lang.Object obj) {
        if (compareAndSet(false, true)) {
            this.f21591C.t(p087i7.w.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public java.lang.String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
