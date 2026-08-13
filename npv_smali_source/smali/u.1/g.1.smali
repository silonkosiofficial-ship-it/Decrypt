.class public abstract Lu/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lu/r0;
    .locals 7

    new-instance v6, Lu/r0;

    invoke-interface {p1}, Lu/x0;->a()Lx7/l;

    move-result-object v0

    invoke-interface {v0, p4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    move-object v5, p4

    check-cast v5, Lu/r;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V

    return-object v6
.end method

.method public static final b(Lu/e;)J
    .locals 4

    invoke-interface {p0}, Lu/e;->b()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    return-wide v0
.end method
