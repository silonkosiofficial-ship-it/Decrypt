.class final Lj2/b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj2/b;->b(LW8/V;Ljava/lang/Object;)LP4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/concurrent/futures/c$a;

.field final synthetic E:LW8/V;


# direct methods
.method constructor <init>(Landroidx/concurrent/futures/c$a;LW8/V;)V
    .locals 0

    iput-object p1, p0, Lj2/b$a;->D:Landroidx/concurrent/futures/c$a;

    iput-object p2, p0, Lj2/b$a;->E:LW8/V;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    if-eqz p1, :cond_1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lj2/b$a;->D:Landroidx/concurrent/futures/c$a;

    invoke-virtual {p1}, Landroidx/concurrent/futures/c$a;->c()Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj2/b$a;->D:Landroidx/concurrent/futures/c$a;

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->e(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj2/b$a;->D:Landroidx/concurrent/futures/c$a;

    iget-object v0, p0, Lj2/b$a;->E:LW8/V;

    invoke-interface {v0}, LW8/V;->y()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->b(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lj2/b$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
