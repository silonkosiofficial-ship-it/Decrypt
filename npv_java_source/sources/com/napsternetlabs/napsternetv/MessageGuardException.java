package com.napsternetlabs.napsternetv;

/* JADX INFO: loaded from: classes.dex */
public class MessageGuardException extends java.lang.RuntimeException {
    static java.lang.String fingerprint;
    private final java.lang.String guard;
    protected final java.lang.String id;

    public MessageGuardException(java.lang.Throwable th) {
        this(th, null);
    }

    public MessageGuardException(java.lang.Throwable th, java.lang.String str) {
        super(th.getLocalizedMessage(), th);
        java.lang.String message = th.getMessage();
        message = message == null ? "NO_MSG" : message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(message);
        sb.append(" ");
        sb.append(fingerprint);
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        this.guard = sb.toString();
        this.id = str;
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        java.lang.String str = getClass().getName() + "_" + android.util.Base64.encodeToString(this.guard.getBytes("UTF-8"), 11).replace('-', '$');
        java.lang.String localizedMessage = getLocalizedMessage();
        if (localizedMessage == null) {
            return str;
        }
        return str + ": " + localizedMessage;
    }
}
