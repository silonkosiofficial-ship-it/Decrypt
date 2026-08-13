.class public final Ll8/a$e$c$b;
.super Lp8/i$b;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/a$e$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private D:I

.field private E:I

.field private F:I

.field private G:Ljava/lang/Object;

.field private H:Ll8/a$e$c$c;

.field private I:Ljava/util/List;

.field private J:Ljava/util/List;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$b;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Ll8/a$e$c$b;->E:I

    const-string v0, ""

    iput-object v0, p0, Ll8/a$e$c$b;->G:Ljava/lang/Object;

    sget-object v0, Ll8/a$e$c$c;->D:Ll8/a$e$c$c;

    iput-object v0, p0, Ll8/a$e$c$b;->H:Ll8/a$e$c$c;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e$c$b;->I:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e$c$b;->J:Ljava/util/List;

    invoke-direct {p0}, Ll8/a$e$c$b;->w()V

    return-void
.end method

.method static synthetic n()Ll8/a$e$c$b;
    .locals 1

    invoke-static {}, Ll8/a$e$c$b;->t()Ll8/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method private static t()Ll8/a$e$c$b;
    .locals 1

    new-instance v0, Ll8/a$e$c$b;

    invoke-direct {v0}, Ll8/a$e$c$b;-><init>()V

    return-object v0
.end method

.method private u()V
    .locals 3

    .prologue
    iget v0, p0, Ll8/a$e$c$b;->D:I

    const/16 v1, 0x20

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Ll8/a$e$c$b;->J:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll8/a$e$c$b;->J:Ljava/util/List;

    iget v0, p0, Ll8/a$e$c$b;->D:I

    or-int/2addr v0, v1

    iput v0, p0, Ll8/a$e$c$b;->D:I

    :cond_0
    return-void
.end method

.method private v()V
    .locals 3

    .prologue
    iget v0, p0, Ll8/a$e$c$b;->D:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Ll8/a$e$c$b;->I:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ll8/a$e$c$b;->I:Ljava/util/List;

    iget v0, p0, Ll8/a$e$c$b;->D:I

    or-int/2addr v0, v1

    iput v0, p0, Ll8/a$e$c$b;->D:I

    :cond_0
    return-void
.end method

.method private w()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(I)Ll8/a$e$c$b;
    .locals 1

    iget v0, p0, Ll8/a$e$c$b;->D:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll8/a$e$c$b;->D:I

    iput p1, p0, Ll8/a$e$c$b;->F:I

    return-object p0
.end method

.method public B(I)Ll8/a$e$c$b;
    .locals 1

    iget v0, p0, Ll8/a$e$c$b;->D:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll8/a$e$c$b;->D:I

    iput p1, p0, Ll8/a$e$c$b;->E:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll8/a$e$c$b;->r()Ll8/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ll8/a$e$c$b;->y(Lp8/e;Lp8/g;)Ll8/a$e$c$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Ll8/a$e$c$b;->p()Ll8/a$e$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Ll8/a$e$c;

    invoke-virtual {p0, p1}, Ll8/a$e$c$b;->x(Ll8/a$e$c;)Ll8/a$e$c$b;

    move-result-object p1

    return-object p1
.end method

