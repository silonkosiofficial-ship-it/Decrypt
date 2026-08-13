.class final Lu2/b$b$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu2/b$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo2/u;


# direct methods
.method constructor <init>(Lo2/u;)V
    .locals 0

    iput-object p1, p0, Lu2/b$b$a;->D:Lo2/u;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly2/e;)Ljava/lang/Integer;
    .locals 2

    .prologue
    const-string v0, "stmt"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu2/b$b$a;->D:Lo2/u;

    invoke-virtual {v0}, Lo2/u;->a()Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ly2/e;->p()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1, v1}, Ly2/e;->getInt(I)I

    move-result v1

    :cond_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/e;

    invoke-virtual {p0, p1}, Lu2/b$b$a;->a(Ly2/e;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
