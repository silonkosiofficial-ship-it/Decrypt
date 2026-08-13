.class final LF8/e$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF8/e;->u(LF8/d0;LJ8/j;LJ8/j;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/util/List;

.field final synthetic E:LF8/d0;

.field final synthetic F:LJ8/o;

.field final synthetic G:LJ8/j;


# direct methods
.method constructor <init>(Ljava/util/List;LF8/d0;LJ8/o;LJ8/j;)V
    .locals 0

    iput-object p1, p0, LF8/e$b;->D:Ljava/util/List;

    iput-object p2, p0, LF8/e$b;->E:LF8/d0;

    iput-object p3, p0, LF8/e$b;->F:LJ8/o;

    iput-object p4, p0, LF8/e$b;->G:LJ8/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/d0$a;)V
    .locals 6

    .prologue
    const-string v0, "$this$runForkingPoint"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LF8/e$b;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ8/j;

    new-instance v2, LF8/e$b$a;

    iget-object v3, p0, LF8/e$b;->E:LF8/d0;

    iget-object v4, p0, LF8/e$b;->F:LJ8/o;

    iget-object v5, p0, LF8/e$b;->G:LJ8/j;

    invoke-direct {v2, v3, v4, v1, v5}, LF8/e$b$a;-><init>(LF8/d0;LJ8/o;LJ8/j;LJ8/j;)V

    invoke-interface {p1, v2}, LF8/d0$a;->a(Lx7/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/d0$a;

    invoke-virtual {p0, p1}, LF8/e$b;->a(LF8/d0$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
