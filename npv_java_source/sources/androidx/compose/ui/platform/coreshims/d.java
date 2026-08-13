package androidx.compose.ui.platform.coreshims;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f20089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.View f20090b;

    private static class a {
        static android.os.Bundle a(android.view.ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    private static class b {
        static android.view.autofill.AutofillId a(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j6) {
            return contentCaptureSession.newAutofillId(autofillId, j6);
        }

        static android.view.ViewStructure b(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static android.view.ViewStructure c(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j6) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j6);
        }

        static void d(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, java.lang.CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private static class c {
        static void a(android.view.contentcapture.ContentCaptureSession contentCaptureSession, java.util.List<android.view.ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private d(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        this.f20089a = contentCaptureSession;
        this.f20090b = view;
    }

    public static androidx.compose.ui.platform.coreshims.d f(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        return new androidx.compose.ui.platform.coreshims.d(contentCaptureSession, view);
    }

    public android.view.autofill.AutofillId a(long j6) {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            return null;
        }
        android.view.contentcapture.ContentCaptureSession contentCaptureSessionA = androidx.compose.ui.platform.coreshims.c.a(this.f20089a);
        androidx.compose.ui.platform.coreshims.b bVarA = androidx.compose.ui.platform.coreshims.e.a(this.f20090b);
        j$.util.Objects.requireNonNull(bVarA);
        return androidx.compose.ui.platform.coreshims.d.b.a(contentCaptureSessionA, bVarA.a(), j6);
    }

    public androidx.compose.ui.platform.coreshims.f b(android.view.autofill.AutofillId autofillId, long j6) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.platform.coreshims.f.i(androidx.compose.ui.platform.coreshims.d.b.c(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), autofillId, j6));
        }
        return null;
    }

    public void c(android.view.autofill.AutofillId autofillId, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.coreshims.d.b.e(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), autofillId, charSequence);
        }
    }

    public void d(java.util.List list) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            androidx.compose.ui.platform.coreshims.d.c.a(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), list);
            return;
        }
        if (i6 >= 29) {
            android.view.ViewStructure viewStructureB = androidx.compose.ui.platform.coreshims.d.b.b(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), this.f20090b);
            androidx.compose.ui.platform.coreshims.d.a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            androidx.compose.ui.platform.coreshims.d.b.d(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), viewStructureB);
            for (int i10 = 0; i10 < list.size(); i10++) {
                androidx.compose.ui.platform.coreshims.d.b.d(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), (android.view.ViewStructure) list.get(i10));
            }
            android.view.ViewStructure viewStructureB2 = androidx.compose.ui.platform.coreshims.d.b.b(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), this.f20090b);
            androidx.compose.ui.platform.coreshims.d.a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            androidx.compose.ui.platform.coreshims.d.b.d(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), viewStructureB2);
        }
    }

    public void e(long[] jArr) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            android.view.contentcapture.ContentCaptureSession contentCaptureSessionA = androidx.compose.ui.platform.coreshims.c.a(this.f20089a);
            androidx.compose.ui.platform.coreshims.b bVarA = androidx.compose.ui.platform.coreshims.e.a(this.f20090b);
            j$.util.Objects.requireNonNull(bVarA);
            androidx.compose.ui.platform.coreshims.d.b.f(contentCaptureSessionA, bVarA.a(), jArr);
            return;
        }
        if (i6 >= 29) {
            android.view.ViewStructure viewStructureB = androidx.compose.ui.platform.coreshims.d.b.b(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), this.f20090b);
            androidx.compose.ui.platform.coreshims.d.a.a(viewStructureB).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            androidx.compose.ui.platform.coreshims.d.b.d(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), viewStructureB);
            android.view.contentcapture.ContentCaptureSession contentCaptureSessionA2 = androidx.compose.ui.platform.coreshims.c.a(this.f20089a);
            androidx.compose.ui.platform.coreshims.b bVarA2 = androidx.compose.ui.platform.coreshims.e.a(this.f20090b);
            j$.util.Objects.requireNonNull(bVarA2);
            androidx.compose.ui.platform.coreshims.d.b.f(contentCaptureSessionA2, bVarA2.a(), jArr);
            android.view.ViewStructure viewStructureB2 = androidx.compose.ui.platform.coreshims.d.b.b(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), this.f20090b);
            androidx.compose.ui.platform.coreshims.d.a.a(viewStructureB2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            androidx.compose.ui.platform.coreshims.d.b.d(androidx.compose.ui.platform.coreshims.c.a(this.f20089a), viewStructureB2);
        }
    }
}
