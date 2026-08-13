.class final Lo2/D$k;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/D;->t(Lo2/k;ILm7/e;)Ljava/lang/Object;
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

.field final synthetic L:Lo2/D;

.field M:I


# direct methods
.method constructor <init>(Lo2/D;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lo2/D$k;->L:Lo2/D;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lo2/D$k;->K:Ljava/lang/Object;

    iget p1, p0, Lo2/D$k;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo2/D$k;->M:I

    iget-object p1, p0, Lo2/D$k;->L:Lo2/D;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lo2/D;->g(Lo2/D;Lo2/k;ILm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
