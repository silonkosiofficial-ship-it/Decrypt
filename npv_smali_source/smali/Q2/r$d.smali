.class LQ2/r$d;
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

    iput-object p1, p0, LQ2/r$d;->d:LQ2/r;

    invoke-direct {p0, p2}, Lo2/w;-><init>(Lo2/n;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE workspec SET period_start_time=? WHERE id=?"

    return-object v0
.end method
