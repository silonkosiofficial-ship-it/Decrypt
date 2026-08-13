.class final Lt2/a$f;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt2/a;->k(Lh2/L$a;ILm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lt2/a;

.field J:I


# direct methods
.method constructor <init>(Lt2/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lt2/a$f;->I:Lt2/a;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lt2/a$f;->H:Ljava/lang/Object;

    iget p1, p0, Lt2/a$f;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt2/a$f;->J:I

    iget-object p1, p0, Lt2/a$f;->I:Lt2/a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lt2/a;->g(Lt2/a;Lh2/L$a;ILm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
