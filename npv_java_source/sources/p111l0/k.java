package p111l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, float f6, p141o0.e2 e2Var, boolean z6, long j6, long j10) {
        return (Y0.i.o(f6, Y0.i.q((float) 0)) > 0 || z6) ? dVar.b(new androidx.compose.ui.draw.ShadowGraphicsLayerElement(f6, e2Var, z6, j6, j10, null)) : dVar;
    }

    public static /* synthetic */ androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f6, p141o0.e2 e2Var, boolean z6, long j6, long j10, int i6, java.lang.Object obj) {
        boolean z10;
        p141o0.e2 e2VarA = (i6 & 2) != 0 ? p141o0.Y1.a() : e2Var;
        if ((i6 & 4) != 0) {
            z10 = false;
            if (Y0.i.o(f6, Y0.i.q(0)) > 0) {
                z10 = true;
            }
        } else {
            z10 = z6;
        }
        return a(dVar, f6, e2VarA, z10, (i6 & 8) != 0 ? p141o0.D1.a() : j6, (i6 & 16) != 0 ? p141o0.D1.a() : j10);
    }
}
