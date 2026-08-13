.class final Lf8/l$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/l;->f(LO7/b;La8/g;)LO7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LO7/j0;


# direct methods
.method constructor <init>(LO7/j0;)V
    .locals 0

    iput-object p1, p0, Lf8/l$d;->D:LO7/j0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LO7/b;)LF8/E;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->n()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lf8/l$d;->D:LO7/j0;

    invoke-interface {v0}, LO7/j0;->getIndex()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/j0;

    invoke-interface {p1}, LO7/i0;->getType()LF8/E;

    move-result-object p1

    const-string v0, "getType(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LO7/b;

    invoke-virtual {p0, p1}, Lf8/l$d;->a(LO7/b;)LF8/E;

    move-result-object p1

    return-object p1
.end method
