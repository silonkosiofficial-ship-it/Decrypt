.class final Landroidx/compose/foundation/gestures/f$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx/r;

.field final synthetic E:Lx/C;


# direct methods
.method constructor <init>(Lx/r;Lx/C;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$b$a;->D:Lx/r;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/f$b$a;->E:Lx/C;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/gestures/a$b;)V
    .locals 4

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f$b$a;->D:Lx/r;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/f$b$a;->E:Lx/C;

    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/a$b;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lx/C;->x(J)J

    move-result-wide v1

    sget-object p1, Ly0/f;->a:Ly0/f$a;

    invoke-virtual {p1}, Ly0/f$a;->b()I

    move-result p1

    invoke-interface {v0, v1, v2, p1}, Lx/r;->a(JI)J

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/gestures/a$b;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/f$b$a;->a(Landroidx/compose/foundation/gestures/a$b;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
