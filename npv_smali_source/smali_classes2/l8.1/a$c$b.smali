.class public final Ll8/a$c$b;
.super Lp8/i$b;
.source "SourceFile"

# interfaces
.implements Lp8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private D:I

.field private E:I

.field private F:I


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lp8/i$b;-><init>()V

    invoke-direct {p0}, Ll8/a$c$b;->u()V

    return-void
.end method

.method static synthetic n()Ll8/a$c$b;
    .locals 1

    invoke-static {}, Ll8/a$c$b;->t()Ll8/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method private static t()Ll8/a$c$b;
    .locals 1

    new-instance v0, Ll8/a$c$b;

    invoke-direct {v0}, Ll8/a$c$b;-><init>()V

    return-object v0
.end method

.method private u()V
    .locals 0

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll8/a$c$b;->r()Ll8/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g0(Lp8/e;Lp8/g;)Lp8/p$a;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ll8/a$c$b;->w(Lp8/e;Lp8/g;)Ll8/a$c$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i()Lp8/p;
    .locals 1

    invoke-virtual {p0}, Ll8/a$c$b;->p()Ll8/a$c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic l(Lp8/i;)Lp8/i$b;
    .locals 0

    check-cast p1, Ll8/a$c;

    invoke-virtual {p0, p1}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    move-result-object p1

    return-object p1
.end method

.method public p()Ll8/a$c;
    .locals 2

    .prologue
    invoke-virtual {p0}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object v0

    invoke-virtual {v0}, Ll8/a$c;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lp8/a$a;->j(Lp8/p;)Lp8/v;

    move-result-object v0

    throw v0
.end method

.method public q()Ll8/a$c;
    .locals 4

    .prologue
    new-instance v0, Ll8/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll8/a$c;-><init>(Lp8/i$b;Ll8/a$a;)V

    iget v1, p0, Ll8/a$c$b;->D:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Ll8/a$c$b;->E:I

    invoke-static {v0, v2}, Ll8/a$c;->r(Ll8/a$c;I)I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v1, p0, Ll8/a$c$b;->F:I

    invoke-static {v0, v1}, Ll8/a$c;->s(Ll8/a$c;I)I

    invoke-static {v0, v3}, Ll8/a$c;->t(Ll8/a$c;I)I

    return-object v0
.end method

.method public r()Ll8/a$c$b;
    .locals 2

    invoke-static {}, Ll8/a$c$b;->t()Ll8/a$c$b;

    move-result-object v0

    invoke-virtual {p0}, Ll8/a$c$b;->q()Ll8/a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    move-result-object v0

    return-object v0
.end method

.method public v(Ll8/a$c;)Ll8/a$c$b;
    .locals 1

    .prologue
    invoke-static {}, Ll8/a$c;->v()Ll8/a$c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p1}, Ll8/a$c;->z()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll8/a$c;->x()I

    move-result v0

    invoke-virtual {p0, v0}, Ll8/a$c$b;->y(I)Ll8/a$c$b;

    :cond_1
    invoke-virtual {p1}, Ll8/a$c;->y()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll8/a$c;->w()I

    move-result v0

    invoke-virtual {p0, v0}, Ll8/a$c$b;->x(I)Ll8/a$c$b;

    :cond_2
    invoke-virtual {p0}, Lp8/i$b;->k()Lp8/d;

    move-result-object v0

    invoke-static {p1}, Ll8/a$c;->u(Ll8/a$c;)Lp8/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp8/d;->e(Lp8/d;)Lp8/d;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp8/i$b;->m(Lp8/d;)Lp8/i$b;

    return-object p0
.end method

.method public w(Lp8/e;Lp8/g;)Ll8/a$c$b;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Ll8/a$c;->K:Lp8/r;

    invoke-interface {v1, p1, p2}, Lp8/r;->a(Lp8/e;Lp8/g;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll8/a$c;
    :try_end_0
    .catch Lp8/k; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

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

    check-cast p2, Ll8/a$c;
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

    invoke-virtual {p0, v0}, Ll8/a$c$b;->v(Ll8/a$c;)Ll8/a$c$b;

    :cond_1
    throw p1
.end method

.method public x(I)Ll8/a$c$b;
    .locals 1

    iget v0, p0, Ll8/a$c$b;->D:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll8/a$c$b;->D:I

    iput p1, p0, Ll8/a$c$b;->F:I

    return-object p0
.end method

.method public y(I)Ll8/a$c$b;
    .locals 1

    iget v0, p0, Ll8/a$c$b;->D:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll8/a$c$b;->D:I

    iput p1, p0, Ll8/a$c$b;->E:I

    return-object p0
.end method
