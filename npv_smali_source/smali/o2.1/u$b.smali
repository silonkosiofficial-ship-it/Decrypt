.class final Lo2/u$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/u;-><init>(Ljava/lang/String;Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;


# direct methods
.method constructor <init>(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lo2/u$b;->D:Lx7/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly2/e;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/u$b;->D:Lx7/l;

    new-instance v1, Lo2/b;

    invoke-direct {v1, p1}, Lo2/b;-><init>(Ly2/e;)V

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly2/e;

    invoke-virtual {p0, p1}, Lo2/u$b;->a(Ly2/e;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
