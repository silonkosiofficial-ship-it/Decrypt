package p156p5;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f52752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f52753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.Map f52754c = new java.util.HashMap();

    public a(java.lang.String str, java.util.Map map) {
        this.f52752a = str;
        this.f52753b = map;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002b A[EDGE_INSN: B:15:0x002b->B:4:0x002b BREAK  A[LOOP:0: B:6:0x0037->B:5:0x0036], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:5:0x0036 A[LOOP:0: B:6:0x0037->B:5:0x0036, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0040  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x005b -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private java.lang.String a(java.util.Map r7) throws java.io.UnsupportedEncodingException {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = ""
            java.lang.String r5 = "UTF-8"
            if (r3 == 0) goto L36
        L2b:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r5)
            goto L37
        L36:
            r1 = r4
        L37:
            r0.append(r1)
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r3 = "&"
            r0.append(r3)
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            if (r3 == 0) goto L36
            goto L2b
        L5e:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p156p5.a.a(java.util.Map):java.lang.String");
    }

    private java.lang.String b(java.lang.String str, java.util.Map map) throws java.io.UnsupportedEncodingException {
        java.lang.String strA = a(map);
        if (strA.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return str + "?" + strA;
        }
        if (!str.endsWith("&")) {
            strA = "&" + strA;
        }
        return str + strA;
    }

    private java.lang.String e(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[8192];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i6 = bufferedReader.read(cArr);
            if (i6 == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, i6);
        }
    }

    public p156p5.c c() throws java.lang.Throwable {
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        p116l5.f.d();
        java.io.InputStream inputStream = null;
        java.lang.String strE = null;
        inputStream = null;
        try {
            java.lang.String strB = b(this.f52752a, this.f52753b);
            p076h5.g.f().i("GET Request URL: " + strB);
            httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL(strB).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (java.util.Map.Entry entry : this.f52754c.entrySet()) {
                    httpsURLConnection.addRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                java.io.InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        strE = e(inputStream2);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new p156p5.c(responseCode, strE);
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public p156p5.a d(java.lang.String str, java.lang.String str2) {
        this.f52754c.put(str, str2);
        return this;
    }
}
