package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    static class a {
        static void a(java.lang.Object obj, android.content.Intent intent, android.os.Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        public static android.app.RemoteInput b(androidx.core.app.q qVar) {
            throw null;
        }

        static android.os.Bundle c(android.content.Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    static android.app.RemoteInput a(androidx.core.app.q qVar) {
        return androidx.core.app.q.a.b(qVar);
    }

    static android.app.RemoteInput[] b(androidx.core.app.q[] qVarArr) {
        if (qVarArr == null) {
            return null;
        }
        android.app.RemoteInput[] remoteInputArr = new android.app.RemoteInput[qVarArr.length];
        for (int i6 = 0; i6 < qVarArr.length; i6++) {
            androidx.core.app.q qVar = qVarArr[i6];
            remoteInputArr[i6] = a(null);
        }
        return remoteInputArr;
    }
}
