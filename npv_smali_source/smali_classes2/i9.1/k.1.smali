.class public final Li9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/h;
.implements Li9/N;
.implements Li9/V;
.implements Lm9/c;


# instance fields
.field private final a:Li9/v;

.field private final b:Li9/x;

.field private final c:Li9/y;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Li9/v;Li9/x;Li9/y;Ljava/lang/String;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "time"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offset"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/k;->a:Li9/v;

    iput-object p2, p0, Li9/k;->b:Li9/x;

    iput-object p3, p0, Li9/k;->c:Li9/y;

    iput-object p4, p0, Li9/k;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Li9/v;Li9/x;Li9/y;Ljava/lang/String;ILy7/k;)V
    .locals 9

    .prologue
    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    new-instance p1, Li9/v;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Li9/v;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    new-instance p2, Li9/x;

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Li9/x;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Li9/g;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    new-instance p3, Li9/y;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v6}, Li9/y;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILy7/k;)V

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Li9/k;-><init>(Li9/v;Li9/x;Li9/y;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->A()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public B(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v0, p1}, Li9/y;->B(Ljava/lang/Integer;)V

    return-void
.end method

.method public C(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->C(Ljava/lang/Integer;)V

    return-void
.end method

.method public D(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v0, p1}, Li9/y;->D(Ljava/lang/Integer;)V

    return-void
.end method

.method public E(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v0, p1}, Li9/y;->E(Ljava/lang/Integer;)V

    return-void
.end method

.method public F()Li9/k;
    .locals 5

    new-instance v0, Li9/k;

    iget-object v1, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v1}, Li9/v;->a()Li9/v;

    move-result-object v1

    iget-object v2, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v2}, Li9/x;->c()Li9/x;

    move-result-object v2

    iget-object v3, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v3}, Li9/y;->a()Li9/y;

    move-result-object v3

    iget-object v4, p0, Li9/k;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Li9/k;-><init>(Li9/v;Li9/x;Li9/y;Ljava/lang/String;)V

    return-object v0
.end method

.method public final G()Li9/v;
    .locals 1

    iget-object v0, p0, Li9/k;->a:Li9/v;

    return-object v0
.end method

.method public final H()Li9/y;
    .locals 1

    iget-object v0, p0, Li9/k;->c:Li9/y;

    return-object v0
.end method

.method public final I()Li9/x;
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    return-object v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/k;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final K(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Li9/k;->d:Ljava/lang/String;

    return-void
.end method

.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->b()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v0}, Li9/y;->c()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lj9/a;)V
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->d(Lj9/a;)V

    return-void
.end method

.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li9/k;->F()Li9/k;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Li9/k;

    if-eqz v0, :cond_0

    check-cast p1, Li9/k;

    iget-object v0, p1, Li9/k;->a:Li9/v;

    iget-object v1, p0, Li9/k;->a:Li9/v;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Li9/k;->b:Li9/x;

    iget-object v1, p0, Li9/k;->b:Li9/x;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Li9/k;->c:Li9/y;

    iget-object v1, p0, Li9/k;->c:Li9/y;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Li9/k;->d:Ljava/lang/String;

    iget-object v0, p0, Li9/k;->d:Ljava/lang/String;

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Li9/g;
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->f()Li9/g;

    move-result-object v0

    return-object v0
.end method

.method public g(Li9/g;)V
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->g(Li9/g;)V

    return-void
.end method

.method public h()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v0}, Li9/y;->h()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    iget-object v0, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->hashCode()I

    move-result v0

    iget-object v1, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v1}, Li9/x;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v1}, Li9/y;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Li9/k;->d:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public i(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->i(Ljava/lang/Integer;)V

    return-void
.end method

.method public j(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->j(Ljava/lang/Integer;)V

    return-void
.end method

.method public k(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->k(Ljava/lang/Integer;)V

    return-void
.end method

.method public l()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v0}, Li9/y;->l()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public m(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->m(Ljava/lang/Integer;)V

    return-void
.end method

.method public n()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->n()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public o(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->o(Ljava/lang/Integer;)V

    return-void
.end method

.method public p()Lj9/a;
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->p()Lj9/a;

    move-result-object v0

    return-object v0
.end method

.method public q()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->q()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public r()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->r()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public s()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->s()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public t(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->t(Ljava/lang/Integer;)V

    return-void
.end method

.method public u()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v0}, Li9/y;->u()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public v()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->v()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->w()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public x(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->x(Ljava/lang/Integer;)V

    return-void
.end method

.method public y(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/k;->a:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->y(Ljava/lang/Integer;)V

    return-void
.end method

.method public z(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Li9/k;->c:Li9/y;

    invoke-virtual {v0, p1}, Li9/y;->z(Ljava/lang/Boolean;)V

    return-void
.end method
