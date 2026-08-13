package C1;

/* JADX INFO: loaded from: classes.dex */
public class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f1268a;

    static class a extends android.view.accessibility.AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C1.E f1269a;

        a(C1.E e6) {
            this.f1269a = e6;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int i6) {
            C1.B b6 = this.f1269a.b(i6);
            if (b6 == null) {
                return null;
            }
            return b6.a1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public java.util.List findAccessibilityNodeInfosByText(java.lang.String str, int i6) {
            java.util.List listC = this.f1269a.c(str, i6);
            if (listC == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = listC.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((C1.B) listC.get(i10)).a1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo findFocus(int i6) {
            C1.B bD = this.f1269a.d(i6);
            if (bD == null) {
                return null;
            }
            return bD.a1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i6, int i10, android.os.Bundle bundle) {
            return this.f1269a.f(i6, i10, bundle);
        }
    }

    static class b extends C1.E.a {
        b(C1.E e6) {
            super(e6);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i6, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
            this.f1269a.a(i6, C1.B.b1(accessibilityNodeInfo), str, bundle);
        }
    }

    public E() {
        this.f1268a = android.os.Build.VERSION.SDK_INT >= 26 ? new C1.E.b(this) : new C1.E.a(this);
    }

    public E(java.lang.Object obj) {
        this.f1268a = obj;
    }

    public void a(int i6, C1.B b6, java.lang.String str, android.os.Bundle bundle) {
    }

    public C1.B b(int i6) {
        return null;
    }

    public java.util.List c(java.lang.String str, int i6) {
        return null;
    }

    public C1.B d(int i6) {
        return null;
    }

    public java.lang.Object e() {
        return this.f1268a;
    }

    public boolean f(int i6, int i10, android.os.Bundle bundle) {
        return false;
    }
}
