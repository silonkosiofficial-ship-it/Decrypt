.class public final LV/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LV/h1;

.field private final b:[I

.field private final c:I

.field private final d:[Ljava/lang/Object;

.field private final e:I

.field private f:Ljava/util/HashMap;

.field private g:Z

.field private h:I

.field private i:I

.field private j:I

.field private final k:LV/X;

.field private l:I

.field private m:I

.field private n:I

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LV/h1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV/g1;->a:LV/h1;

    invoke-virtual {p1}, LV/h1;->M()[I

    move-result-object v0

    iput-object v0, p0, LV/g1;->b:[I

    invoke-virtual {p1}, LV/h1;->N()I

    move-result v0

    iput v0, p0, LV/g1;->c:I

    invoke-virtual {p1}, LV/h1;->O()[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, LV/g1;->d:[Ljava/lang/Object;

    invoke-virtual {p1}, LV/h1;->P()I

    move-result p1

    iput p1, p0, LV/g1;->e:I

    iput v0, p0, LV/g1;->i:I

    const/4 p1, -0x1

    iput p1, p0, LV/g1;->j:I

    new-instance p1, LV/X;

    invoke-direct {p1}, LV/X;-><init>()V

    iput-object p1, p0, LV/g1;->k:LV/X;

    return-void
.end method

.method private final M([II)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {p1, p2}, LV/j1;->m([II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/g1;->d:[Ljava/lang/Object;

    invoke-static {p1, p2}, LV/j1;->q([II)I

    move-result p1

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    sget-object p1, LV/n;->a:LV/n$a;

    invoke-virtual {p1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final O([II)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {p1, p2}, LV/j1;->k([II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/g1;->d:[Ljava/lang/Object;

    invoke-static {p1, p2}, LV/j1;->r([II)I

    move-result p1

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final b([II)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {p1, p2}, LV/j1;->i([II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/g1;->d:[Ljava/lang/Object;

    invoke-static {p1, p2}, LV/j1;->a([II)I

    move-result p1

    aget-object p1, v0, p1

    goto :goto_0

    :cond_0
    sget-object p1, LV/n;->a:LV/n$a;

    invoke-virtual {p1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final A(I)Ljava/lang/Object;
    .locals 1

    iget v0, p0, LV/g1;->h:I

    invoke-virtual {p0, v0, p1}, LV/g1;->B(II)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final B(II)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->u([II)I

    move-result v0

    add-int/lit8 p1, p1, 0x1

    iget v1, p0, LV/g1;->c:I

    if-ge p1, v1, :cond_0

    iget-object v1, p0, LV/g1;->b:[I

    invoke-static {v1, p1}, LV/j1;->e([II)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, p0, LV/g1;->e:I

    :goto_0
    add-int/2addr v0, p2

    if-ge v0, p1, :cond_1

    iget-object p1, p0, LV/g1;->d:[Ljava/lang/Object;

    aget-object p1, p1, v0

    goto :goto_1

    :cond_1
    sget-object p1, LV/n;->a:LV/n$a;

    invoke-virtual {p1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final C(I)I
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->n([II)I

    move-result p1

    return p1
.end method

.method public final D(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-direct {p0, v0, p1}, LV/g1;->O([II)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final E(I)I
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->h([II)I

    move-result p1

    return p1
.end method

.method public final F(I)Z
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->j([II)Z

    move-result p1

    return p1
.end method

.method public final G(I)Z
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->k([II)Z

    move-result p1

    return p1
.end method

.method public final H()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, LV/g1;->t()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, LV/g1;->h:I

    iget v1, p0, LV/g1;->i:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final I()Z
    .locals 2

    iget-object v0, p0, LV/g1;->b:[I

    iget v1, p0, LV/g1;->h:I

    invoke-static {v0, v1}, LV/j1;->m([II)Z

    move-result v0

    return v0
.end method

.method public final J(I)Z
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->m([II)Z

    move-result p1

    return p1
.end method

.method public final K()Ljava/lang/Object;
    .locals 3

    .prologue
    iget v0, p0, LV/g1;->l:I

    if-gtz v0, :cond_1

    iget v0, p0, LV/g1;->m:I

    iget v1, p0, LV/g1;->n:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, LV/g1;->o:Z

    iget-object v1, p0, LV/g1;->d:[Ljava/lang/Object;

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, LV/g1;->m:I

    aget-object v0, v1, v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LV/g1;->o:Z

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final L(I)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->m([II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LV/g1;->b:[I

    invoke-direct {p0, v0, p1}, LV/g1;->M([II)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final N(I)I
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->p([II)I

    move-result p1

    return p1
.end method

.method public final P(I)I
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->s([II)I

    move-result p1

    return p1
.end method

.method public final Q(I)V
    .locals 2

    .prologue
    iget v0, p0, LV/g1;->l:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Cannot reposition while in an empty region"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    iput p1, p0, LV/g1;->h:I

    iget v0, p0, LV/g1;->c:I

    if-ge p1, v0, :cond_2

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->s([II)I

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, -0x1

    :goto_1
    iput p1, p0, LV/g1;->j:I

    if-gez p1, :cond_3

    iget p1, p0, LV/g1;->c:I

    :goto_2
    iput p1, p0, LV/g1;->i:I

    goto :goto_3

    :cond_3
    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->h([II)I

    move-result v0

    add-int/2addr p1, v0

    goto :goto_2

    :goto_3
    iput v1, p0, LV/g1;->m:I

    iput v1, p0, LV/g1;->n:I

    return-void
.end method

.method public final R(I)V
    .locals 5

    .prologue
    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->h([II)I

    move-result v0

    add-int/2addr v0, p1

    iget v1, p0, LV/g1;->h:I

    const/4 v2, 0x0

    if-lt v1, p1, :cond_0

    if-gt v1, v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-nez v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Index "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " is not a parent of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    iput p1, p0, LV/g1;->j:I

    iput v0, p0, LV/g1;->i:I

    iput v2, p0, LV/g1;->m:I

    iput v2, p0, LV/g1;->n:I

    return-void
.end method

.method public final S()I
    .locals 3

    .prologue
    iget v0, p0, LV/g1;->l:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Cannot skip while in an empty region"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LV/g1;->b:[I

    iget v2, p0, LV/g1;->h:I

    invoke-static {v0, v2}, LV/j1;->m([II)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, LV/g1;->b:[I

    iget v1, p0, LV/g1;->h:I

    invoke-static {v0, v1}, LV/j1;->p([II)I

    move-result v1

    :goto_1
    iget v0, p0, LV/g1;->h:I

    iget-object v2, p0, LV/g1;->b:[I

    invoke-static {v2, v0}, LV/j1;->h([II)I

    move-result v2

    add-int/2addr v0, v2

    iput v0, p0, LV/g1;->h:I

    return v1
.end method

.method public final T()V
    .locals 2

    .prologue
    iget v0, p0, LV/g1;->l:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Cannot skip the enclosing group while in an empty region"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    iget v0, p0, LV/g1;->i:I

    iput v0, p0, LV/g1;->h:I

    iput v1, p0, LV/g1;->m:I

    iput v1, p0, LV/g1;->n:I

    return-void
.end method

.method public final U()V
    .locals 5

    .prologue
    iget v0, p0, LV/g1;->l:I

    if-gtz v0, :cond_5

    iget v0, p0, LV/g1;->j:I

    iget v1, p0, LV/g1;->h:I

    iget-object v2, p0, LV/g1;->b:[I

    invoke-static {v2, v1}, LV/j1;->s([II)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v0, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    const-string v2, "Invalid slot table detected"

    invoke-static {v2}, LV/I0;->a(Ljava/lang/String;)V

    :cond_1
    iget-object v2, p0, LV/g1;->f:Ljava/util/HashMap;

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0}, LV/g1;->a(I)LV/d;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/W;

    :cond_2
    iget-object v0, p0, LV/g1;->k:LV/X;

    iget v2, p0, LV/g1;->m:I

    iget v4, p0, LV/g1;->n:I

    if-nez v2, :cond_3

    if-nez v4, :cond_3

    const/4 v2, -0x1

    :cond_3
    invoke-virtual {v0, v2}, LV/X;->j(I)V

    iput v1, p0, LV/g1;->j:I

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, v1}, LV/j1;->h([II)I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, LV/g1;->i:I

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, LV/g1;->h:I

    iget-object v2, p0, LV/g1;->b:[I

    invoke-static {v2, v1}, LV/j1;->u([II)I

    move-result v2

    iput v2, p0, LV/g1;->m:I

    iget v2, p0, LV/g1;->c:I

    sub-int/2addr v2, v3

    if-lt v1, v2, :cond_4

    iget v0, p0, LV/g1;->e:I

    goto :goto_1

    :cond_4
    iget-object v1, p0, LV/g1;->b:[I

    invoke-static {v1, v0}, LV/j1;->e([II)I

    move-result v0

    :goto_1
    iput v0, p0, LV/g1;->n:I

    :cond_5
    return-void
.end method

.method public final V()V
    .locals 2

    .prologue
    iget v0, p0, LV/g1;->l:I

    if-gtz v0, :cond_1

    iget-object v0, p0, LV/g1;->b:[I

    iget v1, p0, LV/g1;->h:I

    invoke-static {v0, v1}, LV/j1;->m([II)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Expected a node group"

    invoke-static {v0}, LV/I0;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LV/g1;->U()V

    :cond_1
    return-void
.end method

.method public final a(I)LV/d;
    .locals 3

    .prologue
    iget-object v0, p0, LV/g1;->a:LV/h1;

    invoke-virtual {v0}, LV/h1;->D()Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, LV/g1;->c:I

    invoke-static {v0, p1, v1}, LV/j1;->t(Ljava/util/ArrayList;II)I

    move-result v1

    if-gez v1, :cond_0

    new-instance v2, LV/d;

    invoke-direct {v2, p1}, LV/d;-><init>(I)V

    add-int/lit8 v1, v1, 0x1

    neg-int p1, v1

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, LV/d;

    :goto_0
    return-object v2
.end method

.method public final c()V
    .locals 1

    iget v0, p0, LV/g1;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LV/g1;->l:I

    return-void
.end method

.method public final d()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LV/g1;->g:Z

    iget-object v0, p0, LV/g1;->a:LV/h1;

    iget-object v1, p0, LV/g1;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p0, v1}, LV/h1;->f(LV/g1;Ljava/util/HashMap;)V

    return-void
.end method

.method public final e(I)Z
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-static {v0, p1}, LV/j1;->c([II)Z

    move-result p1

    return p1
.end method

.method public final f()V
    .locals 1

    .prologue
    iget v0, p0, LV/g1;->l:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Unbalanced begin/end empty"

    invoke-static {v0}, LV/I0;->a(Ljava/lang/String;)V

    :cond_1
    iget v0, p0, LV/g1;->l:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LV/g1;->l:I

    return-void
.end method

.method public final g()V
    .locals 4

    .prologue
    iget v0, p0, LV/g1;->l:I

    if-nez v0, :cond_5

    iget v0, p0, LV/g1;->h:I

    iget v1, p0, LV/g1;->i:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "endGroup() not called at the end of a group"

    invoke-static {v0}, LV/q;->r(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LV/g1;->b:[I

    iget v1, p0, LV/g1;->j:I

    invoke-static {v0, v1}, LV/j1;->s([II)I

    move-result v0

    iput v0, p0, LV/g1;->j:I

    if-gez v0, :cond_2

    iget v1, p0, LV/g1;->c:I

    goto :goto_1

    :cond_2
    iget-object v1, p0, LV/g1;->b:[I

    invoke-static {v1, v0}, LV/j1;->h([II)I

    move-result v1

    add-int/2addr v1, v0

    :goto_1
    iput v1, p0, LV/g1;->i:I

    iget-object v1, p0, LV/g1;->k:LV/X;

    invoke-virtual {v1}, LV/X;->i()I

    move-result v1

    if-gez v1, :cond_3

    iput v2, p0, LV/g1;->m:I

    iput v2, p0, LV/g1;->n:I

    goto :goto_3

    :cond_3
    iput v1, p0, LV/g1;->m:I

    iget v1, p0, LV/g1;->c:I

    sub-int/2addr v1, v3

    if-lt v0, v1, :cond_4

    iget v0, p0, LV/g1;->e:I

    goto :goto_2

    :cond_4
    iget-object v1, p0, LV/g1;->b:[I

    add-int/2addr v0, v3

    invoke-static {v1, v0}, LV/j1;->e([II)I

    move-result v0

    :goto_2
    iput v0, p0, LV/g1;->n:I

    :cond_5
    :goto_3
    return-void
.end method

.method public final h()Ljava/util/List;
    .locals 10

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget v1, p0, LV/g1;->l:I

    if-lez v1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, LV/g1;->h:I

    const/4 v2, 0x0

    move v8, v2

    :goto_0
    iget v2, p0, LV/g1;->i:I

    if-ge v1, v2, :cond_2

    new-instance v2, LV/c0;

    iget-object v3, p0, LV/g1;->b:[I

    invoke-static {v3, v1}, LV/j1;->n([II)I

    move-result v4

    iget-object v3, p0, LV/g1;->b:[I

    invoke-direct {p0, v3, v1}, LV/g1;->O([II)Ljava/lang/Object;

    move-result-object v5

    iget-object v3, p0, LV/g1;->b:[I

    invoke-static {v3, v1}, LV/j1;->m([II)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    :goto_1
    move v7, v3

    goto :goto_2

    :cond_1
    iget-object v3, p0, LV/g1;->b:[I

    invoke-static {v3, v1}, LV/j1;->p([II)I

    move-result v3

    goto :goto_1

    :goto_2
    add-int/lit8 v9, v8, 0x1

    move-object v3, v2

    move v6, v1

    invoke-direct/range {v3 .. v8}, LV/c0;-><init>(ILjava/lang/Object;III)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, LV/g1;->b:[I

    invoke-static {v2, v1}, LV/j1;->h([II)I

    move-result v2

    add-int/2addr v1, v2

    move v8, v9

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, LV/g1;->g:Z

    return v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, LV/g1;->i:I

    return v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, LV/g1;->h:I

    return v0
.end method

.method public final l()Ljava/lang/Object;
    .locals 2

    .prologue
    iget v0, p0, LV/g1;->h:I

    iget v1, p0, LV/g1;->i:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LV/g1;->b:[I

    invoke-direct {p0, v1, v0}, LV/g1;->b([II)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final m()I
    .locals 1

    iget v0, p0, LV/g1;->i:I

    return v0
.end method

.method public final n()I
    .locals 2

    .prologue
    iget v0, p0, LV/g1;->h:I

    iget v1, p0, LV/g1;->i:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LV/g1;->b:[I

    invoke-static {v1, v0}, LV/j1;->n([II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final o()Ljava/lang/Object;
    .locals 2

    .prologue
    iget v0, p0, LV/g1;->h:I

    iget v1, p0, LV/g1;->i:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LV/g1;->b:[I

    invoke-direct {p0, v1, v0}, LV/g1;->O([II)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final p()I
    .locals 2

    iget-object v0, p0, LV/g1;->b:[I

    iget v1, p0, LV/g1;->h:I

    invoke-static {v0, v1}, LV/j1;->h([II)I

    move-result v0

    return v0
.end method

.method public final q()I
    .locals 3

    iget v0, p0, LV/g1;->m:I

    iget-object v1, p0, LV/g1;->b:[I

    iget v2, p0, LV/g1;->j:I

    invoke-static {v1, v2}, LV/j1;->u([II)I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public final r()Z
    .locals 1

    iget-boolean v0, p0, LV/g1;->o:Z

    return v0
.end method

.method public final s()Z
    .locals 2

    .prologue
    iget v0, p0, LV/g1;->h:I

    iget v1, p0, LV/g1;->i:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LV/g1;->b:[I

    invoke-static {v1, v0}, LV/j1;->k([II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final t()Z
    .locals 1

    .prologue
    iget v0, p0, LV/g1;->l:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SlotReader(current="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LV/g1;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LV/g1;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LV/g1;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LV/g1;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()I
    .locals 1

    iget v0, p0, LV/g1;->j:I

    return v0
.end method

.method public final v()I
    .locals 2

    .prologue
    iget v0, p0, LV/g1;->j:I

    if-ltz v0, :cond_0

    iget-object v1, p0, LV/g1;->b:[I

    invoke-static {v1, v0}, LV/j1;->p([II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final w()I
    .locals 2

    iget v0, p0, LV/g1;->n:I

    iget v1, p0, LV/g1;->m:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final x()I
    .locals 1

    iget v0, p0, LV/g1;->c:I

    return v0
.end method

.method public final y()LV/h1;
    .locals 1

    iget-object v0, p0, LV/g1;->a:LV/h1;

    return-object v0
.end method

.method public final z(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LV/g1;->b:[I

    invoke-direct {p0, v0, p1}, LV/g1;->b([II)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
