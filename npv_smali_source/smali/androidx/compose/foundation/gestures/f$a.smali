.class final Landroidx/compose/foundation/gestures/f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f;-><init>(Lx/A;Lv/T;Lx/p;Lx/s;ZZLz/l;Lx/f;)V
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

    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$a;->D:Landroidx/compose/foundation/gestures/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/t;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f$a;->D:Landroidx/compose/foundation/gestures/f;

    invoke-static {v0}, Landroidx/compose/foundation/gestures/f;->u2(Landroidx/compose/foundation/gestures/f;)Lx/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx/h;->n2(LD0/t;)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/t;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/f$a;->a(LD0/t;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
