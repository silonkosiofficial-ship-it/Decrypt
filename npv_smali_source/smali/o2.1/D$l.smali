.class final Lo2/D$l;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/D;->u(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lo2/D;

.field I:I


# direct methods
.method constructor <init>(Lo2/D;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lo2/D$l;->H:Lo2/D;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo2/D$l;->G:Ljava/lang/Object;

    iget p1, p0, Lo2/D$l;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo2/D$l;->I:I

    iget-object p1, p0, Lo2/D$l;->H:Lo2/D;

    invoke-virtual {p1, p0}, Lo2/D;->u(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
