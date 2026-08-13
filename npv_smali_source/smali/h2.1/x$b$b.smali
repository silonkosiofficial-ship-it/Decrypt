.class final Lh2/x$b$b;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/x$b;->a(Lx7/p;Lm7/e;)Ljava/lang/Object;
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

.field N:Ljava/lang/Object;

.field O:Ljava/lang/Object;

.field P:Ljava/lang/Object;

.field synthetic Q:Ljava/lang/Object;

.field final synthetic R:Lh2/x$b;

.field S:I


# direct methods
.method constructor <init>(Lh2/x$b;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Lh2/x$b$b;->R:Lh2/x$b;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh2/x$b$b;->Q:Ljava/lang/Object;

    iget p1, p0, Lh2/x$b$b;->S:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh2/x$b$b;->S:I

    iget-object p1, p0, Lh2/x$b$b;->R:Lh2/x$b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lh2/x$b;->a(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
