.class final LR7/d$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/d;->S()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LR7/d;


# direct methods
.method constructor <init>(LR7/d;)V
    .locals 0

    iput-object p1, p0, LR7/d$c;->D:LR7/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF8/t0;)Ljava/lang/Boolean;
    .locals 2

    .prologue
    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1}, LF8/G;->a(LF8/E;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LR7/d$c;->D:LR7/d;

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    instance-of v1, p1, LO7/f0;

    if-eqz v1, :cond_0

    check-cast p1, LO7/f0;

    invoke-interface {p1}, LO7/n;->b()LO7/m;

    move-result-object p1

    invoke-static {p1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF8/t0;

    invoke-virtual {p0, p1}, LR7/d$c;->a(LF8/t0;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
