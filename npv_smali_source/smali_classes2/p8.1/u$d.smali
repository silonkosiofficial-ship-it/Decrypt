.class Lp8/u$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field private C:I

.field private D:Z

.field private E:Ljava/util/Iterator;

.field final synthetic F:Lp8/u;


# direct methods
.method private constructor <init>(Lp8/u;)V
    .locals 0

    iput-object p1, p0, Lp8/u$d;->F:Lp8/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lp8/u$d;->C:I

    return-void
.end method

.method synthetic constructor <init>(Lp8/u;Lp8/u$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lp8/u$d;-><init>(Lp8/u;)V

    return-void
.end method

.method private b()Ljava/util/Iterator;
    .locals 1

    .prologue
    iget-object v0, p0, Lp8/u$d;->E:Ljava/util/Iterator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lp8/u$d;->F:Lp8/u;

    invoke-static {v0}, Lp8/u;->d(Lp8/u;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lp8/u$d;->E:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, Lp8/u$d;->E:Ljava/util/Iterator;

    return-object v0
.end method


# virtual methods
.method public c()Ljava/util/Map$Entry;
    .locals 2

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lp8/u$d;->D:Z

    iget v1, p0, Lp8/u$d;->C:I

    add-int/2addr v1, v0

    iput v1, p0, Lp8/u$d;->C:I

    iget-object v0, p0, Lp8/u$d;->F:Lp8/u;

    invoke-static {v0}, Lp8/u;->b(Lp8/u;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lp8/u$d;->F:Lp8/u;

    invoke-static {v0}, Lp8/u;->b(Lp8/u;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lp8/u$d;->C:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    return-object v0

    :cond_0
    invoke-direct {p0}, Lp8/u$d;->b()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public hasNext()Z
    .locals 3

    .prologue
    iget v0, p0, Lp8/u$d;->C:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lp8/u$d;->F:Lp8/u;

    invoke-static {v2}, Lp8/u;->b(Lp8/u;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v0, v2, :cond_1

    invoke-direct {p0}, Lp8/u$d;->b()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp8/u$d;->c()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    .prologue
    iget-boolean v0, p0, Lp8/u$d;->D:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp8/u$d;->D:Z

    iget-object v0, p0, Lp8/u$d;->F:Lp8/u;

    invoke-static {v0}, Lp8/u;->a(Lp8/u;)V

    iget v0, p0, Lp8/u$d;->C:I

    iget-object v1, p0, Lp8/u$d;->F:Lp8/u;

    invoke-static {v1}, Lp8/u;->b(Lp8/u;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lp8/u$d;->F:Lp8/u;

    iget v1, p0, Lp8/u$d;->C:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lp8/u$d;->C:I

    invoke-static {v0, v1}, Lp8/u;->c(Lp8/u;I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lp8/u$d;->b()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() was called before next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
