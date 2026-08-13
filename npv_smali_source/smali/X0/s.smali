.class public abstract LX0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LX0/r;LX0/r;F)LX0/r;
    .locals 7

    new-instance v6, LX0/r;

    invoke-virtual {p0}, LX0/r;->b()J

    move-result-wide v0

    invoke-virtual {p1}, LX0/r;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3, p2}, LM0/D;->f(JJF)J

    move-result-wide v1

    invoke-virtual {p0}, LX0/r;->c()J

    move-result-wide v3

    invoke-virtual {p1}, LX0/r;->c()J

    move-result-wide p0

    invoke-static {v3, v4, p0, p1, p2}, LM0/D;->f(JJF)J

    move-result-wide v3

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LX0/r;-><init>(JJLy7/k;)V

    return-object v6
.end method
