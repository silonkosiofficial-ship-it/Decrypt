.class final La4/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:La4/l;


# direct methods
.method synthetic constructor <init>(La4/l;La4/i;)V
    .locals 0

    iput-object p1, p0, La4/j;->C:La4/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    iget-object v0, p0, La4/j;->C:La4/l;

    invoke-virtual {v0}, La4/l;->b()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-static {}, LV3/i;->d()LV3/f;

    move-result-object v2

    invoke-interface {v2}, LV3/f;->a()J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    iget-object v0, p0, La4/j;->C:La4/l;

    invoke-static {v0}, La4/l;->c(La4/l;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, La4/l;->f(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
