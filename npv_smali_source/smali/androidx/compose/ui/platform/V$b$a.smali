.class final Landroidx/compose/ui/platform/V$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/V$b;->a(LW8/N;)Landroidx/compose/ui/platform/C0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/platform/V;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/V;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/V$b$a;->D:Landroidx/compose/ui/platform/V;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/ui/platform/V$b$a;->D:Landroidx/compose/ui/platform/V;

    invoke-static {v0}, Landroidx/compose/ui/platform/V;->c(Landroidx/compose/ui/platform/V;)LW8/N;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LW8/O;->e(LW8/N;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/V$b$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
