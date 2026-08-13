.class final LS/X0$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X0$a;->a(Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LS/U0;

.field final synthetic E:LS/e0;


# direct methods
.method constructor <init>(LS/U0;LS/e0;)V
    .locals 0

    iput-object p1, p0, LS/X0$a$b;->D:LS/U0;

    iput-object p2, p0, LS/X0$a$b;->E:LS/e0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, LS/X0$a$b;->D:LS/U0;

    iget-object v1, p0, LS/X0$a$b;->E:LS/e0;

    invoke-virtual {v1}, LS/e0;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LS/X0$a$b;->E:LS/e0;

    invoke-virtual {v0}, LS/e0;->b()Ljava/util/List;

    move-result-object v0

    new-instance v1, LS/X0$a$b$a;

    iget-object v2, p0, LS/X0$a$b;->D:LS/U0;

    invoke-direct {v1, v2}, LS/X0$a$b$a;-><init>(LS/U0;)V

    invoke-static {v0, v1}, Lj7/v;->I(Ljava/util/List;Lx7/l;)Z

    iget-object v0, p0, LS/X0$a$b;->E:LS/e0;

    invoke-virtual {v0}, LS/e0;->c()LV/Q0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LV/Q0;->invalidate()V

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/X0$a$b;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
