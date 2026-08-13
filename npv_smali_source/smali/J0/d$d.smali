.class final LJ0/d$d;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ0/d;->e(Landroid/view/ScrollCaptureSession;LY0/r;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field J:I

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:LJ0/d;

.field M:I


# direct methods
.method constructor <init>(LJ0/d;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LJ0/d$d;->L:LJ0/d;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LJ0/d$d;->K:Ljava/lang/Object;

    iget p1, p0, LJ0/d$d;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LJ0/d$d;->M:I

    iget-object p1, p0, LJ0/d$d;->L:LJ0/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, LJ0/d;->d(LJ0/d;Landroid/view/ScrollCaptureSession;LY0/r;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
