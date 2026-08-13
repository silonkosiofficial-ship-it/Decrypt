.class public final Lc8/g;
.super LF8/l0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc8/g$a;
    }
.end annotation


# static fields
.field public static final e:Lc8/g$a;

.field private static final f:Lc8/a;

.field private static final g:Lc8/a;


# instance fields
.field private final c:Lc8/f;

.field private final d:LF8/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lc8/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc8/g$a;-><init>(Ly7/k;)V

    sput-object v0, Lc8/g;->e:Lc8/g$a;

    sget-object v0, LF8/p0;->D:LF8/p0;

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v7}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v1

    sget-object v2, Lc8/c;->E:Lc8/c;

    invoke-virtual {v1, v2}, Lc8/a;->l(Lc8/c;)Lc8/a;

    move-result-object v1

    sput-object v1, Lc8/g;->f:Lc8/a;

    move-object v2, v0

    invoke-static/range {v2 .. v7}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v0

    sget-object v1, Lc8/c;->D:Lc8/c;

    invoke-virtual {v0, v1}, Lc8/a;->l(Lc8/c;)Lc8/a;

    move-result-object v0

    sput-object v0, Lc8/g;->g:Lc8/a;

    return-void
.end method

.method public constructor <init>(LF8/h0;)V
    .locals 3

    .prologue
    invoke-direct {p0}, LF8/l0;-><init>()V

    new-instance v0, Lc8/f;

    invoke-direct {v0}, Lc8/f;-><init>()V

    iput-object v0, p0, Lc8/g;->c:Lc8/f;

    if-nez p1, :cond_0

    new-instance p1, LF8/h0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, LF8/h0;-><init>(LF8/v;LF8/g0;ILy7/k;)V

    :cond_0
    iput-object p1, p0, Lc8/g;->d:LF8/h0;

    return-void
.end method

