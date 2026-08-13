.class final Lz9/W$b;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz9/W;->h(Li7/c;Lm7/e;)Ljava/lang/Object;
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

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Lz9/W;

.field L:I


# direct methods
.method constructor <init>(Lz9/W;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lz9/W$b;->K:Lz9/W;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lz9/W$b;->J:Ljava/lang/Object;

    iget p1, p0, Lz9/W$b;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz9/W$b;->L:I

    iget-object p1, p0, Lz9/W$b;->K:Lz9/W;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lz9/W;->c(Lz9/W;Li7/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
