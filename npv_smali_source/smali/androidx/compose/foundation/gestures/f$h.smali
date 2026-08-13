.class final Landroidx/compose/foundation/gestures/f$h;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f;->B2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/gestures/f;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$h;->D:Landroidx/compose/foundation/gestures/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f$h;->D:Landroidx/compose/foundation/gestures/f;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v1

    invoke-static {v0, v1}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/e;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/f$h;->D:Landroidx/compose/foundation/gestures/f;

    invoke-static {v1}, Landroidx/compose/foundation/gestures/f;->v2(Landroidx/compose/foundation/gestures/f;)Lx/j;

    move-result-object v1

    invoke-static {v0}, Lt/z;->c(LY0/e;)Lu/B;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx/j;->e(Lu/B;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/f$h;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
