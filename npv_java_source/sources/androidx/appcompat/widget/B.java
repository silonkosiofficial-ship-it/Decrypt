package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.widget.TextView f18065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.view.textclassifier.TextClassifier f18066b;

    private static final class a {
        static android.view.textclassifier.TextClassifier a(android.widget.TextView textView) {
            android.view.textclassifier.TextClassificationManager textClassificationManager = (android.view.textclassifier.TextClassificationManager) textView.getContext().getSystemService(android.view.textclassifier.TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : android.view.textclassifier.TextClassifier.NO_OP;
        }
    }

    B(android.widget.TextView textView) {
        this.f18065a = (android.widget.TextView) B1.i.g(textView);
    }

    public android.view.textclassifier.TextClassifier a() {
        android.view.textclassifier.TextClassifier textClassifier = this.f18066b;
        return textClassifier == null ? androidx.appcompat.widget.B.a.a(this.f18065a) : textClassifier;
    }

    public void b(android.view.textclassifier.TextClassifier textClassifier) {
        this.f18066b = textClassifier;
    }
}