.method public synthetic constructor <init>(LF8/h0;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lc8/g;-><init>(LF8/h0;)V

    return-void
.end method

.method public static final synthetic i(Lc8/g;LF8/M;LO7/e;Lc8/a;)Li7/u;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lc8/g;->j(LF8/M;LO7/e;Lc8/a;)Li7/u;

    move-result-object p0

    return-object p0
.end method

.method private final j(LF8/M;LO7/e;Lc8/a;)Li7/u;
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v10, p3

    invoke-virtual/range {p1 .. p1}, LF8/E;->W0()LF8/e0;

    move-result-object v3

    invoke-interface {v3}, LF8/e0;->x()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    :goto_0
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    invoke-static {v1, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-static/range {p1 .. p1}, LL7/g;->c0(LF8/E;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual/range {p1 .. p1}, LF8/E;->U0()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/i0;

    new-instance v3, LF8/k0;

    invoke-interface {v2}, LF8/i0;->a()LF8/u0;

    move-result-object v4

    invoke-interface {v2}, LF8/i0;->getType()LF8/E;

    move-result-object v2

    const-string v5, "getType(...)"

    invoke-static {v2, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v2, v10}, Lc8/g;->k(LF8/E;Lc8/a;)LF8/E;

    move-result-object v2

    invoke-direct {v3, v4, v2}, LF8/k0;-><init>(LF8/u0;LF8/E;)V

    invoke-static {v3}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LF8/E;->V0()LF8/a0;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LF8/E;->W0()LF8/e0;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LF8/E;->X0()Z

    move-result v8

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, LF8/F;->l(LF8/a0;LF8/e0;Ljava/util/List;ZLG8/g;ILjava/lang/Object;)LF8/M;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static/range {p1 .. p1}, LF8/G;->a(LF8/E;)Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v2, LH8/j;->m0:LH8/j;

    invoke-virtual/range {p1 .. p1}, LF8/E;->W0()LF8/e0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-interface {v2, v0}, LO7/e;->f0(LF8/l0;)Ly8/h;

    move-result-object v11

    const-string v3, "getMemberScope(...)"

    invoke-static {v11, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LF8/E;->V0()LF8/a0;

    move-result-object v12

    invoke-interface/range {p2 .. p2}, LO7/h;->p()LF8/e0;

    move-result-object v13

    const-string v3, "getTypeConstructor(...)"

    invoke-static {v13, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p2 .. p2}, LO7/h;->p()LF8/e0;

    move-result-object v3

    invoke-interface {v3}, LF8/e0;->x()Ljava/util/List;

    move-result-object v3

    const-string v4, "getParameters(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LO7/f0;

    iget-object v3, v0, Lc8/g;->c:Lc8/f;

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v6, v0, Lc8/g;->d:LF8/h0;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v5, p3

    invoke-static/range {v3 .. v9}, LF8/v;->b(LF8/v;LO7/f0;LF8/w;LF8/h0;LF8/E;ILjava/lang/Object;)LF8/i0;

    move-result-object v3

    invoke-interface {v14, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual/range {p1 .. p1}, LF8/E;->X0()Z

    move-result v5

    new-instance v7, Lc8/g$b;

    invoke-direct {v7, v2, v0, v1, v10}, Lc8/g$b;-><init>(LO7/e;Lc8/g;LF8/M;Lc8/a;)V

    move-object v2, v12

    move-object v3, v13

    move-object v4, v14

    move-object v6, v11

    invoke-static/range {v2 .. v7}, LF8/F;->n(LF8/a0;LF8/e0;Ljava/util/List;ZLy8/h;Lx7/l;)LF8/M;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto/16 :goto_1
.end method

.method private final k(LF8/E;Lc8/a;)LF8/E;
    .locals 3

    .prologue
    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->w()LO7/h;

    move-result-object v0

    instance-of v1, v0, LO7/f0;

    if-eqz v1, :cond_0

    iget-object p1, p0, Lc8/g;->d:LF8/h0;

    check-cast v0, LO7/f0;

    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Lc8/a;->j(Z)Lc8/a;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LF8/h0;->c(LO7/f0;LF8/w;)LF8/E;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lc8/g;->k(LF8/E;Lc8/a;)LF8/E;

    move-result-object p1

    goto :goto_1

    :cond_0
    instance-of p2, v0, LO7/e;

    if-eqz p2, :cond_4

    invoke-static {p1}, LF8/B;->d(LF8/E;)LF8/M;

    move-result-object p2

    invoke-virtual {p2}, LF8/E;->W0()LF8/e0;

    move-result-object p2

    invoke-interface {p2}, LF8/e0;->w()LO7/h;

    move-result-object p2

    instance-of v1, p2, LO7/e;

    if-eqz v1, :cond_3

    invoke-static {p1}, LF8/B;->c(LF8/E;)LF8/M;

    move-result-object v1

    check-cast v0, LO7/e;

    sget-object v2, Lc8/g;->f:Lc8/a;

    invoke-direct {p0, v1, v0, v2}, Lc8/g;->j(LF8/M;LO7/e;Lc8/a;)Li7/u;

    move-result-object v0

    invoke-virtual {v0}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/M;

    invoke-virtual {v0}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {p1}, LF8/B;->d(LF8/E;)LF8/M;

    move-result-object p1

    check-cast p2, LO7/e;

    sget-object v2, Lc8/g;->g:Lc8/a;

    invoke-direct {p0, p1, p2, v2}, Lc8/g;->j(LF8/M;LO7/e;Lc8/a;)Li7/u;

    move-result-object p1

    invoke-virtual {p1}, Li7/u;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LF8/M;

    invoke-virtual {p1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v1, p2}, LF8/F;->d(LF8/M;LF8/M;)LF8/t0;

    move-result-object p1

    goto :goto_1

    :cond_2
    :goto_0
    new-instance p1, Lc8/h;

    invoke-direct {p1, v1, p2}, Lc8/h;-><init>(LF8/M;LF8/M;)V

    :goto_1
    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "For some reason declaration for upper bound is not a class but \""

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "\" while for lower it\'s \""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x22

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected declaration kind: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic l(Lc8/g;LF8/E;Lc8/a;ILjava/lang/Object;)LF8/E;
    .locals 9

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lc8/a;

    sget-object v1, LF8/p0;->D:LF8/p0;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lc8/a;-><init>(LF8/p0;Lc8/c;ZZLjava/util/Set;LF8/M;ILy7/k;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lc8/g;->k(LF8/E;Lc8/a;)LF8/E;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic e(LF8/E;)LF8/i0;
    .locals 0

    invoke-virtual {p0, p1}, Lc8/g;->m(LF8/E;)LF8/k0;

    move-result-object p1

    return-object p1
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m(LF8/E;)LF8/k0;
    .locals 3

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LF8/k0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p1, v1, v2, v1}, Lc8/g;->l(Lc8/g;LF8/E;Lc8/a;ILjava/lang/Object;)LF8/E;

    move-result-object p1

    invoke-direct {v0, p1}, LF8/k0;-><init>(LF8/E;)V

    return-object v0
.end method
