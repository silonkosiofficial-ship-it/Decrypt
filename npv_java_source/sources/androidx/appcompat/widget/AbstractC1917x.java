package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1917x {

    /* JADX INFO: renamed from: androidx.appcompat.widget.x$a */
    private static final class a {
        static boolean a(android.view.DragEvent dragEvent, android.widget.TextView textView, android.app.Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                android.text.Selection.setSelection((android.text.Spannable) textView.getText(), offsetForPosition);
                androidx.core.view.X.d0(textView, new androidx.core.view.C1996d.a(dragEvent.getClipData(), 3).a());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        static boolean b(android.view.DragEvent dragEvent, android.view.View view, android.app.Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            androidx.core.view.X.d0(view, new androidx.core.view.C1996d.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    static boolean a(android.view.View view, android.view.DragEvent dragEvent) {
        int i6 = android.os.Build.VERSION.SDK_INT;
        if (i6 < 31 && i6 >= 24 && dragEvent.getLocalState() == null && androidx.core.view.X.C(view) != null) {
            android.app.Activity activityC = c(view);
            if (activityC == null) {
                java.lang.String str = "Can't handle drop: no activity: view=" + view;
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof android.widget.TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof android.widget.TextView ? androidx.appcompat.widget.AbstractC1917x.a.a(dragEvent, (android.widget.TextView) view, activityC) : androidx.appcompat.widget.AbstractC1917x.a.b(dragEvent, view, activityC);
            }
        }
        return false;
    }

    static boolean b(android.widget.TextView textView, int i6) {
        if (android.os.Build.VERSION.SDK_INT >= 31 || androidx.core.view.X.C(textView) == null || !(i6 == 16908322 || i6 == 16908337)) {
            return false;
        }
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) textView.getContext().getSystemService("clipboard");
        android.content.ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            androidx.core.view.X.d0(textView, new androidx.core.view.C1996d.a(primaryClip, 1).c(i6 != 16908322 ? 1 : 0).a());
        }
        return true;
    }

    static android.app.Activity c(android.view.View view) {
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }
}
