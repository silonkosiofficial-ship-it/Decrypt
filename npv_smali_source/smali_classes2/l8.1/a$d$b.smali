.class public final Ll8/a$d$b;
.super Lp8/i$b;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private D:I

.field private E:Ll8/a$b;

.field private F:Ll8/a$c;

.field private G:Ll8/a$c;

.field private H:Ll8/a$c;

.field private I:Ll8/a$c;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$b;-><init>()V

    invoke-static {}, Ll8/a$b;->v()Ll8/a$b;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d$b;->E:Ll8/a$b;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d$b;->F:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d$b;->G:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d$b;->H:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v0

    iput-object v0, p0, Ll8/a$d$b;->I:Ll8/a$c;

    invoke-direct {p0}, Ll8/a$d$b;->u()V

    return-void
.end method

.method static synthetic n()Ll8/a$d$b;
    .locals 1

    invoke-static {}, Ll8/a$d$b;->t()Ll8/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method private static t()Ll8/a$d$b;
    .locals 1

    new-instance v0, Ll8/a$d$b;

    invoke-direct {v0}, Ll8/a$d$b;-><init>()V

    return-object v0
.end method

.method private u()V
    .locals 0

    return-void
.end method


# virtual methods
.method public A(Ll8/a$c;)Ll8/a$d$b;
    .locals 3

    .prologue
    iget v0, p0, Ll8/a$d$b;->D:I

    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->H:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->H:Ll8/a$c;

    invoke-static {v0}, Ll8/a$c;->C(Ll8/a$c;)Ll8/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    move-result-object p1

    invoke-virtual {p1}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Ll8/a$d$b;->H:Ll8/a$c;

    iget p1, p0, Ll8/a$d$b;->D:I

    or-int/2addr p1, v1

    iput p1, p0, Ll8/a$d$b;->D:I

    return-object p0
.end method

.method public B(Ll8/a$c;)Ll8/a$d$b;
    .locals 3

    .prologue
    iget v0, p0, Ll8/a$d$b;->D:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->F:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->F:Ll8/a$c;

    invoke-static {v0}, Ll8/a$c;->C(Ll8/a$c;)Ll8/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    move-result-object p1

    invoke-virtual {p1}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Ll8/a$d$b;->F:Ll8/a$c;

    iget p1, p0, Ll8/a$d$b;->D:I

    or-int/2addr p1, v1

    iput p1, p0, Ll8/a$d$b;->D:I

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll8/a$d$b;->r()Ll8/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ll8/a$d$b;->y(Lp8/e;Lp8/g;)Ll8/a$d$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Ll8/a$d$b;->p()Ll8/a$d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Ll8/a$d;

    invoke-virtual {p0, p1}, Ll8/a$d$b;->x(Ll8/a$d;)Ll8/a$d$b;

    move-result-object p1

    return-object p1
.end method

.method public p()Ll8/a$d;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ll8/a$d$b;->q()Ll8/a$d;

    move-result-object v0

    invoke-virtual {v0}, Ll8/a$d;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public q()Ll8/a$d;
    .locals 5

    .prologue
    new-instance v0, Ll8/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll8/a$d;-><init>(Lp8/i$b;Ll8/a$a;)V

    iget v1, p0, Ll8/a$d$b;->D:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Ll8/a$d$b;->E:Ll8/a$b;

    invoke-static {v0, v2}, Ll8/a$d;->r(Ll8/a$d;Ll8/a$b;)Ll8/a$b;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-object v2, p0, Ll8/a$d$b;->F:Ll8/a$c;

    invoke-static {v0, v2}, Ll8/a$d;->s(Ll8/a$d;Ll8/a$c;)Ll8/a$c;

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget-object v2, p0, Ll8/a$d$b;->G:Ll8/a$c;

    invoke-static {v0, v2}, Ll8/a$d;->t(Ll8/a$d;Ll8/a$c;)Ll8/a$c;

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, Ll8/a$d$b;->H:Ll8/a$c;

    invoke-static {v0, v2}, Ll8/a$d;->u(Ll8/a$d;Ll8/a$c;)Ll8/a$c;

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget-object v1, p0, Ll8/a$d$b;->I:Ll8/a$c;

    invoke-static {v0, v1}, Ll8/a$d;->v(Ll8/a$d;Ll8/a$c;)Ll8/a$c;

    invoke-static {v0, v3}, Ll8/a$d;->w(Ll8/a$d;I)I

    return-object v0
