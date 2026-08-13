.class public abstract synthetic Lh0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 1

    .prologue
    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/ui/a;

    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/a;-><init>(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
