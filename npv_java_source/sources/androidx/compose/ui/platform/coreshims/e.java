package androidx.compose.ui.platform.coreshims;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    static class a {
        public static android.view.autofill.AutofillId a(android.view.View view) {
            return view.getAutofillId();
        }
    }

    private static class b {
        static android.view.contentcapture.ContentCaptureSession a(android.view.View view) {
            return view.getContentCaptureSession();
        }
    }

    private static class c {
        static void a(android.view.View view, int i6) {
            view.setImportantForContentCapture(i6);
        }
    }

    public static androidx.compose.ui.platform.coreshims.b a(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.compose.ui.platform.coreshims.b.b(androidx.compose.ui.platform.coreshims.e.a.a(view));
        }
        return null;
    }

    public static androidx.compose.ui.platform.coreshims.d b(android.view.View view) {
        android.view.contentcapture.ContentCaptureSession contentCaptureSessionA;
        if (android.os.Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = androidx.compose.ui.platform.coreshims.e.b.a(view)) == null) {
            return null;
        }
        return androidx.compose.ui.platform.coreshims.d.f(contentCaptureSessionA, view);
    }

    public static void c(android.view.View view, int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.compose.ui.platform.coreshims.e.c.a(view, i6);
        }
    }
}
