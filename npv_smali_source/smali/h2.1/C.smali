.class public final Lh2/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/N;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh2/C$a;,
        Lh2/C$b;
    }
.end annotation


# static fields
.field public static final e:Lh2/C$a;

.field private static final f:Lh2/C;


# instance fields
.field private final a:Ljava/util/List;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh2/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh2/C$a;-><init>(Ly7/k;)V

    sput-object v0, Lh2/C;->e:Lh2/C$a;

    new-instance v0, Lh2/C;

    sget-object v1, Lh2/x$b;->g:Lh2/x$b$a;

    invoke-virtual {v1}, Lh2/x$b$a;->e()Lh2/x$b;

    move-result-object v1

    invoke-direct {v0, v1}, Lh2/C;-><init>(Lh2/x$b;)V

    sput-object v0, Lh2/C;->f:Lh2/C;

    return-void
.end method

.method public constructor <init>(Lh2/x$b;)V
    .locals 2

    const-string v0, "insertEvent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lh2/x$b;->j()I

    move-result v1

    invoke-virtual {p1}, Lh2/x$b;->i()I

    move-result p1

    invoke-direct {p0, v0, v1, p1}, Lh2/C;-><init>(Ljava/util/List;II)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;II)V
    .locals 1

    const-string v0, "pages"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lj7/v;->W0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-direct {p0, p1}, Lh2/C;->j(Ljava/util/List;)I

    move-result p1

    iput p1, p0, Lh2/C;->b:I

    iput p2, p0, Lh2/C;->c:I

    iput p3, p0, Lh2/C;->d:I

    return-void
.end method

.method public static final synthetic e()Lh2/C;
    .locals 1

    sget-object v0, Lh2/C;->f:Lh2/C;

    return-object v0
.end method

.method private final g(I)V
    .locals 3

    .prologue
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lh2/C;->a()I

    move-result v0

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", Size: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lh2/C;->a()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final h(Lh2/x$a;)Lh2/G;
    .locals 5

    .prologue
    new-instance v0, LE7/i;

    invoke-virtual {p1}, Lh2/x$a;->e()I

    move-result v1

    invoke-virtual {p1}, Lh2/x$a;->d()I

    move-result v2

    invoke-direct {v0, v1, v2}, LE7/i;-><init>(II)V

    invoke-direct {p0, v0}, Lh2/C;->i(LE7/i;)I

    move-result v0

    invoke-virtual {p0}, Lh2/C;->b()I

    move-result v1

    sub-int/2addr v1, v0

    iput v1, p0, Lh2/C;->b:I

    invoke-virtual {p1}, Lh2/x$a;->c()Lh2/t;

    move-result-object v1

    sget-object v2, Lh2/t;->D:Lh2/t;

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v1

    invoke-virtual {p1}, Lh2/x$a;->g()I

    move-result p1

    iput p1, p0, Lh2/C;->c:I

    new-instance p1, Lh2/G$c;

    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v2

    invoke-direct {p1, v0, v2, v1}, Lh2/G$c;-><init>(III)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lh2/C;->d()I

    move-result v1

    invoke-virtual {p1}, Lh2/x$a;->g()I

    move-result v2

    iput v2, p0, Lh2/C;->d:I

    new-instance v2, Lh2/G$b;

    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v3

    invoke-virtual {p0}, Lh2/C;->b()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p1}, Lh2/x$a;->g()I

    move-result p1

    invoke-direct {v2, v3, v0, p1, v1}, Lh2/G$b;-><init>(IIII)V

    move-object p1, v2

    :goto_0
    return-object p1
.end method

