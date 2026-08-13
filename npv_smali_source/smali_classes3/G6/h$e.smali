.class final LG6/h$e;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/h;->z0(LH9/x;LH9/z;Lm7/i;LO6/e;Lm7/e;)Ljava/lang/Object;
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

.field final synthetic K:LG6/h;

.field L:I


# direct methods
.method constructor <init>(LG6/h;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LG6/h$e;->K:LG6/h;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, LG6/h$e;->J:Ljava/lang/Object;

    iget p1, p0, LG6/h$e;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LG6/h$e;->L:I

    iget-object v0, p0, LG6/h$e;->K:LG6/h;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, LG6/h;->N(LG6/h;LH9/x;LH9/z;Lm7/i;LO6/e;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
