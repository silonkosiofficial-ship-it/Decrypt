.class LP8/f$c;
.super LP8/f$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field private final D:I

.field final synthetic E:LP8/f;


# direct methods
.method public constructor <init>(LP8/f;)V
    .locals 1

    iput-object p1, p0, LP8/f$c;->E:LP8/f;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LP8/f$d;-><init>(LP8/f$a;)V

    invoke-static {p1}, LP8/f;->e(LP8/f;)I

    move-result p1

    iput p1, p0, LP8/f$c;->D:I

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 3

    .prologue
    iget-object v0, p0, LP8/f$c;->E:LP8/f;

    invoke-static {v0}, LP8/f;->g(LP8/f;)I

    move-result v0

    iget v1, p0, LP8/f$c;->D:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ModCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LP8/f$c;->E:LP8/f;

    invoke-static {v2}, LP8/f;->n(LP8/f;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "; expected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LP8/f$c;->D:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LP8/f$c;->E:LP8/f;

    invoke-static {v0}, LP8/f;->f(LP8/f;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 1

    invoke-virtual {p0}, LP8/f$c;->b()V

    iget-object v0, p0, LP8/f$c;->E:LP8/f;

    invoke-virtual {v0}, LP8/f;->clear()V

    return-void
.end method
