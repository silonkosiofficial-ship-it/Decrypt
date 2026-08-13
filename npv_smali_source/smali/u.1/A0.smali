.class public abstract synthetic Lu/A0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lu/B0;Lu/r;Lu/r;Lu/r;)Lu/r;
    .locals 6

    invoke-interface {p0, p1, p2, p3}, Lu/B0;->e(Lu/r;Lu/r;Lu/r;)J

    move-result-wide v1

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-interface/range {v0 .. v5}, Lu/B0;->b(JLu/r;Lu/r;Lu/r;)Lu/r;

    move-result-object p0

    return-object p0
.end method
