.class public final Lg8/e$b;
.super Lg8/e$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/e;->w(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final b:Ljava/util/HashMap;

.field final synthetic c:Lg8/e;

.field final synthetic d:LO7/e;

.field final synthetic e:Ln8/b;

.field final synthetic f:Ljava/util/List;

.field final synthetic g:LO7/a0;


# direct methods
.method constructor <init>(Lg8/e;LO7/e;Ln8/b;Ljava/util/List;LO7/a0;)V
    .locals 0

    iput-object p1, p0, Lg8/e$b;->c:Lg8/e;

    iput-object p2, p0, Lg8/e$b;->d:LO7/e;

    iput-object p3, p0, Lg8/e$b;->e:Ln8/b;

    iput-object p4, p0, Lg8/e$b;->f:Ljava/util/List;

    iput-object p5, p0, Lg8/e$b;->g:LO7/a0;

    invoke-direct {p0, p1}, Lg8/e$a;-><init>(Lg8/e;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lg8/e$b;->b:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    iget-object v0, p0, Lg8/e$b;->c:Lg8/e;

    iget-object v1, p0, Lg8/e$b;->e:Ln8/b;

    iget-object v2, p0, Lg8/e$b;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v1, v2}, Lg8/a;->D(Ln8/b;Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lg8/e$b;->c:Lg8/e;

    iget-object v1, p0, Lg8/e$b;->e:Ln8/b;

    invoke-virtual {v0, v1}, Lg8/b;->v(Ln8/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lg8/e$b;->f:Ljava/util/List;

    new-instance v1, LP7/d;

    iget-object v2, p0, Lg8/e$b;->d:LO7/e;

    invoke-interface {v2}, LO7/e;->w()LF8/M;

    move-result-object v2

    iget-object v3, p0, Lg8/e$b;->b:Ljava/util/HashMap;

    iget-object v4, p0, Lg8/e$b;->g:LO7/a0;

    invoke-direct {v1, v2, v3, v4}, LP7/d;-><init>(LF8/E;Ljava/util/Map;LO7/a0;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Ln8/f;Ljava/util/ArrayList;)V
    .locals 4

    .prologue
    const-string v0, "elements"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lg8/e$b;->d:LO7/e;

    invoke-static {p1, v0}, LY7/a;->b(Ln8/f;LO7/e;)LO7/j0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lg8/e$b;->b:Ljava/util/HashMap;

    sget-object v2, Lt8/h;->a:Lt8/h;

    invoke-static {p2}, LP8/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p2

    invoke-interface {v0}, LO7/i0;->getType()LF8/E;

    move-result-object v0

    const-string v3, "getType(...)"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p2, v0}, Lt8/h;->a(Ljava/util/List;LF8/E;)Lt8/b;

    move-result-object p2

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lg8/e$b;->c:Lg8/e;

    iget-object v1, p0, Lg8/e$b;->e:Ln8/b;

    invoke-virtual {v0, v1}, Lg8/b;->v(Ln8/b;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object p1

    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lt8/a;

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lg8/e$b;->f:Ljava/util/List;

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt8/a;

    invoke-virtual {v0}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP7/c;

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

.method public h(Ln8/f;Lt8/g;)V
    .locals 1

    .prologue
    const-string v0, "value"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lg8/e$b;->b:Ljava/util/HashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
