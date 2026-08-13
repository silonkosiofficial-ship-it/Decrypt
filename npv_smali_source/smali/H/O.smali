.class public abstract LH/O;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;Lz/l;ZLx7/l;)Landroidx/compose/ui/d;
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    new-instance p2, LH/O$a;

    invoke-direct {p2, p3, p1}, LH/O$a;-><init>(Lx7/l;Lz/l;)V

    const/4 p1, 0x1

    const/4 p3, 0x0

    invoke-static {p0, p3, p2, p1, p3}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/d;Lx7/l;Lx7/q;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object p0

    :cond_0
    return-object p0
.end method
