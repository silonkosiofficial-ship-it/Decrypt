.class final Lh2/H$c;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/H;->q(Ljava/util/List;IIZLh2/s;Lh2/s;Lh2/o;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:I

.field M:I

.field N:Z

.field synthetic O:Ljava/lang/Object;

.field final synthetic P:Lh2/H;

.field Q:I


# direct methods
.method constructor <init>(Lh2/H;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/H$c;->P:Lh2/H;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iput-object p1, p0, Lh2/H$c;->O:Ljava/lang/Object;

    iget p1, p0, Lh2/H$c;->Q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh2/H$c;->Q:I

    iget-object v0, p0, Lh2/H$c;->P:Lh2/H;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, p0

    invoke-static/range {v0 .. v8}, Lh2/H;->j(Lh2/H;Ljava/util/List;IIZLh2/s;Lh2/s;Lh2/o;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
