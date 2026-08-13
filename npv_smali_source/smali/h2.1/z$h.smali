.class final Lh2/z$h;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z;->t(Lh2/t;Lh2/l;Lm7/e;)Ljava/lang/Object;
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

.field L:Ljava/lang/Object;

.field M:Ljava/lang/Object;

.field N:Ljava/lang/Object;

.field O:Ljava/lang/Object;

.field P:Ljava/lang/Object;

.field Q:I

.field R:I

.field synthetic S:Ljava/lang/Object;

.field final synthetic T:Lh2/z;

.field U:I


# direct methods
.method constructor <init>(Lh2/z;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/z$h;->T:Lh2/z;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh2/z$h;->S:Ljava/lang/Object;

    iget p1, p0, Lh2/z$h;->U:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh2/z$h;->U:I

    iget-object p1, p0, Lh2/z$h;->T:Lh2/z;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lh2/z;->c(Lh2/z;Lh2/t;Lh2/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
