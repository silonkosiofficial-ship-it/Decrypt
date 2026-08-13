package N3;

/* JADX INFO: renamed from: N3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC1390c extends android.app.DialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private android.app.Dialog f7650C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f7651D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.app.Dialog f7652E;

    public static N3.DialogFragmentC1390c a(android.app.Dialog dialog, android.content.DialogInterface.OnCancelListener onCancelListener) {
        N3.DialogFragmentC1390c dialogFragmentC1390c = new N3.DialogFragmentC1390c();
        android.app.Dialog dialog2 = (android.app.Dialog) Q3.AbstractC1477p.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1390c.f7650C = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1390c.f7651D = onCancelListener;
        }
        return dialogFragmentC1390c;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f7651D;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.f7650C;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f7652E == null) {
            this.f7652E = new android.app.AlertDialog.Builder((android.content.Context) Q3.AbstractC1477p.l(getActivity())).create();
        }
        return this.f7652E;
    }

    @Override // android.app.DialogFragment
    public void show(android.app.FragmentManager fragmentManager, java.lang.String str) {
        super.show(fragmentManager, str);
    }
}
