.class Lp8/t$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final C:Ljava/util/Stack;

.field private D:Lp8/o;


# direct methods
.method private constructor <init>(Lp8/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lp8/t$c;->C:Ljava/util/Stack;

    invoke-direct {p0, p1}, Lp8/t$c;->b(Lp8/d;)Lp8/o;

    move-result-object p1

    iput-object p1, p0, Lp8/t$c;->D:Lp8/o;

    return-void
.end method

.method synthetic constructor <init>(Lp8/d;Lp8/t$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lp8/t$c;-><init>(Lp8/d;)V

    return-void
.end method

.method private b(Lp8/d;)Lp8/o;
    .locals 1

    .prologue
    :goto_0
    instance-of v0, p1, Lp8/t;

    if-eqz v0, :cond_0

    check-cast p1, Lp8/t;

    iget-object v0, p0, Lp8/t$c;->C:Ljava/util/Stack;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lp8/t;->V(Lp8/t;)Lp8/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lp8/o;

    return-object p1
.end method

.method private c()Lp8/o;
    .locals 2

    .prologue
    :cond_0
    iget-object v0, p0, Lp8/t$c;->C:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v0, p0, Lp8/t$c;->C:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp8/t;

    invoke-static {v0}, Lp8/t;->W(Lp8/t;)Lp8/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lp8/t$c;->b(Lp8/d;)Lp8/o;

    move-result-object v0

    invoke-virtual {v0}, Lp8/d;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0
.end method


# virtual methods
.method public d()Lp8/o;
    .locals 2

    .prologue
    iget-object v0, p0, Lp8/t$c;->D:Lp8/o;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lp8/t$c;->c()Lp8/o;

    move-result-object v1

    iput-object v1, p0, Lp8/t$c;->D:Lp8/o;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lp8/t$c;->D:Lp8/o;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lp8/t$c;->d()Lp8/o;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
