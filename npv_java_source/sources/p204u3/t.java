package p204u3;

/* JADX INFO: loaded from: classes.dex */
final class t extends p214v3.B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ p204u3.x f55512c;

    /* synthetic */ t(p204u3.x xVar, p204u3.u uVar) {
        this.f55512c = xVar;
    }

    @Override // p214v3.B
    public final void a() {
        final android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.Bitmap bitmapA = p174r3.v.y().a(java.lang.Integer.valueOf(this.f55512c.f55515D.f24724Q.f53875H));
        if (bitmapA != null) {
            p174r3.v.t();
            p204u3.x xVar = this.f55512c;
            p174r3.l lVar = xVar.f55515D.f24724Q;
            boolean z6 = lVar.f53873F;
            float f6 = lVar.f53874G;
            android.app.Activity activity = xVar.f55514C;
            if (!z6 || f6 <= 0.0f || f6 > 25.0f) {
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(activity.getResources(), bitmapA);
            } else {
                try {
                    android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapA, bitmapA.getWidth(), bitmapA.getHeight(), false);
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    android.renderscript.RenderScript renderScriptCreate = android.renderscript.RenderScript.create(activity);
                    android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlurCreate = android.renderscript.ScriptIntrinsicBlur.create(renderScriptCreate, android.renderscript.Element.U8_4(renderScriptCreate));
                    android.renderscript.Allocation allocationCreateFromBitmap = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    android.renderscript.Allocation allocationCreateFromBitmap2 = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f6);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (java.lang.RuntimeException unused) {
                    bitmapDrawable = new android.graphics.drawable.BitmapDrawable(activity.getResources(), bitmapA);
                }
            }
            p214v3.E0.f55826l.post(new java.lang.Runnable() { // from class: u3.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f55510C.f55512c.f55514C.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
