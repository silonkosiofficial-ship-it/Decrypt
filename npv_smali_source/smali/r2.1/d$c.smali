.class final Lr2/d$c;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr2/d;->f(Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lr2/d;

.field J:I


# direct methods
.method constructor <init>(Lr2/d;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lr2/d$c;->I:Lr2/d;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lr2/d$c;->H:Ljava/lang/Object;

    iget p1, p0, Lr2/d$c;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lr2/d$c;->J:I

    iget-object p1, p0, Lr2/d$c;->I:Lr2/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lr2/d;->e(Lr2/d;Lo2/B$a;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
