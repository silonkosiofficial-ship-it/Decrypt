.class final Lb8/j$j;
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

    iput-object p1, p0, Lb8/j$j;->D:Lb8/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/f;)Ljava/util/List;
    .locals 2

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lb8/j$j;->D:Lb8/j;

    invoke-static {v1}, Lb8/j;->h(Lb8/j;)LE8/h;

    move-result-object v1

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    iget-object v1, p0, Lb8/j$j;->D:Lb8/j;

    invoke-virtual {v1, p1, v0}, Lb8/j;->s(Ln8/f;Ljava/util/Collection;)V

    iget-object p1, p0, Lb8/j$j;->D:Lb8/j;

    invoke-virtual {p1}, Lb8/j;->C()LO7/m;

    move-result-object p1

    invoke-static {p1}, Lr8/f;->t(LO7/m;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb8/j$j;->D:Lb8/j;

    invoke-virtual {p1}, Lb8/j;->w()La8/g;

    move-result-object p1

    invoke-virtual {p1}, La8/g;->a()La8/b;

    move-result-object p1

    invoke-virtual {p1}, La8/b;->r()Lf8/l;

    move-result-object p1

    iget-object v1, p0, Lb8/j$j;->D:Lb8/j;

    invoke-virtual {v1}, Lb8/j;->w()La8/g;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lf8/l;->g(La8/g;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, Lb8/j$j;->a(Ln8/f;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
