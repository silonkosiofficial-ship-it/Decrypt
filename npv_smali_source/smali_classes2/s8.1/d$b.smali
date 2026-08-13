.class public final Ls8/d$b;
.super LF8/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/d;->e(LF8/l0;Z)LF8/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Z


# direct methods
.method constructor <init>(LF8/l0;Z)V
    .locals 0

    iput-boolean p2, p0, Ls8/d$b;->d:Z

    invoke-direct {p0, p1}, LF8/p;-><init>(LF8/l0;)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Ls8/d$b;->d:Z

    return v0
.end method

.method public e(LF8/E;)LF8/i0;
    .locals 3

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LF8/p;->e(LF8/E;)LF8/i0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    invoke-interface {p1}, LF8/e0;->w()LO7/h;

    move-result-object p1

    instance-of v2, p1, LO7/f0;

    if-eqz v2, :cond_0

    move-object v1, p1

    check-cast v1, LO7/f0;

    :cond_0
    invoke-static {v0, v1}, Ls8/d;->a(LF8/i0;LO7/f0;)LF8/i0;

    move-result-object v1

    :cond_1
    return-object v1
.end method
