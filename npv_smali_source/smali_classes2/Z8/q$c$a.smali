.class final LZ8/q$c$a;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/q$c;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:LZ8/q$c;

.field I:I


# direct methods
.method constructor <init>(LZ8/q$c;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LZ8/q$c$a;->H:LZ8/q$c;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LZ8/q$c$a;->G:Ljava/lang/Object;

    iget p1, p0, LZ8/q$c$a;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LZ8/q$c$a;->I:I

    iget-object p1, p0, LZ8/q$c$a;->H:LZ8/q$c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LZ8/q$c;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
