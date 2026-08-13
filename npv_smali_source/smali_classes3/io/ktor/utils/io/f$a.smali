.class final Lio/ktor/utils/io/f$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/ktor/utils/io/f;->b(Lio/ktor/utils/io/d;Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:J

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
    .locals 1

    iput-object p1, p0, Lio/ktor/utils/io/f$a;->I:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/f$a;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/f$a;->J:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lio/ktor/utils/io/f;->b(Lio/ktor/utils/io/d;Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
