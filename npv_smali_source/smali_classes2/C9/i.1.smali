.class public final LC9/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC9/i$a;
    }
.end annotation


# instance fields
.field private C:LC9/k;

.field private final D:LZ8/y;

.field private E:LC9/N;

.field private final F:Ljava/util/LinkedHashMap;

.field private G:LC9/I;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LZ8/P;->a(Ljava/lang/Object;)LZ8/y;

    move-result-object v0

    iput-object v0, p0, LC9/i;->D:LZ8/y;

    new-instance v0, LC9/N;

    invoke-direct {v0}, LC9/N;-><init>()V

    iput-object v0, p0, LC9/i;->E:LC9/N;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LC9/i;->F:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static synthetic n(LC9/i;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, LC9/i;->m(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(LC9/i;Ljava/lang/String;LC9/u;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LC9/i;->p(Ljava/lang/String;LC9/u;)V

    return-void
.end method

.method private final s(LC9/I;)V
    .locals 8

    .prologue
    iput-object p1, p0, LC9/i;->G:LC9/I;

    if-eqz p1, :cond_5

    new-instance v0, LC9/N;

    invoke-direct {v0}, LC9/N;-><init>()V

    iput-object v0, p0, LC9/i;->E:LC9/N;

    invoke-virtual {p1}, LC9/I;->b()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LD9/c;

    sget-object v3, LC9/N;->c:LC9/N$a;

    invoke-interface {v2}, LD9/c;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LC9/N$a;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    instance-of v4, v2, LD9/d;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/util/Collection;

    move-object v4, v2

    check-cast v4, LD9/d;

    invoke-virtual {v4}, LD9/d;->c()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    sget-object v7, LC9/N;->c:LC9/N$a;

    invoke-virtual {v7, v6}, LC9/N$a;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v5, v6}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    :cond_0
    invoke-static {v3, v5}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    :cond_1
    invoke-static {v3, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li7/u;

    invoke-virtual {v2}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-static {p1, v4}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li7/u;

    iget-object v1, p0, LC9/i;->E:LC9/N;

    invoke-virtual {v0}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD9/c;

    invoke-virtual {v1, v2, v0}, LC9/N;->d(Ljava/lang/String;LD9/c;)V

    goto :goto_4

    :cond_5
    return-void
.end method


# virtual methods
.method public final a(LC9/g;)Z
    .locals 1

    const-string v0, "entry"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final b()LZ8/y;
    .locals 1

    iget-object v0, p0, LC9/i;->D:LZ8/y;

    return-object v0
.end method

.method public final c()LZ8/f;
    .locals 2

    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-static {v0}, LZ8/h;->a(LZ8/x;)LZ8/C;

    move-result-object v0

    new-instance v1, LC9/i$d;

    invoke-direct {v1, v0}, LC9/i$d;-><init>(LZ8/f;)V

    return-object v1
.end method

.method public final d()LZ8/f;
    .locals 2

    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-static {v0}, LZ8/h;->a(LZ8/x;)LZ8/C;

    move-result-object v0

    new-instance v1, LC9/i$b;

    invoke-direct {v1, v0}, LC9/i$b;-><init>(LZ8/f;)V

    return-object v1
.end method

.method public final e()LZ8/f;
    .locals 2

    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-static {v0}, LZ8/h;->a(LZ8/x;)LZ8/C;

    move-result-object v0

    new-instance v1, LC9/i$g;

    invoke-direct {v1, v0}, LC9/i$g;-><init>(LZ8/f;)V

    return-object v1
.end method

.method public final h()LZ8/f;
    .locals 2

    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-static {v0}, LZ8/h;->a(LZ8/x;)LZ8/C;

    move-result-object v0

    new-instance v1, LC9/i$e;

    invoke-direct {v1, v0}, LC9/i$e;-><init>(LZ8/f;)V

    return-object v1
.end method

.method public i(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 2

    .prologue
    const-string v0, "source"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LC9/i$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object p1, p0, LC9/i;->D:LZ8/y;

    invoke-interface {p1}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LC9/g;

    invoke-virtual {p2}, LC9/g;->e()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LC9/i;->D:LZ8/y;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, LZ8/y;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lj7/v;->v0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC9/g;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1, p2}, LC9/g;->v(Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final j()LZ8/f;
    .locals 2

    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-static {v0}, LZ8/h;->a(LZ8/x;)LZ8/C;

    move-result-object v0

    new-instance v1, LC9/i$c;

    invoke-direct {v1, v0}, LC9/i$c;-><init>(LZ8/f;)V

    return-object v1
.end method

.method public final k()LZ8/f;
    .locals 2

    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-static {v0}, LZ8/h;->a(LZ8/x;)LZ8/C;

    move-result-object v0

    new-instance v1, LC9/i$f;

    invoke-direct {v1, v0}, LC9/i$f;-><init>(LZ8/f;)V

    return-object v1
.end method

.method public final l(Landroidx/lifecycle/r;Landroidx/lifecycle/Y;)V
    .locals 1

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelStoreOwner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LC9/k;->c:LC9/k$b;

    invoke-interface {p2}, Landroidx/lifecycle/Y;->n()Landroidx/lifecycle/X;

    move-result-object p2

    invoke-virtual {v0, p2}, LC9/k$b;->a(Landroidx/lifecycle/X;)LC9/k;

    move-result-object p2

    iput-object p2, p0, LC9/i;->C:LC9/k;

    invoke-interface {p1}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 4

    .prologue
    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    invoke-static {v0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC9/g;

    iget-object v3, p0, LC9/i;->D:LZ8/y;

    invoke-static {v0, v2}, Lj7/v;->d0(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v3, v0}, LZ8/y;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v1}, LC9/g;->e()V

    iget-object v0, p0, LC9/i;->F:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm7/e;

    if-eqz v0, :cond_0

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final p(Ljava/lang/String;LC9/u;)V
    .locals 15

    .prologue
    move-object v0, p0

    move-object/from16 v8, p1

    const-string v1, "path"

    invoke-static {v8, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, LC9/i;->D:LZ8/y;

    invoke-interface {v1}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Ljava/util/List;

    const-string v1, ""

    const/16 v2, 0x3f

    invoke-static {v8, v2, v1}, LS8/r;->f1(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v8, v2, v4, v3, v4}, LS8/r;->p1(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, LC9/i;->E:LC9/N;

    invoke-virtual {v3, v2}, LC9/N;->b(Ljava/lang/String;)LC9/K;

    move-result-object v2

    if-eqz v2, :cond_14

    const/4 v10, 0x1

    if-eqz p2, :cond_6

    invoke-virtual/range {p2 .. p2}, LC9/u;->b()Z

    move-result v3

    if-eqz v3, :cond_6

    move-object v3, v9

    check-cast v3, Ljava/lang/Iterable;

    instance-of v5, v3, Ljava/util/Collection;

    if-eqz v5, :cond_0

    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC9/g;

    invoke-virtual {v2}, LC9/K;->b()LD9/c;

    move-result-object v7

    invoke-interface {v7}, LD9/c;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, LC9/u;->a()Z

    move-result v11

    invoke-static {v6, v7, v8, v11}, LC9/h;->a(LC9/g;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, LC9/g;

    invoke-virtual {v2}, LC9/K;->b()LD9/c;

    move-result-object v6

    invoke-interface {v6}, LD9/c;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, LC9/u;->a()Z

    move-result v7

    invoke-static {v5, v6, v8, v7}, LC9/h;->a(LC9/g;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v4, v3

    :cond_3
    check-cast v4, LC9/g;

    if-eqz v4, :cond_a

    iget-object v1, v0, LC9/i;->D:LZ8/y;

    invoke-interface {v1}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LC9/g;

    invoke-virtual {v6}, LC9/g;->m()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, LC9/g;->m()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    xor-int/2addr v6, v10

    if-eqz v6, :cond_4

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    invoke-static {v3, v4}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, LZ8/y;->setValue(Ljava/lang/Object;)V

    goto :goto_5

    :cond_6
    :goto_1
    iget-object v11, v0, LC9/i;->D:LZ8/y;

    invoke-interface {v11}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ljava/util/Collection;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    const-string v5, "randomUUID(...)"

    invoke-static {v3, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "toString(...)"

    invoke-static {v3, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, LC9/K;->b()LD9/c;

    move-result-object v5

    invoke-virtual {v2}, LC9/K;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_7

    goto :goto_2

    :cond_7
    move-object v1, v4

    :goto_2
    if-eqz v1, :cond_8

    new-instance v2, LC9/G;

    invoke-direct {v2, v1}, LC9/G;-><init>(Ljava/lang/String;)V

    move-object v7, v2

    goto :goto_3

    :cond_8
    move-object v7, v4

    :goto_3
    iget-object v1, v0, LC9/i;->C:LC9/k;

    if-nez v1, :cond_9

    const-string v1, "_navControllerViewModel"

    invoke-static {v1}, Ly7/t;->p(Ljava/lang/String;)V

    move-object v13, v4

    goto :goto_4

    :cond_9
    move-object v13, v1

    :goto_4
    new-instance v14, LC9/g;

    move-object v1, v14

    move-object v2, v3

    move-object v3, v5

    move-object/from16 v4, p1

    move-object v5, v6

    move-object v6, v13

    invoke-direct/range {v1 .. v7}, LC9/g;-><init>(Ljava/lang/String;LD9/c;Ljava/lang/String;Ljava/util/Map;LC9/Q;LC9/G;)V

    invoke-static {v12, v14}, Lj7/v;->D0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v11, v1}, LZ8/y;->setValue(Ljava/lang/Object;)V

    :cond_a
    :goto_5
    if-eqz p2, :cond_13

    invoke-virtual/range {p2 .. p2}, LC9/u;->c()LC9/B;

    move-result-object v1

    sget-object v2, LC9/B$b;->a:LC9/B$b;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    invoke-virtual/range {p2 .. p2}, LC9/u;->b()Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, v0, LC9/i;->D:LZ8/y;

    invoke-interface {v1}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v1, v10}, Lj7/v;->d0(Ljava/util/List;I)Ljava/util/List;

    move-result-object v9

    :cond_b
    invoke-virtual/range {p2 .. p2}, LC9/u;->c()LC9/B;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_d

    :cond_c
    move v2, v3

    goto :goto_6

    :cond_d
    sget-object v2, LC9/B$c;->a:LC9/B$c;

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-static {v9}, Lj7/v;->o(Ljava/util/List;)I

    move-result v2

    sub-int/2addr v2, v10

    goto :goto_6

    :cond_e
    instance-of v2, v1, LC9/B$d;

    if-eqz v2, :cond_12

    move-object v2, v1

    check-cast v2, LC9/B$d;

    invoke-virtual {v2}, LC9/B$d;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_10

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v9, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v4

    :cond_f
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LC9/g;

    invoke-virtual {v2}, LC9/B$d;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, LC9/u;->a()Z

    move-result v7

    invoke-static {v5, v6, v8, v7}, LC9/h;->a(LC9/g;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/ListIterator;->nextIndex()I

    move-result v2

    goto :goto_6

    :cond_10
    const/4 v2, 0x0

    :goto_6
    if-eq v2, v3, :cond_13

    invoke-interface {v1}, LC9/B;->a()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_7

    :cond_11
    add-int/lit8 v2, v2, 0x1

    :goto_7
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v9, v2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    iget-object v2, v0, LC9/i;->D:LZ8/y;

    invoke-interface {v2}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v3, v1}, Lj7/v;->y0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v2, v3}, LZ8/y;->setValue(Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC9/g;

    invoke-virtual {v2}, LC9/g;->e()V

    goto :goto_8

    :cond_12
    new-instance v1, Li7/s;

    invoke-direct {v1}, Li7/s;-><init>()V

    throw v1

    :cond_13
    return-void

    :cond_14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RouteStackManager: navigate target "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " not found"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final r(LC9/I;)V
    .locals 3

    .prologue
    const-string v0, "routeGraph"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LC9/i;->G:LC9/I;

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LC9/i;->G:LC9/I;

    if-eqz v0, :cond_1

    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC9/g;

    invoke-virtual {v1}, LC9/g;->e()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LC9/i;->D:LZ8/y;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, LZ8/y;->setValue(Ljava/lang/Object;)V

    :cond_1
    invoke-direct {p0, p1}, LC9/i;->s(LC9/I;)V

    invoke-virtual {p1}, LC9/I;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, v1}, LC9/i;->q(LC9/i;Ljava/lang/String;LC9/u;ILjava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-direct {p0, p1}, LC9/i;->s(LC9/I;)V

    iget-object p1, p0, LC9/i;->D:LZ8/y;

    invoke-interface {p1}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC9/g;

    iget-object v1, p0, LC9/i;->E:LC9/N;

    invoke-virtual {v0}, LC9/g;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, LC9/N;->b(Ljava/lang/String;)LC9/K;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LC9/K;->b()LD9/c;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_3
    invoke-virtual {v0}, LC9/g;->l()LD9/c;

    move-result-object v1

    :cond_4
    invoke-virtual {v0, v1}, LC9/g;->w(LD9/c;)V

    goto :goto_1

    :cond_5
    :goto_2
    return-void
.end method
