package fa;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class c {
    public static boolean a(fa.d dVar, ga.b bVar) {
        int iG = bVar.g();
        if (iG == 0) {
            return dVar.f();
        }
        if (iG == 10) {
            return dVar.b();
        }
        if (iG == 20) {
            return dVar.e();
        }
        if (iG == 30) {
            return dVar.a();
        }
        if (iG == 40) {
            return dVar.c();
        }
        throw new java.lang.IllegalArgumentException("Level [" + bVar + "] not recognized.");
    }
}
