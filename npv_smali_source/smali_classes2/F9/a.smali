.class public final LF9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private b:LF9/c;

.field private final c:LZ8/y;

.field private final d:LZ8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LF9/a;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, LZ8/P;->a(Ljava/lang/Object;)LZ8/y;

    move-result-object v0

    iput-object v0, p0, LF9/a;->c:LZ8/y;

    new-instance v1, LF9/a$a;

    invoke-direct {v1, v0, p0}, LF9/a$a;-><init>(LZ8/f;LF9/a;)V

    iput-object v1, p0, LF9/a;->d:LZ8/f;

    return-void
.end method

.method private final a()LF9/c;
    .locals 3

    .prologue
    iget-object v0, p0, LF9/a;->b:LF9/c;

    if-nez v0, :cond_2

    iget-object v0, p0, LF9/a;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LF9/c;

    invoke-interface {v2}, LF9/c;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move-object v0, v1

    check-cast v0, LF9/c;

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final b()LZ8/f;
    .locals 1

    iget-object v0, p0, LF9/a;->d:LZ8/f;

    return-object v0
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, LF9/a;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final d()V
    .locals 2

    .prologue
    invoke-direct {p0}, LF9/a;->a()LF9/c;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, LF9/a;->b:LF9/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LF9/c;->a()V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    invoke-direct {p0}, LF9/a;->a()LF9/c;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, LF9/a;->b:LF9/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LF9/c;->d()V

    :cond_0
    return-void
.end method

.method public final f(F)V
    .locals 1

    .prologue
    invoke-direct {p0}, LF9/a;->a()LF9/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LF9/c;->c(F)V

    :cond_0
    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, LF9/a;->c:LZ8/y;

    invoke-interface {v0}, LZ8/y;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, LZ8/y;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h()V
    .locals 3

    .prologue
    iget-object v0, p0, LF9/a;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LF9/c;

    invoke-interface {v2}, LF9/c;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, LF9/c;

    iput-object v1, p0, LF9/a;->b:LF9/c;

    if-eqz v1, :cond_2

    invoke-interface {v1}, LF9/c;->b()V

    :cond_2
    return-void
.end method

.method public final i(LF9/c;)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF9/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LF9/a;->g()V

    return-void
.end method

.method public final j(LF9/c;)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF9/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LF9/a;->g()V

    return-void
.end method
