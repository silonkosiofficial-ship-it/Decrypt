package androidx.core.view;

/* JADX INFO: renamed from: androidx.core.view.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1990a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final android.view.View.AccessibilityDelegate f21696c = new android.view.View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View.AccessibilityDelegate f21697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.view.View.AccessibilityDelegate f21698b;

    /* JADX INFO: renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0410a extends android.view.View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.core.view.C1990a f21699a;

        C0410a(androidx.core.view.C1990a c1990a) {
            this.f21699a = c1990a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return this.f21699a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
            C1.E eB = this.f21699a.b(view);
            if (eB != null) {
                return (android.view.accessibility.AccessibilityNodeProvider) eB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            this.f21699a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            C1.B bB1 = C1.B.b1(accessibilityNodeInfo);
            bB1.M0(androidx.core.view.X.U(view));
            bB1.x0(androidx.core.view.X.P(view));
            bB1.G0(androidx.core.view.X.o(view));
            bB1.R0(androidx.core.view.X.G(view));
            this.f21699a.g(view, bB1);
            bB1.f(accessibilityNodeInfo.getText(), view);
            java.util.List listC = androidx.core.view.C1990a.c(view);
            for (int i6 = 0; i6 < listC.size(); i6++) {
                bB1.b((C1.B.a) listC.get(i6));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            this.f21699a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return this.f21699a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(android.view.View view, int i6, android.os.Bundle bundle) {
            return this.f21699a.j(view, i6, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(android.view.View view, int i6) {
            this.f21699a.l(view, i6);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            this.f21699a.m(view, accessibilityEvent);
        }
    }

    public C1990a() {
        this(f21696c);
    }

    public C1990a(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        this.f21697a = accessibilityDelegate;
        this.f21698b = new androidx.core.view.C1990a.C0410a(this);
    }

    static java.util.List c(android.view.View view) {
        java.util.List list = (java.util.List) view.getTag(p202u1.c.f55379H);
        return list == null ? java.util.Collections.emptyList() : list;
    }

    private boolean e(android.text.style.ClickableSpan clickableSpan, android.view.View view) {
        if (clickableSpan != null) {
            android.text.style.ClickableSpan[] clickableSpanArrR = C1.B.r(view.createAccessibilityNodeInfo().getText());
            for (int i6 = 0; clickableSpanArrR != null && i6 < clickableSpanArrR.length; i6++) {
                if (clickableSpan.equals(clickableSpanArrR[i6])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i6, android.view.View view) {
        java.lang.ref.WeakReference weakReference;
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(p202u1.c.f55380I);
        if (sparseArray == null || (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i6)) == null) {
            return false;
        }
        android.text.style.ClickableSpan clickableSpan = (android.text.style.ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f21697a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C1.E b(android.view.View view) {
        android.view.accessibility.AccessibilityNodeProvider accessibilityNodeProvider = this.f21697a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1.E(accessibilityNodeProvider);
        }
        return null;
    }

    android.view.View.AccessibilityDelegate d() {
        return this.f21698b;
    }

    public void f(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f21697a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(android.view.View view, C1.B b6) {
        this.f21697a.onInitializeAccessibilityNodeInfo(view, b6.a1());
    }

    public void h(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f21697a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f21697a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(android.view.View view, int i6, android.os.Bundle bundle) {
        java.util.List listC = c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i10 = 0; i10 < listC.size(); i10++) {
            C1.B.a aVar = (C1.B.a) listC.get(i10);
            if (aVar.b() == i6) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f21697a.performAccessibilityAction(view, i6, bundle);
        }
        return (zPerformAccessibilityAction || i6 != p202u1.c.f55391a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(android.view.View view, int i6) {
        this.f21697a.sendAccessibilityEvent(view, i6);
    }

    public void m(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.f21697a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
