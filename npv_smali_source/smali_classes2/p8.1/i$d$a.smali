.class public Lp8/i$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/i$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Iterator;

.field private b:Ljava/util/Map$Entry;

.field private final c:Z

.field final synthetic d:Lp8/i$d;


# direct methods
.method private constructor <init>(Lp8/i$d;Z)V
    .locals 1

    .prologue
    iput-object p1, p0, Lp8/i$d$a;->d:Lp8/i$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp8/i$d;->r(Lp8/i$d;)Lp8/h;

    move-result-object p1

    invoke-virtual {p1}, Lp8/h;->p()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lp8/i$d$a;->a:Ljava/util/Iterator;

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    iput-object p1, p0, Lp8/i$d$a;->b:Ljava/util/Map$Entry;

    :cond_0
    iput-boolean p2, p0, Lp8/i$d$a;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lp8/i$d;ZLp8/i$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp8/i$d$a;-><init>(Lp8/i$d;Z)V

    return-void
.end method


# virtual methods
.method public a(ILp8/f;)V
    .locals 3

    .prologue
    :goto_0
    iget-object v0, p0, Lp8/i$d$a;->b:Ljava/util/Map$Entry;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp8/i$e;

    invoke-virtual {v0}, Lp8/i$e;->c()I

    move-result v0

    if-ge v0, p1, :cond_2

    iget-object v0, p0, Lp8/i$d$a;->b:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp8/i$e;

    iget-boolean v1, p0, Lp8/i$d$a;->c:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lp8/i$e;->p()Lp8/y$c;

    move-result-object v1

    sget-object v2, Lp8/y$c;->L:Lp8/y$c;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lp8/i$e;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lp8/i$e;->c()I

    move-result v0

    iget-object v1, p0, Lp8/i$d$a;->b:Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lp8/p;

    invoke-virtual {p2, v0, v1}, Lp8/f;->e0(ILp8/p;)V

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lp8/i$d$a;->b:Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lp8/h;->z(Lp8/h$b;Ljava/lang/Object;Lp8/f;)V

    :goto_1
    iget-object v0, p0, Lp8/i$d$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp8/i$d$a;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    :goto_2
    iput-object v0, p0, Lp8/i$d$a;->b:Ljava/util/Map$Entry;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    return-void
.end method
