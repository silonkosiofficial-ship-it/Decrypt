.class final LV/o$b;
.super LV/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:Z

.field private final d:LV/B;

.field private e:Ljava/util/Set;

.field private final f:Ljava/util/Set;

.field private final g:LV/w0;

.field final synthetic h:LV/o;


# direct methods
.method public constructor <init>(LV/o;IZZLV/B;)V
    .locals 0

    iput-object p1, p0, LV/o$b;->h:LV/o;

    invoke-direct {p0}, LV/s;-><init>()V

    iput p2, p0, LV/o$b;->a:I

    iput-boolean p3, p0, LV/o$b;->b:Z

    iput-boolean p4, p0, LV/o$b;->c:Z

    iput-object p5, p0, LV/o$b;->d:LV/B;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, LV/o$b;->f:Ljava/util/Set;

    invoke-static {}, Ld0/f;->a()Ld0/e;

    move-result-object p1

    invoke-static {}, LV/v1;->m()LV/u1;

    move-result-object p2

    invoke-static {p1, p2}, LV/v1;->h(Ljava/lang/Object;LV/u1;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LV/o$b;->g:LV/w0;

    return-void
.end method

.method private final u()LV/H0;
    .locals 1

    iget-object v0, p0, LV/o$b;->g:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/H0;

    return-object v0
.end method

.method private final v(LV/H0;)V
    .locals 1

    iget-object v0, p0, LV/o$b;->g:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(LV/G;Lx7/p;)V
    .locals 1

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->Y(LV/o;)LV/s;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LV/s;->a(LV/G;Lx7/p;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->W(LV/o;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, LV/o;->c0(LV/o;I)V

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->Y(LV/o;)LV/s;

    move-result-object v0

    invoke-virtual {v0}, LV/s;->c()Z

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LV/o$b;->b:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, LV/o$b;->c:Z

    return v0
.end method

.method public f()LV/H0;
    .locals 1

    invoke-direct {p0}, LV/o$b;->u()LV/H0;

    move-result-object v0

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, LV/o$b;->a:I

    return v0
.end method

.method public h()Lm7/i;
    .locals 1

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->Y(LV/o;)LV/s;

    move-result-object v0

    invoke-virtual {v0}, LV/s;->h()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public i()LV/B;
    .locals 1

    iget-object v0, p0, LV/o$b;->d:LV/B;

    return-object v0
.end method

.method public j(LV/o0;)V
    .locals 1

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->Y(LV/o;)LV/s;

    move-result-object v0

    invoke-virtual {v0, p1}, LV/s;->j(LV/o0;)V

    return-void
.end method

.method public k(LV/G;)V
    .locals 2

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->Y(LV/o;)LV/s;

    move-result-object v0

    iget-object v1, p0, LV/o$b;->h:LV/o;

    invoke-virtual {v1}, LV/o;->C0()LV/G;

    move-result-object v1

    invoke-virtual {v0, v1}, LV/s;->k(LV/G;)V

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->Y(LV/o;)LV/s;

    move-result-object v0

    invoke-virtual {v0, p1}, LV/s;->k(LV/G;)V

    return-void
.end method

.method public l(LV/o0;)LV/n0;
    .locals 1

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->Y(LV/o;)LV/s;

    move-result-object v0

    invoke-virtual {v0, p1}, LV/s;->l(LV/o0;)LV/n0;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/util/Set;)V
    .locals 1

    .prologue
    iget-object v0, p0, LV/o$b;->e:Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LV/o$b;->e:Ljava/util/Set;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public n(LV/n;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, LV/o;

    invoke-super {p0, v0}, LV/s;->n(LV/n;)V

    iget-object v0, p0, LV/o$b;->f:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public o(LV/G;)V
    .locals 1

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->Y(LV/o;)LV/s;

    move-result-object v0

    invoke-virtual {v0, p1}, LV/s;->o(LV/G;)V

    return-void
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->W(LV/o;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, LV/o;->c0(LV/o;I)V

    return-void
.end method

.method public q(LV/n;)V
    .locals 3

    .prologue
    iget-object v0, p0, LV/o$b;->e:Ljava/util/Set;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl"

    invoke-static {p1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    check-cast v2, LV/o;

    invoke-static {v2}, LV/o;->a0(LV/o;)LV/h1;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LV/o$b;->f:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Ly7/W;->a(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public r(LV/G;)V
    .locals 1

    iget-object v0, p0, LV/o$b;->h:LV/o;

    invoke-static {v0}, LV/o;->Y(LV/o;)LV/s;

    move-result-object v0

    invoke-virtual {v0, p1}, LV/s;->r(LV/G;)V

    return-void
.end method

.method public final s()V
    .locals 6

    .prologue
    iget-object v0, p0, LV/o$b;->f:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, LV/o$b;->e:Ljava/util/Set;

    if-eqz v0, :cond_1

    iget-object v1, p0, LV/o$b;->f:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LV/o;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    invoke-static {v2}, LV/o;->a0(LV/o;)LV/h1;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, LV/o$b;->f:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    :cond_2
    return-void
.end method

.method public final t()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LV/o$b;->f:Ljava/util/Set;

    return-object v0
.end method

.method public final w(LV/H0;)V
    .locals 0

    invoke-direct {p0, p1}, LV/o$b;->v(LV/H0;)V

    return-void
.end method
