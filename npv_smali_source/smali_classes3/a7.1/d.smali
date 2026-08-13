.class public abstract La7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LW6/b;

.field private final b:Ljava/util/List;

.field private c:I

.field private d:Z

.field private e:La7/i;

.field private volatile synthetic interceptors$delegate:Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>([La7/i;)V
    .locals 1

    const-string v0, "phases"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    invoke-static {v0}, LW6/d;->a(Z)LW6/b;

    move-result-object v0

    iput-object v0, p0, La7/d;->a:LW6/b;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, La7/d;->b:Ljava/util/List;

    const/4 p1, 0x0

    iput-object p1, p0, La7/d;->interceptors$delegate:Ljava/lang/Object;

    return-void
.end method

.method private final b()Ljava/util/List;
    .locals 7

    .prologue
    iget v0, p0, La7/d;->c:I

    if-nez v0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, La7/d;->m(Ljava/util/List;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v1, p0, La7/d;->b:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_4

    invoke-static {v1}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    if-ltz v0, :cond_4

    move v4, v3

    :goto_0
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, La7/c;

    if-eqz v6, :cond_1

    check-cast v5, La7/c;

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, La7/c;->h()Z

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v5}, La7/c;->i()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v5}, La7/d;->p(La7/c;)V

    return-object v0

    :cond_3
    :goto_2
    if-eq v4, v0, :cond_4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Lj7/v;->o(Ljava/util/List;)I

    move-result v4

    if-ltz v4, :cond_7

    :goto_3
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, La7/c;

    if-eqz v6, :cond_5

    check-cast v5, La7/c;

    goto :goto_4

    :cond_5
    move-object v5, v2

    :goto_4
    if-nez v5, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v5, v0}, La7/c;->b(Ljava/util/List;)V

    :goto_5
    if-eq v3, v4, :cond_7

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_7
    invoke-direct {p0, v0}, La7/d;->m(Ljava/util/List;)V

    return-object v0
.end method

.method private final c(Ljava/lang/Object;Ljava/lang/Object;Lm7/i;)La7/e;
    .locals 2

    invoke-direct {p0}, La7/d;->q()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, La7/d;->g()Z

    move-result v1

    invoke-static {p1, v0, p2, p3, v1}, La7/f;->a(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lm7/i;Z)La7/e;

    move-result-object p1

    return-object p1
.end method

