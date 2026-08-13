package V2;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static /* synthetic */ void a(V2.d dVar, long j6, boolean z6, boolean z10, p237x7.l lVar, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
        }
        if ((i6 & 2) != 0) {
            z6 = p141o0.A0.j(j6) > 0.5f;
        }
        boolean z11 = z6;
        boolean z12 = (i6 & 4) != 0 ? true : z10;
        if ((i6 & 8) != 0) {
            lVar = V2.e.f15113b;
        }
        dVar.b(j6, z11, z12, lVar);
    }

    public static /* synthetic */ void b(V2.d dVar, long j6, boolean z6, p237x7.l lVar, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
        }
        if ((i6 & 2) != 0) {
            z6 = p141o0.A0.j(j6) > 0.5f;
        }
        if ((i6 & 4) != 0) {
            lVar = V2.e.f15113b;
        }
        dVar.a(j6, z6, lVar);
    }
}
