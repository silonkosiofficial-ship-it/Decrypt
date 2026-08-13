.class final Lu0/q$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu0/q;-><init>(Lu0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu0/q;


# direct methods
.method constructor <init>(Lu0/q;)V
    .locals 0

    iput-object p1, p0, Lu0/q$a;->D:Lu0/q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    iget-object v0, p0, Lu0/q$a;->D:Lu0/q;

    invoke-static {v0}, Lu0/q;->k(Lu0/q;)I

    move-result v0

    iget-object v1, p0, Lu0/q$a;->D:Lu0/q;

    invoke-static {v1}, Lu0/q;->l(Lu0/q;)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lu0/q$a;->D:Lu0/q;

    invoke-static {v0}, Lu0/q;->l(Lu0/q;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lu0/q;->m(Lu0/q;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu0/q$a;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
