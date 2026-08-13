.class public abstract Lo0/d2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo0/c2;Lo0/c2;F)Lo0/c2;
    .locals 8

    new-instance v7, Lo0/c2;

    invoke-virtual {p0}, Lo0/c2;->c()J

    move-result-wide v0

    invoke-virtual {p1}, Lo0/c2;->c()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3, p2}, Lo0/A0;->i(JJF)J

    move-result-wide v1

    invoke-virtual {p0}, Lo0/c2;->d()J

    move-result-wide v3

    invoke-virtual {p1}, Lo0/c2;->d()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6, p2}, Ln0/h;->e(JJF)J

    move-result-wide v3

    invoke-virtual {p0}, Lo0/c2;->b()F

    move-result p0

    invoke-virtual {p1}, Lo0/c2;->b()F

    move-result p1

    invoke-static {p0, p1, p2}, La1/b;->b(FFF)F

    move-result v5

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lo0/c2;-><init>(JJFLy7/k;)V

    return-object v7
.end method
