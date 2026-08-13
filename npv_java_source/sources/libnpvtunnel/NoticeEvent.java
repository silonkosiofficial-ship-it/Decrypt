package libnpvtunnel;

/* JADX INFO: loaded from: classes2.dex */
public final class NoticeEvent implements go.Seq.Proxy {
    private final int refnum;

    static {
        libnpvtunnel.Libnpvtunnel.touch();
    }

    public NoticeEvent() {
        int i__New = __New();
        this.refnum = i__New;
        go.Seq.trackGoRef(i__New, this);
    }

    NoticeEvent(int i6) {
        this.refnum = i6;
        go.Seq.trackGoRef(i6, this);
    }

    private static native int __New();

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof libnpvtunnel.NoticeEvent)) {
            return false;
        }
        libnpvtunnel.NoticeEvent noticeEvent = (libnpvtunnel.NoticeEvent) obj;
        java.lang.String type = getType();
        java.lang.String type2 = noticeEvent.getType();
        if (type == null) {
            if (type2 != null) {
                return false;
            }
        } else if (!type.equals(type2)) {
            return false;
        }
        java.lang.String timestamp = getTimestamp();
        java.lang.String timestamp2 = noticeEvent.getTimestamp();
        if (timestamp == null) {
            return timestamp2 == null;
        }
        return timestamp.equals(timestamp2);
    }

    public final native java.lang.String getTimestamp();

    public final native java.lang.String getType();

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{getType(), getTimestamp()});
    }

    @Override // go.Seq.GoObject
    public final int incRefnum() {
        go.Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setTimestamp(java.lang.String str);

    public final native void setType(java.lang.String str);

    public java.lang.String toString() {
        return "NoticeEvent{Type:" + getType() + ",Timestamp:" + getTimestamp() + ",}";
    }
}
