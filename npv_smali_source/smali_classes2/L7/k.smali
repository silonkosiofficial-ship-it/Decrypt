.class public abstract LL7/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LR7/y;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v8, LR7/y;

    new-instance v1, LR7/m;

    sget-object v0, LH8/k;->a:LH8/k;

    invoke-virtual {v0}, LH8/k;->i()LO7/G;

    move-result-object v0

    sget-object v2, LL7/j;->q:Ln8/c;

    invoke-direct {v1, v0, v2}, LR7/m;-><init>(LO7/G;Ln8/c;)V

    sget-object v2, LO7/f;->E:LO7/f;

    sget-object v0, LL7/j;->t:Ln8/c;

    invoke-virtual {v0}, Ln8/c;->g()Ln8/f;

    move-result-object v5

    sget-object v6, LO7/a0;->a:LO7/a0;

    sget-object v9, LE8/f;->e:LE8/n;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v8

    move-object v7, v9

    invoke-direct/range {v0 .. v7}, LR7/y;-><init>(LO7/m;LO7/f;ZZLn8/f;LO7/a0;LE8/n;)V

    sget-object v0, LO7/D;->G:LO7/D;

    invoke-virtual {v8, v0}, LR7/y;->V0(LO7/D;)V

    sget-object v0, LO7/t;->e:LO7/u;

    invoke-virtual {v8, v0}, LR7/y;->X0(LO7/u;)V

    sget-object v0, LP7/g;->d:LP7/g$a;

    invoke-virtual {v0}, LP7/g$a;->b()LP7/g;

    move-result-object v1

    sget-object v3, LF8/u0;->H:LF8/u0;

    const-string v0, "T"

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, v8

    move-object v6, v9

    invoke-static/range {v0 .. v6}, LR7/K;->a1(LO7/m;LP7/g;ZLF8/u0;Ln8/f;ILE8/n;)LO7/f0;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v8, v0}, LR7/y;->W0(Ljava/util/List;)V

    invoke-virtual {v8}, LR7/y;->T0()V

    sput-object v8, LL7/k;->a:LR7/y;

    return-void
.end method

.method public static final a(LF8/E;)LF8/M;
    .locals 13

    .prologue
    const-string v0, "suspendFunType"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->r(LF8/E;)Z

    invoke-static {p0}, LK8/a;->i(LF8/E;)LL7/g;

    move-result-object v1

    invoke-virtual {p0}, LF8/E;->k()LP7/g;

    move-result-object v2

    invoke-static {p0}, LL7/f;->k(LF8/E;)LF8/E;

    move-result-object v3

    invoke-static {p0}, LL7/f;->e(LF8/E;)Ljava/util/List;

    move-result-object v4

    invoke-static {p0}, LL7/f;->m(LF8/E;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LF8/i0;

    invoke-interface {v6}, LF8/i0;->getType()LF8/E;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v0}, LF8/a0$a;->i()LF8/a0;

    move-result-object v6

    sget-object v0, LL7/k;->a:LR7/y;

    invoke-virtual {v0}, LR7/y;->p()LF8/e0;

    move-result-object v7

    const-string v0, "getTypeConstructor(...)"

    invoke-static {v7, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LL7/f;->l(LF8/E;)LF8/E;

    move-result-object v0

    invoke-static {v0}, LK8/a;->a(LF8/E;)LF8/i0;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v11, 0x10

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object v0

    invoke-static {v5, v0}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {p0}, LK8/a;->i(LF8/E;)LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->I()LF8/M;

    move-result-object v7

    const-string v0, "getNullableAnyType(...)"

    invoke-static {v7, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x80

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v10}, LL7/f;->c(LL7/g;LP7/g;LF8/E;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;ZILjava/lang/Object;)LF8/M;

    move-result-object v0

    invoke-virtual {p0}, LF8/E;->X0()Z

    move-result p0

    invoke-virtual {v0, p0}, LF8/M;->d1(Z)LF8/M;

    move-result-object p0

    return-object p0
.end method
