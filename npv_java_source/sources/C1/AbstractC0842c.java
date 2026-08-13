package C1;

/* JADX INFO: renamed from: C1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0842c {

    /* JADX INFO: renamed from: C1.c$a */
    public interface a {
        void onTouchExplorationStateChanged(boolean z6);
    }

    /* JADX INFO: renamed from: C1.c$b */
    private static final class b implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C1.AbstractC0842c.a f1273a;

        b(C1.AbstractC0842c.a aVar) {
            this.f1273a = aVar;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1.AbstractC0842c.b) {
                return this.f1273a.equals(((C1.AbstractC0842c.b) obj).f1273a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1273a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z6) {
            this.f1273a.onTouchExplorationStateChanged(z6);
        }
    }

    public static boolean a(android.view.accessibility.AccessibilityManager accessibilityManager, C1.AbstractC0842c.a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new C1.AbstractC0842c.b(aVar));
    }

    public static boolean b(android.view.accessibility.AccessibilityManager accessibilityManager, C1.AbstractC0842c.a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new C1.AbstractC0842c.b(aVar));
    }
}
