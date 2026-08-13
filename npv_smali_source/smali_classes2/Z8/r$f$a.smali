.class public final LZ8/r$f$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/r$f;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field H:I

.field final synthetic I:LZ8/r$f;

.field J:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LZ8/r$f;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LZ8/r$f$a;->I:LZ8/r$f;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LZ8/r$f$a;->G:Ljava/lang/Object;

    iget p1, p0, LZ8/r$f$a;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LZ8/r$f$a;->H:I

    iget-object p1, p0, LZ8/r$f$a;->I:LZ8/r$f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LZ8/r$f;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
