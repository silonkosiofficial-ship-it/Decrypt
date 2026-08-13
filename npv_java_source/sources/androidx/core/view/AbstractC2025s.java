package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2025s {
    public static void a(int i6, int i10, int i11, android.graphics.Rect rect, android.graphics.Rect rect2, int i12) {
        android.view.Gravity.apply(i6, i10, i11, rect, rect2, i12);
    }

    public static int b(int i6, int i10) {
        return android.view.Gravity.getAbsoluteGravity(i6, i10);
    }
}
