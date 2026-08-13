.class final LD0/i0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD0/i0;-><init>(LD0/k0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/i0;


# direct methods
.method constructor <init>(LD0/i0;)V
    .locals 0

    iput-object p1, p0, LD0/i0$d;->D:LD0/i0;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LF0/J;LD0/i0;)V
    .locals 2

    .prologue
    iget-object p2, p0, LD0/i0$d;->D:LD0/i0;

    invoke-virtual {p1}, LF0/J;->r0()LD0/C;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LD0/C;

    iget-object v1, p0, LD0/i0$d;->D:LD0/i0;

    invoke-static {v1}, LD0/i0;->a(LD0/i0;)LD0/k0;

    move-result-object v1

    invoke-direct {v0, p1, v1}, LD0/C;-><init>(LF0/J;LD0/k0;)V

    invoke-virtual {p1, v0}, LF0/J;->J1(LD0/C;)V

    :cond_0
    invoke-static {p2, v0}, LD0/i0;->c(LD0/i0;LD0/C;)V

    iget-object p1, p0, LD0/i0$d;->D:LD0/i0;

    invoke-static {p1}, LD0/i0;->b(LD0/i0;)LD0/C;

    move-result-object p1

    invoke-virtual {p1}, LD0/C;->B()V

    iget-object p1, p0, LD0/i0$d;->D:LD0/i0;

    invoke-static {p1}, LD0/i0;->b(LD0/i0;)LD0/C;

    move-result-object p1

    iget-object p2, p0, LD0/i0$d;->D:LD0/i0;

    invoke-static {p2}, LD0/i0;->a(LD0/i0;)LD0/k0;

    move-result-object p2

    invoke-virtual {p1, p2}, LD0/C;->J(LD0/k0;)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LF0/J;

    check-cast p2, LD0/i0;

    invoke-virtual {p0, p1, p2}, LD0/i0$d;->a(LF0/J;LD0/i0;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
