.class final Lb8/j$i;
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

    iput-object p1, p0, Lb8/j$i;->D:Lb8/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/f;)Ljava/util/Collection;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    iget-object v1, p0, Lb8/j$i;->D:Lb8/j;

    invoke-static {v1}, Lb8/j;->i(Lb8/j;)LE8/g;

    move-result-object v1

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lb8/j$i;->D:Lb8/j;

    invoke-static {v1, v0}, Lb8/j;->k(Lb8/j;Ljava/util/Set;)V

    iget-object v1, p0, Lb8/j$i;->D:Lb8/j;

    invoke-virtual {v1, v0, p1}, Lb8/j;->r(Ljava/util/Collection;Ln8/f;)V

    iget-object p1, p0, Lb8/j$i;->D:Lb8/j;

    invoke-virtual {p1}, Lb8/j;->w()La8/g;

    move-result-object p1

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object p1

    invoke-virtual {p1}, La8/b;->r()Lf8/l;

    move-result-object p1

    iget-object v1, p0, Lb8/j$i;->D:Lb8/j;

    invoke-virtual {v1}, Lb8/j;->w()La8/g;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lf8/l;->g(La8/g;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, Lb8/j$i;->a(Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
