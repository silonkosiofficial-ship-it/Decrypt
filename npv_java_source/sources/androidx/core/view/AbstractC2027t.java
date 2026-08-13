package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2027t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f21770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static java.lang.reflect.Method f21771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f21772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static java.lang.reflect.Field f21773d;

    /* JADX INFO: renamed from: androidx.core.view.t$a */
    public interface a {
        boolean r(android.view.KeyEvent keyEvent);
    }

    private static boolean a(android.app.ActionBar actionBar, android.view.KeyEvent keyEvent) {
        if (!f21770a) {
            try {
                f21771b = actionBar.getClass().getMethod("onMenuKeyEvent", android.view.KeyEvent.class);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            f21770a = true;
        }
        java.lang.reflect.Method method = f21771b;
        if (method != null) {
            try {
                java.lang.Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((java.lang.Boolean) objInvoke).booleanValue();
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean b(android.app.Activity activity, android.view.KeyEvent keyEvent) {
        activity.onUserInteraction();
        android.view.Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            android.app.ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        android.view.View decorView = window.getDecorView();
        if (androidx.core.view.X.h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static boolean c(android.app.Dialog dialog, android.view.KeyEvent keyEvent) {
        android.content.DialogInterface.OnKeyListener onKeyListenerF = f(dialog);
        if (onKeyListenerF != null && onKeyListenerF.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        android.view.Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        android.view.View decorView = window.getDecorView();
        if (androidx.core.view.X.h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    public static boolean d(android.view.View view, android.view.KeyEvent keyEvent) {
        return androidx.core.view.X.i(view, keyEvent);
    }

    public static boolean e(androidx.core.view.AbstractC2027t.a aVar, android.view.View view, android.view.Window.Callback callback, android.view.KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return aVar.r(keyEvent);
        }
        if (callback instanceof android.app.Activity) {
            return b((android.app.Activity) callback, keyEvent);
        }
        if (callback instanceof android.app.Dialog) {
            return c((android.app.Dialog) callback, keyEvent);
        }
        return (view != null && androidx.core.view.X.h(view, keyEvent)) || aVar.r(keyEvent);
    }

    private static android.content.DialogInterface.OnKeyListener f(android.app.Dialog dialog) {
        if (!f21772c) {
            try {
                java.lang.reflect.Field declaredField = android.app.Dialog.class.getDeclaredField("mOnKeyListener");
                f21773d = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
            }
            f21772c = true;
        }
        java.lang.reflect.Field field = f21773d;
        if (field == null) {
            return null;
        }
        try {
            return (android.content.DialogInterface.OnKeyListener) field.get(dialog);
        } catch (java.lang.IllegalAccessException unused2) {
            return null;
        }
    }
}
