.class public final LP9/f$l;
.super LL9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP9/f;->K1(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LP9/f;

.field final synthetic f:I

.field final synthetic g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLP9/f;IJ)V
    .locals 0

    iput-object p3, p0, LP9/f$l;->e:LP9/f;

    iput p4, p0, LP9/f$l;->f:I

    iput-wide p5, p0, LP9/f$l;->g:J

    invoke-direct {p0, p1, p2}, LL9/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 4

    .prologue
    :try_start_0
    iget-object v0, p0, LP9/f$l;->e:LP9/f;

    invoke-virtual {v0}, LP9/f;->d1()LP9/j;

    move-result-object v0

    iget v1, p0, LP9/f$l;->f:I

    iget-wide v2, p0, LP9/f$l;->g:J

    invoke-virtual {v0, v1, v2, v3}, LP9/j;->e0(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, LP9/f$l;->e:LP9/f;

    invoke-static {v1, v0}, LP9/f;->a(LP9/f;Ljava/io/IOException;)V

    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
