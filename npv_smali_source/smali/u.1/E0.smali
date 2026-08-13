.class public abstract synthetic Lu/E0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lu/F0;Lu/r;Lu/r;Lu/r;)J
    .locals 0

    invoke-interface {p0}, Lu/F0;->d()I

    move-result p1

    invoke-interface {p0}, Lu/F0;->f()I

    move-result p0

    add-int/2addr p1, p0

    int-to-long p0, p1

    const-wide/32 p2, 0xf4240

    mul-long/2addr p0, p2

    return-wide p0
.end method