.method public p()Ll8/a$e$c;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ll8/a$e$c$b;->q()Ll8/a$e$c;

    move-result-object v0

    invoke-virtual {v0}, Ll8/a$e$c;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public q()Ll8/a$e$c;
    .locals 5

    .prologue
    new-instance v0, Ll8/a$e$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll8/a$e$c;-><init>(Lp8/i$b;Ll8/a$a;)V

    iget v1, p0, Ll8/a$e$c$b;->D:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Ll8/a$e$c$b;->E:I

    invoke-static {v0, v2}, Ll8/a$e$c;->t(Ll8/a$e$c;I)I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Ll8/a$e$c$b;->F:I

    invoke-static {v0, v2}, Ll8/a$e$c;->u(Ll8/a$e$c;I)I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, Ll8/a$e$c$b;->G:Ljava/lang/Object;

    invoke-static {v0, v2}, Ll8/a$e$c;->w(Ll8/a$e$c;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v1, p0, Ll8/a$e$c$b;->H:Ll8/a$e$c$c;

    invoke-static {v0, v1}, Ll8/a$e$c;->x(Ll8/a$e$c;Ll8/a$e$c$c;)Ll8/a$e$c$c;

    iget v1, p0, Ll8/a$e$c$b;->D:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    iget-object v1, p0, Ll8/a$e$c$b;->I:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll8/a$e$c$b;->I:Ljava/util/List;

    iget v1, p0, Ll8/a$e$c$b;->D:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Ll8/a$e$c$b;->D:I

    :cond_4
    iget-object v1, p0, Ll8/a$e$c$b;->I:Ljava/util/List;

    invoke-static {v0, v1}, Ll8/a$e$c;->z(Ll8/a$e$c;Ljava/util/List;)Ljava/util/List;

    iget v1, p0, Ll8/a$e$c$b;->D:I

    const/16 v2, 0x20

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_5

    iget-object v1, p0, Ll8/a$e$c$b;->J:Ljava/util/List;

    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll8/a$e$c$b;->J:Ljava/util/List;

    iget v1, p0, Ll8/a$e$c$b;->D:I

    and-int/lit8 v1, v1, -0x21

    iput v1, p0, Ll8/a$e$c$b;->D:I

    :cond_5
    iget-object v1, p0, Ll8/a$e$c$b;->J:Ljava/util/List;

    invoke-static {v0, v1}, Ll8/a$e$c;->B(Ll8/a$e$c;Ljava/util/List;)Ljava/util/List;

    invoke-static {v0, v3}, Ll8/a$e$c;->r(Ll8/a$e$c;I)I

    return-object v0
.end method

.method public r()Ll8/a$e$c$b;
    .locals 2

    invoke-static {}, Ll8/a$e$c$b;->t()Ll8/a$e$c$b;

    move-result-object v0

    invoke-virtual {p0}, Ll8/a$e$c$b;->q()Ll8/a$e$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll8/a$e$c$b;->x(Ll8/a$e$c;)Ll8/a$e$c$b;

    move-result-object v0

    return-object v0
.end method

.method public x(Ll8/a$e$c;)Ll8/a$e$c$b;
    .locals 2

    .prologue
    invoke-static {}, Ll8/a$e$c;->C()Ll8/a$e$c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Ll8/a$e$c;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll8/a$e$c;->F()I

    move-result v0

    invoke-virtual {p0, v0}, Ll8/a$e$c$b;->B(I)Ll8/a$e$c$b;

    :cond_1
    invoke-virtual {p1}, Ll8/a$e$c;->N()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll8/a$e$c;->E()I

    move-result v0

    invoke-virtual {p0, v0}, Ll8/a$e$c$b;->A(I)Ll8/a$e$c$b;

    :cond_2
    invoke-virtual {p1}, Ll8/a$e$c;->P()Z

    move-result v0

    if-eqz v0, :cond_3

    iget v0, p0, Ll8/a$e$c$b;->D:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll8/a$e$c$b;->D:I

    invoke-static {p1}, Ll8/a$e$c;->v(Ll8/a$e$c;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e$c$b;->G:Ljava/lang/Object;

    :cond_3
    invoke-virtual {p1}, Ll8/a$e$c;->M()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ll8/a$e$c;->D()Ll8/a$e$c$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll8/a$e$c$b;->z(Ll8/a$e$c$c;)Ll8/a$e$c$b;

    :cond_4
    invoke-static {p1}, Ll8/a$e$c;->y(Ll8/a$e$c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Ll8/a$e$c$b;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {p1}, Ll8/a$e$c;->y(Ll8/a$e$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e$c$b;->I:Ljava/util/List;

    iget v0, p0, Ll8/a$e$c$b;->D:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Ll8/a$e$c$b;->D:I

    goto :goto_0

    :cond_5
    invoke-direct {p0}, Ll8/a$e$c$b;->v()V

    iget-object v0, p0, Ll8/a$e$c$b;->I:Ljava/util/List;

    invoke-static {p1}, Ll8/a$e$c;->y(Ll8/a$e$c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_6
    :goto_0
    invoke-static {p1}, Ll8/a$e$c;->A(Ll8/a$e$c;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Ll8/a$e$c$b;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Ll8/a$e$c;->A(Ll8/a$e$c;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll8/a$e$c$b;->J:Ljava/util/List;

    iget v0, p0, Ll8/a$e$c$b;->D:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Ll8/a$e$c$b;->D:I

    goto :goto_1

    :cond_7
    invoke-direct {p0}, Ll8/a$e$c$b;->u()V

    iget-object v0, p0, Ll8/a$e$c$b;->J:Ljava/util/List;

    invoke-static {p1}, Ll8/a$e$c;->A(Ll8/a$e$c;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_8
    :goto_1
    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Ll8/a$e$c;->s(Ll8/a$e$c;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public y(Lp8/e;Lp8/g;)Ll8/a$e$c$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Ll8/a$e$c;->Q:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll8/a$e$c;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Ll8/a$e$c$b;->x(Ll8/a$e$c;)Ll8/a$e$c$b;

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

    check-cast p2, Ll8/a$e$c;
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

    invoke-virtual {p0, v0}, Ll8/a$e$c$b;->x(Ll8/a$e$c;)Ll8/a$e$c$b;

    :cond_1
    throw p1
.end method

.method public z(Ll8/a$e$c$c;)Ll8/a$e$c$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Ll8/a$e$c$b;->D:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll8/a$e$c$b;->D:I

    iput-object p1, p0, Ll8/a$e$c$b;->H:Ll8/a$e$c$c;

    return-object p0
.end method
