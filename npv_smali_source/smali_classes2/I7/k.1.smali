.class public final LI7/k;
.super LI7/n;
.source "SourceFile"

# interfaces
.implements LF7/c;
.implements LI7/l;
.implements LI7/C;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/k$a;,
        LI7/k$b;
    }
.end annotation


# instance fields
.field private final F:Ljava/lang/Class;

.field private final G:Li7/n;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "jClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LI7/n;-><init>()V

    iput-object p1, p0, LI7/k;->F:Ljava/lang/Class;

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance v0, LI7/k$d;

    invoke-direct {v0, p0}, LI7/k$d;-><init>(LI7/k;)V

    invoke-static {p1, v0}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LI7/k;->G:Li7/n;

    return-void
.end method

.method public static final synthetic D(LI7/k;Ln8/b;LT7/k;)LO7/e;
    .locals 0

    invoke-direct {p0, p1, p2}, LI7/k;->G(Ln8/b;LT7/k;)LO7/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(LI7/k;)Ln8/b;
    .locals 0

    invoke-direct {p0}, LI7/k;->H()Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method private final F(Ln8/b;LT7/k;)LO7/e;
    .locals 10

    new-instance v9, LR7/h;

    new-instance v1, LR7/m;

    invoke-virtual {p2}, LT7/k;->b()LO7/G;

    move-result-object v0

    invoke-virtual {p1}, Ln8/b;->h()Ln8/c;

    move-result-object v2

    const-string v3, "getPackageFqName(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0, v2}, LR7/m;-><init>(LO7/G;Ln8/c;)V

    invoke-virtual {p1}, Ln8/b;->j()Ln8/f;

    move-result-object v2

    sget-object v3, LO7/D;->D:LO7/D;

    sget-object v4, LO7/f;->D:LO7/f;

    invoke-virtual {p2}, LT7/k;->b()LO7/G;

    move-result-object p1

    invoke-interface {p1}, LO7/G;->t()LL7/g;

    move-result-object p1

    invoke-virtual {p1}, LL7/g;->h()LO7/e;

    move-result-object p1

    invoke-interface {p1}, LO7/e;->w()LF8/M;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/util/Collection;

    sget-object v6, LO7/a0;->a:LO7/a0;

    invoke-virtual {p2}, LT7/k;->a()LB8/k;

    move-result-object p1

    invoke-virtual {p1}, LB8/k;->u()LE8/n;

    move-result-object v8

    const/4 v7, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LR7/h;-><init>(LO7/m;Ln8/f;LO7/D;LO7/f;Ljava/util/Collection;LO7/a0;ZLE8/n;)V

    invoke-virtual {p2}, LT7/k;->a()LB8/k;

    move-result-object p1

    invoke-virtual {p1}, LB8/k;->u()LE8/n;

    move-result-object p1

    new-instance p2, LI7/k$c;

    invoke-direct {p2, v9, p1}, LI7/k$c;-><init>(LR7/h;LE8/n;)V

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {v9, p2, p1, v0}, LR7/h;->T0(Ly8/h;Ljava/util/Set;LO7/d;)V

    return-object v9
.end method

.method private final G(Ln8/b;LT7/k;)LO7/e;
    .locals 4

    .prologue
    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isSynthetic()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, LI7/k;->F(Ln8/b;LT7/k;)LO7/e;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, LT7/f;->c:LT7/f$a;

    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LT7/f$a;->a(Ljava/lang/Class;)LT7/f;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LT7/f;->b()Lh8/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lh8/a;->c()Lh8/a$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    const/4 v1, -0x1

    goto :goto_1

    :cond_2
    sget-object v1, LI7/k$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    :goto_1
    const/16 v2, 0x29

    const-string v3, " (kind = "

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :pswitch_1
    new-instance p1, LI7/D;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown class: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    invoke-direct {p0, p1, p2}, LI7/k;->F(Ln8/b;LT7/k;)LO7/e;

    move-result-object p1

    return-object p1

    :pswitch_3
    new-instance p1, LI7/D;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unresolved class: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method private final H()Ln8/b;
    .locals 2

    sget-object v0, LI7/I;->a:LI7/I;

    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LI7/I;->c(Ljava/lang/Class;)Ln8/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final I()Li7/n;
    .locals 1

    iget-object v0, p0, LI7/k;->G:Li7/n;

    return-object v0
.end method

.method public J()LO7/e;
    .locals 1

    iget-object v0, p0, LI7/k;->G:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/k$a;

    invoke-virtual {v0}, LI7/k$a;->k()LO7/e;

    move-result-object v0

    return-object v0
