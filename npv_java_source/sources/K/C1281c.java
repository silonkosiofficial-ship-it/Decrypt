package K;

/* JADX INFO: renamed from: K.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1281c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K.C1281c f5858a = new K.C1281c();

    private C1281c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(java.util.function.IntConsumer intConsumer, int i6) {
        intConsumer.accept(i6);
    }

    public final void b(H.C1230w c1230w, N.F f6, android.view.inputmethod.HandwritingGesture handwritingGesture, androidx.compose.ui.platform.A1 a6, java.util.concurrent.Executor executor, final java.util.function.IntConsumer intConsumer, p237x7.l lVar) {
        final int iL = c1230w != null ? K.i0.f5861a.l(c1230w, handwritingGesture, f6, a6, lVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new java.lang.Runnable() { // from class: K.b
                @Override // java.lang.Runnable
                public final void run() {
                    K.C1281c.c(intConsumer, iL);
                }
            });
        } else {
            intConsumer.accept(iL);
        }
    }

    public final boolean d(H.C1230w c1230w, N.F f6, android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, android.os.CancellationSignal cancellationSignal) {
        if (c1230w != null) {
            return K.i0.f5861a.D(c1230w, previewableHandwritingGesture, f6, cancellationSignal);
        }
        return false;
    }
}
