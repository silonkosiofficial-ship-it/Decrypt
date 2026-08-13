.class public final LB8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB8/i$a;,
        LB8/i$b;
    }
.end annotation


# static fields
.field public static final c:LB8/i$b;

.field private static final d:Ljava/util/Set;


# instance fields
.field private final a:LB8/k;

.field private final b:Lx7/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB8/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB8/i$b;-><init>(Ly7/k;)V

    sput-object v0, LB8/i;->c:LB8/i$b;

    sget-object v0, LL7/j$a;->d:Ln8/d;

    invoke-virtual {v0}, Ln8/d;->l()Ln8/c;

    move-result-object v0

    invoke-static {v0}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v0

    invoke-static {v0}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LB8/i;->d:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(LB8/k;)V
    .locals 1

    const-string v0, "components"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/i;->a:LB8/k;

    invoke-virtual {p1}, LB8/k;->u()LE8/n;

    move-result-object p1

    new-instance v0, LB8/i$c;

    invoke-direct {v0, p0}, LB8/i$c;-><init>(LB8/i;)V

    invoke-interface {p1, v0}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p1

    iput-object p1, p0, LB8/i;->b:Lx7/l;

    return-void
.end method

.method public static final synthetic a(LB8/i;LB8/i$a;)LO7/e;
    .locals 0

    invoke-direct {p0, p1}, LB8/i;->c(LB8/i$a;)LO7/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Ljava/util/Set;
    .locals 1

    sget-object v0, LB8/i;->d:Ljava/util/Set;

    return-object v0
.end method

.method private final c(LB8/i$a;)LO7/e;
    .locals 12

    .prologue
    invoke-virtual {p1}, LB8/i$a;->b()Ln8/b;

    move-result-object v0

    iget-object v1, p0, LB8/i;->a:LB8/k;

    invoke-virtual {v1}, LB8/k;->l()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQ7/b;

    invoke-interface {v2, v0}, LQ7/b;->c(Ln8/b;)LO7/e;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_1
    sget-object v1, LB8/i;->d:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p1}, LB8/i$a;->a()LB8/g;

    move-result-object p1

    if-nez p1, :cond_3

    iget-object p1, p0, LB8/i;->a:LB8/k;

    invoke-virtual {p1}, LB8/k;->e()LB8/h;

    move-result-object p1

    invoke-interface {p1, v0}, LB8/h;->a(Ln8/b;)LB8/g;

    move-result-object p1

    if-nez p1, :cond_3

    return-object v2

    :cond_3
    invoke-virtual {p1}, LB8/g;->a()Lk8/c;

    move-result-object v1

    invoke-virtual {p1}, LB8/g;->b()Li8/c;

    move-result-object v10

    invoke-virtual {p1}, LB8/g;->c()Lk8/a;

    move-result-object v11

    invoke-virtual {p1}, LB8/g;->d()LO7/a0;

    move-result-object p1

    invoke-virtual {v0}, Ln8/b;->g()Ln8/b;

    move-result-object v3

    const-string v4, "getShortClassName(...)"

    if-eqz v3, :cond_7

    const/4 v5, 0x2

    invoke-static {p0, v3, v2, v5, v2}, LB8/i;->e(LB8/i;Ln8/b;LB8/g;ILjava/lang/Object;)LO7/e;

    move-result-object v3

    instance-of v5, v3, LD8/d;

    if-eqz v5, :cond_4

    check-cast v3, LD8/d;

    goto :goto_0

    :cond_4
    move-object v3, v2

    :goto_0
    if-nez v3, :cond_5

    return-object v2

    :cond_5
    invoke-virtual {v0}, Ln8/b;->j()Ln8/f;

    move-result-object v0

    invoke-static {v0, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, LD8/d;->p1(Ln8/f;)Z

    move-result v0

    if-nez v0, :cond_6

    return-object v2

    :cond_6
    invoke-virtual {v3}, LD8/d;->i1()LB8/m;

    move-result-object v0

    :goto_1
    move-object v4, v0

    goto :goto_3

    :cond_7
    iget-object v3, p0, LB8/i;->a:LB8/k;

    invoke-virtual {v3}, LB8/k;->s()LO7/L;

    move-result-object v3

    invoke-virtual {v0}, Ln8/b;->h()Ln8/c;

    move-result-object v5

    const-string v6, "getPackageFqName(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v5}, LO7/N;->c(LO7/L;Ln8/c;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LO7/K;

    instance-of v7, v6, LB8/o;

    if-eqz v7, :cond_a

    check-cast v6, LB8/o;

    invoke-virtual {v0}, Ln8/b;->j()Ln8/f;

    move-result-object v7

    invoke-static {v7, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, LB8/o;->T0(Ln8/f;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_2

    :cond_9
    move-object v5, v2

    :cond_a
    :goto_2
    move-object v4, v5

    check-cast v4, LO7/K;

    if-nez v4, :cond_b

    return-object v2

    :cond_b
    iget-object v3, p0, LB8/i;->a:LB8/k;

    new-instance v6, Lk8/g;

    invoke-virtual {v10}, Li8/c;->i1()Li8/t;

    move-result-object v0

    const-string v2, "getTypeTable(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v0}, Lk8/g;-><init>(Li8/t;)V

    sget-object v0, Lk8/h;->b:Lk8/h$a;

    invoke-virtual {v10}, Li8/c;->k1()Li8/w;

    move-result-object v2

    const-string v5, "getVersionRequirementTable(...)"

    invoke-static {v2, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lk8/h$a;->a(Li8/w;)Lk8/h;

    move-result-object v7

    const/4 v9, 0x0

    move-object v5, v1

    move-object v8, v11

    invoke-virtual/range {v3 .. v9}, LB8/k;->a(LO7/K;Lk8/c;Lk8/g;Lk8/h;Lk8/a;LD8/f;)LB8/m;

    move-result-object v0

    goto :goto_1

    :goto_3
    new-instance v0, LD8/d;

    move-object v3, v0

    move-object v5, v10

    move-object v6, v1

    move-object v7, v11

    move-object v8, p1

    invoke-direct/range {v3 .. v8}, LD8/d;-><init>(LB8/m;Li8/c;Lk8/c;Lk8/a;LO7/a0;)V

    return-object v0
.end method

.method public static synthetic e(LB8/i;Ln8/b;LB8/g;ILjava/lang/Object;)LO7/e;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, LB8/i;->d(Ln8/b;LB8/g;)LO7/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Ln8/b;LB8/g;)LO7/e;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/i;->b:Lx7/l;

    new-instance v1, LB8/i$a;

    invoke-direct {v1, p1, p2}, LB8/i$a;-><init>(Ln8/b;LB8/g;)V

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/e;

    return-object p1
.end method
