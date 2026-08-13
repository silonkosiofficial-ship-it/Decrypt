.class public final Lr8/a;
.super Lr8/p;
.source "SourceFile"


# static fields
.field public static final a:Lr8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr8/a;

    invoke-direct {v0}, Lr8/a;-><init>()V

    sput-object v0, Lr8/a;->a:Lr8/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lr8/p;-><init>()V

    return-void
.end method

.method private static final b(LO7/e;Ljava/util/LinkedHashSet;Ly8/h;Z)V
    .locals 4

    .prologue
    sget-object v0, Ly8/d;->t:Ly8/d;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p2, v0, v2, v1, v2}, Ly8/k$a;->a(Ly8/k;Ly8/d;Lx7/l;ILjava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/m;

    instance-of v3, v1, LO7/e;

    if-eqz v3, :cond_0

    check-cast v1, LO7/e;

    invoke-interface {v1}, LO7/C;->R()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    const-string v3, "getName(...)"

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LW7/d;->O:LW7/d;

    invoke-interface {p2, v1, v3}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object v1

    instance-of v3, v1, LO7/e;

    if-eqz v3, :cond_1

    check-cast v1, LO7/e;

    goto :goto_1

    :cond_1
    instance-of v3, v1, LO7/e0;

    if-eqz v3, :cond_2

    check-cast v1, LO7/e0;

    invoke-interface {v1}, LO7/e0;->v()LO7/e;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {v1, p0}, Lr8/f;->z(LO7/e;LO7/e;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_5
    if-eqz p3, :cond_0

    invoke-interface {v1}, LO7/e;->H0()Ly8/h;

    move-result-object v1

    const-string v3, "getUnsubstitutedInnerClassesScope(...)"

    invoke-static {v1, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, v1, p3}, Lr8/a;->b(LO7/e;Ljava/util/LinkedHashSet;Ly8/h;Z)V

    goto :goto_0

    :cond_6
    return-void
.end method


# virtual methods
.method public a(LO7/e;Z)Ljava/util/Collection;
    .locals 4

    .prologue
    const-string v0, "sealedClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/e;->q()LO7/D;

    move-result-object v0

    sget-object v1, LO7/D;->E:LO7/D;

    if-eq v0, v1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    if-nez p2, :cond_1

    invoke-interface {p1}, LO7/e;->b()LO7/m;

    move-result-object v1

    goto :goto_2

    :cond_1
    invoke-static {p1}, Lv8/c;->r(LO7/m;)LR8/h;

    move-result-object v1

    invoke-interface {v1}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LO7/m;

    instance-of v3, v3, LO7/K;

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    move-object v1, v2

    check-cast v1, LO7/m;

    :goto_2
    instance-of v2, v1, LO7/K;

    if-eqz v2, :cond_4

    check-cast v1, LO7/K;

    invoke-interface {v1}, LO7/K;->u()Ly8/h;

    move-result-object v1

    invoke-static {p1, v0, v1, p2}, Lr8/a;->b(LO7/e;Ljava/util/LinkedHashSet;Ly8/h;Z)V

    :cond_4
    invoke-interface {p1}, LO7/e;->H0()Ly8/h;

    move-result-object p2

    const-string v1, "getUnsubstitutedInnerClassesScope(...)"

    invoke-static {p2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-static {p1, v0, p2, v1}, Lr8/a;->b(LO7/e;Ljava/util/LinkedHashSet;Ly8/h;Z)V

    new-instance p1, Lr8/a$a;

    invoke-direct {p1}, Lr8/a$a;-><init>()V

    invoke-static {v0, p1}, Lj7/v;->L0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    goto :goto_0
.end method
