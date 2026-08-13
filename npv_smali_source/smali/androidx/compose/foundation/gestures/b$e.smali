.class final Landroidx/compose/foundation/gestures/b$e;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/b;->q2(Landroidx/compose/foundation/gestures/a$d;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Landroidx/compose/foundation/gestures/b;

.field J:I


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/b;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$e;->I:Landroidx/compose/foundation/gestures/b;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b$e;->H:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/foundation/gestures/b$e;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/foundation/gestures/b$e;->J:I

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b$e;->I:Landroidx/compose/foundation/gestures/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Landroidx/compose/foundation/gestures/b;->e2(Landroidx/compose/foundation/gestures/b;Landroidx/compose/foundation/gestures/a$d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
