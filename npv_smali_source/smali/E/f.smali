.class abstract synthetic LE/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LF0/j;Ln0/i;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_0
    invoke-static {p0}, LF0/k;->k(LF0/j;)LD0/t;

    move-result-object v0

    invoke-static {p0}, Landroidx/compose/foundation/relocation/b;->c(LF0/j;)LE/a;

    move-result-object p0

    if-nez p0, :cond_1

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0

    :cond_1
    new-instance v1, LE/f$a;

    invoke-direct {v1, p1, v0}, LE/f$a;-><init>(Ln0/i;LD0/t;)V

    invoke-interface {p0, v0, v1, p2}, LE/a;->j1(LD0/t;Lx7/a;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static synthetic b(LF0/j;Ln0/i;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LE/e;->a(LF0/j;Ln0/i;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
