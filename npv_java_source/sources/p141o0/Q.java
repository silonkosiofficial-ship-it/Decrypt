package p141o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public static final p141o0.E1 a(int i6, int i10, int i11, boolean z6, p151p0.c cVar) {
        android.graphics.Bitmap bitmapCreateBitmap;
        android.graphics.Bitmap.Config configD = d(i11);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = p141o0.C6954d0.b(i6, i10, i11, z6, cVar);
        } else {
            bitmapCreateBitmap = android.graphics.Bitmap.createBitmap((android.util.DisplayMetrics) null, i6, i10, configD);
            bitmapCreateBitmap.setHasAlpha(z6);
        }
        return new p141o0.N(bitmapCreateBitmap);
    }

    public static final android.graphics.Bitmap b(p141o0.E1 e6) {
        if (e6 instanceof p141o0.N) {
            return ((p141o0.N) e6).c();
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final p141o0.E1 c(android.graphics.Bitmap bitmap) {
        return new p141o0.N(bitmap);
    }

    public static final android.graphics.Bitmap.Config d(int i6) {
        o0.F1.a aVar = p141o0.F1.f52118b;
        if (!p141o0.F1.i(i6, aVar.b())) {
            if (p141o0.F1.i(i6, aVar.a())) {
                return android.graphics.Bitmap.Config.ALPHA_8;
            }
            if (p141o0.F1.i(i6, aVar.e())) {
                return android.graphics.Bitmap.Config.RGB_565;
            }
            int i10 = android.os.Build.VERSION.SDK_INT;
            if (i10 >= 26 && p141o0.F1.i(i6, aVar.c())) {
                return android.graphics.Bitmap.Config.RGBA_F16;
            }
            if (i10 >= 26 && p141o0.F1.i(i6, aVar.d())) {
                return android.graphics.Bitmap.Config.HARDWARE;
            }
        }
        return android.graphics.Bitmap.Config.ARGB_8888;
    }

    public static final int e(android.graphics.Bitmap.Config config) {
        if (config == android.graphics.Bitmap.Config.ALPHA_8) {
            return p141o0.F1.f52118b.a();
        }
        if (config == android.graphics.Bitmap.Config.RGB_565) {
            return p141o0.F1.f52118b.e();
        }
        if (config != android.graphics.Bitmap.Config.ARGB_4444) {
            int i6 = android.os.Build.VERSION.SDK_INT;
            if (i6 >= 26 && config == android.graphics.Bitmap.Config.RGBA_F16) {
                return p141o0.F1.f52118b.c();
            }
            if (i6 >= 26 && config == android.graphics.Bitmap.Config.HARDWARE) {
                return p141o0.F1.f52118b.d();
            }
        }
        return p141o0.F1.f52118b.b();
    }
}
