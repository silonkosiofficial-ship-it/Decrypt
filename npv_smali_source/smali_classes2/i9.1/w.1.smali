.class public final Li9/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/h;
.implements Li9/N;
.implements Lm9/c;


# instance fields
.field private final a:Li9/v;

.field private final b:Li9/x;


# direct methods
.method public constructor <init>(Li9/v;Li9/x;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "time"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/w;->a:Li9/v;

    iput-object p2, p0, Li9/w;->b:Li9/x;

    return-void
.end method

.method public synthetic constructor <init>(Li9/v;Li9/x;ILy7/k;)V
    .locals 9

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

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
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

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
    invoke-direct {p0, p1, p2}, Li9/w;-><init>(Li9/v;Li9/x;)V

    return-void
.end method


# virtual methods
.method public A()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->A()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public C(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->C(Ljava/lang/Integer;)V

    return-void
.end method

.method public a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->b()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public c()Li9/w;
    .locals 3

    new-instance v0, Li9/w;

    iget-object v1, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v1}, Li9/v;->a()Li9/v;

    move-result-object v1

    iget-object v2, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v2}, Li9/x;->c()Li9/x;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Li9/w;-><init>(Li9/v;Li9/x;)V

    return-object v0
.end method

.method public d(Lj9/a;)V
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->d(Lj9/a;)V

    return-void
.end method

.method public bridge synthetic e()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li9/w;->c()Li9/w;

    move-result-object v0

    return-object v0
.end method

.method public f()Li9/g;
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->f()Li9/g;

    move-result-object v0

    return-object v0
.end method

.method public g(Li9/g;)V
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->g(Li9/g;)V

    return-void
.end method

.method public final h(Lh9/j;)V
    .locals 2

    const-string v0, "dateTime"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li9/w;->a:Li9/v;

    invoke-virtual {p1}, Lh9/j;->g()Lh9/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Li9/v;->b(Lh9/h;)V

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {p1}, Lh9/j;->n()Lh9/l;

    move-result-object p1

    invoke-virtual {v0, p1}, Li9/x;->h(Lh9/l;)V

    return-void
.end method

.method public i(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->i(Ljava/lang/Integer;)V

    return-void
.end method

.method public j(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->j(Ljava/lang/Integer;)V

    return-void
.end method

.method public k(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->k(Ljava/lang/Integer;)V

    return-void
.end method

.method public final l()Lh9/j;
    .locals 3

    new-instance v0, Lh9/j;

    iget-object v1, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v1}, Li9/v;->c()Lh9/h;

    move-result-object v1

    iget-object v2, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v2}, Li9/x;->k()Lh9/l;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lh9/j;-><init>(Lh9/h;Lh9/l;)V

    return-object v0
.end method

.method public m(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->m(Ljava/lang/Integer;)V

    return-void
.end method

.method public n()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->n()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public o(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->o(Ljava/lang/Integer;)V

    return-void
.end method

.method public p()Lj9/a;
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->p()Lj9/a;

    move-result-object v0

    return-object v0
.end method

.method public q()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->q()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public r()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0}, Li9/x;->r()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public s()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->s()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public t(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->t(Ljava/lang/Integer;)V

    return-void
.end method

.method public v()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->v()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public w()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v0}, Li9/v;->w()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public x(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/w;->b:Li9/x;

    invoke-virtual {v0, p1}, Li9/x;->x(Ljava/lang/Integer;)V

    return-void
.end method

.method public y(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Li9/w;->a:Li9/v;

    invoke-virtual {v0, p1}, Li9/v;->y(Ljava/lang/Integer;)V

    return-void
.end method