.end method

.method public final K()Ly8/h;
    .locals 1

    invoke-virtual {p0}, LI7/k;->J()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->w()LF8/M;

    move-result-object v0

    invoke-virtual {v0}, LF8/E;->u()Ly8/h;

    move-result-object v0

    return-object v0
.end method

.method public final L()Ly8/h;
    .locals 2

    invoke-virtual {p0}, LI7/k;->J()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->Y()Ly8/h;

    move-result-object v0

    const-string v1, "getStaticScope(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic a()LO7/h;
    .locals 1

    invoke-virtual {p0}, LI7/k;->J()LO7/e;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI7/k;->G:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/k$a;

    invoke-virtual {v0}, LI7/k$a;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LI7/k;->G:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/k$a;

    invoke-virtual {v0}, LI7/k$a;->o()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LU7/d;->c(Ljava/lang/Class;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {p1, v0}, Ly7/W;->m(Ljava/lang/Object;I)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LU7/d;->g(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public e()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LI7/k;->F:Ljava/lang/Class;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LI7/k;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lw7/a;->c(LF7/c;)Ljava/lang/Class;

    move-result-object v0

    check-cast p1, LF7/c;

    invoke-static {p1}, Lw7/a;->c(LF7/c;)Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LI7/k;->G:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/k$a;

    invoke-virtual {v0}, LI7/k$a;->p()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lw7/a;->c(LF7/c;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public q()Ljava/util/Collection;
    .locals 3

    .prologue
    invoke-virtual {p0}, LI7/k;->J()LO7/e;

    move-result-object v0

    invoke-interface {v0}, LO7/e;->j()LO7/f;

    move-result-object v1

    sget-object v2, LO7/f;->E:LO7/f;

    if-eq v1, v2, :cond_1

    invoke-interface {v0}, LO7/e;->j()LO7/f;

    move-result-object v1

    sget-object v2, LO7/f;->I:LO7/f;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LO7/e;->r()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getConstructors(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public r(Ln8/f;)Ljava/util/Collection;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LI7/k;->K()Ly8/h;

    move-result-object v0

    sget-object v1, LW7/d;->J:LW7/d;

    invoke-interface {v0, p1, v1}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0}, LI7/k;->L()Ly8/h;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public t(I)LO7/U;
    .locals 9

    .prologue
    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "DefaultImpls"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lw7/a;->e(Ljava/lang/Class;)LF7/c;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LI7/k;

    invoke-virtual {v0, p1}, LI7/k;->t(I)LO7/U;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, LI7/k;->J()LO7/e;

    move-result-object v0

    instance-of v1, v0, LD8/d;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, LD8/d;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, LD8/d;->j1()Li8/c;

    move-result-object v1

    sget-object v3, Ll8/a;->j:Lp8/i$f;

    const-string v4, "classLocalVariable"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3, p1}, Lk8/e;->b(Lp8/i$d;Lp8/i$f;I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Li8/n;

    if-eqz v4, :cond_2

    invoke-virtual {p0}, LI7/k;->e()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0}, LD8/d;->i1()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->g()Lk8/c;

    move-result-object v5

    invoke-virtual {v0}, LD8/d;->i1()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->j()Lk8/g;

    move-result-object v6

    invoke-virtual {v0}, LD8/d;->l1()Lk8/a;

    move-result-object v7

    sget-object v8, LI7/k$e;->L:LI7/k$e;

    invoke-static/range {v3 .. v8}, LI7/M;->h(Ljava/lang/Class;Lp8/p;Lk8/c;Lk8/g;Lk8/a;Lx7/p;)LO7/a;

    move-result-object p1

    move-object v2, p1

    check-cast v2, LO7/U;

    :cond_2
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LI7/k;->H()Ln8/b;

    move-result-object v1

    invoke-virtual {v1}, Ln8/b;->h()Ln8/c;

    move-result-object v2

    const-string v3, "getPackageFqName(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ln8/c;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1}, Ln8/b;->i()Ln8/c;

    move-result-object v1

    invoke-virtual {v1}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v3

    const-string v1, "asString(...)"

    invoke-static {v3, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/16 v4, 0x2e

    const/16 v5, 0x24

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LS8/r;->Q(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w(Ln8/f;)Ljava/util/Collection;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LI7/k;->K()Ly8/h;

    move-result-object v0

    sget-object v1, LW7/d;->J:LW7/d;

    invoke-interface {v0, p1, v1}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0}, LI7/k;->L()Ly8/h;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method
