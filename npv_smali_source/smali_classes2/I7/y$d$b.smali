.class final LI7/y$d$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI7/y$d;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LI7/y$d;


# direct methods
.method constructor <init>(LI7/y$d;)V
    .locals 0

    iput-object p1, p0, LI7/y$d$b;->D:LI7/y$d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LO7/W;
    .locals 3

    .prologue
    iget-object v0, p0, LI7/y$d$b;->D:LI7/y$d;

    invoke-virtual {v0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->I()LO7/U;

    move-result-object v0

    invoke-interface {v0}, LO7/U;->i()LO7/W;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LI7/y$d$b;->D:LI7/y$d;

    invoke-virtual {v0}, LI7/y$a;->G()LI7/y;

    move-result-object v0

    invoke-virtual {v0}, LI7/y;->I()LO7/U;

    move-result-object v0

    sget-object v1, LP7/g;->d:LP7/g$a;

    invoke-virtual {v1}, LP7/g$a;->b()LP7/g;

    move-result-object v2

    invoke-virtual {v1}, LP7/g$a;->b()LP7/g;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lr8/e;->e(LO7/U;LP7/g;LP7/g;)LR7/E;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LI7/y$d$b;->a()LO7/W;

    move-result-object v0

    return-object v0
.end method
