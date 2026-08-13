package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class G1 {
    public static final p141o0.E1 a(int i6, int i10, int i11, boolean z6, p151p0.c cVar) {
        return p141o0.Q.a(i6, i10, i11, z6, cVar);
    }

    public static /* synthetic */ p141o0.E1 b(int i6, int i10, int i11, boolean z6, p151p0.c cVar, int i12, java.lang.Object obj) {
        if ((i12 & 4) != 0) {
            i11 = p141o0.F1.f52118b.b();
        }
        if ((i12 & 8) != 0) {
            z6 = true;
        }
        if ((i12 & 16) != 0) {
            cVar = p151p0.g.f52623a.w();
        }
        return a(i6, i10, i11, z6, cVar);
    }
}
