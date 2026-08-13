.class public abstract LX0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LX0/p;LX0/p;F)LX0/p;
    .locals 3

    new-instance v0, LX0/p;

    invoke-virtual {p0}, LX0/p;->b()F

    move-result v1

    invoke-virtual {p1}, LX0/p;->b()F

    move-result v2

    invoke-static {v1, v2, p2}, La1/b;->b(FFF)F

    move-result v1

    invoke-virtual {p0}, LX0/p;->c()F

    move-result p0

    invoke-virtual {p1}, LX0/p;->c()F

    move-result p1

    invoke-static {p0, p1, p2}, La1/b;->b(FFF)F

    move-result p0

    invoke-direct {v0, v1, p0}, LX0/p;-><init>(FF)V

    return-object v0
.end method
