.class public abstract LX7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX7/a$a;
    }
.end annotation


# static fields
.field private static final c:LX7/a$a;

.field private static final d:Ljava/util/Map;


# instance fields
.field private final a:LX7/x;

.field private final b:Lj$/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    new-instance v0, LX7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX7/a$a;-><init>(Ly7/k;)V

    sput-object v0, LX7/a;->c:LX7/a$a;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {}, LX7/b;->values()[LX7/b;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    invoke-virtual {v4}, LX7/b;->g()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_0

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sput-object v0, LX7/a;->d:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(LX7/x;)V
    .locals 1

    const-string v0, "javaTypeEnhancementState"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/a;->a:LX7/x;

    new-instance p1, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, LX7/a;->b:Lj$/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private final a(Ljava/util/Set;)Ljava/util/Set;
    .locals 2

    .prologue
    sget-object v0, LX7/b;->G:LX7/b;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LX7/b;->values()[LX7/b;

    move-result-object v0

    invoke-static {v0}, Lj7/n;->d1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sget-object v1, LX7/b;->H:LX7/b;

    invoke-static {v0, v1}, Lj7/Z;->i(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private final d(Ljava/lang/Object;)LX7/r;
    .locals 10

    .prologue
    invoke-direct {p0, p1}, LX7/a;->r(Ljava/lang/Object;)LX7/r;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0, p1}, LX7/a;->t(Ljava/lang/Object;)Li7/u;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v0}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    invoke-direct {p0, p1}, LX7/a;->q(Ljava/lang/Object;)LX7/G;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-direct {p0, v2}, LX7/a;->p(Ljava/lang/Object;)LX7/G;

    move-result-object p1

    :cond_2
    invoke-virtual {p1}, LX7/G;->i()Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v1

    :cond_3
    sget-object v3, LX7/a$b;->D:LX7/a$b;

    invoke-direct {p0, v2, v3}, LX7/a;->g(Ljava/lang/Object;Lx7/l;)Lf8/i;

    move-result-object v2

    if-nez v2, :cond_4

    return-object v1

    :cond_4
    new-instance v9, LX7/r;

    invoke-virtual {p1}, LX7/G;->m()Z

    move-result p1

    const/4 v3, 0x1

    invoke-static {v2, v1, p1, v3, v1}, Lf8/i;->b(Lf8/i;Lf8/h;ZILjava/lang/Object;)Lf8/i;

    move-result-object v4

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, LX7/r;-><init>(Lf8/i;Ljava/util/Collection;ZILy7/k;)V

    return-object v9
.end method

.method private final g(Ljava/lang/Object;Lx7/l;)Lf8/i;
    .locals 3

    .prologue
    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-direct {p0, p1, v0}, LX7/a;->n(Ljava/lang/Object;Z)Lf8/i;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, LX7/a;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-direct {p0, p1}, LX7/a;->p(Ljava/lang/Object;)LX7/G;

    move-result-object p1

    invoke-virtual {p1}, LX7/G;->i()Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    invoke-interface {p2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-direct {p0, v0, p2}, LX7/a;->n(Ljava/lang/Object;Z)Lf8/i;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, LX7/G;->m()Z

    move-result p1

    const/4 v0, 0x1

    invoke-static {p2, v1, p1, v0, v1}, Lf8/i;->b(Lf8/i;Lf8/h;ZILjava/lang/Object;)Lf8/i;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method private final h(Ljava/lang/Object;Ln8/c;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-virtual {p0, p1}, LX7/a;->k(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LX7/a;->i(Ljava/lang/Object;)Ln8/c;

    move-result-object v1

    invoke-static {v1, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private final l(Ljava/lang/Object;Ln8/c;)Z
    .locals 2

    .prologue
    invoke-virtual {p0, p1}, LX7/a;->k(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LX7/a;->i(Ljava/lang/Object;)Ln8/c;

    move-result-object v0

    invoke-static {v0, p2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    :cond_2
    :goto_0
    return v1
.end method

.method private final n(Ljava/lang/Object;Z)Lf8/i;
    .locals 6

    .prologue
    invoke-virtual {p0, p1}, LX7/a;->i(Ljava/lang/Object;)Ln8/c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v2, p0, LX7/a;->a:LX7/x;

    invoke-virtual {v2}, LX7/x;->c()Lx7/l;

    move-result-object v2

    invoke-interface {v2, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LX7/G;

    invoke-virtual {v2}, LX7/G;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v1

    :cond_1
    invoke-static {}, LX7/C;->o()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    :cond_2
    :goto_0
    sget-object p1, Lf8/h;->D:Lf8/h;

    goto/16 :goto_5

    :cond_3
    invoke-static {}, LX7/C;->n()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_4
    :goto_1
    sget-object p1, Lf8/h;->E:Lf8/h;

    goto/16 :goto_5

    :cond_5
    invoke-static {}, LX7/C;->j()Ln8/c;

    move-result-object v3

    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    move v3, v5

    goto :goto_2

    :cond_6
    invoke-static {}, LX7/C;->g()Ln8/c;

    move-result-object v3

    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {}, LX7/C;->k()Ln8/c;

    move-result-object v3

    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    move v3, v5

    goto :goto_3

    :cond_8
    invoke-static {}, LX7/C;->h()Ln8/c;

    move-result-object v3

    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    :goto_3
    if-eqz v3, :cond_a

    :cond_9
    sget-object p1, Lf8/h;->C:Lf8/h;

    goto/16 :goto_5

    :cond_a
    invoke-static {}, LX7/C;->f()Ln8/c;

    move-result-object v3

    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {p0, p1, v4}, LX7/a;->b(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->j0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_4

    :sswitch_0
    const-string v0, "ALWAYS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_1

    :sswitch_1
    const-string v0, "UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_4

    :sswitch_2
    const-string v0, "NEVER"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_4

    :sswitch_3
    const-string v0, "MAYBE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_b
    :goto_4
    return-object v1

    :cond_c
    invoke-static {}, LX7/C;->d()Ln8/c;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    goto/16 :goto_0

    :cond_d
    invoke-static {}, LX7/C;->c()Ln8/c;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    goto/16 :goto_1

    :cond_e
    invoke-static {}, LX7/C;->a()Ln8/c;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_f

    goto/16 :goto_1

    :cond_f
    invoke-static {}, LX7/C;->b()Ln8/c;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    goto/16 :goto_0

    :goto_5
    new-instance v0, Lf8/i;

    invoke-virtual {v2}, LX7/G;->m()Z

    move-result v1

    if-nez v1, :cond_10

    if-eqz p2, :cond_11

    :cond_10
    move v4, v5

    :cond_11
    invoke-direct {v0, p1, v4}, Lf8/i;-><init>(Lf8/h;Z)V

    return-object v0

    :cond_12
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x45bf448 -> :sswitch_3
        0x46bd26c -> :sswitch_2
        0x19d1382a -> :sswitch_1
        0x7342860f -> :sswitch_0
    .end sparse-switch
.end method

.method private final o(Ljava/lang/Object;)LX7/G;
    .locals 2

    .prologue
    invoke-virtual {p0, p1}, LX7/a;->i(Ljava/lang/Object;)Ln8/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, LX7/c;->c()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LX7/a;->a:LX7/x;

    invoke-virtual {p1}, LX7/x;->c()Lx7/l;

    move-result-object p1

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LX7/G;

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, LX7/a;->p(Ljava/lang/Object;)LX7/G;

    move-result-object p1

    return-object p1
.end method

.method private final p(Ljava/lang/Object;)LX7/G;
    .locals 0

    .prologue
    invoke-direct {p0, p1}, LX7/a;->q(Ljava/lang/Object;)LX7/G;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    iget-object p1, p0, LX7/a;->a:LX7/x;

    invoke-virtual {p1}, LX7/x;->d()LX7/z;

    move-result-object p1

    invoke-virtual {p1}, LX7/z;->a()LX7/G;

    move-result-object p1

    return-object p1
.end method

.method private final q(Ljava/lang/Object;)LX7/G;
    .locals 3

    .prologue
    iget-object v0, p0, LX7/a;->a:LX7/x;

    invoke-virtual {v0}, LX7/x;->d()LX7/z;

    move-result-object v0

    invoke-virtual {v0}, LX7/z;->c()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1}, LX7/a;->i(Ljava/lang/Object;)Ln8/c;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX7/G;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-static {}, LX7/c;->d()Ln8/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LX7/a;->h(Ljava/lang/Object;Ln8/c;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_9

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1}, LX7/a;->b(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-static {p1}, Lj7/v;->j0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LX7/a;->a:LX7/x;

    invoke-virtual {v1}, LX7/x;->d()LX7/z;

    move-result-object v1

    invoke-virtual {v1}, LX7/z;->b()LX7/G;

    move-result-object v1

    if-nez v1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x7f610e2e

    if-eq v1, v2, :cond_6

    const v2, -0x6d97ad37

    if-eq v1, v2, :cond_4

    const v2, 0x288a86

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "WARN"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, LX7/G;->F:LX7/G;

    goto :goto_0

    :cond_4
    const-string v1, "STRICT"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object v0, LX7/G;->G:LX7/G;

    goto :goto_0

    :cond_6
    const-string v1, "IGNORE"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    sget-object v0, LX7/G;->E:LX7/G;

    goto :goto_0

    :cond_8
    move-object v0, v1

    :cond_9
    :goto_0
    return-object v0
.end method

.method private final r(Ljava/lang/Object;)LX7/r;
    .locals 8

    .prologue
    iget-object v0, p0, LX7/a;->a:LX7/x;

    invoke-virtual {v0}, LX7/x;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, LX7/c;->a()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, p1}, LX7/a;->i(Ljava/lang/Object;)Ln8/c;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LX7/r;

    if-eqz v2, :cond_3

    invoke-direct {p0, p1}, LX7/a;->o(Ljava/lang/Object;)LX7/G;

    move-result-object p1

    sget-object v0, LX7/G;->E:LX7/G;

    if-eq p1, v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v2}, LX7/r;->d()Lf8/i;

    move-result-object v0

    invoke-virtual {p1}, LX7/G;->m()Z

    move-result p1

    const/4 v3, 0x1

    invoke-static {v0, v1, p1, v3, v1}, Lf8/i;->b(Lf8/i;Lf8/h;ZILjava/lang/Object;)Lf8/i;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LX7/r;->b(LX7/r;Lf8/i;Ljava/util/Collection;ZILjava/lang/Object;)LX7/r;

    move-result-object v1

    :cond_3
    return-object v1
.end method

.method private final t(Ljava/lang/Object;)Li7/u;
    .locals 4

    .prologue
    iget-object v0, p0, LX7/a;->a:LX7/x;

    invoke-virtual {v0}, LX7/x;->d()LX7/z;

    move-result-object v0

    invoke-virtual {v0}, LX7/z;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, LX7/c;->e()Ln8/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LX7/a;->h(Ljava/lang/Object;Ln8/c;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0, p1}, LX7/a;->k(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, LX7/a;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    if-nez v2, :cond_4

    return-object v1

    :cond_4
    const/4 p1, 0x1

    invoke-virtual {p0, v0, p1}, LX7/a;->b(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    move-result-object p1

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v3, LX7/a;->d:Ljava/util/Map;

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX7/b;

    if-eqz v1, :cond_5

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance p1, Li7/u;

    invoke-direct {p0, v0}, LX7/a;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p1, v2, v0}, Li7/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method protected abstract b(Ljava/lang/Object;Z)Ljava/lang/Iterable;
.end method

.method public final c(LX7/y;Ljava/lang/Iterable;)LX7/y;
    .locals 5

    .prologue
    const-string v0, "annotations"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX7/a;->a:LX7/x;

    invoke-virtual {v0}, LX7/x;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1}, LX7/a;->d(Ljava/lang/Object;)LX7/r;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    return-object p1

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, LX7/y;->b()Ljava/util/EnumMap;

    move-result-object p2

    if-eqz p2, :cond_4

    new-instance v1, Ljava/util/EnumMap;

    invoke-direct {v1, p2}, Ljava/util/EnumMap;-><init>(Ljava/util/EnumMap;)V

    goto :goto_1

    :cond_4
    new-instance v1, Ljava/util/EnumMap;

    const-class p2, LX7/b;

    invoke-direct {v1, p2}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LX7/r;

    invoke-virtual {v2}, LX7/r;->e()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX7/b;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    goto :goto_2

    :cond_6
    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, LX7/y;

    invoke-direct {p1, v1}, LX7/y;-><init>(Ljava/util/EnumMap;)V

    :goto_3
    return-object p1
.end method

.method public final e(Ljava/lang/Iterable;)Lf8/f;
    .locals 4

    .prologue
    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, LX7/a;->i(Ljava/lang/Object;)Ln8/c;

    move-result-object v2

    invoke-static {}, LX7/C;->p()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v2, Lf8/f;->C:Lf8/f;

    goto :goto_1

    :cond_1
    invoke-static {}, LX7/C;->m()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lf8/f;->D:Lf8/f;

    :goto_1
    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_2

    return-object v0

    :cond_2
    move-object v1, v2

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final f(Ljava/lang/Iterable;Lx7/l;)Lf8/i;
    .locals 4

    .prologue
    const-string v0, "annotations"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "forceWarning"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move-object v1, v0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0, v2, p2}, LX7/a;->g(Ljava/lang/Object;Lx7/l;)Lf8/i;

    move-result-object v2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_0

    invoke-static {v2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lf8/i;->d()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, Lf8/i;->d()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lf8/i;->d()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v1}, Lf8/i;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    move-object v1, v2

    goto :goto_0

    :cond_4
    return-object v0

    :cond_5
    return-object v1
.end method

.method protected abstract i(Ljava/lang/Object;)Ln8/c;
.end method

.method protected abstract j(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method protected abstract k(Ljava/lang/Object;)Ljava/lang/Iterable;
.end method

.method public final m(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const-string v0, "annotation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LL7/j$a;->H:Ln8/c;

    invoke-direct {p0, p1, v0}, LX7/a;->h(Ljava/lang/Object;Ln8/c;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1, v0}, LX7/a;->b(Ljava/lang/Object;Z)Ljava/lang/Iterable;

    move-result-object p1

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "TYPE"

    invoke-static {v1, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    :cond_3
    :goto_0
    return v0
.end method

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    const-string v0, "annotation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX7/a;->a:LX7/x;

    invoke-virtual {v0}, LX7/x;->d()LX7/z;

    move-result-object v0

    invoke-virtual {v0}, LX7/z;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, LX7/c;->b()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p0, p1}, LX7/a;->i(Ljava/lang/Object;)Ln8/c;

    move-result-object v2

    invoke-static {v0, v2}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {}, LX7/c;->f()Ln8/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LX7/a;->l(Ljava/lang/Object;Ln8/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {}, LX7/c;->g()Ln8/c;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LX7/a;->l(Ljava/lang/Object;Ln8/c;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    iget-object v0, p0, LX7/a;->b:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p1}, LX7/a;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_7

    invoke-virtual {p0, p1}, LX7/a;->k(Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, LX7/a;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_4
    move-object v3, v1

    :goto_0
    if-nez v3, :cond_5

    return-object v1

    :cond_5
    invoke-interface {v0, v2, v3}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    move-object v3, p1

    :cond_7
    :goto_1
    return-object v3

    :cond_8
    :goto_2
    return-object p1
.end method
