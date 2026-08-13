.class public abstract Lq2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lo2/n;Z[Ljava/lang/String;Lx7/l;)LZ8/f;
    .locals 2

    const-string v0, "db"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tableNames"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo2/n;->r()Landroidx/room/c;

    move-result-object v0

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {v0, p2, v1}, Landroidx/room/c;->g([Ljava/lang/String;Z)LZ8/f;

    move-result-object p2

    invoke-static {p2}, LZ8/h;->l(LZ8/f;)LZ8/f;

    move-result-object p2

    new-instance v0, Lq2/g$a;

    invoke-direct {v0, p2, p0, p1, p3}, Lq2/g$a;-><init>(LZ8/f;Lo2/n;ZLx7/l;)V

    return-object v0
.end method
