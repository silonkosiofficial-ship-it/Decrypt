.class final Lb8/j$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/j;-><init>(La8/g;Lb8/j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/j;


# direct methods
.method constructor <init>(Lb8/j;)V
    .locals 0

    iput-object p1, p0, Lb8/j$f;->D:Lb8/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/f;)Ljava/util/Collection;
    .locals 5

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/j$f;->D:Lb8/j;

    invoke-virtual {v0}, Lb8/j;->B()Lb8/j;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb8/j$f;->D:Lb8/j;

    invoke-virtual {v0}, Lb8/j;->B()Lb8/j;

    move-result-object v0

    invoke-static {v0}, Lb8/j;->i(Lb8/j;)LE8/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lb8/j$f;->D:Lb8/j;

    invoke-virtual {v1}, Lb8/j;->y()LE8/i;

    move-result-object v1

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb8/b;

    invoke-interface {v1, p1}, Lb8/b;->d(Ln8/f;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/r;

    iget-object v3, p0, Lb8/j$f;->D:Lb8/j;

    invoke-virtual {v3, v2}, Lb8/j;->I(Le8/r;)LZ7/e;

    move-result-object v3

    iget-object v4, p0, Lb8/j$f;->D:Lb8/j;

    invoke-virtual {v4, v3}, Lb8/j;->G(LZ7/e;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lb8/j$f;->D:Lb8/j;

    invoke-virtual {v4}, Lb8/j;->w()La8/g;

    move-result-object v4

    invoke-virtual {v4}, La8/g;->a()La8/b;

    move-result-object v4

    invoke-virtual {v4}, La8/b;->h()LY7/g;

    move-result-object v4

    invoke-interface {v4, v2, v3}, LY7/g;->b(Le8/q;LO7/Z;)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lb8/j$f;->D:Lb8/j;

    invoke-virtual {v1, v0, p1}, Lb8/j;->o(Ljava/util/Collection;Ln8/f;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, Lb8/j$f;->a(Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
