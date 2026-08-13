package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends androidx.core.content.a {

    static class a {
        static void a(java.lang.Object obj) {
            ((android.app.SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(android.app.Activity activity, java.lang.String[] strArr, int i6) {
            activity.requestPermissions(strArr, i6);
        }

        static boolean c(android.app.Activity activity, java.lang.String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    public interface InterfaceC0400b {
        void a(int i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(android.app.Activity activity) {
        if (activity.isFinishing() || androidx.core.app.d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void n(final android.app.Activity activity) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new android.os.Handler(activity.getMainLooper()).post(new java.lang.Runnable() { // from class: androidx.core.app.a
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.core.app.b.m(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void o(android.app.Activity activity, java.lang.String[] strArr, int i6) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (android.text.TextUtils.isEmpty(strArr[i10])) {
                throw new java.lang.IllegalArgumentException("Permission request for permissions " + java.util.Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (android.os.Build.VERSION.SDK_INT < 33 && android.text.TextUtils.equals(strArr[i10], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(java.lang.Integer.valueOf(i10));
            }
        }
        int size = hashSet.size();
        java.lang.String[] strArr2 = size > 0 ? new java.lang.String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (!hashSet.contains(java.lang.Integer.valueOf(i12))) {
                    strArr2[i11] = strArr[i12];
                    i11++;
                }
            }
        }
        if (activity instanceof androidx.core.app.b.InterfaceC0400b) {
            ((androidx.core.app.b.InterfaceC0400b) activity).a(i6);
        }
        androidx.core.app.b.a.b(activity, strArr, i6);
    }

    public static void p(android.app.Activity activity, android.content.Intent intent, int i6, android.os.Bundle bundle) {
        activity.startActivityForResult(intent, i6, bundle);
    }

    public static void q(android.app.Activity activity, android.content.IntentSender intentSender, int i6, android.content.Intent intent, int i10, int i11, int i12, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i6, intent, i10, i11, i12, bundle);
    }
}
