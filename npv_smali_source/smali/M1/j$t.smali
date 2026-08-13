.class final LM1/j$t;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j;-><init>(LM1/w;Ljava/util/List;LM1/d;LW8/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LM1/j;


# direct methods
.method constructor <init>(LM1/j;)V
    .locals 0

    iput-object p1, p0, LM1/j$t;->D:LM1/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    if-eqz p1, :cond_0

    iget-object v0, p0, LM1/j$t;->D:LM1/j;

    invoke-static {v0}, LM1/j;->c(LM1/j;)LM1/k;

    move-result-object v0

    new-instance v1, LM1/l;

    invoke-direct {v1, p1}, LM1/l;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, LM1/k;->c(LM1/v;)LM1/v;

    :cond_0
    iget-object p1, p0, LM1/j$t;->D:LM1/j;

    invoke-static {p1}, LM1/j;->g(LM1/j;)Li7/n;

    move-result-object p1

    invoke-interface {p1}, Li7/n;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LM1/j$t;->D:LM1/j;

    invoke-virtual {p1}, LM1/j;->r()LM1/x;

    move-result-object p1

    invoke-interface {p1}, LM1/b;->close()V

    :cond_1
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LM1/j$t;->a(Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
