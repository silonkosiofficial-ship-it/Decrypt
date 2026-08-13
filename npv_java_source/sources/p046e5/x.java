package p046e5;

/* JADX INFO: loaded from: classes3.dex */
public class x implements F5.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f44744c = new java.lang.Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile java.lang.Object f44745a = f44744c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile F5.b f44746b;

    public x(F5.b bVar) {
        this.f44746b = bVar;
    }

    @Override // F5.b
    public java.lang.Object get() {
        java.lang.Object obj = this.f44745a;
        java.lang.Object obj2 = f44744c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f44745a;
                    if (obj == obj2) {
                        obj = this.f44746b.get();
                        this.f44745a = obj;
                        this.f44746b = null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
