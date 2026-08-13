.class final LO1/g$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO1/g;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
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

.field final synthetic J:LO1/g;

.field K:I


# direct methods
.method constructor <init>(LO1/g;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LO1/g$a;->J:LO1/g;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LO1/g$a;->I:Ljava/lang/Object;

    iget p1, p0, LO1/g$a;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LO1/g$a;->K:I

    iget-object p1, p0, LO1/g$a;->J:LO1/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LO1/g;->e(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
