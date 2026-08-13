.class final Ly0/d$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/d;->J(JJLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:J

.field H:J

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Ly0/d;

.field K:I


# direct methods
.method constructor <init>(Ly0/d;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Ly0/d$a;->J:Ly0/d;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ly0/d$a;->I:Ljava/lang/Object;

    iget p1, p0, Ly0/d$a;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly0/d$a;->K:I

    iget-object v0, p0, Ly0/d$a;->J:Ly0/d;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ly0/d;->J(JJLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
