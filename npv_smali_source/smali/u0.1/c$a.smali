.class final Lu0/c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu0/c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu0/c;


# direct methods
.method constructor <init>(Lu0/c;)V
    .locals 0

    iput-object p1, p0, Lu0/c$a;->D:Lu0/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lu0/l;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lu0/c$a;->D:Lu0/c;

    invoke-static {v0, p1}, Lu0/c;->e(Lu0/c;Lu0/l;)V

    iget-object v0, p0, Lu0/c$a;->D:Lu0/c;

    invoke-virtual {v0}, Lu0/c;->b()Lx7/l;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lu0/l;

    invoke-virtual {p0, p1}, Lu0/c$a;->a(Lu0/l;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
