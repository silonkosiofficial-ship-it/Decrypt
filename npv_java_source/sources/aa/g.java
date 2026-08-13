package aa;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final p141o0.E1 a(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        if (i6 > i10) {
            options.inDensity = i6;
            options.inTargetDensity = i10;
        }
        android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        p247y7.AbstractC7350t.e(bitmapDecodeByteArray, "decodeByteArray(...)");
        return p141o0.Q.c(bitmapDecodeByteArray);
    }

    public static final aa.B b(byte[] bArr) {
        p247y7.AbstractC7350t.f(bArr, "<this>");
        throw new java.lang.IllegalStateException("Android platform doesn't support SVG format.".toString());
    }

    public static final p191t0.b c(aa.B b6, Y0.e eVar) {
        p247y7.AbstractC7350t.f(b6, "<this>");
        p247y7.AbstractC7350t.f(eVar, "density");
        throw new java.lang.IllegalStateException("Android platform doesn't support SVG format.".toString());
    }
}
