.class final Lo2/n$i;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/n;->j(Lo2/c;)Lo2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lo2/n;


# direct methods
.method constructor <init>(Lo2/n;)V
    .locals 0

    iput-object p1, p0, Lo2/n$i;->D:Lo2/n;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo2/c;)Lz2/e;
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo2/n$i;->D:Lo2/n;

    invoke-virtual {v0, p1}, Lo2/n;->m(Lo2/c;)Lz2/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo2/c;

    invoke-virtual {p0, p1}, Lo2/n$i;->a(Lo2/c;)Lz2/e;

    move-result-object p1

    return-object p1
.end method
