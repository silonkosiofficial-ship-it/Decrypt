.class final LW8/Z0;
.super Lb9/z;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final G:J


# direct methods
.method public constructor <init>(JLm7/e;)V
    .locals 1

    invoke-interface {p3}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    invoke-direct {p0, v0, p3}, Lb9/z;-><init>(Lm7/i;Lm7/e;)V

    iput-wide p1, p0, LW8/Z0;->G:J

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-wide v0, p0, LW8/Z0;->G:J

    invoke-virtual {p0}, LW8/a;->getContext()Lm7/i;

    move-result-object v2

    invoke-static {v2}, LW8/Y;->b(Lm7/i;)LW8/X;

    move-result-object v2

    invoke-static {v0, v1, v2, p0}, LW8/a1;->a(JLW8/X;LW8/z0;)LW8/Y0;

    move-result-object v0

    invoke-virtual {p0, v0}, LW8/F0;->x(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public w0()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, LW8/a;->w0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(timeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LW8/Z0;->G:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
