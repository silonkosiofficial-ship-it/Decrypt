.class final Lb8/e$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/e;-><init>(La8/g;Le8/a;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lb8/e;


# direct methods
.method constructor <init>(Lb8/e;)V
    .locals 0

    iput-object p1, p0, Lb8/e$a;->D:Lb8/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 5

    .prologue
    iget-object v0, p0, Lb8/e$a;->D:Lb8/e;

    invoke-static {v0}, Lb8/e;->f(Lb8/e;)Le8/a;

    move-result-object v0

    invoke-interface {v0}, Le8/a;->a()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, Lb8/e$a;->D:Lb8/e;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le8/b;

    invoke-interface {v3}, Le8/b;->getName()Ln8/f;

    move-result-object v4

    if-nez v4, :cond_1

    sget-object v4, LX7/B;->c:Ln8/f;

    :cond_1
    invoke-static {v1, v3}, Lb8/e;->g(Lb8/e;Le8/b;)Lt8/g;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v4, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lj7/S;->q(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb8/e$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
