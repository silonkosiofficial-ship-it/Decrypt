.class public final Lc8/f;
.super LF8/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc8/f$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LF8/v;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LO7/f0;LF8/w;LF8/h0;LF8/E;)LF8/i0;
    .locals 2

    .prologue
    const-string v0, "parameter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAttr"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameterUpperBoundEraser"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "erasedUpperBound"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lc8/a;

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, LF8/v;->a(LO7/f0;LF8/w;LF8/h0;LF8/E;)LF8/i0;

    move-result-object p1

    return-object p1

    :cond_0
    check-cast p2, Lc8/a;

    invoke-virtual {p2}, Lc8/a;->i()Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    sget-object p3, Lc8/c;->C:Lc8/c;

    invoke-virtual {p2, p3}, Lc8/a;->l(Lc8/c;)Lc8/a;

    move-result-object p2

    :goto_0
    invoke-virtual {p2}, Lc8/a;->g()Lc8/c;

    move-result-object p3

    sget-object v0, Lc8/f$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_6

    const/4 v1, 0x2

    if-eq p3, v1, :cond_3

    const/4 v1, 0x3

    if-ne p3, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_3
    :goto_1
    invoke-interface {p1}, LO7/f0;->s()LF8/u0;

    move-result-object p3

    invoke-virtual {p3}, LF8/u0;->g()Z

    move-result p3

    if-nez p3, :cond_4

    new-instance p2, LF8/k0;

    sget-object p3, LF8/u0;->G:LF8/u0;

    invoke-static {p1}, Lv8/c;->j(LO7/m;)LL7/g;

    move-result-object p1

    invoke-virtual {p1}, LL7/g;->H()LF8/M;

    move-result-object p1

    invoke-direct {p2, p3, p1}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p4}, LF8/E;->W0()LF8/e0;

    move-result-object p3

    invoke-interface {p3}, LF8/e0;->x()Ljava/util/List;

    move-result-object p3

    const-string v1, "getParameters(...)"

    invoke-static {p3, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    xor-int/2addr p3, v0

    if-eqz p3, :cond_5

    new-instance p2, LF8/k0;

    sget-object p1, LF8/u0;->I:LF8/u0;

    invoke-direct {p2, p1, p4}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    goto :goto_2

    :cond_5
    invoke-static {p1, p2}, LF8/q0;->t(LO7/f0;LF8/w;)LF8/i0;

    move-result-object p2

    :goto_2
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    new-instance p2, LF8/k0;

    sget-object p1, LF8/u0;->G:LF8/u0;

    invoke-direct {p2, p1, p4}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    :goto_3
    return-object p2
.end method
