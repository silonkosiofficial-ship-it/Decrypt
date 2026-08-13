.class final Landroidx/compose/ui/platform/x$k;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/x;->M(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Landroidx/compose/ui/platform/x;

.field K:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/x;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/x$k;->J:Landroidx/compose/ui/platform/x;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/compose/ui/platform/x$k;->I:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/ui/platform/x$k;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/ui/platform/x$k;->K:I

    iget-object p1, p0, Landroidx/compose/ui/platform/x$k;->J:Landroidx/compose/ui/platform/x;

    invoke-virtual {p1, p0}, Landroidx/compose/ui/platform/x;->M(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
