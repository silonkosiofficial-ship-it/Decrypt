.class final Lb8/g$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/g;->C0(LO7/Z;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/Z;

.field final synthetic E:Lb8/g;


# direct methods
.method constructor <init>(LO7/Z;Lb8/g;)V
    .locals 0

    iput-object p1, p0, Lb8/g$i;->D:LO7/Z;

    iput-object p2, p0, Lb8/g$i;->E:Lb8/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/f;)Ljava/util/Collection;
    .locals 2

    .prologue
    const-string v0, "accessorName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/g$i;->D:LO7/Z;

    invoke-interface {v0}, LO7/I;->getName()Ln8/f;

    move-result-object v0

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lb8/g$i;->D:LO7/Z;

    invoke-static {p1}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lb8/g$i;->E:Lb8/g;

    invoke-static {v0, p1}, Lb8/g;->T(Lb8/g;Ln8/f;)Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lb8/g$i;->E:Lb8/g;

    invoke-static {v1, p1}, Lb8/g;->U(Lb8/g;Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, Lb8/g$i;->a(Ln8/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
