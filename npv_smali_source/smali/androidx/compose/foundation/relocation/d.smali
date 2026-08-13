.class abstract synthetic Landroidx/compose/foundation/relocation/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LD0/t;LD0/t;Ln0/i;)Ln0/i;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/relocation/d;->c(LD0/t;LD0/t;Ln0/i;)Ln0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LF0/j;)LE/a;
    .locals 1

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Landroidx/compose/foundation/relocation/f;->S:Landroidx/compose/foundation/relocation/f$a;

    invoke-static {p0, v0}, LF0/F0;->a(LF0/j;Ljava/lang/Object;)LF0/E0;

    move-result-object v0

    check-cast v0, LE/a;

    if-nez v0, :cond_1

    invoke-static {p0}, LE/d;->b(LF0/j;)LE/a;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private static final c(LD0/t;LD0/t;Ln0/i;)Ln0/i;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, LD0/t;->N(LD0/t;Z)Ln0/i;

    move-result-object p0

    invoke-virtual {p0}, Ln0/i;->m()J

    move-result-wide p0

    invoke-virtual {p2, p0, p1}, Ln0/i;->t(J)Ln0/i;

    move-result-object p0

    return-object p0
.end method
