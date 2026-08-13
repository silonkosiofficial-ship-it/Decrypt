.class public abstract Lg8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB8/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/b$a;,
        Lg8/b$b;,
        Lg8/b$c;,
        Lg8/b$d;
    }
.end annotation


# static fields
.field public static final b:Lg8/b$b;


# instance fields
.field private final a:Lg8/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg8/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg8/b$b;-><init>(Ly7/k;)V

    sput-object v0, Lg8/b;->b:Lg8/b$b;

    return-void
.end method

.method public constructor <init>(Lg8/r;)V
    .locals 1

    const-string v0, "kotlinClassFinder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/b;->a:Lg8/r;

    return-void
.end method

.method private final A(LB8/A$a;)Lg8/t;
    .locals 2

    .prologue
    invoke-virtual {p1}, LB8/A;->c()LO7/a0;

    move-result-object p1

    instance-of v0, p1, Lg8/v;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lg8/v;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lg8/v;->d()Lg8/t;

    move-result-object v1

    :cond_1
    return-object v1
.end method

.method private final l(LB8/A;Lp8/p;)I
    .locals 3

    .prologue
    instance-of v0, p2, Li8/i;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    check-cast p2, Li8/i;

    invoke-static {p2}, Lk8/f;->g(Li8/i;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_0
    move v1, v2

    goto :goto_1

    :cond_0
    instance-of v0, p2, Li8/n;

    if-eqz v0, :cond_1

    check-cast p2, Li8/n;

    invoke-static {p2}, Lk8/f;->h(Li8/n;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_1
    instance-of v0, p2, Li8/d;

    if-eqz v0, :cond_4

    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class"

    invoke-static {p1, p2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LB8/A$a;

    invoke-virtual {p1}, LB8/A$a;->g()Li8/c$c;

    move-result-object p2

    sget-object v0, Li8/c$c;->F:Li8/c$c;

    if-ne p2, v0, :cond_2

    const/4 v1, 0x2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, LB8/A$a;->i()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    return v1

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final m(LB8/A;Lg8/w;ZZLjava/lang/Boolean;Z)Ljava/util/List;
    .locals 8

    .prologue
    sget-object v0, Lg8/b;->b:Lg8/b$b;

    iget-object v6, p0, Lg8/b;->a:Lg8/r;

    invoke-virtual {p0}, Lg8/b;->t()Lm8/e;

    move-result-object v7

    move-object v1, p1

    move v2, p3

    move v3, p4

    move-object v4, p5

    move v5, p6

    invoke-virtual/range {v0 .. v7}, Lg8/b$b;->a(LB8/A;ZZLjava/lang/Boolean;ZLg8/r;Lm8/e;)Lg8/t;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Lg8/b;->o(LB8/A;Lg8/t;)Lg8/t;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lg8/b;->p(Lg8/t;)Lg8/b$a;

    move-result-object p1

    invoke-virtual {p1}, Lg8/b$a;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-nez p1, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method static synthetic n(Lg8/b;LB8/A;Lg8/w;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;
    .locals 9

    .prologue
    if-nez p8, :cond_4

    and-int/lit8 v0, p7, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, p3

    :goto_0
    and-int/lit8 v0, p7, 0x8

    if-eqz v0, :cond_1

    move v6, v1

    goto :goto_1

    :cond_1
    move v6, p4

    :goto_1
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object v7, v0

    goto :goto_2

    :cond_2
    move-object v7, p5

    :goto_2
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_3

    move v8, v1

    goto :goto_3

    :cond_3
    move v8, p6

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v8}, Lg8/b;->m(LB8/A;Lg8/w;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic s(Lg8/b;Lp8/p;Lk8/c;Lk8/g;LB8/b;ZILjava/lang/Object;)Lg8/w;
    .locals 6

    .prologue
    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lg8/b;->r(Lp8/p;Lk8/c;Lk8/g;LB8/b;Z)Lg8/w;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getCallableSignature"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final z(LB8/A;Li8/n;Lg8/b$c;)Ljava/util/List;
    .locals 18

    .prologue
    move-object/from16 v0, p3

    sget-object v1, Lk8/b;->B:Lk8/b$b;

    invoke-virtual/range {p2 .. p2}, Li8/n;->a0()I

    move-result v2

    invoke-virtual {v1, v2}, Lk8/b$b;->f(I)Ljava/lang/Boolean;

    move-result-object v8

    const-string v1, "get(...)"

    invoke-static {v8, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    invoke-static/range {p2 .. p2}, Lm8/i;->f(Li8/n;)Z

    move-result v9

    sget-object v1, Lg8/b$c;->C:Lg8/b$c;

    invoke-virtual/range {p1 .. p1}, LB8/A;->b()Lk8/c;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, LB8/A;->d()Lk8/g;

    move-result-object v12

    if-ne v0, v1, :cond_1

    const/16 v16, 0x28

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v10 .. v17}, Lg8/c;->b(Li8/n;Lk8/c;Lk8/g;ZZZILjava/lang/Object;)Lg8/w;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-static/range {v3 .. v11}, Lg8/b;->n(Lg8/b;LB8/A;Lg8/w;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    const/16 v16, 0x30

    const/16 v17, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v10 .. v17}, Lg8/c;->b(Li8/n;Lk8/c;Lk8/g;ZZZILjava/lang/Object;)Lg8/w;

    move-result-object v5

    if-nez v5, :cond_2

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {v5}, Lg8/w;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, "$delegate"

    const/4 v6, 0x0

    invoke-static {v1, v4, v6, v2, v3}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    sget-object v2, Lg8/b$c;->E:Lg8/b$c;

    if-ne v0, v2, :cond_3

    const/4 v6, 0x1

    :cond_3
    if-eq v1, v6, :cond_4

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_4
    const/4 v7, 0x1

    const/4 v6, 0x1

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct/range {v3 .. v9}, Lg8/b;->m(LB8/A;Lg8/w;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Li8/s;Lk8/c;)Ljava/util/List;
    .locals 2

    .prologue
    const-string v0, "proto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ll8/a;->h:Lp8/i$f;

    invoke-virtual {p1, v0}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "getExtension(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, p2}, Lg8/b;->x(Li8/b;Lk8/c;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public b(LB8/A;Lp8/p;LB8/b;ILi8/u;)Ljava/util/List;
    .locals 9

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callableProto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v3

    invoke-virtual {p1}, LB8/A;->d()Lk8/g;

    move-result-object v4

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v5, p3

    invoke-static/range {v1 .. v8}, Lg8/b;->s(Lg8/b;Lp8/p;Lk8/c;Lk8/g;LB8/b;ZILjava/lang/Object;)Lg8/w;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-direct {p0, p1, p2}, Lg8/b;->l(LB8/A;Lp8/p;)I

    move-result p2

    add-int/2addr p4, p2

    sget-object p2, Lg8/w;->b:Lg8/w$a;

    invoke-virtual {p2, p3, p4}, Lg8/w$a;->e(Lg8/w;I)Lg8/w;

    move-result-object v2

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v8}, Lg8/b;->n(Lg8/b;LB8/A;Lg8/w;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public c(LB8/A;Li8/g;)Ljava/util/List;
    .locals 11

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/w;->b:Lg8/w$a;

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v1

    invoke-virtual {p2}, Li8/g;->F()I

    move-result p2

    invoke-interface {v1, p2}, Lk8/c;->getString(I)Ljava/lang/String;

    move-result-object p2

    move-object v1, p1

    check-cast v1, LB8/A$a;

    invoke-virtual {v1}, LB8/A$a;->e()Ln8/b;

    move-result-object v1

    invoke-virtual {v1}, Ln8/b;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "asString(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lm8/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Lg8/w$a;->a(Ljava/lang/String;Ljava/lang/String;)Lg8/w;

    move-result-object v4

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    invoke-static/range {v2 .. v10}, Lg8/b;->n(Lg8/b;LB8/A;Lg8/w;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d(LB8/A;Li8/n;)Ljava/util/List;
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/b$c;->D:Lg8/b$c;

    invoke-direct {p0, p1, p2, v0}, Lg8/b;->z(LB8/A;Li8/n;Lg8/b$c;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public f(LB8/A;Li8/n;)Ljava/util/List;
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg8/b$c;->E:Lg8/b$c;

    invoke-direct {p0, p1, p2, v0}, Lg8/b;->z(LB8/A;Li8/n;Lg8/b$c;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public g(Li8/q;Lk8/c;)Ljava/util/List;
    .locals 2

    .prologue
    const-string v0, "proto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ll8/a;->f:Lp8/i$f;

    invoke-virtual {p1, v0}, Lp8/i$d;->u(Lp8/i$f;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "getExtension(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/b;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, p2}, Lg8/b;->x(Li8/b;Lk8/c;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public h(LB8/A$a;)Ljava/util/List;
    .locals 3

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg8/b;->A(LB8/A$a;)Lg8/t;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Lg8/b$e;

    invoke-direct {v1, p0, p1}, Lg8/b$e;-><init>(Lg8/b;Ljava/util/ArrayList;)V

    invoke-virtual {p0, v0}, Lg8/b;->q(Lg8/t;)[B

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lg8/t;->d(Lg8/t$c;[B)V

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Class for loading annotations is not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LB8/A$a;->a()Ln8/c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i(LB8/A;Lp8/p;LB8/b;)Ljava/util/List;
    .locals 10

    .prologue
    const-string v2, "container"

    invoke-static {p1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "proto"

    invoke-static {p2, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "kind"

    invoke-static {p3, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, LB8/b;->D:LB8/b;

    if-ne p3, v2, :cond_0

    move-object v0, p2

    check-cast v0, Li8/n;

    sget-object v2, Lg8/b$c;->C:Lg8/b$c;

    invoke-direct {p0, p1, v0, v2}, Lg8/b;->z(LB8/A;Li8/n;Lg8/b$c;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v4

    invoke-virtual {p1}, LB8/A;->d()Lk8/g;

    move-result-object v5

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p2

    move-object v6, p3

    invoke-static/range {v2 .. v9}, Lg8/b;->s(Lg8/b;Lp8/p;Lk8/c;Lk8/g;LB8/b;ZILjava/lang/Object;)Lg8/w;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_1
    const/16 v7, 0x3c

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v8}, Lg8/b;->n(Lg8/b;LB8/A;Lg8/w;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public j(LB8/A;Lp8/p;LB8/b;)Ljava/util/List;
    .locals 10

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LB8/A;->b()Lk8/c;

    move-result-object v3

    invoke-virtual {p1}, LB8/A;->d()Lk8/g;

    move-result-object v4

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v5, p3

    invoke-static/range {v1 .. v8}, Lg8/b;->s(Lg8/b;Lp8/p;Lk8/c;Lk8/g;LB8/b;ZILjava/lang/Object;)Lg8/w;

    move-result-object p2

    if-eqz p2, :cond_0

    sget-object p3, Lg8/w;->b:Lg8/w$a;

    const/4 v0, 0x0

    invoke-virtual {p3, p2, v0}, Lg8/w$a;->e(Lg8/w;I)Lg8/w;

    move-result-object v3

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v9}, Lg8/b;->n(Lg8/b;LB8/A;Lg8/w;ZZLjava/lang/Boolean;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected final o(LB8/A;Lg8/t;)Lg8/t;
    .locals 1

    .prologue
    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_1

    instance-of p2, p1, LB8/A$a;

    if-eqz p2, :cond_0

    check-cast p1, LB8/A$a;

    invoke-direct {p0, p1}, Lg8/b;->A(LB8/A$a;)Lg8/t;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :cond_1
    :goto_0
    return-object p2
.end method

.method protected abstract p(Lg8/t;)Lg8/b$a;
.end method

.method protected q(Lg8/t;)[B
    .locals 1

    const-string v0, "kotlinClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected final r(Lp8/p;Lk8/c;Lk8/g;LB8/b;Z)Lg8/w;
    .locals 8

    .prologue
    const-string v0, "proto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li8/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object p4, Lg8/w;->b:Lg8/w$a;

    sget-object p5, Lm8/i;->a:Lm8/i;

    check-cast p1, Li8/d;

    invoke-virtual {p5, p1, p2, p3}, Lm8/i;->b(Li8/d;Lk8/c;Lk8/g;)Lm8/d$b;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p4, p1}, Lg8/w$a;->b(Lm8/d;)Lg8/w;

    move-result-object v1

    goto/16 :goto_1

    :cond_1
    instance-of v0, p1, Li8/i;

    if-eqz v0, :cond_2

    sget-object p4, Lg8/w;->b:Lg8/w$a;

    sget-object p5, Lm8/i;->a:Lm8/i;

    check-cast p1, Li8/i;

    invoke-virtual {p5, p1, p2, p3}, Lm8/i;->e(Li8/i;Lk8/c;Lk8/g;)Lm8/d$b;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v1

    :cond_2
    instance-of v0, p1, Li8/n;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Lp8/i$d;

    sget-object v2, Ll8/a;->d:Lp8/i$f;

    const-string v3, "propertySignature"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Lk8/e;->a(Lp8/i$d;Lp8/i$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll8/a$d;

    if-nez v0, :cond_3

    return-object v1

    :cond_3
    sget-object v2, Lg8/b$d;->a:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p4

    aget p4, v2, p4

    const/4 v2, 0x1

    if-eq p4, v2, :cond_6

    const/4 v2, 0x2

    if-eq p4, v2, :cond_5

    const/4 v0, 0x3

    if-eq p4, v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, p1

    check-cast v2, Li8/n;

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v3, p2

    move-object v4, p3

    move v7, p5

    invoke-static/range {v2 .. v7}, Lg8/c;->a(Li8/n;Lk8/c;Lk8/g;ZZZ)Lg8/w;

    move-result-object v1

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ll8/a$d;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Lg8/w;->b:Lg8/w$a;

    invoke-virtual {v0}, Ll8/a$d;->C()Ll8/a$c;

    move-result-object p3

    const-string p4, "getSetter(...)"

    :goto_0
    invoke-static {p3, p4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Lg8/w$a;->c(Lk8/c;Ll8/a$c;)Lg8/w;

    move-result-object v1

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Ll8/a$d;->G()Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object p1, Lg8/w;->b:Lg8/w$a;

    invoke-virtual {v0}, Ll8/a$d;->B()Ll8/a$c;

    move-result-object p3

    const-string p4, "getGetter(...)"

    goto :goto_0

    :cond_7
    :goto_1
    return-object v1
.end method

.method public abstract t()Lm8/e;
.end method

.method protected final u()Lg8/r;
    .locals 1

    iget-object v0, p0, Lg8/b;->a:Lg8/r;

    return-object v0
.end method

.method protected final v(Ln8/b;)Z
    .locals 3

    .prologue
    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln8/b;->g()Ln8/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ln8/b;->j()Ln8/f;

    move-result-object v0

    invoke-virtual {v0}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Container"

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg8/b;->a:Lg8/r;

    invoke-virtual {p0}, Lg8/b;->t()Lm8/e;

    move-result-object v2

    invoke-static {v0, p1, v2}, Lg8/s;->b(Lg8/r;Ln8/b;Lm8/e;)Lg8/t;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v0, LK7/a;->a:LK7/a;

    invoke-virtual {v0, p1}, LK7/a;->c(Lg8/t;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method protected abstract w(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;
.end method

.method public abstract x(Li8/b;Lk8/c;)Ljava/lang/Object;
.end method

.method protected final y(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;
    .locals 1

    .prologue
    const-string v0, "annotationClassId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LK7/a;->a:LK7/a;

    invoke-virtual {v0}, LK7/a;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lg8/b;->w(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;

    move-result-object p1

    return-object p1
.end method
