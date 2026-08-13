package p019b9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.StackTraceElement f24330a = new p000a.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.String f24331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final java.lang.String f24332c;

    static {
        java.lang.Object objB;
        java.lang.Object objB2;
        try {
            i7.w.a aVar = p087i7.w.f46751D;
            objB = p087i7.w.b(p147o7.a.class.getCanonicalName());
        } catch (java.lang.Throwable th) {
            i7.w.a aVar2 = p087i7.w.f46751D;
            objB = p087i7.w.b(p087i7.x.a(th));
        }
        if (p087i7.w.e(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f24331b = (java.lang.String) objB;
        try {
            objB2 = p087i7.w.b(p019b9.C.class.getCanonicalName());
        } catch (java.lang.Throwable th2) {
            i7.w.a aVar3 = p087i7.w.f46751D;
            objB2 = p087i7.w.b(p087i7.x.a(th2));
        }
        if (p087i7.w.e(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f24332c = (java.lang.String) objB2;
    }

    public static final java.lang.Throwable a(java.lang.Throwable th) {
        return th;
    }
}
