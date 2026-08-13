.class final Ly0/d$b;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/d;->h1(JLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:J

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Ly0/d;

.field J:I


# direct methods
.method constructor <init>(Ly0/d;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Ly0/d$b;->I:Ly0/d;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Ly0/d$b;->H:Ljava/lang/Object;

    iget p1, p0, Ly0/d$b;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly0/d$b;->J:I

    iget-object p1, p0, Ly0/d$b;->I:Ly0/d;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Ly0/d;->h1(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
