.class public abstract LN/H;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LN/F;Lw/i;)Lx7/l;
    .locals 1

    new-instance v0, LN/H$a;

    invoke-direct {v0, p0, p1}, LN/H$a;-><init>(LN/F;Lw/i;)V

    return-object v0
.end method

.method public static final b(Lz0/p;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static final c(Landroidx/compose/ui/d;LN/F;)Landroidx/compose/ui/d;
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lv/K;->d(IILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LN/H$b;

    invoke-direct {v0, p1}, LN/H$b;-><init>(LN/F;)V

    invoke-static {p0, v2, v0, v1, v2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/d;Lx7/l;Lx7/q;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method
