package N3;

/* JADX INFO: loaded from: classes.dex */
public class n extends androidx.fragment.app.e {

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private android.app.Dialog f7673V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f7674W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private android.app.Dialog f7675X0;

    public static N3.n R1(android.app.Dialog dialog, android.content.DialogInterface.OnCancelListener onCancelListener) {
        N3.n nVar = new N3.n();
        android.app.Dialog dialog2 = (android.app.Dialog) Q3.AbstractC1477p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        nVar.f7673V0 = dialog2;
        if (onCancelListener != null) {
            nVar.f7674W0 = onCancelListener;
        }
        return nVar;
    }

    @Override // androidx.fragment.app.e
    public android.app.Dialog J1(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.f7673V0;
        if (dialog != null) {
            return dialog;
        }
        O1(false);
        if (this.f7675X0 == null) {
            this.f7675X0 = new android.app.AlertDialog.Builder((android.content.Context) Q3.AbstractC1477p.l(t())).create();
        }
        return this.f7675X0;
    }

    @Override // androidx.fragment.app.e
    public void Q1(androidx.fragment.app.n nVar, java.lang.String str) {
        super.Q1(nVar, str);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f7674W0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
