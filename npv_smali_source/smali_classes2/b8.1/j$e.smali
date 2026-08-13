.class final Lb8/j$e;
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

    iput-object p1, p0, Lb8/j$e;->D:Lb8/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ln8/f;)LO7/U;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/j$e;->D:Lb8/j;

    invoke-virtual {v0}, Lb8/j;->B()Lb8/j;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb8/j$e;->D:Lb8/j;

    invoke-virtual {v0}, Lb8/j;->B()Lb8/j;

    move-result-object v0

    invoke-static {v0}, Lb8/j;->h(Lb8/j;)LE8/h;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/U;

    return-object p1

    :cond_0
    iget-object v0, p0, Lb8/j$e;->D:Lb8/j;

    invoke-virtual {v0}, Lb8/j;->y()LE8/i;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb8/b;

    invoke-interface {v0, p1}, Lb8/b;->c(Ln8/f;)Le8/n;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Le8/n;->L()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lb8/j$e;->D:Lb8/j;

    invoke-static {v0, p1}, Lb8/j;->j(Lb8/j;Le8/n;)LO7/U;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ln8/f;

    invoke-virtual {p0, p1}, Lb8/j$e;->a(Ln8/f;)LO7/U;

    move-result-object p1

    return-object p1
.end method
