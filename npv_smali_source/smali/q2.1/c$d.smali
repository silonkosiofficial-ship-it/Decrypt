.class final Lq2/c$d;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq2/c;->a(ZLx7/p;Lm7/e;)Ljava/lang/Object;
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

.field K:Z

.field synthetic L:Ljava/lang/Object;

.field final synthetic M:Lq2/c;

.field N:I


# direct methods
.method constructor <init>(Lq2/c;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lq2/c$d;->M:Lq2/c;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lq2/c$d;->L:Ljava/lang/Object;

    iget p1, p0, Lq2/c$d;->N:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq2/c$d;->N:I

    iget-object p1, p0, Lq2/c$d;->M:Lq2/c;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lq2/c;->a(ZLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
