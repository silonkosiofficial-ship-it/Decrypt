.class public abstract synthetic Ly2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ly2/e;I)Z
    .locals 2

    .prologue
    invoke-interface {p0, p1}, Ly2/e;->getLong(I)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static b(Ly2/e;I)I
    .locals 0

    invoke-interface {p0, p1}, Ly2/e;->getLong(I)J

    move-result-wide p0

    long-to-int p0, p0

    return p0
.end method
