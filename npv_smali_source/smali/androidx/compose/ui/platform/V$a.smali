.class final Landroidx/compose/ui/platform/V$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/V;->b(Landroidx/compose/ui/platform/Q0;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Landroidx/compose/ui/platform/V;

.field H:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/V;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/V$a;->G:Landroidx/compose/ui/platform/V;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/compose/ui/platform/V$a;->F:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/ui/platform/V$a;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/ui/platform/V$a;->H:I

    iget-object p1, p0, Landroidx/compose/ui/platform/V$a;->G:Landroidx/compose/ui/platform/V;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Landroidx/compose/ui/platform/V;->b(Landroidx/compose/ui/platform/Q0;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