.end method

.method public r()Ll8/a$d$b;
    .locals 2

    invoke-static {}, Ll8/a$d$b;->t()Ll8/a$d$b;

    move-result-object v0

    invoke-virtual {p0}, Ll8/a$d$b;->q()Ll8/a$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll8/a$d$b;->x(Ll8/a$d;)Ll8/a$d$b;

    move-result-object v0

    return-object v0
.end method

.method public v(Ll8/a$c;)Ll8/a$d$b;
    .locals 3

    .prologue
    iget v0, p0, Ll8/a$d$b;->D:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->I:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->I:Ll8/a$c;

    invoke-static {v0}, Ll8/a$c;->C(Ll8/a$c;)Ll8/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    move-result-object p1

    invoke-virtual {p1}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Ll8/a$d$b;->I:Ll8/a$c;

    iget p1, p0, Ll8/a$d$b;->D:I

    or-int/2addr p1, v1

    iput p1, p0, Ll8/a$d$b;->D:I

    return-object p0
.end method

.method public w(Ll8/a$b;)Ll8/a$d$b;
    .locals 3

    .prologue
    iget v0, p0, Ll8/a$d$b;->D:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->E:Ll8/a$b;

    invoke-static {}, Ll8/a$b;->v()Ll8/a$b;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->E:Ll8/a$b;

    invoke-static {v0}, Ll8/a$b;->C(Ll8/a$b;)Ll8/a$b$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll8/a$b$b;->v(Ll8/a$b;)Ll8/a$b$b;

    move-result-object p1

    invoke-virtual {p1}, Ll8/a$b$b;->q()Ll8/a$b;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Ll8/a$d$b;->E:Ll8/a$b;

    iget p1, p0, Ll8/a$d$b;->D:I

    or-int/2addr p1, v1

    iput p1, p0, Ll8/a$d$b;->D:I

    return-object p0
.end method

.method public x(Ll8/a$d;)Ll8/a$d$b;
    .locals 1

    .prologue
    invoke-static {}, Ll8/a$d;->y()Ll8/a$d;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Ll8/a$d;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll8/a$d;->A()Ll8/a$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll8/a$d$b;->w(Ll8/a$b;)Ll8/a$d$b;

    :cond_1
    invoke-virtual {p1}, Ll8/a$d;->I()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll8/a$d;->D()Ll8/a$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll8/a$d$b;->B(Ll8/a$c;)Ll8/a$d$b;

    :cond_2
    invoke-virtual {p1}, Ll8/a$d;->G()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ll8/a$d;->B()Ll8/a$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll8/a$d$b;->z(Ll8/a$c;)Ll8/a$d$b;

    :cond_3
    invoke-virtual {p1}, Ll8/a$d;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ll8/a$d;->C()Ll8/a$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll8/a$d$b;->A(Ll8/a$c;)Ll8/a$d$b;

    :cond_4
    invoke-virtual {p1}, Ll8/a$d;->E()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ll8/a$d;->z()Ll8/a$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll8/a$d$b;->v(Ll8/a$c;)Ll8/a$d$b;

    :cond_5
    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Ll8/a$d;->x(Ll8/a$d;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public y(Lp8/e;Lp8/g;)Ll8/a$d$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Ll8/a$d;->N:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll8/a$d;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Ll8/a$d$b;->x(Ll8/a$d;)Ll8/a$d$b;

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

    check-cast p2, Ll8/a$d;
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

    invoke-virtual {p0, v0}, Ll8/a$d$b;->x(Ll8/a$d;)Ll8/a$d$b;

    :cond_1
    throw p1
.end method

.method public z(Ll8/a$c;)Ll8/a$d$b;
    .locals 3

    .prologue
    iget v0, p0, Ll8/a$d$b;->D:I

    const/4 v1, 0x4

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->G:Ll8/a$c;

    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Ll8/a$d$b;->G:Ll8/a$c;

    invoke-static {v0}, Ll8/a$c;->C(Ll8/a$c;)Ll8/a$c$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    move-result-object p1

    invoke-virtual {p1}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Ll8/a$d$b;->G:Ll8/a$c;

    iget p1, p0, Ll8/a$d$b;->D:I

    or-int/2addr p1, v1

    iput p1, p0, Ll8/a$d$b;->D:I

    return-object p0
.end method
