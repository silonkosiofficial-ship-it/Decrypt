.class public final La7/a;
.super La7/e;
.source "SourceFile"


# instance fields
.field private final D:Ljava/util/List;

.field private final E:Lm7/i;

.field private F:Ljava/lang/Object;

.field private G:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lm7/i;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interceptors"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subject"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, La7/e;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, La7/a;->D:Ljava/util/List;

    iput-object p4, p0, La7/a;->E:Lm7/i;

    iput-object p3, p0, La7/a;->F:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic f(La7/a;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, La7/a;->h(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p1, La7/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, La7/a$a;

    iget v1, v0, La7/a$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La7/a$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, La7/a$a;

    invoke-direct {v0, p0, p1}, La7/a$a;-><init>(La7/a;Lm7/e;)V

    :goto_0
    iget-object p1, v0, La7/a$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, La7/a$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v2, v0, La7/a$a;->F:Ljava/lang/Object;

    check-cast v2, La7/a;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object v2, p0

    :cond_3
    :goto_1
    iget p1, v2, La7/a;->G:I

    const/4 v4, -0x1

    if-ne p1, v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v4, v2, La7/a;->D:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-lt p1, v5, :cond_5

    invoke-virtual {v2}, La7/a;->g()V

    :goto_2
    invoke-virtual {v2}, La7/a;->c()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx7/q;

    add-int/lit8 p1, p1, 0x1

    iput p1, v2, La7/a;->G:I

    invoke-virtual {v2}, La7/a;->c()Ljava/lang/Object;

    move-result-object p1

    iput-object v2, v0, La7/a$a;->F:Ljava/lang/Object;

    iput v3, v0, La7/a$a;->I:I

    invoke-interface {v4, v2, p1, v0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La7/a;->G:I

    invoke-virtual {p0, p1}, La7/a;->i(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, La7/a;->d(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La7/a;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public d(Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget v0, p0, La7/a;->G:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, La7/a;->c()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, La7/a;->D:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, La7/a;->g()V

    invoke-virtual {p0}, La7/a;->c()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-direct {p0, p1}, La7/a;->h(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, La7/a;->i(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, La7/a;->d(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, La7/a;->G:I

    return-void
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, La7/a;->E:Lm7/i;

    return-object v0
.end method

.method public i(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, La7/a;->F:Ljava/lang/Object;

    return-void
.end method
