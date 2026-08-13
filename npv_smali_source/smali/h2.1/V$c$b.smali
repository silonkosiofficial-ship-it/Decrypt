.class final Lh2/V$c$b;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/V$c;->b(ILW8/z0;Lm7/e;)Ljava/lang/Object;
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

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Lh2/V$c;

.field L:I


# direct methods
.method constructor <init>(Lh2/V$c;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/V$c$b;->K:Lh2/V$c;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lh2/V$c$b;->J:Ljava/lang/Object;

    iget p1, p0, Lh2/V$c$b;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh2/V$c$b;->L:I

    iget-object p1, p0, Lh2/V$c$b;->K:Lh2/V$c;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lh2/V$c;->b(ILW8/z0;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