.method private final e(La7/i;)La7/c;
    .locals 5

    .prologue
    iget-object v0, p0, La7/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p1, :cond_0

    new-instance v1, La7/c;

    sget-object v3, La7/j$c;->a:La7/j$c;

    invoke-direct {v1, p1, v3}, La7/c;-><init>(La7/i;La7/j;)V

    invoke-interface {v0, v2, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    instance-of v4, v3, La7/c;

    if-eqz v4, :cond_1

    check-cast v3, La7/c;

    invoke-virtual {v3}, La7/c;->e()La7/i;

    move-result-object v4

    if-ne v4, p1, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private final f(La7/i;)I
    .locals 5

    .prologue
    iget-object v0, p0, La7/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p1, :cond_1

    instance-of v4, v3, La7/c;

    if-eqz v4, :cond_0

    check-cast v3, La7/c;

    invoke-virtual {v3}, La7/c;->e()La7/i;

    move-result-object v3

    if-ne v3, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v2

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method private final h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, La7/d;->interceptors$delegate:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final i(La7/i;)Z
    .locals 6

    .prologue
    iget-object v0, p0, La7/d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eq v4, p1, :cond_1

    instance-of v5, v4, La7/c;

    if-eqz v5, :cond_0

    check-cast v4, La7/c;

    invoke-virtual {v4}, La7/c;->e()La7/i;

    move-result-object v4

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method

.method private final m(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1}, La7/d;->o(Ljava/util/List;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, La7/d;->d:Z

    const/4 p1, 0x0

    iput-object p1, p0, La7/d;->e:La7/i;

    return-void
.end method

.method private final n()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La7/d;->o(Ljava/util/List;)V

    const/4 v1, 0x0

    iput-boolean v1, p0, La7/d;->d:Z

    iput-object v0, p0, La7/d;->e:La7/i;

    return-void
.end method

.method private final o(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, La7/d;->interceptors$delegate:Ljava/lang/Object;

    return-void
.end method

.method private final p(La7/c;)V
    .locals 1

    invoke-virtual {p1}, La7/c;->i()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, La7/d;->o(Ljava/util/List;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, La7/d;->d:Z

    invoke-virtual {p1}, La7/c;->e()La7/i;

    move-result-object p1

    iput-object p1, p0, La7/d;->e:La7/i;

    return-void
.end method

.method private final q()Ljava/util/List;
    .locals 1

    .prologue
    invoke-direct {p0}, La7/d;->h()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0}, La7/d;->b()Ljava/util/List;

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, La7/d;->d:Z

    invoke-direct {p0}, La7/d;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final r(La7/i;Lx7/q;)Z
    .locals 5

    .prologue
    invoke-direct {p0}, La7/d;->h()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, La7/d;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_5

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v1, p0, La7/d;->d:Z

    if-nez v1, :cond_5

    invoke-static {v0}, Ly7/W;->n(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, La7/d;->e:La7/i;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return v3

    :cond_2
    iget-object v1, p0, La7/d;->b:Ljava/util/List;

    invoke-static {v1}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-direct {p0, p1}, La7/d;->f(La7/i;)I

    move-result v1

    iget-object v4, p0, La7/d;->b:Ljava/util/List;

    invoke-static {v4}, Lj7/v;->o(Ljava/util/List;)I

    move-result v4

    if-ne v1, v4, :cond_3

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_0
    invoke-direct {p0, p1}, La7/d;->e(La7/i;)La7/c;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, La7/c;->a(Lx7/q;)V

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return v3

    :cond_5
    :goto_1
    return v2
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p3}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, La7/d;->c(Ljava/lang/Object;Ljava/lang/Object;Lm7/i;)La7/e;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, La7/e;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract g()Z
.end method

.method public final j(La7/i;La7/i;)V
    .locals 6

    .prologue
    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phase"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, La7/d;->i(La7/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, La7/d;->f(La7/i;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_7

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, La7/d;->b:Ljava/util/List;

    invoke-static {v2}, Lj7/v;->o(Ljava/util/List;)I

    move-result v2

    if-gt v1, v2, :cond_6

    :goto_0
    iget-object v3, p0, La7/d;->b:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, La7/c;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    check-cast v3, La7/c;

    goto :goto_1

    :cond_1
    move-object v3, v5

    :goto_1
    if-eqz v3, :cond_6

    invoke-virtual {v3}, La7/c;->f()La7/j;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_3

    :cond_2
    instance-of v4, v3, La7/j$a;

    if-eqz v4, :cond_3

    move-object v5, v3

    check-cast v5, La7/j$a;

    :cond_3
    if-eqz v5, :cond_5

    invoke-virtual {v5}, La7/j$a;->a()La7/i;

    move-result-object v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v3, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    move v0, v1

    :cond_5
    :goto_2
    if-eq v1, v2, :cond_6

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    :goto_3
    iget-object v1, p0, La7/d;->b:Ljava/util/List;

    add-int/lit8 v0, v0, 0x1

    new-instance v2, La7/c;

    new-instance v3, La7/j$a;

    invoke-direct {v3, p1}, La7/j$a;-><init>(La7/i;)V

    invoke-direct {v2, p2, v3}, La7/c;-><init>(La7/i;La7/j;)V

    invoke-interface {v1, v0, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void

    :cond_7
    new-instance p2, La7/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Phase "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was not registered for this pipeline"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, La7/b;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final k(La7/i;La7/i;)V
    .locals 4

    .prologue
    const-string v0, "reference"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "phase"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, La7/d;->i(La7/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, La7/d;->f(La7/i;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, La7/d;->b:Ljava/util/List;

    new-instance v2, La7/c;

    new-instance v3, La7/j$b;

    invoke-direct {v3, p1}, La7/j$b;-><init>(La7/i;)V

    invoke-direct {v2, p2, v3}, La7/c;-><init>(La7/i;La7/j;)V

    invoke-interface {v1, v0, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void

    :cond_1
    new-instance p2, La7/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Phase "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was not registered for this pipeline"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, La7/b;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final l(La7/i;Lx7/q;)V
    .locals 2

    .prologue
    const-string v0, "phase"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La7/d;->e(La7/i;)La7/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, p2}, La7/d;->r(La7/i;Lx7/q;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, La7/d;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La7/d;->c:I

    return-void

    :cond_0
    invoke-virtual {v0, p2}, La7/c;->a(Lx7/q;)V

    iget p1, p0, La7/d;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La7/d;->c:I

    invoke-direct {p0}, La7/d;->n()V

    invoke-virtual {p0}, La7/d;->a()V

    return-void

    :cond_1
    new-instance p2, La7/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Phase "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " was not registered for this pipeline"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, La7/b;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
