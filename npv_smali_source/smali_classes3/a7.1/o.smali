.class public final La7/o;
.super La7/e;
.source "SourceFile"


# instance fields
.field private final D:Ljava/util/List;

.field private final E:Lm7/e;

.field private F:Ljava/lang/Object;

.field private final G:[Lm7/e;

.field private H:I

.field private I:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V
    .locals 1

    const-string v0, "initial"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blocks"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, La7/e;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, La7/o;->D:Ljava/util/List;

    new-instance p2, La7/o$a;

    invoke-direct {p2, p0}, La7/o$a;-><init>(La7/o;)V

    iput-object p2, p0, La7/o;->E:Lm7/e;

    iput-object p1, p0, La7/o;->F:Ljava/lang/Object;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lm7/e;

    iput-object p1, p0, La7/o;->G:[Lm7/e;

    const/4 p1, -0x1

    iput p1, p0, La7/o;->H:I

    return-void
.end method

.method public static final synthetic f(La7/o;)I
    .locals 0

    iget p0, p0, La7/o;->H:I

    return p0
.end method

.method public static final synthetic g(La7/o;)[Lm7/e;
    .locals 0

    iget-object p0, p0, La7/o;->G:[Lm7/e;

    return-object p0
.end method

.method public static final synthetic h(La7/o;Z)Z
    .locals 0

    invoke-direct {p0, p1}, La7/o;->l(Z)Z

    move-result p0

    return p0
.end method

.method public static final synthetic i(La7/o;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, La7/o;->m(Ljava/lang/Object;)V

    return-void
.end method

.method private final k()V
    .locals 3

    .prologue
    iget v0, p0, La7/o;->H:I

    if-ltz v0, :cond_0

    iget-object v1, p0, La7/o;->G:[Lm7/e;

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, La7/o;->H:I

    const/4 v2, 0x0

    aput-object v2, v1, v0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No more continuations to resume"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final l(Z)Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    :cond_0
    iget v1, p0, La7/o;->I:I

    iget-object v2, p0, La7/o;->D:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    if-nez p1, :cond_1

    sget-object p1, Li7/w;->D:Li7/w$a;

    invoke-virtual {p0}, La7/o;->c()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, La7/o;->m(Ljava/lang/Object;)V

    return v3

    :cond_1
    return v0

    :cond_2
    add-int/lit8 v2, v1, 0x1

    iput v2, p0, La7/o;->I:I

    iget-object v2, p0, La7/o;->D:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/q;

    :try_start_0
    invoke-virtual {p0}, La7/o;->c()Ljava/lang/Object;

    move-result-object v2

    iget-object v4, p0, La7/o;->E:Lm7/e;

    invoke-static {v1, p0, v2, v4}, La7/h;->a(Lx7/q;La7/e;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v2, :cond_0

    return v3

    :catchall_0
    move-exception p1

    sget-object v0, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0
.end method

.method private final m(Ljava/lang/Object;)V
    .locals 4

    .prologue
    iget v0, p0, La7/o;->H:I

    if-ltz v0, :cond_1

    iget-object v1, p0, La7/o;->G:[Lm7/e;

    aget-object v0, v1, v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, La7/o;->G:[Lm7/e;

    iget v2, p0, La7/o;->H:I

    add-int/lit8 v3, v2, -0x1

    iput v3, p0, La7/o;->H:I

    const/4 v3, 0x0

    aput-object v3, v1, v2

    invoke-static {p1}, Li7/w;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-static {p1}, Li7/w;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1, v0}, La7/l;->a(Ljava/lang/Throwable;Lm7/e;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No more continuations to resume"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    const/4 v0, 0x0

    iput v0, p0, La7/o;->I:I

    iget-object v0, p0, La7/o;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, La7/o;->n(Ljava/lang/Object;)V

    iget p1, p0, La7/o;->H:I

    if-gez p1, :cond_1

    invoke-virtual {p0, p2}, La7/o;->d(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already started"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La7/o;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public d(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget v0, p0, La7/o;->I:I

    iget-object v1, p0, La7/o;->D:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    :goto_0
    invoke-virtual {p0}, La7/o;->c()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Ln7/b;->d(Lm7/e;)Lm7/e;

    move-result-object v0

    invoke-virtual {p0, v0}, La7/o;->j(Lm7/e;)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, La7/o;->l(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, La7/o;->k()V

    goto :goto_0

    :cond_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    invoke-static {p1}, Lo7/h;->c(Lm7/e;)V

    :cond_2
    return-object v0
.end method

.method public e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, La7/o;->n(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, La7/o;->d(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, La7/o;->E:Lm7/e;

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    return-object v0
.end method

.method public final j(Lm7/e;)V
    .locals 2

    const-string v0, "continuation"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, La7/o;->G:[Lm7/e;

    iget v1, p0, La7/o;->H:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La7/o;->H:I

    aput-object p1, v0, v1

    return-void
.end method

.method public n(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, La7/o;->F:Ljava/lang/Object;

    return-void
.end method
