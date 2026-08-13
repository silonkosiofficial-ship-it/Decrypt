.class final Lb8/h$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/h;-><init>(La8/g;Le8/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/h;


# direct methods
.method constructor <init>(Lb8/h;)V
    .locals 0

    iput-object p1, p0, Lb8/h$a;->D:Lb8/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 7

    .prologue
    iget-object v0, p0, Lb8/h$a;->D:Lb8/h;

    invoke-static {v0}, Lb8/h;->O0(Lb8/h;)La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->o()Lg8/z;

    move-result-object v0

    iget-object v1, p0, Lb8/h$a;->D:Lb8/h;

    invoke-virtual {v1}, LR7/z;->e()Ln8/c;

    move-result-object v1

    invoke-virtual {v1}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "asString(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lg8/z;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lb8/h$a;->D:Lb8/h;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lw8/d;->d(Ljava/lang/String;)Lw8/d;

    move-result-object v4

    invoke-virtual {v4}, Lw8/d;->e()Ln8/c;

    move-result-object v4

    invoke-static {v4}, Ln8/b;->m(Ln8/c;)Ln8/b;

    move-result-object v4

    const-string v5, "topLevel(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lb8/h;->O0(Lb8/h;)La8/g;

    move-result-object v5

    invoke-virtual {v5}, La8/g;->a()La8/b;

    move-result-object v5

    invoke-virtual {v5}, La8/b;->j()Lg8/r;

    move-result-object v5

    invoke-static {v1}, Lb8/h;->U0(Lb8/h;)Lm8/e;

    move-result-object v6

    invoke-static {v5, v4, v6}, Lg8/s;->b(Lg8/r;Ln8/b;Lm8/e;)Lg8/t;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-static {v3, v4}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v2}, Lj7/S;->q(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/h$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
