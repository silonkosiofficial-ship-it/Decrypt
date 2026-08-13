.class LQ2/f$a;
.super Lo2/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ2/f;-><init>(Lo2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LQ2/f;


# direct methods
.method constructor <init>(LQ2/f;Lo2/n;)V
    .locals 0

    iput-object p1, p0, LQ2/f$a;->d:LQ2/f;

    invoke-direct {p0, p2}, Lo2/g;-><init>(Lo2/n;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    return-object v0
.end method

.method public bridge synthetic i(Lz2/h;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LQ2/d;

    invoke-virtual {p0, p1, p2}, LQ2/f$a;->k(Lz2/h;LQ2/d;)V

    return-void
.end method

.method public k(Lz2/h;LQ2/d;)V
    .locals 3

    .prologue
    iget-object v0, p2, LQ2/d;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lz2/f;->M0(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lz2/f;->C(ILjava/lang/String;)V

    :goto_0
    iget-object p2, p2, LQ2/d;->b:Ljava/lang/Long;

    const/4 v0, 0x2

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Lz2/f;->M0(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lz2/f;->l(IJ)V

    :goto_1
    return-void
.end method
