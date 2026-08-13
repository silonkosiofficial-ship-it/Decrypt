package C1;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static void a(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i6) {
        accessibilityRecord.setMaxScrollX(i6);
    }

    public static void b(android.view.accessibility.AccessibilityRecord accessibilityRecord, int i6) {
        accessibilityRecord.setMaxScrollY(i6);
    }

    public static void c(android.view.accessibility.AccessibilityRecord accessibilityRecord, android.view.View view, int i6) {
        accessibilityRecord.setSource(view, i6);
    }
}
