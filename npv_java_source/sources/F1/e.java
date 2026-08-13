package F1;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    class a extends android.view.inputmethod.InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ F1.e.c f2735a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(android.view.inputmethod.InputConnection inputConnection, boolean z6, F1.e.c cVar) {
            super(inputConnection, z6);
            this.f2735a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(android.view.inputmethod.InputContentInfo inputContentInfo, int i6, android.os.Bundle bundle) {
            if (this.f2735a.a(F1.f.f(inputContentInfo), i6, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i6, bundle);
        }
    }

    class b extends android.view.inputmethod.InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ F1.e.c f2736a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(android.view.inputmethod.InputConnection inputConnection, boolean z6, F1.e.c cVar) {
            super(inputConnection, z6);
            this.f2736a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(java.lang.String str, android.os.Bundle bundle) {
            if (F1.e.e(str, bundle, this.f2736a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public interface c {
        boolean a(F1.f fVar, int i6, android.os.Bundle bundle);
    }

    private static F1.e.c b(final android.view.View view) {
        B1.i.g(view);
        return new F1.e.c() { // from class: F1.d
            @Override // F1.e.c
            public final boolean a(F1.f fVar, int i6, android.os.Bundle bundle) {
                return F1.e.f(view, fVar, i6, bundle);
            }
        };
    }

    public static android.view.inputmethod.InputConnection c(android.view.View view, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    public static android.view.inputmethod.InputConnection d(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, F1.e.c cVar) {
        B1.c.d(inputConnection, "inputConnection must be non-null");
        B1.c.d(editorInfo, "editorInfo must be non-null");
        B1.c.d(cVar, "onCommitContentListener must be non-null");
        if (android.os.Build.VERSION.SDK_INT >= 25) {
            return new F1.e.a(inputConnection, false, cVar);
        }
        return F1.c.a(editorInfo).length == 0 ? inputConnection : new F1.e.b(inputConnection, false, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static boolean e(java.lang.String str, android.os.Bundle bundle, F1.e.c cVar) throws java.lang.Throwable {
        boolean z6;
        android.os.ResultReceiver resultReceiver;
        boolean zA;
        ?? r6 = 0;
        r6 = 0;
        if (bundle == null) {
            return false;
        }
        if (android.text.TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z6 = false;
        } else {
            if (!android.text.TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z6 = true;
        }
        try {
            android.os.ResultReceiver resultReceiver2 = (android.os.ResultReceiver) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                android.net.Uri uri = (android.net.Uri) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                android.content.ClipDescription clipDescription = (android.content.ClipDescription) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                android.net.Uri uri2 = (android.net.Uri) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i6 = bundle.getInt(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                android.os.Bundle bundle2 = (android.os.Bundle) bundle.getParcelable(z6 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    zA = cVar.a(new F1.f(uri, clipDescription, uri2), i6, bundle2);
                }
                if (resultReceiver2 != 0) {
                    r6 = zA;
                    resultReceiver2.send(r6, null);
                }
                r6 = zA;
                return r6;
            } catch (java.lang.Throwable th) {
                th = th;
                resultReceiver = resultReceiver2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            resultReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean f(android.view.View view, F1.f fVar, int i6, android.os.Bundle bundle) {
        if (android.os.Build.VERSION.SDK_INT >= 25 && (i6 & 1) != 0) {
            try {
                fVar.d();
                android.os.Parcelable parcelable = (android.os.Parcelable) fVar.e();
                bundle = bundle == null ? new android.os.Bundle() : new android.os.Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (java.lang.Exception e6) {
                return false;
            }
        }
        return androidx.core.view.X.d0(view, new androidx.core.view.C1996d.a(new android.content.ClipData(fVar.b(), new android.content.ClipData.Item(fVar.a())), 2).d(fVar.c()).b(bundle).a()) == null;
    }
}
