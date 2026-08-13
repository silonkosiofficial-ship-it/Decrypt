.class final LS/X$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/B0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/X;->d2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LS/X;


# direct methods
.method constructor <init>(LS/X;)V
    .locals 0

    iput-object p1, p0, LS/X$a;->C:LS/X;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    .prologue
    iget-object v0, p0, LS/X$a;->C:LS/X;

    invoke-static {v0}, LS/X;->a2(LS/X;)Lo0/B0;

    move-result-object v0

    invoke-interface {v0}, Lo0/B0;->a()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LS/X$a;->C:LS/X;

    invoke-static {}, LS/I0;->a()LV/O0;

    move-result-object v1

    invoke-static {v0, v1}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS/G0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LS/G0;->a()J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-eqz v1, :cond_1

    invoke-virtual {v0}, LS/G0;->a()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LS/X$a;->C:LS/X;

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v1

    invoke-static {v0, v1}, LF0/i;->a(LF0/h;LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo0/y0;

    invoke-virtual {v0}, Lo0/y0;->w()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method
