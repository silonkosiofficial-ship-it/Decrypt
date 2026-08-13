.class public abstract LF0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF0/h;LV/w;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Cannot read CompositionLocal because the Modifier node is not currently attached."

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    invoke-virtual {p0}, LF0/J;->J()LV/z;

    move-result-object p0

    invoke-interface {p0, p1}, LV/z;->b(LV/w;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
