package androidx.compose.ui.graphics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, p237x7.l lVar) {
        return dVar.b(new androidx.compose.ui.graphics.BlockGraphicsLayerElement(lVar));
    }

    public static final androidx.compose.ui.d b(androidx.compose.ui.d dVar, float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j6, p141o0.e2 e2Var, boolean z6, p141o0.Z1 z10, long j10, long j11, int i6) {
        return dVar.b(new androidx.compose.ui.graphics.GraphicsLayerElement(f6, f10, f11, f12, f13, f14, f15, f16, f17, f18, j6, e2Var, z6, z10, j10, j11, i6, null));
    }

    public static /* synthetic */ androidx.compose.ui.d c(androidx.compose.ui.d dVar, float f6, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j6, p141o0.e2 e2Var, boolean z6, p141o0.Z1 z10, long j10, long j11, int i6, int i10, java.lang.Object obj) {
        return b(dVar, (i10 & 1) != 0 ? 1.0f : f6, (i10 & 2) != 0 ? 1.0f : f10, (i10 & 4) == 0 ? f11 : 1.0f, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 0.0f : f13, (i10 & 32) != 0 ? 0.0f : f14, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) != 0 ? 0.0f : f16, (i10 & 256) == 0 ? f17 : 0.0f, (i10 & 512) != 0 ? 8.0f : f18, (i10 & 1024) != 0 ? androidx.compose.ui.graphics.f.f19784b.a() : j6, (i10 & 2048) != 0 ? p141o0.Y1.a() : e2Var, (i10 & 4096) != 0 ? false : z6, (i10 & 8192) != 0 ? null : z10, (i10 & 16384) != 0 ? p141o0.D1.a() : j10, (i10 & 32768) != 0 ? p141o0.D1.a() : j11, (i10 & 65536) != 0 ? androidx.compose.ui.graphics.a.f19739a.a() : i6);
    }

    public static final androidx.compose.ui.d d(androidx.compose.ui.d dVar) {
        return androidx.compose.ui.platform.E0.b() ? dVar.b(c(androidx.compose.ui.d.f19586a, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : dVar;
    }
}
