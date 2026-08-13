package androidx.appcompat.app;

/* JADX INFO: renamed from: androidx.appcompat.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC1891b extends androidx.appcompat.app.t implements android.content.DialogInterface {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final androidx.appcompat.app.AlertController f17518H;

    /* JADX INFO: renamed from: androidx.appcompat.app.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.app.AlertController.b f17519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f17520b;

        public a(android.content.Context context) {
            this(context, androidx.appcompat.app.DialogInterfaceC1891b.m(context, 0));
        }

        public a(android.content.Context context, int i6) {
            this.f17519a = new androidx.appcompat.app.AlertController.b(new android.view.ContextThemeWrapper(context, androidx.appcompat.app.DialogInterfaceC1891b.m(context, i6)));
            this.f17520b = i6;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b a() {
            androidx.appcompat.app.DialogInterfaceC1891b dialogInterfaceC1891b = new androidx.appcompat.app.DialogInterfaceC1891b(this.f17519a.f17429a, this.f17520b);
            this.f17519a.a(dialogInterfaceC1891b.f17518H);
            dialogInterfaceC1891b.setCancelable(this.f17519a.f17446r);
            if (this.f17519a.f17446r) {
                dialogInterfaceC1891b.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC1891b.setOnCancelListener(this.f17519a.f17447s);
            dialogInterfaceC1891b.setOnDismissListener(this.f17519a.f17448t);
            android.content.DialogInterface.OnKeyListener onKeyListener = this.f17519a.f17449u;
            if (onKeyListener != null) {
                dialogInterfaceC1891b.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC1891b;
        }

        public android.content.Context b() {
            return this.f17519a.f17429a;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a c(android.widget.ListAdapter listAdapter, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.b bVar = this.f17519a;
            bVar.f17451w = listAdapter;
            bVar.f17452x = onClickListener;
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a d(boolean z6) {
            this.f17519a.f17446r = z6;
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a e(android.view.View view) {
            this.f17519a.f17435g = view;
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a f(android.graphics.drawable.Drawable drawable) {
            this.f17519a.f17432d = drawable;
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a g(int i6) {
            androidx.appcompat.app.AlertController.b bVar = this.f17519a;
            bVar.f17436h = bVar.f17429a.getText(i6);
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a h(android.content.DialogInterface.OnCancelListener onCancelListener) {
            this.f17519a.f17447s = onCancelListener;
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a i(android.content.DialogInterface.OnKeyListener onKeyListener) {
            this.f17519a.f17449u = onKeyListener;
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a j(int i6, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.b bVar = this.f17519a;
            bVar.f17437i = bVar.f17429a.getText(i6);
            this.f17519a.f17439k = onClickListener;
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a k(android.widget.ListAdapter listAdapter, int i6, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.b bVar = this.f17519a;
            bVar.f17451w = listAdapter;
            bVar.f17452x = onClickListener;
            bVar.f17422I = i6;
            bVar.f17421H = true;
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a l(int i6) {
            androidx.appcompat.app.AlertController.b bVar = this.f17519a;
            bVar.f17434f = bVar.f17429a.getText(i6);
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a m(java.lang.CharSequence charSequence) {
            this.f17519a.f17434f = charSequence;
            return this;
        }

        public androidx.appcompat.app.DialogInterfaceC1891b.a n(android.view.View view) {
            androidx.appcompat.app.AlertController.b bVar = this.f17519a;
            bVar.f17454z = view;
            bVar.f17453y = 0;
            bVar.f17418E = false;
            return this;
        }
    }

    protected DialogInterfaceC1891b(android.content.Context context, int i6) {
        super(context, m(context, i6));
        this.f17518H = new androidx.appcompat.app.AlertController(getContext(), this, getWindow());
    }

    static int m(android.content.Context context, int i6) {
        if (((i6 >>> 24) & 255) >= 1) {
            return i6;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(p090j.a.f48635l, typedValue, true);
        return typedValue.resourceId;
    }

    public android.widget.ListView l() {
        return this.f17518H.d();
    }

    @Override // androidx.appcompat.app.t, p040e.r, android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f17518H.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i6, android.view.KeyEvent keyEvent) {
        if (this.f17518H.f(i6, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i6, android.view.KeyEvent keyEvent) {
        if (this.f17518H.g(i6, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i6, keyEvent);
    }

    @Override // androidx.appcompat.app.t, android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f17518H.p(charSequence);
    }
}
