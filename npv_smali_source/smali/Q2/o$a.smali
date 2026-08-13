.class LQ2/o$a;
.super Lo2/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ2/o;-><init>(Lo2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LQ2/o;


# direct methods
.method constructor <init>(LQ2/o;Lo2/n;)V
    .locals 0

    iput-object p1, p0, LQ2/o$a;->d:LQ2/o;

    invoke-direct {p0, p2}, Lo2/g;-><init>(Lo2/n;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic i(Lz2/h;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LQ2/m;

    invoke-virtual {p0, p1, p2}, LQ2/o$a;->k(Lz2/h;LQ2/m;)V

    return-void
.end method

.method public k(Lz2/h;LQ2/m;)V
    .locals 2

    .prologue
    iget-object v0, p2, LQ2/m;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lz2/f;->M0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lz2/f;->C(ILjava/lang/String;)V

    :goto_0
    iget-object p2, p2, LQ2/m;->b:Landroidx/work/b;

    invoke-static {p2}, Landroidx/work/b;->k(Landroidx/work/b;)[B

    move-result-object p2

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Lz2/f;->M0(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v0, p2}, Lz2/f;->p0(I[B)V

    :goto_1
    return-void
.end method
