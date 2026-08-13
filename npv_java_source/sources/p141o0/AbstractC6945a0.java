package p141o0;

/* JADX INFO: renamed from: o0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6945a0 {
    public static final android.graphics.Shader.TileMode a(int i6) {
        o0.j2.a aVar = p141o0.j2.f52237a;
        if (!p141o0.j2.f(i6, aVar.a())) {
            if (p141o0.j2.f(i6, aVar.d())) {
                return android.graphics.Shader.TileMode.REPEAT;
            }
            if (p141o0.j2.f(i6, aVar.c())) {
                return android.graphics.Shader.TileMode.MIRROR;
            }
            if (p141o0.j2.f(i6, aVar.b()) && android.os.Build.VERSION.SDK_INT >= 31) {
                return p141o0.l2.f52243a.b();
            }
        }
        return android.graphics.Shader.TileMode.CLAMP;
    }
}
