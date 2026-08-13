.class final Ly/h$c;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly/h;->h(Lx/w;FFLu/l;Lu/j;Lx7/l;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:F

.field G:F

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field synthetic J:Ljava/lang/Object;

.field K:I


# direct methods
.method constructor <init>(Lm7/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Ly/h$c;->J:Ljava/lang/Object;

    iget p1, p0, Ly/h$c;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly/h$c;->K:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Ly/h;->c(Lx/w;FFLu/l;Lu/j;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
