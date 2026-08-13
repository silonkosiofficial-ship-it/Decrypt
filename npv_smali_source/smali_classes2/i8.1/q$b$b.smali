.class public final Li8/q$b$b;
.super Lp8/i$b;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li8/q$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private D:I

.field private E:Li8/q$b$c;

.field private F:Li8/q;

.field private G:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lp8/i$b;-><init>()V

    sget-object v0, Li8/q$b$c;->F:Li8/q$b$c;

    iput-object v0, p0, Li8/q$b$b;->E:Li8/q$b$c;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v0

    iput-object v0, p0, Li8/q$b$b;->F:Li8/q;

    invoke-direct {p0}, Li8/q$b$b;->u()V

    return-void
.end method

.method static synthetic n()Li8/q$b$b;
    .locals 1

    invoke-static {}, Li8/q$b$b;->t()Li8/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method private static t()Li8/q$b$b;
    .locals 1

    new-instance v0, Li8/q$b$b;

    invoke-direct {v0}, Li8/q$b$b;-><init>()V

    return-object v0
.end method

.method private u()V
    .locals 0

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li8/q$b$b;->r()Li8/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Li8/q$b$b;->w(Lp8/e;Lp8/g;)Li8/q$b$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Li8/q$b$b;->p()Li8/q$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Li8/q$b;

    invoke-virtual {p0, p1}, Li8/q$b$b;->v(Li8/q$b;)Li8/q$b$b;

    move-result-object p1

    return-object p1
.end method

.method public p()Li8/q$b;
    .locals 2

    .prologue
    invoke-virtual {p0}, Li8/q$b$b;->q()Li8/q$b;

    move-result-object v0

    invoke-virtual {v0}, Li8/q$b;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public q()Li8/q$b;
    .locals 5

    .prologue
    new-instance v0, Li8/q$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li8/q$b;-><init>(Lp8/i$b;Li8/a;)V

    iget v1, p0, Li8/q$b$b;->D:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v2, p0, Li8/q$b$b;->E:Li8/q$b$c;

    invoke-static {v0, v2}, Li8/q$b;->r(Li8/q$b;Li8/q$b$c;)Li8/q$b$c;

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget-object v2, p0, Li8/q$b$b;->F:Li8/q;

    invoke-static {v0, v2}, Li8/q$b;->s(Li8/q$b;Li8/q;)Li8/q;

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v1, p0, Li8/q$b$b;->G:I

    invoke-static {v0, v1}, Li8/q$b;->t(Li8/q$b;I)I

    invoke-static {v0, v3}, Li8/q$b;->u(Li8/q$b;I)I

    return-object v0
.end method

.method public r()Li8/q$b$b;
    .locals 2

    invoke-static {}, Li8/q$b$b;->t()Li8/q$b$b;

    move-result-object v0

    invoke-virtual {p0}, Li8/q$b$b;->q()Li8/q$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Li8/q$b$b;->v(Li8/q$b;)Li8/q$b$b;

    move-result-object v0

    return-object v0
.end method

.method public v(Li8/q$b;)Li8/q$b$b;
    .locals 1

    .prologue
    invoke-static {}, Li8/q$b;->w()Li8/q$b;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Li8/q$b;->A()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li8/q$b;->x()Li8/q$b$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/q$b$b;->y(Li8/q$b$c;)Li8/q$b$b;

    :cond_1
    invoke-virtual {p1}, Li8/q$b;->B()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Li8/q$b;->y()Li8/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Li8/q$b$b;->x(Li8/q;)Li8/q$b$b;

    :cond_2
    invoke-virtual {p1}, Li8/q$b;->C()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Li8/q$b;->z()I

    move-result v0

    invoke-virtual {p0, v0}, Li8/q$b$b;->z(I)Li8/q$b$b;

    :cond_3
    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Li8/q$b;->v(Li8/q$b;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public w(Lp8/e;Lp8/g;)Li8/q$b$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Li8/q$b;->L:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li8/q$b;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Li8/q$b$b;->v(Li8/q$b;)Li8/q$b$b;

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

    check-cast p2, Li8/q$b;
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

    invoke-virtual {p0, v0}, Li8/q$b$b;->v(Li8/q$b;)Li8/q$b$b;

    :cond_1
    throw p1
.end method

.method public x(Li8/q;)Li8/q$b$b;
    .locals 3

    .prologue
    iget v0, p0, Li8/q$b$b;->D:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Li8/q$b$b;->F:Li8/q;

    invoke-static {}, Li8/q;->X()Li8/q;

    move-result-object v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, Li8/q$b$b;->F:Li8/q;

    invoke-static {v0}, Li8/q;->z0(Li8/q;)Li8/q$c;

    move-result-object v0

    invoke-virtual {v0, p1}, Li8/q$c;->C(Li8/q;)Li8/q$c;

    move-result-object p1

    invoke-virtual {p1}, Li8/q$c;->v()Li8/q;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Li8/q$b$b;->F:Li8/q;

    iget p1, p0, Li8/q$b$b;->D:I

    or-int/2addr p1, v1

    iput p1, p0, Li8/q$b$b;->D:I

    return-object p0
.end method

.method public y(Li8/q$b$c;)Li8/q$b$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Li8/q$b$b;->D:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Li8/q$b$b;->D:I

    iput-object p1, p0, Li8/q$b$b;->E:Li8/q$b$c;

    return-object p0
.end method

.method public z(I)Li8/q$b$b;
    .locals 1

    iget v0, p0, Li8/q$b$b;->D:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Li8/q$b$b;->D:I

    iput p1, p0, Li8/q$b$b;->G:I

    return-object p0
.end method
