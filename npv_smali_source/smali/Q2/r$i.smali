.class LQ2/r$i;
.super Lo2/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ2/r;-><init>(Lo2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:LQ2/r;


# direct methods
.method constructor <init>(LQ2/r;Lo2/n;)V
    .locals 0

    iput-object p1, p0, LQ2/r$i;->d:LQ2/r;

    invoke-direct {p0, p2}, Lo2/w;-><init>(Lo2/n;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"

    return-object v0
.end method
