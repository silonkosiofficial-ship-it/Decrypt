.class final LS5/B$c;
.super Lo7/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/B;->i(Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:LS5/B;

.field I:I


# direct methods
.method constructor <init>(LS5/B;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS5/B$c;->H:LS5/B;

    invoke-direct {p0, p2}, Lo7/d;-><init>(Lm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LS5/B$c;->G:Ljava/lang/Object;

    iget p1, p0, LS5/B$c;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LS5/B$c;->I:I

    iget-object p1, p0, LS5/B$c;->H:LS5/B;

    invoke-static {p1, p0}, LS5/B;->f(LS5/B;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
