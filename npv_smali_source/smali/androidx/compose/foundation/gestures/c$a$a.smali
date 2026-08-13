.class final Landroidx/compose/foundation/gestures/c$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/c$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx/m;

.field final synthetic E:Landroidx/compose/foundation/gestures/c;


# direct methods
.method constructor <init>(Lx/m;Landroidx/compose/foundation/gestures/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/c$a$a;->D:Lx/m;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/c$a$a;->E:Landroidx/compose/foundation/gestures/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/gestures/a$b;)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/c$a$a;->D:Lx/m;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/c$a$a;->E:Landroidx/compose/foundation/gestures/c;

    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/a$b;->a()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/gestures/c;->y2(Landroidx/compose/foundation/gestures/c;J)J

    move-result-wide v1

    iget-object p1, p0, Landroidx/compose/foundation/gestures/c$a$a;->E:Landroidx/compose/foundation/gestures/c;

    invoke-static {p1}, Landroidx/compose/foundation/gestures/c;->w2(Landroidx/compose/foundation/gestures/c;)Lx/s;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lx/n;->d(JLx/s;)F

    move-result p1

    invoke-interface {v0, p1}, Lx/m;->a(F)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/a$b;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/c$a$a;->a(Landroidx/compose/foundation/gestures/a$b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
