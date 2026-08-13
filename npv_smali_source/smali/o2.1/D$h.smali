.class final Lo2/D$h;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/D;->n([Ljava/lang/String;Lx7/a;Lx7/a;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lo2/D;

.field J:I


# direct methods
.method constructor <init>(Lo2/D;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lo2/D$h;->I:Lo2/D;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo2/D$h;->H:Ljava/lang/Object;

    iget p1, p0, Lo2/D$h;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo2/D$h;->J:I

    iget-object p1, p0, Lo2/D$h;->I:Lo2/D;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lo2/D;->n([Ljava/lang/String;Lx7/a;Lx7/a;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
