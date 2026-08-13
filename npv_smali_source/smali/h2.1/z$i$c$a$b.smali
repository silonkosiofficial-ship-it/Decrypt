.class final Lh2/z$i$c$a$b;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/z$i$c$a;->b(Li7/M;Lm7/e;)Ljava/lang/Object;
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

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:Ljava/lang/Object;

.field synthetic N:Ljava/lang/Object;

.field final synthetic O:Lh2/z$i$c$a;

.field P:I


# direct methods
.method constructor <init>(Lh2/z$i$c$a;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/z$i$c$a$b;->O:Lh2/z$i$c$a;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh2/z$i$c$a$b;->N:Ljava/lang/Object;

    iget p1, p0, Lh2/z$i$c$a$b;->P:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh2/z$i$c$a$b;->P:I

    iget-object p1, p0, Lh2/z$i$c$a$b;->O:Lh2/z$i$c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lh2/z$i$c$a;->b(Li7/M;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
