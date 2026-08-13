.class final LV9/d$e;
.super LL9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic e:LV9/d;


# direct methods
.method public constructor <init>(LV9/d;)V
    .locals 3

    iput-object p1, p0, LV9/d$e;->e:LV9/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, LV9/d;->j(LV9/d;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " writer"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, LL9/a;-><init>(Ljava/lang/String;ZILy7/k;)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, LV9/d$e;->e:LV9/d;

    invoke-virtual {v0}, LV9/d;->w()Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :catch_0
    move-exception v0

    iget-object v1, p0, LV9/d$e;->e:LV9/d;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, LV9/d;->p(Ljava/lang/Exception;LH9/B;)V

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
