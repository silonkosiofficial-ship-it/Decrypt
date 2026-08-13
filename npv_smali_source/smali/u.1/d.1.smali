.class public abstract synthetic Lu/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lu/e;J)Z
    .locals 2

    .prologue
    invoke-interface {p0}, Lu/e;->b()J

    move-result-wide v0

    cmp-long p0, p1, v0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
