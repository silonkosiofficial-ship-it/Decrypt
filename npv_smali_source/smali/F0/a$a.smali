.class final LF0/a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/a;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/a;


# direct methods
.method constructor <init>(LF0/a;)V
    .locals 0

    iput-object p1, p0, LF0/a$a;->D:LF0/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/b;)V
    .locals 5

    .prologue
    invoke-interface {p1}, LF0/b;->k()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, LF0/b;->f()LF0/a;

    move-result-object v0

    invoke-virtual {v0}, LF0/a;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LF0/b;->d0()V

    :cond_1
    invoke-interface {p1}, LF0/b;->f()LF0/a;

    move-result-object v0

    invoke-static {v0}, LF0/a;->b(LF0/a;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, LF0/a$a;->D:LF0/a;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD0/a;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {p1}, LF0/b;->F()LF0/d0;

    move-result-object v4

    invoke-static {v1, v3, v2, v4}, LF0/a;->a(LF0/a;LD0/a;ILF0/d0;)V

    goto :goto_0

    :cond_2
    invoke-interface {p1}, LF0/b;->F()LF0/d0;

    move-result-object p1

    :cond_3
    invoke-virtual {p1}, LF0/d0;->p2()LF0/d0;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v0, p0, LF0/a$a;->D:LF0/a;

    invoke-virtual {v0}, LF0/a;->f()LF0/b;

    move-result-object v0

    invoke-interface {v0}, LF0/b;->F()LF0/d0;

    move-result-object v0

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, LF0/a$a;->D:LF0/a;

    invoke-virtual {v0, p1}, LF0/a;->e(LF0/d0;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LF0/a$a;->D:LF0/a;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LD0/a;

    invoke-virtual {v1, p1, v2}, LF0/a;->i(LF0/d0;LD0/a;)I

    move-result v3

    invoke-static {v1, v2, v3, p1}, LF0/a;->a(LF0/a;LD0/a;ILF0/d0;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/b;

    invoke-virtual {p0, p1}, LF0/a$a;->a(LF0/b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
