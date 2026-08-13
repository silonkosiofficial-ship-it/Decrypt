.class public final LZ/h;
.super LZ/a;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lz7/a;


# instance fields
.field private final E:LZ/f;

.field private F:I

.field private G:LZ/k;

.field private H:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LZ/f;I)V
    .locals 1

    invoke-virtual {p1}, Lj7/h;->size()I

    move-result v0

    invoke-direct {p0, p2, v0}, LZ/a;-><init>(II)V

    iput-object p1, p0, LZ/h;->E:LZ/f;

    invoke-virtual {p1}, LZ/f;->o()I

    move-result p1

    iput p1, p0, LZ/h;->F:I

    const/4 p1, -0x1

    iput p1, p0, LZ/h;->H:I

    invoke-direct {p0}, LZ/h;->o()V

    return-void
.end method

.method private final k()V
    .locals 2

    .prologue
    iget v0, p0, LZ/h;->F:I

    iget-object v1, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v1}, LZ/f;->o()I

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method private final l()V
    .locals 2

    .prologue
    iget v0, p0, LZ/h;->H:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method private final m()V
    .locals 1

    iget-object v0, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v0}, Lj7/h;->size()I

    move-result v0

    invoke-virtual {p0, v0}, LZ/a;->h(I)V

    iget-object v0, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v0}, LZ/f;->o()I

    move-result v0

    iput v0, p0, LZ/h;->F:I

    const/4 v0, -0x1

    iput v0, p0, LZ/h;->H:I

    invoke-direct {p0}, LZ/h;->o()V

    return-void
.end method

.method private final o()V
    .locals 5

    .prologue
    iget-object v0, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v0}, LZ/f;->s()[Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LZ/h;->G:LZ/k;

    return-void

    :cond_0
    iget-object v1, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v1}, Lj7/h;->size()I

    move-result v1

    invoke-static {v1}, LZ/l;->d(I)I

    move-result v1

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v2

    invoke-static {v2, v1}, LE7/j;->g(II)I

    move-result v2

    iget-object v3, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v3}, LZ/f;->C()I

    move-result v3

    div-int/lit8 v3, v3, 0x5

    add-int/lit8 v3, v3, 0x1

    iget-object v4, p0, LZ/h;->G:LZ/k;

    if-nez v4, :cond_1

    new-instance v4, LZ/k;

    invoke-direct {v4, v0, v2, v1, v3}, LZ/k;-><init>([Ljava/lang/Object;III)V

    iput-object v4, p0, LZ/h;->G:LZ/k;

    goto :goto_0

    :cond_1
    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v0, v2, v1, v3}, LZ/k;->o([Ljava/lang/Object;III)V

    :goto_0
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, LZ/h;->k()V

    iget-object v0, p0, LZ/h;->E:LZ/f;

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    invoke-virtual {v0, v1, p1}, LZ/f;->add(ILjava/lang/Object;)V

    invoke-virtual {p0}, LZ/a;->d()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, LZ/a;->f(I)V

    invoke-direct {p0}, LZ/h;->m()V

    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-direct {p0}, LZ/h;->k()V

    invoke-virtual {p0}, LZ/a;->b()V

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v0

    iput v0, p0, LZ/h;->H:I

    iget-object v0, p0, LZ/h;->G:LZ/k;

    if-nez v0, :cond_0

    iget-object v0, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v0}, LZ/f;->D()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v2}, LZ/a;->f(I)V

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    invoke-virtual {v0}, LZ/a;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1}, LZ/a;->f(I)V

    invoke-virtual {v0}, LZ/k;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v1}, LZ/f;->D()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0, v3}, LZ/a;->f(I)V

    invoke-virtual {v0}, LZ/a;->e()I

    move-result v0

    sub-int/2addr v2, v0

    aget-object v0, v1, v2

    return-object v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-direct {p0}, LZ/h;->k()V

    invoke-virtual {p0}, LZ/a;->c()V

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LZ/h;->H:I

    iget-object v0, p0, LZ/h;->G:LZ/k;

    if-nez v0, :cond_0

    iget-object v0, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v0}, LZ/f;->D()[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LZ/a;->f(I)V

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0

    :cond_0
    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    invoke-virtual {v0}, LZ/a;->e()I

    move-result v2

    if-le v1, v2, :cond_1

    iget-object v1, p0, LZ/h;->E:LZ/f;

    invoke-virtual {v1}, LZ/f;->D()[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p0, v2}, LZ/a;->f(I)V

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v2

    invoke-virtual {v0}, LZ/a;->e()I

    move-result v0

    sub-int/2addr v2, v0

    aget-object v0, v1, v2

    return-object v0

    :cond_1
    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LZ/a;->f(I)V

    invoke-virtual {v0}, LZ/k;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .prologue
    invoke-direct {p0}, LZ/h;->k()V

    invoke-direct {p0}, LZ/h;->l()V

    iget-object v0, p0, LZ/h;->E:LZ/f;

    iget v1, p0, LZ/h;->H:I

    invoke-virtual {v0, v1}, Lj7/h;->remove(I)Ljava/lang/Object;

    iget v0, p0, LZ/h;->H:I

    invoke-virtual {p0}, LZ/a;->d()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, LZ/h;->H:I

    invoke-virtual {p0, v0}, LZ/a;->f(I)V

    :cond_0
    invoke-direct {p0}, LZ/h;->m()V

    return-void
.end method

.method public set(Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, LZ/h;->k()V

    invoke-direct {p0}, LZ/h;->l()V

    iget-object v0, p0, LZ/h;->E:LZ/f;

    iget v1, p0, LZ/h;->H:I

    invoke-virtual {v0, v1, p1}, LZ/f;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LZ/h;->E:LZ/f;

    invoke-virtual {p1}, LZ/f;->o()I

    move-result p1

    iput p1, p0, LZ/h;->F:I

    invoke-direct {p0}, LZ/h;->o()V

    return-void
.end method
