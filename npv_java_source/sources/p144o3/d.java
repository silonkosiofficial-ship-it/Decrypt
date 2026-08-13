package p144o3;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final void a(java.lang.String str) {
        try {
            try {
                Z3.i.b(263);
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 65);
                        sb.append("Received non-success response code ");
                        sb.append(responseCode);
                        sb.append(" from pinging URL: ");
                        sb.append(str);
                        sb.toString();
                    }
                    httpURLConnection.disconnect();
                    Z3.i.a();
                } catch (java.lang.Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (java.io.IOException e6) {
                e = e6;
                java.lang.String message = e.getMessage();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 27 + java.lang.String.valueOf(message).length());
                sb2.append("Error while pinging URL: ");
                sb2.append(str);
                sb2.append(". ");
                sb2.append(message);
                sb2.toString();
                Z3.i.a();
            } catch (java.lang.IndexOutOfBoundsException e10) {
                java.lang.String message2 = e10.getMessage();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 32 + java.lang.String.valueOf(message2).length());
                sb3.append("Error while parsing ping URL: ");
                sb3.append(str);
                sb3.append(". ");
                sb3.append(message2);
                sb3.toString();
                Z3.i.a();
            } catch (java.lang.RuntimeException e11) {
                e = e11;
                java.lang.String message3 = e.getMessage();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 27 + java.lang.String.valueOf(message3).length());
                sb4.append("Error while pinging URL: ");
                sb4.append(str);
                sb4.append(". ");
                sb4.append(message3);
                sb4.toString();
                Z3.i.a();
            }
        } catch (java.lang.Throwable th2) {
            Z3.i.a();
            throw th2;
        }
    }
}
