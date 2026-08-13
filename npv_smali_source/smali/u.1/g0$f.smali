.class final Lu/g0$f;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu/g0;-><init>(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu/g0;


# direct methods
.method constructor <init>(Lu/g0;)V
    .locals 0

    iput-object p1, p0, Lu/g0$f;->D:Lu/g0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lu/g0$f;->D:Lu/g0;

    invoke-static {v0}, Lu/g0;->o(Lu/g0;)Lu/s0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lu/s0;->q()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, Lu/g0;->U(J)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu/g0$f;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
