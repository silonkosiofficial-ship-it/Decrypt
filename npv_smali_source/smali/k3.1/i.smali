.class public final Lk3/i;
.super Lk3/k;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lk3/k;-><init>(Landroid/content/Context;I)V

    const-string v0, "Context cannot be null"

    invoke-static {p1, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e()Lk3/w;
    .locals 1

    iget-object v0, p0, Lk3/k;->C:Ls3/i1;

    invoke-virtual {v0}, Ls3/i1;->h()Lk3/w;

    move-result-object v0

    return-object v0
.end method
