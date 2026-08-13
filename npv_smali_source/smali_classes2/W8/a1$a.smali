.class final LW8/a1$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW8/a1;->e(JLx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:J

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field J:I


# direct methods
.method constructor <init>(Lm7/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, LW8/a1$a;->I:Ljava/lang/Object;

    iget p1, p0, LW8/a1$a;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LW8/a1$a;->J:I

    const-wide/16 v0, 0x0

    const/4 p1, 0x0

    invoke-static {v0, v1, p1, p0}, LW8/a1;->e(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
