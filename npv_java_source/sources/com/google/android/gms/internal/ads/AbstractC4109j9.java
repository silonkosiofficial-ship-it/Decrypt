package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4109j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f36602a = "j9";

    protected static java.util.HashMap a(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            return (java.util.HashMap) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(str.getBytes(), 0))).readObject();
        } catch (java.io.IOException | java.lang.ClassNotFoundException unused) {
            java.lang.String str2 = f36602a;
            return null;
        }
    }

    protected abstract java.util.HashMap b();

    public final java.lang.String toString() {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(b());
            objectOutputStream.close();
            return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
