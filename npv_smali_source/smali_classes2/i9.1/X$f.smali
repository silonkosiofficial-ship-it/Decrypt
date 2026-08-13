.class final Li9/X$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/X;->g(Li9/o$e;Li9/b0;ZLi9/b0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z

.field final synthetic E:Li9/b0;


# direct methods
.method constructor <init>(ZLi9/b0;)V
    .locals 0

    iput-boolean p1, p0, Li9/X$f;->D:Z

    iput-object p2, p0, Li9/X$f;->E:Li9/b0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o$e;)V
    .locals 3

    .prologue
    const-string v0, "$this$outputIfNeeded"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Li9/X$f;->D:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x3a

    invoke-static {p1, v0}, Li9/p;->b(Li9/o;C)V

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Li9/o$e$a;->b(Li9/o$e;Li9/K;ILjava/lang/Object;)V

    iget-object v0, p0, Li9/X$f;->E:Li9/b0;

    new-instance v1, Li9/X$f$a;

    iget-boolean v2, p0, Li9/X$f;->D:Z

    invoke-direct {v1, v2}, Li9/X$f$a;-><init>(Z)V

    invoke-static {p1, v0, v1}, Li9/X;->h(Li9/o;Li9/b0;Lx7/l;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o$e;

    invoke-virtual {p0, p1}, Li9/X$f;->a(Li9/o$e;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
