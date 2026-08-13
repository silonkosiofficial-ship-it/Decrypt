.class LQ2/i$a;
.super Lo2/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ2/i;-><init>(Lo2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LQ2/i;


# direct methods
.method constructor <init>(LQ2/i;Lo2/n;)V
    .locals 0

    iput-object p1, p0, LQ2/i$a;->d:LQ2/i;

    invoke-direct {p0, p2}, Lo2/g;-><init>(Lo2/n;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic i(Lz2/h;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LQ2/g;

    invoke-virtual {p0, p1, p2}, LQ2/i$a;->k(Lz2/h;LQ2/g;)V

    return-void
.end method

.method public k(Lz2/h;LQ2/g;)V
    .locals 2

    .prologue
    iget-object v0, p2, LQ2/g;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lz2/f;->M0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lz2/f;->C(ILjava/lang/String;)V

    :goto_0
    iget p2, p2, LQ2/g;->b:I

    int-to-long v0, p2

    const/4 p2, 0x2

    invoke-interface {p1, p2, v0, v1}, Lz2/f;->l(IJ)V

    return-void
.end method
