.class public final Li8/f$b;
.super Lp8/i$b;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private D:I

.field private E:Li8/f$c;

.field private F:Ljava/util/List;

.field private G:Li8/h;

.field private H:Li8/f$d;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$b;-><init>()V

    sget-object v0, Li8/f$c;->D:Li8/f$c;

    iput-object v0, p0, Li8/f$b;->E:Li8/f$c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/f$b;->F:Ljava/util/List;

    invoke-static {}, Li8/h;->F()Li8/h;

    move-result-object v0

    iput-object v0, p0, Li8/f$b;->G:Li8/h;

    sget-object v0, Li8/f$d;->D:Li8/f$d;

    iput-object v0, p0, Li8/f$b;->H:Li8/f$d;

    invoke-direct {p0}, Li8/f$b;->v()V

    return-void
.end method

.method static synthetic n()Li8/f$b;
    .locals 1

    invoke-static {}, Li8/f$b;->t()Li8/f$b;

    move-result-object v0

    return-object v0
.end method

.method private static t()Li8/f$b;
    .locals 1

    new-instance v0, Li8/f$b;

    invoke-direct {v0}, Li8/f$b;-><init>()V

    return-object v0
.end method

.method private u()V
    .locals 3

    .prologue
    iget v0, p0, Li8/f$b;->D:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Li8/f$b;->F:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Li8/f$b;->F:Ljava/util/List;

    iget v0, p0, Li8/f$b;->D:I

    or-int/2addr v0, v1

    iput v0, p0, Li8/f$b;->D:I

    :cond_0
    return-void
.end method

.method private v()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(Li8/f$d;)Li8/f$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Li8/f$b;->D:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Li8/f$b;->D:I

    iput-object p1, p0, Li8/f$b;->H:Li8/f$d;

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/f$b;->r()Li8/f$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/f$b;->y(Lp8/e;Lp8/g;)Li8/f$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/f$b;->p()Li8/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/f;

    invoke-virtual {p0, p1}, Li8/f$b;->x(Li8/f;)Li8/f$b;

    move-result-object p1

    return-object p1
.end method

.method public p()Li8/f;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/f$b;->q()Li8/f;

    move-result-object v0

    invoke-virtual {v0}, Li8/f;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public q()Li8/f;
    .locals 5

    .prologue
    new-instance v0, Li8/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/f;-><init>(Lp8/i$b;Li8/a;)V

    iget v1, p0, Li8/f$b;->D:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Li8/f$b;->E:Li8/f$c;

    invoke-static {v0, v2}, Li8/f;->r(Li8/f;Li8/f$c;)Li8/f$c;

    iget v2, p0, Li8/f$b;->D:I

    const/4 v4, 0x2

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_1

    iget-object v2, p0, Li8/f$b;->F:Ljava/util/List;

    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Li8/f$b;->F:Ljava/util/List;

    iget v2, p0, Li8/f$b;->D:I

    and-int/lit8 v2, v2, -0x3

    iput v2, p0, Li8/f$b;->D:I

    :cond_1
    iget-object v2, p0, Li8/f$b;->F:Ljava/util/List;

    invoke-static {v0, v2}, Li8/f;->t(Li8/f;Ljava/util/List;)Ljava/util/List;

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x2

    :cond_2
    iget-object v2, p0, Li8/f$b;->G:Li8/h;

    invoke-static {v0, v2}, Li8/f;->u(Li8/f;Li8/h;)Li8/h;

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    or-int/lit8 v3, v3, 0x4

    :cond_3
    iget-object v1, p0, Li8/f$b;->H:Li8/f$d;

    invoke-static {v0, v1}, Li8/f;->v(Li8/f;Li8/f$d;)Li8/f$d;

    invoke-static {v0, v3}, Li8/f;->w(Li8/f;I)I

    return-object v0
.end method

.method public r()Li8/f$b;
    .locals 2

    invoke-static {}, Li8/f$b;->t()Li8/f$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/f$b;->q()Li8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/f$b;->x(Li8/f;)Li8/f$b;

    move-result-object v0

    return-object v0
.end method

.method public w(Li8/h;)Li8/f$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/f$b;->D:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/f$b;->G:Li8/h;

    invoke-static {}, Li8/h;->F()Li8/h;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/f$b;->G:Li8/h;

    invoke-static {v0}, Li8/h;->T(Li8/h;)Li8/h$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/h$b;->x(Li8/h;)Li8/h$b;

    move-result-object p1

    invoke-virtual {p1}, Li8/h$b;->q()Li8/h;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/f$b;->G:Li8/h;

    iget p1, p0, Li8/f$b;->D:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/f$b;->D:I

    return-object p0
.end method

.method public x(Li8/f;)Li8/f$b;
    .locals 2

    .prologue
    invoke-static {}, Li8/f;->z()Li8/f;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/f;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/f;->C()Li8/f$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/f$b;->z(Li8/f$c;)Li8/f$b;

    :cond_1
    invoke-static {p1}, Li8/f;->s(Li8/f;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Li8/f$b;->F:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Li8/f;->s(Li8/f;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Li8/f$b;->F:Ljava/util/List;

    iget v0, p0, Li8/f$b;->D:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Li8/f$b;->D:I

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Li8/f$b;->u()V

    iget-object v0, p0, Li8/f$b;->F:Ljava/util/List;

    invoke-static {p1}, Li8/f;->s(Li8/f;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_0
    invoke-virtual {p1}, Li8/f;->E()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Li8/f;->y()Li8/h;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/f$b;->w(Li8/h;)Li8/f$b;

    :cond_4
    invoke-virtual {p1}, Li8/f;->G()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Li8/f;->D()Li8/f$d;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/f$b;->A(Li8/f$d;)Li8/f$b;

    :cond_5
    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/f;->x(Li8/f;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public y(Lp8/e;Lp8/g;)Li8/f$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/f;->M:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/f;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/f$b;->x(Li8/f;)Li8/f$b;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {p1}, Lp8/k;->a()Lp8/p;

    move-result-object p2

    check-cast p2, Li8/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Li8/f$b;->x(Li8/f;)Li8/f$b;

    :cond_1
    throw p1
.end method

.method public z(Li8/f$c;)Li8/f$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Li8/f$b;->D:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/f$b;->D:I

    iput-object p1, p0, Li8/f$b;->E:Li8/f$c;

    return-object p0
.end method
