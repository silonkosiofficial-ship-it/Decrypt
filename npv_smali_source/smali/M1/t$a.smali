.class final LM1/t$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/t;-><init>(LW8/N;Lx7/l;Lx7/p;Lx7/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;

.field final synthetic E:LM1/t;

.field final synthetic F:Lx7/p;


# direct methods
.method constructor <init>(Lx7/l;LM1/t;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LM1/t$a;->D:Lx7/l;

    iput-object p2, p0, LM1/t$a;->E:LM1/t;

    iput-object p3, p0, LM1/t$a;->F:Lx7/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    iget-object v0, p0, LM1/t$a;->D:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LM1/t$a;->E:LM1/t;

    invoke-static {v0}, LM1/t;->b(LM1/t;)LY8/j;

    move-result-object v0

    invoke-interface {v0, p1}, LY8/C;->c(Ljava/lang/Throwable;)Z

    :cond_0
    iget-object v0, p0, LM1/t$a;->E:LM1/t;

    invoke-static {v0}, LM1/t;->b(LM1/t;)LY8/j;

    move-result-object v0

    invoke-interface {v0}, LY8/B;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LY8/n;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, LM1/t$a;->F:Lx7/p;

    invoke-interface {v1, v0, p1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Li7/M;->a:Li7/M;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LM1/t$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
