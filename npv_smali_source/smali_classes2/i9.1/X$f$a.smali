.class final Li9/X$f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li9/X$f;->a(Li9/o$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Z


# direct methods
.method constructor <init>(Z)V
    .locals 0

    iput-boolean p1, p0, Li9/X$f$a;->D:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li9/o$e;)V
    .locals 2

    .prologue
    const-string v0, "$this$outputIfNeeded"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Li9/X$f$a;->D:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x3a

    invoke-static {p1, v0}, Li9/p;->b(Li9/o;C)V

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Li9/o$e$a;->c(Li9/o$e;Li9/K;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li9/o$e;

    invoke-virtual {p0, p1}, Li9/X$f$a;->a(Li9/o$e;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
