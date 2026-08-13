.class final LY8/h$e;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY8/h;->T0(LY8/p;IJLm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field I:J

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:LY8/h;

.field L:I


# direct methods
.method constructor <init>(LY8/h;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LY8/h$e;->K:LY8/h;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    iput-object p1, p0, LY8/h$e;->J:Ljava/lang/Object;

    iget p1, p0, LY8/h$e;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LY8/h$e;->L:I

    iget-object v0, p0, LY8/h$e;->K:LY8/h;

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, LY8/h;->E(LY8/h;LY8/p;IJLm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, LY8/n;->b(Ljava/lang/Object;)LY8/n;

    move-result-object p1

    return-object p1
.end method
