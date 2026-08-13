.class final Lv/a$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv/a;->b(JLx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:J

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lv/a;

.field J:I


# direct methods
.method constructor <init>(Lv/a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lv/a$a;->I:Lv/a;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lv/a$a;->H:Ljava/lang/Object;

    iget p1, p0, Lv/a$a;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/a$a;->J:I

    iget-object p1, p0, Lv/a$a;->I:Lv/a;

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lv/a;->b(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
