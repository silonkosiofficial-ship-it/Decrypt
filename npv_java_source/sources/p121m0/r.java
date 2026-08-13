package p121m0;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final p121m0.s b(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        F0.J jO1;
        F0.o0 o0VarN0;
        p121m0.i focusOwner;
        F0.AbstractC0914d0 abstractC0914d0S1 = focusTargetNode.E0().s1();
        if (abstractC0914d0S1 == null || (jO1 = abstractC0914d0S1.o1()) == null || (o0VarN0 = jO1.n0()) == null || (focusOwner = o0VarN0.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.g();
    }

    public static final void c(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        F0.AbstractC0925k.n(focusTargetNode).getFocusOwner().a(focusTargetNode);
    }

    public static final p121m0.s d(androidx.compose.ui.focus.FocusTargetNode focusTargetNode) {
        return F0.AbstractC0925k.n(focusTargetNode).getFocusOwner().g();
    }
}
