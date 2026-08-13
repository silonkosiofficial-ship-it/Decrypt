.class final Landroidx/compose/foundation/c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/c;->V1(Lq0/c;)Lo0/L1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ly7/O;

.field final synthetic E:Landroidx/compose/foundation/c;

.field final synthetic F:Lq0/c;


# direct methods
.method constructor <init>(Ly7/O;Landroidx/compose/foundation/c;Lq0/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/c$a;->D:Ly7/O;

    iput-object p2, p0, Landroidx/compose/foundation/c$a;->E:Landroidx/compose/foundation/c;

    iput-object p3, p0, Landroidx/compose/foundation/c$a;->F:Lq0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Landroidx/compose/foundation/c$a;->D:Ly7/O;

    iget-object v1, p0, Landroidx/compose/foundation/c$a;->E:Landroidx/compose/foundation/c;

    invoke-virtual {v1}, Landroidx/compose/foundation/c;->W1()Lo0/e2;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/foundation/c$a;->F:Lq0/c;

    invoke-interface {v2}, Lq0/g;->i()J

    move-result-wide v2

    iget-object v4, p0, Landroidx/compose/foundation/c$a;->F:Lq0/c;

    invoke-interface {v4}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v4

    iget-object v5, p0, Landroidx/compose/foundation/c$a;->F:Lq0/c;

    invoke-interface {v1, v2, v3, v4, v5}, Lo0/e2;->a(JLY0/v;LY0/e;)Lo0/L1;

    move-result-object v1

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/c$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
