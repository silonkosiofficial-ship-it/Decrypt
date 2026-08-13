.class LQ2/i$b;
.super Lo2/w;
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

    iput-object p1, p0, LQ2/i$b;->d:LQ2/i;

    invoke-direct {p0, p2}, Lo2/w;-><init>(Lo2/n;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "DELETE FROM SystemIdInfo where work_spec_id=?"

    return-object v0
.end method
