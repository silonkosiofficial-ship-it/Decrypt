package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static boolean a(android.view.MotionEvent motionEvent, int i6) {
        return (motionEvent.getSource() & i6) == i6;
    }
}
