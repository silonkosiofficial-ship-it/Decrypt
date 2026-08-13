package Q3;

/* JADX INFO: loaded from: classes.dex */
public abstract class D implements android.content.DialogInterface.OnClickListener {
    public static Q3.D b(android.app.Activity activity, android.content.Intent intent, int i6) {
        return new Q3.B(intent, activity, i6);
    }

    public static Q3.D c(P3.InterfaceC1449e interfaceC1449e, android.content.Intent intent, int i6) {
        return new Q3.C(intent, interfaceC1449e, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i6) {
        try {
            try {
                a();
            } catch (android.content.ActivityNotFoundException e6) {
                if (true == android.os.Build.FINGERPRINT.contains("generic")) {
                }
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
