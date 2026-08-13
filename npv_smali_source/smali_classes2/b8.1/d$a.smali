.class final Lb8/d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/d;-><init>(La8/g;Le8/u;Lb8/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/d;


# direct methods
.method constructor <init>(Lb8/d;)V
    .locals 0

    iput-object p1, p0, Lb8/d$a;->D:Lb8/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()[Ly8/h;
    .locals 6

    .prologue
    iget-object v0, p0, Lb8/d$a;->D:Lb8/d;

    invoke-static {v0}, Lb8/d;->i(Lb8/d;)Lb8/h;

    move-result-object v0

    invoke-virtual {v0}, Lb8/h;->W0()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lb8/d$a;->D:Lb8/d;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg8/t;

    invoke-static {v1}, Lb8/d;->h(Lb8/d;)La8/g;

    move-result-object v4

    invoke-virtual {v4}, La8/g;->a()La8/b;

    move-result-object v4

    invoke-virtual {v4}, La8/b;->b()Lg8/j;

    move-result-object v4

    invoke-static {v1}, Lb8/d;->i(Lb8/d;)Lb8/h;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Lg8/j;->b(LO7/K;Lg8/t;)Ly8/h;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v2}, LO8/a;->b(Ljava/lang/Iterable;)LP8/f;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ly8/h;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly8/h;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/d$a;->a()[Ly8/h;

    move-result-object v0

    return-object v0
.end method