.method private final i(LE7/i;)I
    .locals 8

    .prologue
    iget-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh2/W;

    invoke-virtual {v3}, Lh2/W;->e()[I

    move-result-object v4

    array-length v5, v4

    move v6, v1

    :goto_1
    if-ge v6, v5, :cond_0

    aget v7, v4, v6

    invoke-virtual {p1, v7}, LE7/i;->D(I)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {v3}, Lh2/W;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    return v2
.end method

.method private final j(Ljava/util/List;)I
    .locals 2

    .prologue
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh2/W;

    invoke-virtual {v1}, Lh2/W;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method private final m()I
    .locals 1

    iget-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/W;

    invoke-virtual {v0}, Lh2/W;->e()[I

    move-result-object v0

    invoke-static {v0}, Lj7/n;->D0([I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method private final n()I
    .locals 1

    iget-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/W;

    invoke-virtual {v0}, Lh2/W;->e()[I

    move-result-object v0

    invoke-static {v0}, Lj7/n;->C0([I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method private final p(Lh2/x$b;)Lh2/G;
    .locals 6

    .prologue
    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lh2/C;->j(Ljava/util/List;)I

    move-result v0

    invoke-virtual {p1}, Lh2/x$b;->f()Lh2/t;

    move-result-object v1

    sget-object v2, Lh2/C$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lh2/C;->d()I

    move-result v1

    invoke-virtual {p0}, Lh2/C;->b()I

    move-result v2

    iget-object v3, p0, Lh2/C;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v3, v4, v5}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    invoke-virtual {p0}, Lh2/C;->b()I

    move-result v3

    add-int/2addr v3, v0

    iput v3, p0, Lh2/C;->b:I

    invoke-virtual {p1}, Lh2/x$b;->i()I

    move-result v0

    iput v0, p0, Lh2/C;->d:I

    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v0

    add-int/2addr v0, v2

    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh2/W;

    invoke-virtual {v3}, Lh2/W;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lh2/C;->d()I

    move-result p1

    new-instance v3, Lh2/G$a;

    invoke-direct {v3, v0, v2, p1, v1}, Lh2/G$a;-><init>(ILjava/util/List;II)V

    goto :goto_2

    :cond_1
    new-instance p1, Li7/s;

    invoke-direct {p1}, Li7/s;-><init>()V

    throw p1

    :cond_2
    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v1

    iget-object v2, p0, Lh2/C;->a:Ljava/util/List;

    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    const/4 v4, 0x0

    invoke-interface {v2, v4, v3}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    invoke-virtual {p0}, Lh2/C;->b()I

    move-result v2

    add-int/2addr v2, v0

    iput v2, p0, Lh2/C;->b:I

    invoke-virtual {p1}, Lh2/x$b;->j()I

    move-result v0

    iput v0, p0, Lh2/C;->c:I

    invoke-virtual {p1}, Lh2/x$b;->h()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/W;

    invoke-virtual {v2}, Lh2/W;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lh2/C;->c()I

    move-result p1

    new-instance v3, Lh2/G$d;

    invoke-direct {v3, v0, p1, v1}, Lh2/G$d;-><init>(Ljava/util/List;II)V

    :goto_2
    return-object v3

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()I
    .locals 2

    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v0

    invoke-virtual {p0}, Lh2/C;->b()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lh2/C;->d()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lh2/C;->b:I

    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lh2/C;->c:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lh2/C;->d:I

    return v0
.end method

.method public final f(I)Lh2/Z$a;
    .locals 8

    .prologue
    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v0

    sub-int v0, p1, v0

    const/4 v1, 0x0

    move v3, v0

    :goto_0
    iget-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/W;

    invoke-virtual {v0}, Lh2/W;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v3, v0, :cond_0

    iget-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/W;

    invoke-virtual {v0}, Lh2/W;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v3, v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lh2/W;

    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v0

    sub-int v4, p1, v0

    invoke-virtual {p0}, Lh2/C;->a()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-virtual {p0}, Lh2/C;->d()I

    move-result p1

    sub-int/2addr v0, p1

    add-int/lit8 v5, v0, -0x1

    invoke-direct {p0}, Lh2/C;->m()I

    move-result v6

    invoke-direct {p0}, Lh2/C;->n()I

    move-result v7

    invoke-virtual/range {v2 .. v7}, Lh2/W;->f(IIIII)Lh2/Z$a;

    move-result-object p1

    return-object p1
.end method

.method public final k(I)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-direct {p0, p1}, Lh2/C;->g(I)V

    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v0

    sub-int/2addr p1, v0

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Lh2/C;->b()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lh2/C;->l(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public l(I)Ljava/lang/Object;
    .locals 3

    .prologue
    iget-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lh2/C;->a:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/W;

    invoke-virtual {v2}, Lh2/W;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, p1, :cond_0

    goto :goto_1

    :cond_0
    sub-int/2addr p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lh2/C;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh2/W;

    invoke-virtual {v0}, Lh2/W;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final o()Lh2/Z$b;
    .locals 4

    invoke-virtual {p0}, Lh2/C;->b()I

    move-result v0

    new-instance v1, Lh2/Z$b;

    div-int/lit8 v0, v0, 0x2

    invoke-direct {p0}, Lh2/C;->m()I

    move-result v2

    invoke-direct {p0}, Lh2/C;->n()I

    move-result v3

    invoke-direct {v1, v0, v0, v2, v3}, Lh2/Z$b;-><init>(IIII)V

    return-object v1
.end method

.method public final q(Lh2/x;)Lh2/G;
    .locals 1

    .prologue
    const-string v0, "pageEvent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lh2/x$b;

    if-eqz v0, :cond_0

    check-cast p1, Lh2/x$b;

    invoke-direct {p0, p1}, Lh2/C;->p(Lh2/x$b;)Lh2/G;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lh2/x$a;

    if-eqz v0, :cond_1

    check-cast p1, Lh2/x$a;

    invoke-direct {p0, p1}, Lh2/C;->h(Lh2/x$a;)Lh2/G;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final r()Lh2/q;
    .locals 5

    .prologue
    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v0

    invoke-virtual {p0}, Lh2/C;->d()I

    move-result v1

    iget-object v2, p0, Lh2/C;->a:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh2/W;

    invoke-virtual {v4}, Lh2/W;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v3, v4}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Lh2/q;

    invoke-direct {v2, v0, v1, v3}, Lh2/q;-><init>(IILjava/util/List;)V

    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .prologue
    invoke-virtual {p0}, Lh2/C;->b()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p0, v2}, Lh2/C;->l(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/16 v8, 0x3f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lh2/C;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " placeholders), "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lh2/C;->d()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " placeholders)]"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
